package spiceEdit;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 * http://www-ee.uta.edu/online/jung/EE3444/pdfs/SPICEdiodeModel.pdf was a God
 * send
 * @author adm
 * 
 */
public class Diode
{
	private static final String TOSTRINGCOMMA = ", ";

	/**
	 * The diode model.
	 */
	private String model;

	/**
	 * Saturation Current. Is
	 */
	private String IS;

	/**
	 * Parasitic resistance Rs
	 */
	private String RS;

	/**
	 * Emission coefficient n
	 */
	private String N;

	/**
	 * Transit time Td
	 */
	private String TT;

	/**
	 * Zero-bias junction capacitance CD(0)
	 */
	private String CJO;

	/**
	 * Junction potential φ0
	 */
	private String VJ;

	/**
	 * Junction grading coefficient m
	 */
	private String M;

	/**
	 * Activation energy Si: 1.11 Ge: 0.67 Schottky: 0.69 Eg
	 */
	private String EG;

	/**
	 * IS temperature exponent pi
	 */
	private String XTI;

	/**
	 * Flicker noise coefficient kf
	 */
	private String KF;

	/**
	 * Flicker noise exponent af
	 */
	private String AF;

	/**
	 * Forward bias depletion capacitance coefficient FC
	 */
	private String FC;

	/**
	 * Reverse breakdown voltage BV
	 */
	private String BV;

	/**
	 * Reverse breakdown current IBV
	 */
	private String IBV;

	/**
	 * Parameter measurement temperature
	 */
	private String TNOM;

	/**
	 * The manufacturer
	 */
	private String MFG;

	/**
	 * The diode type
	 */
	private String type;

	/**
	 * Average current rating
	 */
	private String IAVE;

	/**
	 * Peak voltage rating
	 */
	private String VPK;

	/**
	 * Peak current rating
	 */
	private String IPK;

	/**
	 * Reverse breakdown ideality factor
	 */
	private String NBV;

	/**
	 * Isr emissions coefficent
	 */
	private String NR;

	/**
	 * High-injection knee current
	 */
	private String IKF;

	/**
	 * Recombination current parameter
	 */
	private String ISR;

	/**
	 * Maximum power dissipation rating
	 */
	private String DISS;

	/**
	 * Temperature rise over ambient
	 */
	private String TRISE;

	/**
	 * Bottom junction leakage conductance
	 */
	private String GLEAK;
	
	/**
	 * Line in the file
	 */
	private String LINE;

	private Object[] parameters = { "Parameter Name", "Value", "Units", "Info" };

	public TableModel getTableModel()
	{


		Object[][] data = {
				{ ".Model", model, "", "The model of the diode" },
				{ "MFG", MFG, "", "The manufacturer" },
				{ "Type", type, "", "The diode type" },
				{ "TNOM", TNOM, "°C", "The temperature which parameters are measured" },
				{ "IPK", IPK, "Amps", "Peak forward current rating. Take fomr datasheet" },
				{ "VPK", VPK, "Volts", "Peak forward voltage rating. Take from datasheet" },
				{ "BV", BV, "Volts", "Reverse breakdown knee voltage. Datasheet VRM or Vbr (Vz for zener)" },
				{ "CJO", CJO, "Farads", "Zero-bias p-n capacitance. Datasheet Cj or Ctot.  Calculator available." },
				{ "IBV", IBV, "Amps", "Maximum leakage current. Datasheet ~10*Ir (or Ibr or Izk for zener)" },
				{ "M", M, "",
						"Range of .25 to .45. Low V zeners ~.25, 50-100V .33, <100V .45. Default .5.  Calculator available." },
				{
						"TT",
						TT,
						"Seconds",
						"Transit time. (use ms, ns, us) ~τD =  QRR/IF (QRR=reverse recovery stored charge, IF=forward current. Calculator available." },
				{ "EG", EG, "Electron Volt",
						"standard value of 1.1 eV, while it's 0.7 eV for Schottky diode and 0.67 eV for germanium diodes." },
				{ "N", N, "",
						"The N value ranges between 1.0 and about 2.0. Adjust to match I-V curvature.  Calculator available." },
				{ "IS", IS, "Amps", "Saturation current. Calculator available." },
				{ "RS", RS, "Ohms", "Parasitic resistance. Calculator available." },
				{ "VJ", VJ, "Volts", "Junction potential. Calculator available." },
				{ "XTI", XTI, "", "IS temperature exponent. Calculator available." },
				{ "AF", AF, "", "Default 1. No known calculation from datasheet." },
				{ "DISS", DISS, "Watts", "Maximum power dissipation rating." },
				{ "FC", FC, "", "Forward bias depletion capacitance coefficient. Default 0.5" },
				{ "GLEAK", GLEAK, "", "Bottom junction leakage conductance" },
				{ "IAVE", IAVE, "Amps", "Average current rating. Take from datasheet." },
				{ "IKF", IKF, "Amps", "High-injection knee current. Current at the start of the knee." },

				{
						"ISR",
						ISR,
						"Amps",
						"",
						"Recombination current parameter. No known calculation from datasheet. Might be possible. See: http://www.uta.edu/ronc/5342/lectures/L12_5342_Sp11.ppt" },
				{ "KF", KF, "", "Flicker noise coefficient kf." },
				{ "NBV", NBV, "", "Reverse breakdown ideality factor. No known calculation from datasheet." },
				{ "NR", NR, "", "Isr emissions coefficent. No known calculation from datasheet" },
				{ "TRISE", TRISE, "Celcius", "Temperature rise over ambient" }

		};

		return new DefaultTableModel(data, parameters);
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	/**
	 * @return the aF
	 */
	public String getAF()
	{
		return AF;
	}

	/**
	 * @return the bV
	 */
	public String getBV()
	{
		return BV;
	}

	/**
	 * @return the cJO
	 */
	public String getCJO()
	{
		return CJO;
	}

	public Object[][] getData()
	{

		return new Object[][] { { "Model", model, "The model of the diode" } };

	}

	/**
	 * @return the dISS
	 */
	public String getDISS()
	{
		return DISS;
	}

	/**
	 * @return the eG
	 */
	public String getEG()
	{
		return EG;
	}

	/**
	 * @return the fC
	 */
	public String getFC()
	{
		return FC;
	}

	/**
	 * @return the gLEAK
	 */
	public String getGLEAK()
	{
		return GLEAK;
	}

	/**
	 * @return the iAVE
	 */
	public String getIAVE()
	{
		return IAVE;
	}

	/**
	 * @return the iBV
	 */
	public String getIBV()
	{
		return IBV;
	}

	/**
	 * @return the iKF
	 */
	public String getIKF()
	{
		return IKF;
	}

	/**
	 * @return the iPK
	 */
	public String getIPK()
	{
		return IPK;
	}

	/**
	 * @return the iS
	 */
	public String getIS()
	{
		return IS;
	}

	/**
	 * @return the iSR
	 */
	public String getISR()
	{
		return ISR;
	}

	/**
	 * @return the kF
	 */
	public String getKF()
	{
		return KF;
	}

	/**
	 * @return the m
	 */
	public String getM()
	{
		return M;
	}

	/**
	 * @return the mFG
	 */
	public String getMFG()
	{
		return MFG;
	}

	/**
	 * @return the model
	 */
	public String getModel()
	{
		return model;
	}

	/**
	 * @return the n
	 */
	public String getN()
	{
		return N;
	}

	/**
	 * @return the nBV
	 */
	public String getNBV()
	{
		return NBV;
	}

	/**
	 * @return the nR
	 */
	public String getNR()
	{
		return NR;
	}

	public Object[] getParameters()
	{
		return parameters;
	}

	/**
	 * @return the rS
	 */
	public String getRS()
	{
		return RS;
	}

	/**
	 * @return the tNOM
	 */
	public String getTNOM()
	{
		return TNOM;
	}

	/**
	 * @return the tRISE
	 */
	public String getTRISE()
	{
		return TRISE;
	}

	/**
	 * @return the tT
	 */
	public String getTT()
	{
		return TT;
	}

	/**
	 * @return the type
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * @return the vJ
	 */
	public String getVJ()
	{
		return VJ;
	}

	/**
	 * @return the vPK
	 */
	public String getVPK()
	{
		return VPK;
	}

	/**
	 * @return the xTI
	 */
	public String getXTI()
	{
		return XTI;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	/**
	 * @param aF the aF to set
	 */
	public void setAF(String aF)
	{
		AF = aF;
	}

	/**
	 * @param bV the bV to set
	 */
	public void setBV(String bV)
	{
		BV = bV;
	}

	/**
	 * @param cJO the cJO to set
	 */
	public void setCJO(String cJO)
	{
		CJO = cJO;
	}

	/**
	 * @param dISS the dISS to set
	 */
	public void setDISS(String dISS)
	{
		DISS = dISS;
	}

	/**
	 * Sets the energy gap.
	 * @param eG the eG to set
	 */
	public final void setEG(final String eG)
	{
		this.EG = eG;
	}

	/**
	 * @param fC the fC to set
	 */
	public void setFC(String fC)
	{
		FC = fC;
	}

	/**
	 * @param gLEAK the gLEAK to set
	 */
	public void setGLEAK(String gLEAK)
	{
		GLEAK = gLEAK;
	}

	/**
	 * @param iAVE the iAVE to set
	 */
	public void setIAVE(String iAVE)
	{
		IAVE = iAVE;
	}

	/**
	 * @param iBV the iBV to set
	 */
	public void setIBV(String iBV)
	{
		IBV = iBV;
	}

	/**
	 * @param iKF the iKF to set
	 */
	public void setIKF(String iKF)
	{
		IKF = iKF;
	}

	/**
	 * @param iPK the iPK to set
	 */
	public void setIPK(String iPK)
	{
		IPK = iPK;
	}

	/**
	 * @param iS the iS to set
	 */
	public void setIS(String iS)
	{
		IS = iS;
	}

	/**
	 * @param iSR the iSR to set
	 */
	public void setISR(String iSR)
	{
		ISR = iSR;
	}

	/**
	 * @param kF the kF to set
	 */
	public void setKF(String kF)
	{
		KF = kF;
	}

	/**
	 * @param m the m to set
	 */
	public void setM(String m)
	{
		M = m;
	}

	/**
	 * @param mFG the mFG to set
	 */
	public void setMFG(String mFG)
	{
		MFG = mFG;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model)
	{
		this.model = model;
	}

	/**
	 * @param n the n to set
	 */
	public void setN(String n)
	{
		N = n;
	}

	/**
	 * @param nBV the nBV to set
	 */
	public void setNBV(String nBV)
	{
		NBV = nBV;
	}

	/**
	 * @param nR the nR to set
	 */
	public void setNR(String nR)
	{
		NR = nR;
	}

	public void setParameters(String[] parameters)
	{
		this.parameters = parameters;
	}

	/**
	 * @param rS the rS to set
	 */
	public void setRS(String rS)
	{
		RS = rS;
	}

	/**
	 * @param tNOM the tNOM to set
	 */
	public void setTNOM(String tNOM)
	{
		this.TNOM = tNOM;
	}

	/**
	 * @param tRISE the tRISE to set
	 */
	public final void setTRISE(String tRISE)
	{
		this.TRISE = tRISE;
	}

	/**
	 * @param tT the tT to set
	 */
	public final void setTT(String tT)
	{
		this.TT = tT;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type)
	{
		this.type = type;
	}

	/**
	 * @param vJ the vJ to set
	 */
	public void setVJ(String vJ)
	{
		this.VJ = vJ;
	}

	/**
	 * @param vPK the vPK to set
	 */
	public void setVPK(String vPK)
	{
		this.VPK = vPK;
	}

	/**
	 * @param xTI the xTI to set
	 */
	public final void setXTI(String xTI)
	{
		this.XTI = xTI;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public final String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Diode [");
		if (model != null)
		{
			builder.append("model=");
			builder.append(model);
			builder.append(TOSTRINGCOMMA);
		}
		if (IS != null)
		{
			builder.append("IS=");
			builder.append(IS);
			builder.append(TOSTRINGCOMMA);
		}
		if (RS != null)
		{
			builder.append("RS=");
			builder.append(RS);
			builder.append(TOSTRINGCOMMA);
		}
		if (N != null)
		{
			builder.append("N=");
			builder.append(N);
			builder.append(TOSTRINGCOMMA);
		}
		if (TT != null)
		{
			builder.append("TT=");
			builder.append(TT);
			builder.append(TOSTRINGCOMMA);
		}
		if (CJO != null)
		{
			builder.append("CJO=");
			builder.append(CJO);
			builder.append(TOSTRINGCOMMA);
		}
		if (VJ != null)
		{
			builder.append("VJ=");
			builder.append(VJ);
			builder.append(TOSTRINGCOMMA);
		}
		if (M != null)
		{
			builder.append("M=");
			builder.append(M);
			builder.append(TOSTRINGCOMMA);
		}
		if (EG != null)
		{
			builder.append("EG=");
			builder.append(EG);
			builder.append(TOSTRINGCOMMA);
		}
		if (XTI != null)
		{
			builder.append("XTI=");
			builder.append(XTI);
			builder.append(TOSTRINGCOMMA);
		}
		if (KF != null)
		{
			builder.append("KF=");
			builder.append(KF);
			builder.append(TOSTRINGCOMMA);
		}
		if (AF != null)
		{
			builder.append("AF=");
			builder.append(AF);
			builder.append(TOSTRINGCOMMA);
		}
		if (FC != null)
		{
			builder.append("FC=");
			builder.append(FC);
			builder.append(TOSTRINGCOMMA);
		}
		if (BV != null)
		{
			builder.append("BV=");
			builder.append(BV);
			builder.append(TOSTRINGCOMMA);
		}
		if (IBV != null)
		{
			builder.append("IBV=");
			builder.append(IBV);
			builder.append(TOSTRINGCOMMA);
		}
		if (TNOM != null)
		{
			builder.append("TNOM=");
			builder.append(TNOM);
			builder.append(TOSTRINGCOMMA);
		}
		if (IAVE != null)
		{
			builder.append("IAVE=");
			builder.append(IAVE);
			builder.append(TOSTRINGCOMMA);
		}
		if (VPK != null)
		{
			builder.append("VPK=");
			builder.append(VPK);
			builder.append(TOSTRINGCOMMA);
		}
		if (IPK != null)
		{
			builder.append("IPK=");
			builder.append(IPK);
			builder.append(TOSTRINGCOMMA);
		}
		if (NBV != null)
		{
			builder.append("NBV=");
			builder.append(NBV);
			builder.append(TOSTRINGCOMMA);
		}
		if (NR != null)
		{
			builder.append("NR=");
			builder.append(NR);
			builder.append(TOSTRINGCOMMA);
		}
		if (IKF != null)
		{
			builder.append("IKF=");
			builder.append(IKF);
			builder.append(TOSTRINGCOMMA);
		}
		if (ISR != null)
		{
			builder.append("ISR=");
			builder.append(ISR);
			builder.append(TOSTRINGCOMMA);
		}
		if (DISS != null)
		{
			builder.append("DISS=");
			builder.append(DISS);
			builder.append(TOSTRINGCOMMA);
		}
		if (TRISE != null)
		{
			builder.append("TRISE=");
			builder.append(TRISE);
			builder.append(TOSTRINGCOMMA);
		}
		if (GLEAK != null)
		{
			builder.append("GLEAK=");
			builder.append(GLEAK);
		}
		if (MFG != null)
		{
			builder.append("MFG=");
			builder.append(MFG);
			builder.append(TOSTRINGCOMMA);
		}
		if (type != null)
		{
			builder.append("type=");
			builder.append(type);
			builder.append(TOSTRINGCOMMA);
		}

		builder.append(']');
		return builder.toString();
	}

	public String getLINE()
	{
		return LINE;
	}

	public void setLINE(String lINE)
	{
		LINE = lINE;
	}
}
