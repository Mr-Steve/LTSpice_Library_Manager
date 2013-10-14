package spiceEdit;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessFile implements Runnable
{

	private static final Charset ENCODING = StandardCharsets.UTF_8;

	private static final String sciRegEx = "\\d{0,}.{0,1}\\d{1,}[eE]-{0,1}\\d{1,}";

	private static int libType;

	private static String formatLine(String text)
	{
		String holder = text;
		// Diode formatting
		if (text.contains(" D ("))
		{
            holder = text.replace(" D (", " D(");
		}
		// Transistor formatting
		else if (text.contains(" NPN ("))
		{
			holder = text.replace(" NPN (", " NPN(");
		}
		else if (text.contains(" PNP ("))
		{
			holder = text.replace(" PNP (", " PNP(");
		}
		// Jfet formatting
		else if (text.contains(" NJF ("))
		{
			holder = text.replace(" NJF (", " NJF(");
		}
		else if (text.contains(" PJF ("))
		{
			holder = text.replace(" PJF (", " PJF(");
		}
		// Mosfet formatting
		else if (text.contains(" VDMOS ("))
		{
			holder = text.replace(" VDMOS (", " VDMOS(");
		}
		else if (text.contains(" NMOS ("))
		{
			holder = text.replace(" NMOS (", " NMOS(");
		}
		else if (text.contains(" PMOS ("))
		{
			holder = text.replace(" PMOS (", " PMOS(");
		}
		return holder;

	}

	/**
	 * @return the libType 0 = diode 1 = bjt 2 = jfet 3 = mos
	 */
	public static int getLibType()
	{
		return libType;
	}

	private static Bipolar procBjt(String text, Long line)
	{
		String holder = text;
		Bipolar bjt = new Bipolar();
		if (text.contains("NPN(") && text.contains(".model"))
		{
			bjt.type = "NPN";
		}
		else if (text.contains("PNP(") && text.contains(".model"))
		{
			bjt.type = "PNP";
		}
		holder = holder.replace("NPN(", "");
		holder = holder.replace("PNP(", "");
		holder = holder.replace(")", "");
        String[] array = holder.split(" |=");
        for (int i = 0; i + 1 < array.length; i += 2)
		{
			if (array[i + 1].matches(sciRegEx) && i != 0)
			{
				array[i + 1] = MathDio.convertSciNot(array[i + 1]);
			}

			switch (array[i].toLowerCase())
				{
					case ".model":
						bjt.model = array[i + 1];
						break;
					case "bf":
						bjt.BF = array[i + 1];
						break;
					case "br":
						bjt.BR = array[i + 1];
						break;
					case "bvcbo":
						bjt.BVcbo = array[i + 1];
						break;
					case "cjc":
						bjt.CJC = array[i + 1];
						break;
					case "cje":
						bjt.CJE = array[i + 1];
						break;
					case "cjs":
						bjt.CJS = array[i + 1];
						break;
					case "eg":
						bjt.EG = array[i + 1];
						break;
					case "fc":
						bjt.FC = array[i + 1];
						break;
					case "ikf":
						bjt.IKF = array[i + 1];
						break;
					case "ikr":
						bjt.IKR = array[i + 1];
						break;
					case "is":
						bjt.IS = array[i + 1];
						break;
					case "isc":
						bjt.ISC = array[i + 1];
						break;
					case "ise":
						bjt.ISE = array[i + 1];
						break;
					case "iss":
						bjt.ISS = array[i + 1];
						break;
					case "itf":
						bjt.ITF = array[i + 1];
						break;
					case "kf":
						bjt.KF = array[i + 1];
						break;
					case "mjc":
						bjt.MJC = array[i + 1];
						break;
					case "mje":
						bjt.MJE = array[i + 1];
						break;
					case "mjs":
						bjt.MJS = array[i + 1];
						break;
					case "nc":
						bjt.NC = array[i + 1];
						break;
					case "ne":
						bjt.NE = array[i + 1];
						break;
					case "nf":
						bjt.NF = array[i + 1];
						break;
					case "nr":
						bjt.NR = array[i + 1];
						break;
					case "ns":
						bjt.NS = array[i + 1];
						break;
					case "ptf":
						bjt.PTF = array[i + 1];
						break;
					case "rb":
						bjt.RB = array[i + 1];
						break;
					case "rbm":
						bjt.RBM = array[i + 1];
						break;
					case "rc":
						bjt.RC = array[i + 1];
						break;
					case "re":
						bjt.RE = array[i + 1];
						break;
					case "tf":
						bjt.TF = array[i + 1];
						break;
					case "tnom":
						bjt.TNOM = array[i + 1];
						break;
					case "tr":
						bjt.TR = array[i + 1];
						break;
					case "vaf":
						bjt.VAF = array[i + 1];
						break;
					case "var":
						bjt.VAR = array[i + 1];
						break;
					case "vjc":
						bjt.VJC = array[i + 1];
						break;
					case "vje":
						bjt.VJE = array[i + 1];
						break;
					case "vjs":
						bjt.VJS = array[i + 1];
						break;
					case "vtf":
						bjt.VTF = array[i + 1];
						break;
					case "xtb":
						bjt.XTB = array[i + 1];
						break;
					case "xtf":
						bjt.XTF = array[i + 1];
						break;
					case "xti":
						bjt.XTI = array[i + 1];
						break;
					case "mfg":
						bjt.MFG = array[i + 1];
						break;
					default:
						break;
				}

		}

		return bjt;

	}

	private static Diode procDiode(String text, Long line)
	{
		String holder = text;
		Diode dio = new Diode();
		dio.setLINE(line);
		holder = holder.replace("D(", "");
		holder = holder.replace(")", "");
        String[] array = holder.split(" |=");
        for (int i = 0; i + 1 < array.length; i += 2)
		{
			if (array[i + 1].matches(sciRegEx))
			{
				array[i + 1] = MathDio.convertSciNot(array[i + 1]);
			}

			switch (array[i].toLowerCase())
				{
					case ".model":
						dio.setModel( array[i + 1]);
						break;
					case "is":
						dio.setIS(array[i + 1]);
						break;
					case "rs":
						dio.setRS(array[i + 1]);
						break;
					case "n":
						dio.setN(array[i + 1]);
						break;
					case "tt":
						dio.setTT(array[i + 1]);
						break;
					case "cjo":
						dio.setCJO(array[i + 1]);
						break;
					case "vj":
						dio.setVJ(array[i + 1]);
						break;
					case "m":
						dio.setM(array[i + 1]);
						break;
					case "eg":
						dio.setEG(array[i + 1]);
						break;
					case "xti":
						dio.setXTI(array[i + 1]);
						break;
					case "kf":
						dio.setKF(array[i + 1]);
						break;
					case "af":
						dio.setAF(array[i + 1]);
						break;
					case "bv":
						dio.setBV(array[i + 1]);
						break;
					case "ibv":
						dio.setIBV(array[i + 1]);
						break;
					case "tnom":
						dio.setTNOM(array[i + 1]);
						break;
					case "iave":
						dio.setIAVE(array[i + 1]);
						break;
					case "vpk":
						dio.setVPK(array[i + 1]);
						break;
					case "ipk":
						dio.setIPK(array[i + 1]);
						break;
					case "nbv":
						dio.setNBV(array[i + 1]);
						break;
					case "nr":
						dio.setNR(array[i + 1]);
						break;
					case "ikf":
						dio.setIKF(array[i + 1]);
						break;
					case "fc":
						dio.setFC(array[i + 1]);
						break;
					case "gleak":
						dio.setGLEAK(array[i + 1]);
						break;
					case "trise":
						dio.setTRISE(array[i + 1]);
						break;
					case "diss":
						dio.setDISS(array[i + 1]);
						break;
					case "isr":
						dio.setISR(array[i + 1]);
						break;
					case "mfg":
						dio.setMFG(array[i + 1]);
						break;
					case "type":
						dio.setType(array[i + 1]);
						break;
                    default:
                        break;
				}

		}

		return dio;

	}

	private static Jfet procJfet(String text, Long line)
	{
		String holder = text;
		Jfet jfet = new Jfet();

		jfet.setLINE(line);
		holder = holder.replace("NJF(", "");
		holder = holder.replace("PJF(", "");
		holder = holder.replace(")", "");
        String[] array = holder.split(" |=");
        for (int i = 0; i + 1 < array.length; i += 2)
		{
			if (array[i + 1].matches(sciRegEx))
			{
				array[i + 1] = MathMain.convertSciNot(array[i + 1]);
			}

			switch (array[i].toLowerCase())
				{
					case ".model":
						jfet.setModel( array[i + 1]);
						break;
                    default:
                        break;
				}
		}
			
		return jfet;
	}
	
	private static Mosfet procMosfet(String text, Long line)
	{
		Mosfet mosfet = new Mosfet();
		
		return mosfet;
	}
	
	/**
	 * @param libType the libType to set
	 */
	private static void setLibType(int libType)
	{
		ProcessFile.libType = libType;
	}

	Scanner scanner;

	List<Diode> dioList;

	List<Bipolar> bjtList;

	List<Jfet> jfetList;

	List<Mosfet> mosList;

	Path file;

	public ProcessFile()
	{
        new MathDio();
	}

	public ProcessFile(Path path)
	{
		file = path;
	}

	/**
	 * @return the bjtList
	 */
	public List<Bipolar> getBjtList()
	{
		return bjtList;
	}

	/**
	 * @return the dioList
	 */
	public List<Diode> getDioList()
	{
		return dioList;
	}

	/**
	 * @return the jfetList
	 */
	public List<Jfet> getJfetList()
	{
		return jfetList;
	}

	/**
	 * @return the mosList
	 */
	public List<Mosfet> getMosList()
	{
		return mosList;
	}

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		dioList = new ArrayList<Diode>();
		bjtList = new ArrayList<Bipolar>();
		jfetList = new ArrayList<Jfet>();
		mosList = new ArrayList<Mosfet>();

		try
		{
			scanner = new Scanner(file, ENCODING.name());
			long lineNumber = 0;
			String text = "";
			while (scanner.hasNextLine())
			{
				lineNumber += 1;
				text = formatLine(scanner.nextLine());
				if (text.contains(" D("))
				{
					setLibType(0);
					dioList.add(procDiode(text, lineNumber));
				}
				else if ((text.contains(" NPN(") || text.contains(" PNP(")) && !text.contains("ako:"))
				{
					setLibType(1);
					bjtList.add(procBjt(text, lineNumber));
				}
				else if (text.contains(" NJF(") || text.contains(" PJF("))
				{
					setLibType(2);
					jfetList.add(procJfet(text, lineNumber));
				}
				else if (text.contains(" VDMOS(") || text.contains(" NMOS(") || text.contains(" PMOS("))
				{
					setLibType(3);
					mosList.add(procMosfet(text, lineNumber));
				}
			}
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if (scanner != null)
			{
				scanner.close();
			}
		}

	}
}
