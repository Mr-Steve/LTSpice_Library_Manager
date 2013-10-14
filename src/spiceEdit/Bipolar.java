/**
 * 
 */
package spiceEdit;

/**
 * @author adm
 * 
 */
public class Bipolar
{

	/**
	 * Forward active current gain B(F) Hfe
	 */
	public String BF;

	/**
	 * Reverse active current gain B(R) hie
	 */
	public String BR;

	/**
	 * C-B breakdown voltage.
	 */
	public String BVcbo;

	/**
	 * Base-collector zero-bias junction capacitance C(j0,BC)
	 */
	public String CJC;

	/**
	 * Base-emitter zero-bias junction capacitance C(j0,BE)
	 */
	public String CJE;

	/**
	 * substrate zero-bias p-n capacitance
	 */
	public String CJS;

	/**
	 * Energy gap for temperature effect on IS
	 */
	public String EG;

	/**
	 * forward-bias depletion capacitor coefficient
	 */
	public String FC;

	/**
	 * Corner for forward-beta high-current roll-off
	 */
	public String IKF;

	/**
	 * corner for reverse-beta high-current roll-off
	 */
	public String IKR;

	/**
	 * Transport saturation current I(s,n) I(C) = I(s)e^(v(BE)/V(T))
	 */
	public String IS;

	/**
	 * base-collector leakage saturation current
	 */
	public String ISC;

	/**
	 * base-emitter leakage saturation current
	 */
	public String ISE;

	/**
	 * substrate p-n saturation current
	 */
	public String ISS;

	/**
	 * transit time dependency on Ic
	 */
	public String ITF;

	/**
	 * flicker noise coefficient
	 */
	public String KF;

	/**
	 * The manufacturer
	 */
	public String MFG;

	/**
	 * base-collector capacitance exponent
	 */
	public String MJC;

	/**
	 * Base-emitter capacitance exponent
	 */
	public String MJE;

	/**
	 * substrate p-n grading factor
	 */
	public String MJS;

	/**
	 * The diode model.
	 */
	public String model;

	/**
	 * base-collector leakage emission coefficient
	 */
	public String NC;

	/**
	 * base-emitter leakage emission coefficient
	 */
	public String NE;

	/**
	 * Forward mode ideality factor n(F)
	 */
	public String NF;

	/**
	 * Reverse mode ideality factor n(R)
	 */
	public String NR;

	/**
	 * substrate p-n emission coefficient
	 */
	public String NS;

	/**
	 * excess phase @ 1/(2π·TF)Hz
	 */
	public String PTF;

	/**
	 * zero bias base resistance
	 */
	public String RB;

	/**
	 * minimum base resistance
	 */
	public String RBM;

	/**
	 * Collector resistance
	 */
	public String RC;

	/**
	 * Emitter resistance
	 */
	public String RE;

	/**
	 * forward transit time (for b-e diffusion capacitance)
	 */
	public String TF;

	/**
	 * Parameter measurement temperatur
	 */
	public String TNOM;

	/**
	 * forward transit time (for b-c diffusion capacitance)
	 */
	public String TR;

	/**
	 * NPN or PNP
	 */
	public String type;

	/**
	 * Forward mode early voltage V(A,F) r(o)I(C)
	 */
	public String VAF;

	/**
	 * Reverse mode early voltage V(A,R)
	 */
	public String VAR;

	/**
	 * Base-collector built-in potential φ(i,BC)
	 */
	public String VJC;

	/**
	 * Base-emitter built-in potential φ(i,BE)
	 */
	public String VJE;

	/**
	 * substrate p-n built-in potential
	 */
	public String VJS;

	/**
	 * transit time dependency on Vbc
	 */
	public String VTF;

	/**
	 * forward and reverse beta temperature coefficient
	 */
	public String XTB;

	/**
	 * transit time bias dependence coefficient
	 */
	public String XTF;

	/**
	 * IS temperature effect exponent
	 */
	public String XTI;

	/**
	 * @return the bF
	 */
	public String getBF()
	{
		return BF;
	}

	/**
	 * @return the bR
	 */
	public String getBR()
	{
		return BR;
	}

	/**
	 * @return the bVcbo
	 */
	public String getBVcbo()
	{
		return BVcbo;
	}

	/**
	 * @return the cJC
	 */
	public String getCJC()
	{
		return CJC;
	}

	/**
	 * @return the cJE
	 */
	public String getCJE()
	{
		return CJE;
	}

	/**
	 * @return the cJS
	 */
	public String getCJS()
	{
		return CJS;
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
	 * @return the iKF
	 */
	public String getIKF()
	{
		return IKF;
	}

	/**
	 * @return the iKR
	 */
	public String getIKR()
	{
		return IKR;
	}

	/**
	 * @return the iS
	 */
	public String getIS()
	{
		return IS;
	}

	/**
	 * @return the iSC
	 */
	public String getISC()
	{
		return ISC;
	}

	/**
	 * @return the iSE
	 */
	public String getISE()
	{
		return ISE;
	}

	/**
	 * @return the iSS
	 */
	public String getISS()
	{
		return ISS;
	}

	/**
	 * @return the iTF
	 */
	public String getITF()
	{
		return ITF;
	}

	/**
	 * @return the kF
	 */
	public String getKF()
	{
		return KF;
	}

	/**
	 * @return the mFG
	 */
	public String getMFG()
	{
		return MFG;
	}

	/**
	 * @return the mJC
	 */
	public String getMJC()
	{
		return MJC;
	}

	/**
	 * @return the mJE
	 */
	public String getMJE()
	{
		return MJE;
	}

	/**
	 * @return the mJS
	 */
	public String getMJS()
	{
		return MJS;
	}

	/**
	 * @return the model
	 */
	public String getModel()
	{
		return model;
	}

	/**
	 * @return the nC
	 */
	public String getNC()
	{
		return NC;
	}

	/**
	 * @return the nE
	 */
	public String getNE()
	{
		return NE;
	}

	/**
	 * @return the nF
	 */
	public String getNF()
	{
		return NF;
	}

	/**
	 * @return the nR
	 */
	public String getNR()
	{
		return NR;
	}

	/**
	 * @return the nS
	 */
	public String getNS()
	{
		return NS;
	}

	/**
	 * @return the pTF
	 */
	public String getPTF()
	{
		return PTF;
	}

	/**
	 * @return the rB
	 */
	public String getRB()
	{
		return RB;
	}

	/**
	 * @return the rBM
	 */
	public String getRBM()
	{
		return RBM;
	}

	/**
	 * @return the rC
	 */
	public String getRC()
	{
		return RC;
	}

	/**
	 * @return the rE
	 */
	public String getRE()
	{
		return RE;
	}

	/**
	 * @return the tF
	 */
	public String getTF()
	{
		return TF;
	}

	/**
	 * @return the tNOM
	 */
	public String getTNOM()
	{
		return TNOM;
	}

	/**
	 * @return the tR
	 */
	public String getTR()
	{
		return TR;
	}

	/**
	 * @return the type
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * @return the vAF
	 */
	public String getVAF()
	{
		return VAF;
	}

	/**
	 * @return the vAR
	 */
	public String getVAR()
	{
		return VAR;
	}

	/**
	 * @return the vJC
	 */
	public String getVJC()
	{
		return VJC;
	}

	/**
	 * @return the vJE
	 */
	public String getVJE()
	{
		return VJE;
	}

	/**
	 * @return the vJS
	 */
	public String getVJS()
	{
		return VJS;
	}

	/**
	 * @return the vTF
	 */
	public String getVTF()
	{
		return VTF;
	}

	/**
	 * @return the xTB
	 */
	public String getXTB()
	{
		return XTB;
	}

	/**
	 * @return the xTF
	 */
	public String getXTF()
	{
		return XTF;
	}

	/**
	 * @return the xTI
	 */
	public String getXTI()
	{
		return XTI;
	}

	/**
	 * @param bF the bF to set
	 */
	public void setBF(String bF)
	{
        BF = bF;
	}

	/**
	 * @param bR the bR to set
	 */
	public void setBR(String bR)
	{
        BR = bR;
	}

	/**
	 * @param bVcbo the bVcbo to set
	 */
	public void setBVcbo(String bVcbo)
	{
        BVcbo = bVcbo;
	}

	/**
	 * @param cJC the cJC to set
	 */
	public void setCJC(String cJC)
	{
        CJC = cJC;
	}

	/**
	 * @param cJE the cJE to set
	 */
	public void setCJE(String cJE)
	{
        CJE = cJE;
	}

	/**
	 * @param cJS the cJS to set
	 */
	public void setCJS(String cJS)
	{
        CJS = cJS;
	}

	/**
	 * @param eG the eG to set
	 */
	public void setEG(String eG)
	{
        EG = eG;
	}

	/**
	 * @param fC the fC to set
	 */
	public void setFC(String fC)
	{
        FC = fC;
	}

	/**
	 * @param iKF the iKF to set
	 */
	public void setIKF(String iKF)
	{
        IKF = iKF;
	}

	/**
	 * @param iKR the iKR to set
	 */
	public void setIKR(String iKR)
	{
        IKR = iKR;
	}

	/**
	 * @param iS the iS to set
	 */
	public void setIS(String iS)
	{
        IS = iS;
	}

	/**
	 * @param iSC the iSC to set
	 */
	public void setISC(String iSC)
	{
        ISC = iSC;
	}

	/**
	 * @param iSE the iSE to set
	 */
	public void setISE(String iSE)
	{
        ISE = iSE;
	}

	/**
	 * @param iSS the iSS to set
	 */
	public void setISS(String iSS)
	{
        ISS = iSS;
	}

	/**
	 * @param iTF the iTF to set
	 */
	public void setITF(String iTF)
	{
        ITF = iTF;
	}

	/**
	 * @param kF the kF to set
	 */
	public void setKF(String kF)
	{
        KF = kF;
	}

	/**
	 * @param mFG the mFG to set
	 */
	public void setMFG(String mFG)
	{
        MFG = mFG;
	}

	/**
	 * @param mJC the mJC to set
	 */
	public void setMJC(String mJC)
	{
        MJC = mJC;
	}

	/**
	 * @param mJE the mJE to set
	 */
	public void setMJE(String mJE)
	{
        MJE = mJE;
	}

	/**
	 * @param mJS the mJS to set
	 */
	public void setMJS(String mJS)
	{
        MJS = mJS;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model)
	{
		this.model = model;
	}

	/**
	 * @param nC the nC to set
	 */
	public void setNC(String nC)
	{
        NC = nC;
	}

	/**
	 * @param nE the nE to set
	 */
	public void setNE(String nE)
	{
        NE = nE;
	}

	/**
	 * @param nF the nF to set
	 */
	public void setNF(String nF)
	{
        NF = nF;
	}

	/**
	 * @param nR the nR to set
	 */
	public void setNR(String nR)
	{
        NR = nR;
	}

	/**
	 * @param nS the nS to set
	 */
	public void setNS(String nS)
	{
        NS = nS;
	}

	/**
	 * @param pTF the pTF to set
	 */
	public void setPTF(String pTF)
	{
        PTF = pTF;
	}

	/**
	 * @param rB the rB to set
	 */
	public void setRB(String rB)
	{
        RB = rB;
	}

	/**
	 * @param rBM the rBM to set
	 */
	public void setRBM(String rBM)
	{
        RBM = rBM;
	}

	/**
	 * @param rC the rC to set
	 */
	public void setRC(String rC)
	{
        RC = rC;
	}

	/**
	 * @param rE the rE to set
	 */
	public void setRE(String rE)
	{
        RE = rE;
	}

	/**
	 * @param tF the tF to set
	 */
	public void setTF(String tF)
	{
        TF = tF;
	}

	/**
	 * @param tNOM the tNOM to set
	 */
	public void setTNOM(String tNOM)
	{
        TNOM = tNOM;
	}

	/**
	 * @param tR the tR to set
	 */
	public void setTR(String tR)
	{
        TR = tR;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type)
	{
		this.type = type;
	}

	/**
	 * @param vAF the vAF to set
	 */
	public void setVAF(String vAF)
	{
        VAF = vAF;
	}

	/**
	 * @param vAR the vAR to set
	 */
	public void setVAR(String vAR)
	{
        VAR = vAR;
	}

	/**
	 * @param vJC the vJC to set
	 */
	public void setVJC(String vJC)
	{
        VJC = vJC;
	}

	/**
	 * @param vJE the vJE to set
	 */
	public void setVJE(String vJE)
	{
        VJE = vJE;
	}

	/**
	 * @param vJS the vJS to set
	 */
	public void setVJS(String vJS)
	{
        VJS = vJS;
	}

	/**
	 * @param vTF the vTF to set
	 */
	public void setVTF(String vTF)
	{
        VTF = vTF;
	}

	/**
	 * @param xTB the xTB to set
	 */
	public void setXTB(String xTB)
	{
        XTB = xTB;
	}

	/**
	 * @param xTF the xTF to set
	 */
	public void setXTF(String xTF)
	{
        XTF = xTF;
	}

	/**
	 * @param xTI the xTI to set
	 */
	public void setXTI(String xTI)
	{
        XTI = xTI;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Bipolar [");
		if (BF != null)
		{
			builder.append("BF=");
			builder.append(BF);
			builder.append(", ");
		}
		if (BR != null)
		{
			builder.append("BR=");
			builder.append(BR);
			builder.append(", ");
		}
		if (BVcbo != null)
		{
			builder.append("BVcbo=");
			builder.append(BVcbo);
			builder.append(", ");
		}
		if (CJC != null)
		{
			builder.append("CJC=");
			builder.append(CJC);
			builder.append(", ");
		}
		if (CJE != null)
		{
			builder.append("CJE=");
			builder.append(CJE);
			builder.append(", ");
		}
		if (CJS != null)
		{
			builder.append("CJS=");
			builder.append(CJS);
			builder.append(", ");
		}
		if (EG != null)
		{
			builder.append("EG=");
			builder.append(EG);
			builder.append(", ");
		}
		if (FC != null)
		{
			builder.append("FC=");
			builder.append(FC);
			builder.append(", ");
		}
		if (IKF != null)
		{
			builder.append("IKF=");
			builder.append(IKF);
			builder.append(", ");
		}
		if (IKR != null)
		{
			builder.append("IKR=");
			builder.append(IKR);
			builder.append(", ");
		}
		if (IS != null)
		{
			builder.append("IS=");
			builder.append(IS);
			builder.append(", ");
		}
		if (ISC != null)
		{
			builder.append("ISC=");
			builder.append(ISC);
			builder.append(", ");
		}
		if (ISE != null)
		{
			builder.append("ISE=");
			builder.append(ISE);
			builder.append(", ");
		}
		if (ISS != null)
		{
			builder.append("ISS=");
			builder.append(ISS);
			builder.append(", ");
		}
		if (ITF != null)
		{
			builder.append("ITF=");
			builder.append(ITF);
			builder.append(", ");
		}
		if (KF != null)
		{
			builder.append("KF=");
			builder.append(KF);
			builder.append(", ");
		}
		if (MFG != null)
		{
			builder.append("MFG=");
			builder.append(MFG);
			builder.append(", ");
		}
		if (MJC != null)
		{
			builder.append("MJC=");
			builder.append(MJC);
			builder.append(", ");
		}
		if (MJE != null)
		{
			builder.append("MJE=");
			builder.append(MJE);
			builder.append(", ");
		}
		if (MJS != null)
		{
			builder.append("MJS=");
			builder.append(MJS);
			builder.append(", ");
		}
		if (model != null)
		{
			builder.append("model=");
			builder.append(model);
			builder.append(", ");
		}
		if (NC != null)
		{
			builder.append("NC=");
			builder.append(NC);
			builder.append(", ");
		}
		if (NE != null)
		{
			builder.append("NE=");
			builder.append(NE);
			builder.append(", ");
		}
		if (NF != null)
		{
			builder.append("NF=");
			builder.append(NF);
			builder.append(", ");
		}
		if (NR != null)
		{
			builder.append("NR=");
			builder.append(NR);
			builder.append(", ");
		}
		if (NS != null)
		{
			builder.append("NS=");
			builder.append(NS);
			builder.append(", ");
		}
		if (PTF != null)
		{
			builder.append("PTF=");
			builder.append(PTF);
			builder.append(", ");
		}
		if (RB != null)
		{
			builder.append("RB=");
			builder.append(RB);
			builder.append(", ");
		}
		if (RBM != null)
		{
			builder.append("RBM=");
			builder.append(RBM);
			builder.append(", ");
		}
		if (RC != null)
		{
			builder.append("RC=");
			builder.append(RC);
			builder.append(", ");
		}
		if (RE != null)
		{
			builder.append("RE=");
			builder.append(RE);
			builder.append(", ");
		}
		if (TF != null)
		{
			builder.append("TF=");
			builder.append(TF);
			builder.append(", ");
		}
		if (TNOM != null)
		{
			builder.append("TNOM=");
			builder.append(TNOM);
			builder.append(", ");
		}
		if (TR != null)
		{
			builder.append("TR=");
			builder.append(TR);
			builder.append(", ");
		}
		if (type != null)
		{
			builder.append("type=");
			builder.append(type);
			builder.append(", ");
		}
		if (VAF != null)
		{
			builder.append("VAF=");
			builder.append(VAF);
			builder.append(", ");
		}
		if (VAR != null)
		{
			builder.append("VAR=");
			builder.append(VAR);
			builder.append(", ");
		}
		if (VJC != null)
		{
			builder.append("VJC=");
			builder.append(VJC);
			builder.append(", ");
		}
		if (VJE != null)
		{
			builder.append("VJE=");
			builder.append(VJE);
			builder.append(", ");
		}
		if (VJS != null)
		{
			builder.append("VJS=");
			builder.append(VJS);
			builder.append(", ");
		}
		if (VTF != null)
		{
			builder.append("VTF=");
			builder.append(VTF);
			builder.append(", ");
		}
		if (XTB != null)
		{
			builder.append("XTB=");
			builder.append(XTB);
			builder.append(", ");
		}
		if (XTF != null)
		{
			builder.append("XTF=");
			builder.append(XTF);
			builder.append(", ");
		}
		if (XTI != null)
		{
			builder.append("XTI=");
			builder.append(XTI);
		}
		builder.append(']');
		return builder.toString();
	}
}
