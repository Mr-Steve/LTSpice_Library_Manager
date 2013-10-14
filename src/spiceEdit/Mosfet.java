package spiceEdit;

public class Mosfet
{
	/**
	 * Flicker noise exponent
	 */
	public String AF;

	/**
	 * zero-bias bulk-drain pn capacitance
	 */
	public String CBD;

	/**
	 * zero-bias bulk-source pn capacitance
	 */
	public String CBS;

	/**
	 * gate-bulk overlap capacitance/channel length
	 */
	public String CGBO;

	/**
	 * gate-drain overlap capacitance/channel width
	 */
	public String CGDO;

	/**
	 * gate-source overlap capacitance/channel width
	 */
	public String CGSO;

	/**
	 * bulk p-n zero-bias bottom capacitance/area
	 */
	public String CJ;

	/**
	 * bulk p-n zero-bias sidewall capacitance/length
	 */
	public String CJSW;

	/**
	 * width effect on threshold
	 */
	public String DELTA;

	/**
	 * static feedback
	 */
	public String ETA;

	/**
	 * bulk p-n forward-bias capacitance coefficient
	 */
	public String FC;

	/**
	 * bulk threshold parameter
	 */
	public String GAMMA;

	/**
	 * channel shot noise coefficient (use with NLEV=3)
	 */
	public String GDSNOI;

	/**
	 * bulk p-n saturation current
	 */
	public String IS;

	/**
	 * bulk p-n saturation current/area
	 */
	public String JS;

	/**
	 * bulk p-n saturation sidewall current/length
	 */
	public String JSSW;

	/**
	 * flicker noise coefficient
	 */
	public String KF;

	/**
	 * transconductance coefficient
	 */
	public String KP;

	/**
	 * channel length
	 */
	public String L;

	/**
	 * channel-length modulation
	 */
	public String LAMBDA;

	/**
	 * lateral diffusion (length)
	 */
	public String LD;

	public String MFG;

	/**
	 * bulk p-n bottom grading coefficient
	 */
	public String MJ;

	/**
	 * bulk p-n sidewall grading coefficient
	 */
	public String MJSW;

	public String MODEL;

	/**
	 * bulk p-n emission coefficient
	 */
	public String N;

	/**
	 * channel charge coefficient
	 */
	public String NEFF;

	/**
	 * fast surface state density
	 */
	public String NFS;

	/**
	 * surface state density
	 */
	public String NSS;

	/**
	 * substrate doping density
	 */
	public String NSUB;

	/**
	 * bulk p-n bottom potential
	 */
	public String PB;

	/**
	 * bulk p-n sidewall potential
	 */
	public String PBSW;

	/**
	 * surface potential
	 */
	public String PHI;

	/**
	 * bulk ohmic resistance
	 */
	public String RB;

	/**
	 * drain ohmic resistance
	 */
	public String RD;

	/**
	 * drain-source shunt resistance
	 */
	public String RDS;

	/**
	 * gate ohmic resistance
	 */
	public String RG;

	/**
	 * source ohmic resistance
	 */
	public String RS;

	/**
	 * drain, source diffusion sheet resistance
	 */
	public String RSH;

	/**
	 * mobility modulation
	 */
	public String THETA;

	/**
	 * oxide thickness
	 */
	public String TOX;

	/**
	 * bulk p-n transit time
	 */
	public String TT;

	public String Type;

	/**
	 * maximum drift velocity
	 */
	public String VMAX;

	/**
	 * zero-bias threshold voltage
	 */
	public String VTO;

	/**
	 * Channel width
	 */
	public String W;

	/**
	 * lateral diffusion (width)
	 */
	public String WD;

	/**
	 * metallurgical junction depth
	 */
	public String XJ;

	/**
	 * fraction of channel charge attributed to drain
	 */
	public String XQC;

	/**
	 * @return the aF
	 */
	public synchronized String getAF()
	{
		return AF;
	}

	/**
	 * @return the cBD
	 */
	public synchronized String getCBD()
	{
		return CBD;
	}

	/**
	 * @return the cBS
	 */
	public synchronized String getCBS()
	{
		return CBS;
	}

	/**
	 * @return the cGBO
	 */
	public synchronized String getCGBO()
	{
		return CGBO;
	}

	/**
	 * @return the cGDO
	 */
	public synchronized String getCGDO()
	{
		return CGDO;
	}

	/**
	 * @return the cGSO
	 */
	public synchronized String getCGSO()
	{
		return CGSO;
	}

	/**
	 * @return the cJ
	 */
	public synchronized String getCJ()
	{
		return CJ;
	}

	/**
	 * @return the cJSW
	 */
	public synchronized String getCJSW()
	{
		return CJSW;
	}

	/**
	 * @return the dELTA
	 */
	public synchronized String getDELTA()
	{
		return DELTA;
	}

	/**
	 * @return the eTA
	 */
	public synchronized String getETA()
	{
		return ETA;
	}

	/**
	 * @return the fC
	 */
	public synchronized String getFC()
	{
		return FC;
	}

	/**
	 * @return the gAMMA
	 */
	public synchronized String getGAMMA()
	{
		return GAMMA;
	}

	/**
	 * @return the gDSNOI
	 */
	public synchronized String getGDSNOI()
	{
		return GDSNOI;
	}

	/**
	 * @return the iS
	 */
	public synchronized String getIS()
	{
		return IS;
	}

	/**
	 * @return the jS
	 */
	public synchronized String getJS()
	{
		return JS;
	}

	/**
	 * @return the jSSW
	 */
	public synchronized String getJSSW()
	{
		return JSSW;
	}

	/**
	 * @return the kF
	 */
	public synchronized String getKF()
	{
		return KF;
	}

	/**
	 * @return the kP
	 */
	public synchronized String getKP()
	{
		return KP;
	}

	/**
	 * @return the l
	 */
	public synchronized String getL()
	{
		return L;
	}

	/**
	 * @return the lAMBDA
	 */
	public synchronized String getLAMBDA()
	{
		return LAMBDA;
	}

	/**
	 * @return the lD
	 */
	public synchronized String getLD()
	{
		return LD;
	}

	/**
	 * @return the mFG
	 */
	public synchronized String getMFG()
	{
		return MFG;
	}

	/**
	 * @return the mJ
	 */
	public synchronized String getMJ()
	{
		return MJ;
	}

	/**
	 * @return the mJSW
	 */
	public synchronized String getMJSW()
	{
		return MJSW;
	}

	/**
	 * @return the mODEL
	 */
	public synchronized String getMODEL()
	{
		return MODEL;
	}

	/**
	 * @return the n
	 */
	public synchronized String getN()
	{
		return N;
	}

	/**
	 * @return the nEFF
	 */
	public synchronized String getNEFF()
	{
		return NEFF;
	}

	/**
	 * @return the nFS
	 */
	public synchronized String getNFS()
	{
		return NFS;
	}

	/**
	 * @return the nSS
	 */
	public synchronized String getNSS()
	{
		return NSS;
	}

	/**
	 * @return the nSUB
	 */
	public synchronized String getNSUB()
	{
		return NSUB;
	}

	/**
	 * @return the pB
	 */
	public synchronized String getPB()
	{
		return PB;
	}

	/**
	 * @return the pBSW
	 */
	public synchronized String getPBSW()
	{
		return PBSW;
	}

	/**
	 * @return the pHI
	 */
	public synchronized String getPHI()
	{
		return PHI;
	}

	/**
	 * @return the rB
	 */
	public synchronized String getRB()
	{
		return RB;
	}

	/**
	 * @return the rD
	 */
	public synchronized String getRD()
	{
		return RD;
	}

	/**
	 * @return the rDS
	 */
	public synchronized String getRDS()
	{
		return RDS;
	}

	/**
	 * @return the rG
	 */
	public synchronized String getRG()
	{
		return RG;
	}

	/**
	 * @return the rS
	 */
	public synchronized String getRS()
	{
		return RS;
	}

	/**
	 * @return the rSH
	 */
	public synchronized String getRSH()
	{
		return RSH;
	}

	/**
	 * @return the tHETA
	 */
	public synchronized String getTHETA()
	{
		return THETA;
	}

	/**
	 * @return the tOX
	 */
	public synchronized String getTOX()
	{
		return TOX;
	}

	/**
	 * @return the tT
	 */
	public synchronized String getTT()
	{
		return TT;
	}

	/**
	 * @return the type
	 */
	public synchronized String getType()
	{
		return Type;
	}

	/**
	 * @return the vMAX
	 */
	public synchronized String getVMAX()
	{
		return VMAX;
	}

	/**
	 * @return the vTO
	 */
	public synchronized String getVTO()
	{
		return VTO;
	}

	/**
	 * @return the w
	 */
	public synchronized String getW()
	{
		return W;
	}

	/**
	 * @return the wD
	 */
	public synchronized String getWD()
	{
		return WD;
	}

	/**
	 * @return the xJ
	 */
	public synchronized String getXJ()
	{
		return XJ;
	}

	/**
	 * @return the xQC
	 */
	public synchronized String getXQC()
	{
		return XQC;
	}

	/**
	 * @param aF the aF to set
	 */
	public synchronized void setAF(String aF)
	{
		AF = aF;
	}

	/**
	 * @param cBD the cBD to set
	 */
	public synchronized void setCBD(String cBD)
	{
		CBD = cBD;
	}

	/**
	 * @param cBS the cBS to set
	 */
	public synchronized void setCBS(String cBS)
	{
		CBS = cBS;
	}

	/**
	 * @param cGBO the cGBO to set
	 */
	public synchronized void setCGBO(String cGBO)
	{
		CGBO = cGBO;
	}

	/**
	 * @param cGDO the cGDO to set
	 */
	public synchronized void setCGDO(String cGDO)
	{
		CGDO = cGDO;
	}

	/**
	 * @param cGSO the cGSO to set
	 */
	public synchronized void setCGSO(String cGSO)
	{
		CGSO = cGSO;
	}

	/**
	 * @param cJ the cJ to set
	 */
	public synchronized void setCJ(String cJ)
	{
		CJ = cJ;
	}

	/**
	 * @param cJSW the cJSW to set
	 */
	public synchronized void setCJSW(String cJSW)
	{
		CJSW = cJSW;
	}

	/**
	 * @param dELTA the dELTA to set
	 */
	public synchronized void setDELTA(String dELTA)
	{
		DELTA = dELTA;
	}

	/**
	 * @param eTA the eTA to set
	 */
	public synchronized void setETA(String eTA)
	{
		ETA = eTA;
	}

	/**
	 * @param fC the fC to set
	 */
	public synchronized void setFC(String fC)
	{
		FC = fC;
	}

	/**
	 * @param gAMMA the gAMMA to set
	 */
	public synchronized void setGAMMA(String gAMMA)
	{
		GAMMA = gAMMA;
	}

	/**
	 * @param gDSNOI the gDSNOI to set
	 */
	public synchronized void setGDSNOI(String gDSNOI)
	{
		GDSNOI = gDSNOI;
	}

	/**
	 * @param iS the iS to set
	 */
	public synchronized void setIS(String iS)
	{
		IS = iS;
	}

	/**
	 * @param jS the jS to set
	 */
	public synchronized void setJS(String jS)
	{
		JS = jS;
	}

	/**
	 * @param jSSW the jSSW to set
	 */
	public synchronized void setJSSW(String jSSW)
	{
		JSSW = jSSW;
	}

	/**
	 * @param kF the kF to set
	 */
	public synchronized void setKF(String kF)
	{
		KF = kF;
	}

	/**
	 * @param kP the kP to set
	 */
	public synchronized void setKP(String kP)
	{
		KP = kP;
	}

	/**
	 * @param l the l to set
	 */
	public synchronized void setL(String l)
	{
		L = l;
	}

	/**
	 * @param lAMBDA the lAMBDA to set
	 */
	public synchronized void setLAMBDA(String lAMBDA)
	{
		LAMBDA = lAMBDA;
	}

	/**
	 * @param lD the lD to set
	 */
	public synchronized void setLD(String lD)
	{
		LD = lD;
	}

	/**
	 * @param mFG the mFG to set
	 */
	public synchronized void setMFG(String mFG)
	{
		MFG = mFG;
	}

	/**
	 * @param mJ the mJ to set
	 */
	public synchronized void setMJ(String mJ)
	{
		MJ = mJ;
	}

	/**
	 * @param mJSW the mJSW to set
	 */
	public synchronized void setMJSW(String mJSW)
	{
		MJSW = mJSW;
	}

	/**
	 * @param mODEL the mODEL to set
	 */
	public synchronized void setMODEL(String mODEL)
	{
		MODEL = mODEL;
	}

	/**
	 * @param n the n to set
	 */
	public synchronized void setN(String n)
	{
		N = n;
	}

	/**
	 * @param nEFF the nEFF to set
	 */
	public synchronized void setNEFF(String nEFF)
	{
		NEFF = nEFF;
	}

	/**
	 * @param nFS the nFS to set
	 */
	public synchronized void setNFS(String nFS)
	{
		NFS = nFS;
	}

	/**
	 * @param nSS the nSS to set
	 */
	public synchronized void setNSS(String nSS)
	{
		NSS = nSS;
	}

	/**
	 * @param nSUB the nSUB to set
	 */
	public synchronized void setNSUB(String nSUB)
	{
		NSUB = nSUB;
	}

	/**
	 * @param pB the pB to set
	 */
	public synchronized void setPB(String pB)
	{
		PB = pB;
	}

	/**
	 * @param pBSW the pBSW to set
	 */
	public synchronized void setPBSW(String pBSW)
	{
		PBSW = pBSW;
	}

	/**
	 * @param pHI the pHI to set
	 */
	public synchronized void setPHI(String pHI)
	{
		PHI = pHI;
	}

	/**
	 * @param rB the rB to set
	 */
	public synchronized void setRB(String rB)
	{
		RB = rB;
	}

	/**
	 * @param rD the rD to set
	 */
	public synchronized void setRD(String rD)
	{
		RD = rD;
	}

	/**
	 * @param rDS the rDS to set
	 */
	public synchronized void setRDS(String rDS)
	{
		RDS = rDS;
	}

	/**
	 * @param rG the rG to set
	 */
	public synchronized void setRG(String rG)
	{
		RG = rG;
	}

	/**
	 * @param rS the rS to set
	 */
	public synchronized void setRS(String rS)
	{
		RS = rS;
	}

	/**
	 * @param rSH the rSH to set
	 */
	public synchronized void setRSH(String rSH)
	{
		RSH = rSH;
	}

	/**
	 * @param tHETA the tHETA to set
	 */
	public synchronized void setTHETA(String tHETA)
	{
		THETA = tHETA;
	}

	/**
	 * @param tOX the tOX to set
	 */
	public synchronized void setTOX(String tOX)
	{
		TOX = tOX;
	}

	/**
	 * @param tT the tT to set
	 */
	public synchronized void setTT(String tT)
	{
		TT = tT;
	}

	/**
	 * @param type the type to set
	 */
	public synchronized void setType(String type)
	{
		Type = type;
	}

	/**
	 * @param vMAX the vMAX to set
	 */
	public synchronized void setVMAX(String vMAX)
	{
		VMAX = vMAX;
	}

	/**
	 * @param vTO the vTO to set
	 */
	public synchronized void setVTO(String vTO)
	{
		VTO = vTO;
	}

	/**
	 * @param w the w to set
	 */
	public synchronized void setW(String w)
	{
		W = w;
	}

	/**
	 * @param wD the wD to set
	 */
	public synchronized void setWD(String wD)
	{
		WD = wD;
	}

	/**
	 * @param xJ the xJ to set
	 */
	public synchronized void setXJ(String xJ)
	{
		XJ = xJ;
	}

	/**
	 * @param xQC the xQC to set
	 */
	public synchronized void setXQC(String xQC)
	{
		XQC = xQC;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Mosfet [");
		if (AF != null)
		{
			builder.append("AF=");
			builder.append(AF);
			builder.append(", ");
		}
		if (CBD != null)
		{
			builder.append("CBD=");
			builder.append(CBD);
			builder.append(", ");
		}
		if (CBS != null)
		{
			builder.append("CBS=");
			builder.append(CBS);
			builder.append(", ");
		}
		if (CGBO != null)
		{
			builder.append("CGBO=");
			builder.append(CGBO);
			builder.append(", ");
		}
		if (CGDO != null)
		{
			builder.append("CGDO=");
			builder.append(CGDO);
			builder.append(", ");
		}
		if (CGSO != null)
		{
			builder.append("CGSO=");
			builder.append(CGSO);
			builder.append(", ");
		}
		if (CJ != null)
		{
			builder.append("CJ=");
			builder.append(CJ);
			builder.append(", ");
		}
		if (CJSW != null)
		{
			builder.append("CJSW=");
			builder.append(CJSW);
			builder.append(", ");
		}
		if (DELTA != null)
		{
			builder.append("DELTA=");
			builder.append(DELTA);
			builder.append(", ");
		}
		if (ETA != null)
		{
			builder.append("ETA=");
			builder.append(ETA);
			builder.append(", ");
		}
		if (FC != null)
		{
			builder.append("FC=");
			builder.append(FC);
			builder.append(", ");
		}
		if (GAMMA != null)
		{
			builder.append("GAMMA=");
			builder.append(GAMMA);
			builder.append(", ");
		}
		if (GDSNOI != null)
		{
			builder.append("GDSNOI=");
			builder.append(GDSNOI);
			builder.append(", ");
		}
		if (IS != null)
		{
			builder.append("IS=");
			builder.append(IS);
			builder.append(", ");
		}
		if (JS != null)
		{
			builder.append("JS=");
			builder.append(JS);
			builder.append(", ");
		}
		if (JSSW != null)
		{
			builder.append("JSSW=");
			builder.append(JSSW);
			builder.append(", ");
		}
		if (KF != null)
		{
			builder.append("KF=");
			builder.append(KF);
			builder.append(", ");
		}
		if (KP != null)
		{
			builder.append("KP=");
			builder.append(KP);
			builder.append(", ");
		}
		if (L != null)
		{
			builder.append("L=");
			builder.append(L);
			builder.append(", ");
		}
		if (LAMBDA != null)
		{
			builder.append("LAMBDA=");
			builder.append(LAMBDA);
			builder.append(", ");
		}
		if (LD != null)
		{
			builder.append("LD=");
			builder.append(LD);
			builder.append(", ");
		}
		if (MFG != null)
		{
			builder.append("MFG=");
			builder.append(MFG);
			builder.append(", ");
		}
		if (MJ != null)
		{
			builder.append("MJ=");
			builder.append(MJ);
			builder.append(", ");
		}
		if (MJSW != null)
		{
			builder.append("MJSW=");
			builder.append(MJSW);
			builder.append(", ");
		}
		if (MODEL != null)
		{
			builder.append("MODEL=");
			builder.append(MODEL);
			builder.append(", ");
		}
		if (N != null)
		{
			builder.append("N=");
			builder.append(N);
			builder.append(", ");
		}
		if (NEFF != null)
		{
			builder.append("NEFF=");
			builder.append(NEFF);
			builder.append(", ");
		}
		if (NFS != null)
		{
			builder.append("NFS=");
			builder.append(NFS);
			builder.append(", ");
		}
		if (NSS != null)
		{
			builder.append("NSS=");
			builder.append(NSS);
			builder.append(", ");
		}
		if (NSUB != null)
		{
			builder.append("NSUB=");
			builder.append(NSUB);
			builder.append(", ");
		}
		if (PB != null)
		{
			builder.append("PB=");
			builder.append(PB);
			builder.append(", ");
		}
		if (PBSW != null)
		{
			builder.append("PBSW=");
			builder.append(PBSW);
			builder.append(", ");
		}
		if (PHI != null)
		{
			builder.append("PHI=");
			builder.append(PHI);
			builder.append(", ");
		}
		if (RB != null)
		{
			builder.append("RB=");
			builder.append(RB);
			builder.append(", ");
		}
		if (RD != null)
		{
			builder.append("RD=");
			builder.append(RD);
			builder.append(", ");
		}
		if (RDS != null)
		{
			builder.append("RDS=");
			builder.append(RDS);
			builder.append(", ");
		}
		if (RG != null)
		{
			builder.append("RG=");
			builder.append(RG);
			builder.append(", ");
		}
		if (RS != null)
		{
			builder.append("RS=");
			builder.append(RS);
			builder.append(", ");
		}
		if (RSH != null)
		{
			builder.append("RSH=");
			builder.append(RSH);
			builder.append(", ");
		}
		if (THETA != null)
		{
			builder.append("THETA=");
			builder.append(THETA);
			builder.append(", ");
		}
		if (TOX != null)
		{
			builder.append("TOX=");
			builder.append(TOX);
			builder.append(", ");
		}
		if (TT != null)
		{
			builder.append("TT=");
			builder.append(TT);
			builder.append(", ");
		}
		if (Type != null)
		{
			builder.append("Type=");
			builder.append(Type);
			builder.append(", ");
		}
		if (VMAX != null)
		{
			builder.append("VMAX=");
			builder.append(VMAX);
			builder.append(", ");
		}
		if (VTO != null)
		{
			builder.append("VTO=");
			builder.append(VTO);
			builder.append(", ");
		}
		if (W != null)
		{
			builder.append("W=");
			builder.append(W);
			builder.append(", ");
		}
		if (WD != null)
		{
			builder.append("WD=");
			builder.append(WD);
			builder.append(", ");
		}
		if (XJ != null)
		{
			builder.append("XJ=");
			builder.append(XJ);
			builder.append(", ");
		}
		if (XQC != null)
		{
			builder.append("XQC=");
			builder.append(XQC);
		}
		builder.append(']');
		return builder.toString();
	}

}
