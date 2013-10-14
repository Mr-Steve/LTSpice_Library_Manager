/**
 * 
 */
package spiceEdit;

import org.jscience.physics.amount.Constants;

import javax.measure.Measure;
import javax.measure.unit.NonSI;
import javax.measure.unit.SI;

/**
 * @author adm
 * 
 */
public class MathDio extends MathMain
{

	/**
	 * This is used to create the forward current chart, not to calculate a parameter.
	 * @param current saturation current
	 * @param voltage Voltage across the diode
	 * @param ideality
	 * @param temperature temperature of measurements
	 * @return
	 */
	public double dioCalculateID(double current, double voltage, double ideality, double temperature)
	{
		// double e = Constants.e.doubleValue(COULOMB);
		double Vt = calculateThermalVoltage(temperature);
		// List<String> billy = metricConvert(IS, "cap");
		return current * (StrictMath.exp(voltage / (ideality * Vt)) - 1);
	}

	/**
	 * 
	 * @param current Current across diode
	 * @param voltage Voltage across the diode
	 * @param ideality
	 * @param temperature temperature of measurements
	 * @return
	 */
	public double dioCalculateIS(double current, double voltage, double ideality, double temperature)
	{

		// double e = Constants.e.doubleValue(COULOMB);
		double Vt = calculateThermalVoltage(temperature);
		// double step1 = (N*Vt);
		// double step2 = (VD/step1);
		// double step3 = Math.exp(step2);
		// double step4 = ( step3 - 1);
		// IS = ID / step4;
		return current / (StrictMath.exp(voltage / (ideality * Vt)) - 1);
	}

	public double dioCalculateTt(double IF, double slew, double trr)
	{

		// There is apparently some way to get this using reverse current
		// instead of slew rate, but I'm not sure which reverse current is
		// needed.
		// There are also some spreadsheets that apparently provide Qrr, which
		// could also be used. I don't see many that provide slew.
		double Qrr = StrictMath.pow(trr, 2) / 2 * slew;

		// double total = Qrr/IF;
		// double result = 0.000000000001;
		// double test = 0.0;
		// Function ((r^2)/2)*(D/t)-(f)*(x)*(e^(-(sqrt((f)/(x*(D/t)))
		// Qrr - IF * TT * Math.exp(-(Math.sqrt(IF/(TT*slew))));
		// while (test != total)
		// {
		// result += 0.000000000001;
		// test = result * Math.exp(-(Math.sqrt(IF/(result*slew))));
		// }
		double tt = 1.0E-3;
		while (Math.abs(dioTranTimeFunction(Qrr, IF, tt, slew) / dioTranTimeDerivative(Qrr, IF, tt, slew, trr)) > EPSILON)
		{
			tt = tt - dioTranTimeFunction(Qrr, IF, tt, slew) / dioTranTimeDerivative(Qrr, IF, tt, slew, trr);
		}
		return tt;
	}

	public double dioCalcXtiLargeScaleTcv(double temperature1, double temperature2, double Voltage1, double Voltage2,
			double Current, double EG, double N)
	{
		double temp1 = convertCelsiusToKelvin(temperature1);
		double temp2 = convertCelsiusToKelvin(temperature2);
		double IS = dioCalculateIS(Current, Voltage1, N, temperature1);
		double TCV = (Voltage2 - Voltage1) / (temp2 - temp1);
		double vt = calculateThermalVoltage(temperature1);
		double top = N * vt * StrictMath.log(Current / IS) - (EG + temp1 * TCV);
		double bottom = vt * temp2 * StrictMath.log(temp2 / temp1) / (temp2 - temp1);
		return top / bottom;
	}

	public double dioCalcXtiReverseCurrent(double temperature1, double temperature2, double IR0, double IR1,
			double N, double EG)
	{
		double temp = Measure.valueOf(EG, NonSI.ELECTRON_VOLT).doubleValue(SI.JOULE);
		double q = Constants.e.getEstimatedValue();
		double k = Constants.k.getEstimatedValue();
		// double k =
		// org.jscience.physics.amount.Constants.k.to(NonSI.ELECTRON_VOLT.divide(SI.KELVIN)).getEstimatedValue();
		double temp0 = convertCelsiusToKelvin(temperature1);
		double temp1 = convertCelsiusToKelvin(temperature2);
		double part1 = StrictMath.log(IR1 / IR0);
		double part2 = q * temp / k;
		double part3 = 1 / temp0 - 1 / temp1;
		double top = N * part1 - part2 * part3;
		double bottom = StrictMath.log(temp1 / temp0);

		return top / bottom;
	}

	public double dioCalcXtiSmallScaleTcv(double temperature, double RS, double IS, double Current,
			double Voltage, double EG, double TCV, double N)
	{
		double temp = convertCelsiusToKelvin(temperature);
		double front = 1 / Voltage;
		double back = N * Voltage * StrictMath.log(Current / IS + 1) - (EG + temp * TCV);
		return front * back;
	}

	public double dioThreePointCJO(double volt1, double volt2, double volt3, double cap1, double cap2,
			double cap3, double M, double VJ)
	{

		return cap1 * StrictMath.pow(1 + volt1 / VJ, M);
	}

	public double dioThreePointIS(double volt1, double curr1, double curr2, double temp, double N, double RS)
	{
		double vt = calculateThermalVoltage(temp);

		double top = curr1;
		double bottom = StrictMath.exp((volt1 - RS * curr1) / (N * vt)) - 1;

		return top / bottom;
	}

	public double dioThreePointM(double volt1, double volt2, double volt3, double cap1, double cap2, double cap3)
	{

		double top = StrictMath.log(cap2 / cap3);
		double bottom = StrictMath.log(volt3 / volt2);

		return top / bottom;
	}

	public double dioThreePointN(double volt1, double volt2, double curr1, double curr2, double temp, double RS)
	{
		double vt = calculateThermalVoltage(temp);

		double top = volt1 - volt2 + RS * (curr2 - curr1);
		double bottom = vt * StrictMath.log(curr1 / curr2);

		return top / bottom;
	}

	public double dioThreePointRS(double volt1, double volt2, double volt3, double curr1, double curr2,
			double curr3)
	{

		double top = volt2 - volt1 + (volt1 - volt3) * StrictMath.log(curr1 / curr2) / StrictMath.log(curr1 / curr3);
		double bottom = curr2 - curr1 + (curr1 - curr3) * StrictMath.log(curr1 / curr2) / StrictMath.log(curr1 / curr3);

		return top / bottom;
	}

	public double dioThreePointVJ(double volt1, double volt2, double volt3, double cap1, double cap2,
			double cap3, double M)
	{
		double k1 = StrictMath.pow(cap1 / cap2, 1 / M);

		double top = k1 * volt1 - volt2;
		double bottom = 1 - k1;

		return top / bottom;
	}

	public double dioTranTimeDerivative(double Qrr, double IF, double TT, double slew, double trr)
	{
		double top = StrictMath.pow(-IF, 2) * StrictMath.exp(-Math.sqrt(IF / (TT * slew)));
		double bottom = 2 * slew * Math.sqrt(IF / (TT * slew));
		double front = top / bottom;
		double back = IF * StrictMath.exp(-Math.sqrt(IF / (TT * slew)));
		return front - back;
	}

	public double dioTranTimeDerivative2(double Qrr, double IF, double TT, double slew, double trr)
	{
		double front = -StrictMath.pow(IF, 2) * StrictMath.exp(-Math.sqrt(IF / (TT * slew))) /
				(4 * slew * StrictMath.pow(TT, 2));
		double top = StrictMath.pow(IF, 3) * StrictMath.exp(-Math.sqrt(IF / (TT * slew)));
		double bottom = 4 * StrictMath.pow(slew, 2) * StrictMath.pow(IF / (slew * TT), 3 / 2) * StrictMath.pow(TT, 3);
		double back = top / bottom;
		return front - back;
	}

	public double dioTranTimeFunction(double Qrr, double IF, double TT, double slew)
	{
		// double taco = Measure.valueOf(slew, Unit<Duration/ElectricCurrent>);
		return Qrr - IF * TT * StrictMath.exp(-Math.sqrt(IF / (TT * slew)));
	}

}