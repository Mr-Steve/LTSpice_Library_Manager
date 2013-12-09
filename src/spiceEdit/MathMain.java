package spiceEdit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.measure.Measure;
import javax.measure.quantity.ElectricCapacitance;
import javax.measure.quantity.Quantity;
import javax.measure.quantity.Temperature;
import javax.measure.unit.NonSI;
import javax.measure.unit.SI;

import org.jscience.physics.amount.Amount;
import org.jscience.physics.amount.Constants;

public class MathMain
{

	/**
	 * Thermal voltage. in volts
	 * 
	 * V(t) = ((Boltzmann constant)*(Room temperature in kelvin
	 * (300K)))/(Electrical charge on the electron)
	 */
	public static final double EPSILON = 1.0e-20;

	public static double calculateThermalVoltage(double TempCelsius)
	{
		Measure<Double, Temperature> temp = Measure.valueOf(TempCelsius, SI.CELSIUS);
		int val = temp.intValue(SI.KELVIN);
		Amount<? extends Quantity> Top = Constants.k.to(NonSI.ELECTRON_VOLT.divide(SI.KELVIN)).times(val);
		Amount<? extends Quantity> Result = Top.divide(Constants.e.doubleValue(NonSI.E));
		return Result.getEstimatedValue();

		// Amount<ElectricPotential> taco = asdf.to(VOLT);
		// Amount<?> top =
		// org.jscience.physics.amount.Constants.k.to(ELECTRON_VOLT.divide(KELVIN));
		// Amount<?> tic = top.times(val);
		// Amount<?> tim = tic.divide(Constants.e.doubleValue(E));
		// return tim.to(VOLT).getEstimatedValue();
		// * temp.doubleValue(KELVIN))
		// return temp.doubleValue(KELVIN);
	}

	public static double convertCelsiusToKelvin(double TempCelsius)
	{
		Measure<Double, Temperature> temp = Measure.valueOf(TempCelsius, SI.CELSIUS);

		return temp.intValue(SI.KELVIN);
	}

	public static String convertSciNot(String text) throws NumberFormatException
	{
		// double val = Double.valueOf(text);
		// return Double.toString(val);
		return new BigDecimal(text).toPlainString();

	}

	public static List<String> metricConvert(double val)
	{
		List<String> result = null;
		String s = "cap".toLowerCase();
		if ("cap".equals(s))
		{
			Measure<Double, ElectricCapacitance> value = Measure.valueOf(val, SI.FARAD);
			result = new ArrayList<String>();
			result.add(value.toString());
			result.add(value.to(SI.MILLI(SI.FARAD)).toString());
			result.add(value.to(SI.MICRO(SI.FARAD)).toString());
			result.add(value.to(SI.NANO(SI.FARAD)).toString());
			result.add(value.to(SI.PICO(SI.FARAD)).toString());

			// value.UNIT.transform(FARAD.getConverterTo(NANO(FARAD)));
		}

		// UnitConverter toMicro = FARAD.toStandardUnit();
		return result;

	}

	public static double metricToMicro(double input)
	{
		Measure<Double, ElectricCapacitance> value = Measure.valueOf(input, SI.FARAD);
		return value.doubleValue(SI.MICRO(SI.FARAD));
	}

	public static double metricToMilli(double input)
	{
		Measure<Double, ElectricCapacitance> value = Measure.valueOf(input, SI.FARAD);
		return value.doubleValue(SI.MILLI(SI.FARAD));
	}

	public static double metricToNano(double input)
	{
		Measure<Double, ElectricCapacitance> value = Measure.valueOf(input, SI.FARAD);
		return value.doubleValue(SI.NANO(SI.FARAD));
	}

	public static double metricToPico(double input)
	{
		Measure<Double, ElectricCapacitance> value = Measure.valueOf(input, SI.FARAD);
		return value.doubleValue(SI.PICO(SI.FARAD));
	}

	public static List<String> microConvert(double val)
	{
		Measure<Double, ElectricCapacitance> value = Measure.valueOf(val, SI.MICRO(SI.FARAD));
		List<String> result = new ArrayList<String>();
		result.add(value.to(SI.FARAD).toString());
		result.add(value.to(SI.MILLI(SI.FARAD)).toString());
		result.add(value.toString());
		result.add(value.to(SI.NANO(SI.FARAD)).toString());
		result.add(value.to(SI.PICO(SI.FARAD)).toString());

		return result;
	}

	public static double microToMetric(double input)
	{
		Measure<Double, ElectricCapacitance> value = Measure.valueOf(input, SI.MICRO(SI.FARAD));
		return value.doubleValue(SI.FARAD);
	}

	public static List<String> milliConvert(double val)
	{
		Measure<Double, ElectricCapacitance> value = Measure.valueOf(val, SI.MILLI(SI.FARAD));
		List<String> result = new ArrayList<String>();
		result.add(value.to(SI.FARAD).toString());
		result.add(value.toString());
		result.add(value.to(SI.MICRO(SI.FARAD)).toString());
		result.add(value.to(SI.NANO(SI.FARAD)).toString());
		result.add(value.to(SI.PICO(SI.FARAD)).toString());

		return result;
	}

	public static double milliToMetric(double input)
	{
		Measure<Double, ElectricCapacitance> value = Measure.valueOf(input, SI.MILLI(SI.FARAD));
		return value.doubleValue(SI.FARAD);
	}

	public static List<String> nanoConvert(double val)
	{
		Measure<Double, ElectricCapacitance> value = Measure.valueOf(val, SI.NANO(SI.FARAD));
		List<String> result = new ArrayList<String>();
		result.add(value.to(SI.FARAD).toString());
		result.add(value.to(SI.MILLI(SI.FARAD)).toString());
		result.add(value.to(SI.MICRO(SI.FARAD)).toString());
		result.add(value.toString());
		result.add(value.to(SI.PICO(SI.FARAD)).toString());

		return result;
	}

	public static double nanoToMetric(double input)
	{
		Measure<Double, ElectricCapacitance> value = Measure.valueOf(input, SI.NANO(SI.FARAD));
		return value.doubleValue(SI.FARAD);
	}

	public static List<String> picoConvert(double val)
	{
		Measure<Double, ElectricCapacitance> value = Measure.valueOf(val, SI.PICO(SI.FARAD));
		List<String> result = new ArrayList<String>();
		result.add(value.to(SI.FARAD).toString());
		result.add(value.to(SI.MILLI(SI.FARAD)).toString());
		result.add(value.to(SI.MICRO(SI.FARAD)).toString());
		result.add(value.to(SI.NANO(SI.FARAD)).toString());
		result.add(value.toString());

		return result;
	}

	public static double picoToMetric(double input)
	{
		Measure<Double, ElectricCapacitance> value = Measure.valueOf(input, SI.PICO(SI.FARAD));
		return value.doubleValue(SI.FARAD);
	}

	public MathMain()
	{
		super();
	}

}