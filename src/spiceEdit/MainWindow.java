package spiceEdit;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.prefs.Preferences;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

public class MainWindow
{
	private static class MainWindowData
	{
		public NumberFormat amountFormat;

		public java.awt.List bjtAwtList;

		public List<Bipolar> bjtList;

		public JPanel bjtPanel;

		public JProgressBar bjtProg;

		public SwingWorker<Boolean, Integer> bjtWorker;

		public JButton btnCalcDioCjo;

		public JButton btnCalcDioIsForwardChart;

		public JButton btnCalcDioIsSaturation;

		public JButton btnCalcDioThreePointIs;

		public JButton btnCalcDioXtiReverse;

		public JButton btnCalcXtiLarge;

		public JButton btnComponentEditSave;

		public JButton btnConvertBase;

		public JButton btnConvertMicro;

		public JButton btnConvertMilli;

		public JButton btnConvertNano;

		public JButton btnConvertPico;

		public JButton btnDioNew;

		public JButton btnDioSave;

		public JButton btnLoadBjt;

		public JButton btnLoadDio;

		public JButton btnLoadJfet;

		public JButton btnLoadMos;

		public JButton button;

		public JButton button_1;

		public JButton button_2;

		public JComboBox<String> cmbCalcDioCjoCap1;

		public JComboBox<String> cmbCalcDioCjoCap2;

		public JComboBox<String> cmbCalcDioCjoCap3;

		public JComboBox<String> cmbCalcDioCjoVolt1;

		public JComboBox<String> cmbCalcDioCjoVolt2;

		public JComboBox<String> cmbCalcDioCjoVolt3;

		public JComboBox<String> cmbCalcDioIsForwardChartMaxCurr;

		public JComboBox<String> cmbCalcDioIsForwardChartMaxVolt;

		public JComboBox<String> cmbCalcDioIsForwardChartMinCurr;

		public JComboBox<String> cmbCalcDioIsForwardChartMinVolt;

		public JComboBox<String> cmbCalcDioIsSaturationCurr;

		public JComboBox<String> cmbCalcDioIsSaturationVolt;

		public JComboBox<String> cmbCalcDioThreePointIsCurr1;

		public JComboBox<String> cmbCalcDioThreePointIsCurr2;

		public JComboBox<String> cmbCalcDioThreePointIsCurr3;

		public JComboBox<String> cmbCalcDioThreePointIsVolt1;

		public JComboBox<String> cmbCalcDioThreePointIsVolt2;

		public JComboBox<String> cmbCalcDioThreePointIsVolt3;

		public JComboBox<String> cmbCalcDioTtCurr;

		public JComboBox<String> cmbCalcDioTtIr;

		public JComboBox<String> cmbCalcDioTtSlew;

		public JComboBox<String> cmbCalcDioTtTrr;

		public JComboBox<String> cmbCalcDioXtiReverseEg;

		public JComboBox<String> cmbCalcDioXtiReverseIr0;

		public JComboBox<String> cmbCalcDioXtiReverseIr1;

		public JComboBox<String> cmbCalcXtiLargeCurr;

		public JComboBox<String> cmbCalcXtiLargeEG;

		public JComboBox<String> cmbCalcXtiLargeVolt1;

		public JComboBox<String> cmbCalcXtiLargeVolt2;

		public java.awt.List dioAwtList;

		public List<Diode> dioList;

		public JPanel dioPanel;

		public JProgressBar dioProg;

		public SwingWorker<Boolean, Integer> dioWorker;

		public ExecutorService executor;

		public JFileChooser fc;

		public Path filePath;

		public JFrame frmMrStevesLtspice;

		public java.awt.List jfetAwtList;

		public List<Jfet> jfetList;

		public JPanel jfetPanel;

		public JProgressBar jfetProg;

		public SwingWorker<Boolean, Integer> jfetWorker;

		public ChartPanel jFreeChartPanelS;

		public JLabel lblCalcDioCjoCap1;

		public JLabel lblCalcDioCjoCap2;

		public JLabel lblCalcDioCjoCap3;

		public JLabel lblCalcDioCjoCjo;

		public JLabel lblCalcDioCjoFc;

		public JLabel lblCalcDioCjoHeader1;

		public JLabel lblCalcDioCjoHeader2;

		public JLabel lblCalcDioCjoImage;

		public JLabel lblCalcDioCjoM;

		public JLabel lblCalcDioCjoVj;

		public JLabel lblCalcDioCjoVolt1;

		public JLabel lblCalcDioCjoVolt2;

		public JLabel lblCalcDioCjoVolt3;

		public JLabel lblCalcDioIsForwardChartMaxCurr;

		public JLabel lblCalcDioIsForwardChartMaxVolt;

		public JLabel lblCalcDioIsForwardChartMinCurr;

		public JLabel lblCalcDioIsForwardChartMinVolt;

		public JLabel lblCalcDioIsSaturationCurr;

		public JLabel lblCalcDioIsSaturationIs;

		public JLabel lblCalcDioIsSaturationN;

		public JLabel lblCalcDioIsSaturationTemp;

		public JLabel lblCalcDioIsSaturationVolt;

		public JLabel lblCalcDioParaResImage;

		public JLabel lblCalcDioThreePointIsCurr1;

		public JLabel lblCalcDioThreePointIsCurr2;

		public JLabel lblCalcDioThreePointIsCurr3;

		public JLabel lblCalcDioThreePointIsHeader1;

		public JLabel lblCalcDioThreePointIsHeader2;

		public JLabel lblCalcDioThreePointIsImage;

		public JLabel lblCalcDioThreePointIsIs;

		public JLabel lblCalcDioThreePointIsN;

		public JLabel lblCalcDioThreePointIsRs;

		public JLabel lblCalcDioThreePointIsTemp;

		public JLabel lblCalcDioThreePointIsTempUnit;

		public JLabel lblCalcDioThreePointIsVolt1;

		public JLabel lblCalcDioThreePointIsVolt2;

		public JLabel lblCalcDioThreePointIsVolt3;

		public JLabel lblCalcDioTtCurr;

		public JLabel lblCalcDioTtIr;

		public JLabel lblCalcDioTtSlew;

		public JLabel lblCalcDioTtTrr;

		public JLabel lblCalcDioTtTt;

		public JLabel lblCalcDioXtiReverseEg;

		public JLabel lblCalcDioXtiReverseHeader;

		public JLabel lblCalcDioXtiReverseImage;

		public JLabel lblCalcDioXtiReverseIr0;

		public JLabel lblCalcDioXtiReverseIr1;

		public JLabel lblCalcDioXtiReverseN;

		public JLabel lblCalcDioXtiReverseTemp1;

		public JLabel lblCalcDioXtiReverseTemp2;

		public JLabel lblCalcDioXtiReverseTempUnit;

		public JLabel lblCalcDioXtiReverseTempUnit2;

		public JLabel lblCalcDioXtiReverseXti;

		public JLabel lblCalcXtiLargeCurr;

		public JLabel lblCalcXtiLargeEg;

		public JLabel lblCalcXtiLargeHeader;

		public JLabel lblCalcXtiLargeImage;

		public JLabel lblCalcXtiLargeN;

		public JLabel lblCalcXtiLargeTemp1;

		public JLabel lblCalcXtiLargeTemp2;

		public JLabel lblCalcXtiLargeVolt1;

		public JLabel lblCalcXtiLargeVolt2;

		public JLabel lblCalcXtiLargeXti;

		public JLabel lblComponentEditor;

		public JLabel lblConvertBase;

		public JLabel lblConvertMicro;

		public JLabel lblConvertMilli;

		public JLabel lblConvertNano;

		public JLabel lblConvertPico;

		public JTabbedPane libTabPane;

		public java.awt.List mosAwtList;

		public List<Mosfet> mosList;

		public JPanel mosPanel;

		public JProgressBar mosProg;

		public SwingWorker<Boolean, Integer> mosWorker;

		public JPanel panelAbout;

		public JPanel panelCalcDioCjo;

		public JPanel panelCalcDioIsForwardChart;

		public JPanel panelCalcDioIsSaturation;

		public JPanel panelCalcDioParaRes;

		public JPanel panelCalcDioThreePointIs;

		public JPanel panelCalcDioTt;

		public JPanel panelCalcDioXtiLarge;

		public JPanel panelCalcDioXtiReverse;

		public JTabbedPane panelCalculators;

		public JPanel panelComponentEditor;

		public JPanel panelConvert;

		public Panel panelLibList;

		public Preferences prefs;

		public ProcessFile procFile;

		public JScrollPane scrollPane;

		public JTable table;

		public JTabbedPane tabsCalcBipolar;

		public JTabbedPane tabsCalcDio;

		public JTabbedPane tabsCalcDioIs;

		public JTabbedPane tabsCalcDioXti;

		public JTabbedPane tabsCalcJfet;

		public JTabbedPane tabsCalcMosfet;

		public JTable tblComponentEdit;

		public JTextPane txtAbout;

		public JFormattedTextField txtCalcDioCjoCap1;

		public JFormattedTextField txtCalcDioCjoCap2;

		public JFormattedTextField txtCalcDioCjoCap3;

		public JTextField txtCalcDioCjoCjo;

		public JTextField txtCalcDioCjoFc;

		public JTextField txtCalcDioCjoM;

		public JTextField txtCalcDioCjoVj;

		public JFormattedTextField txtCalcDioCjoVolt1;

		public JFormattedTextField txtCalcDioCjoVolt2;

		public JFormattedTextField txtCalcDioCjoVolt3;

		public JTextField txtCalcDioIsForwardChartMaxCurr;

		public JTextField txtCalcDioIsForwardChartMaxVolt;

		public JTextField txtCalcDioIsForwardChartMinCurr;

		public JTextField txtCalcDioIsForwardChartMinVolt;

		public JFormattedTextField txtCalcDioIsSaturationCurr;

		public JTextField txtCalcDioIsSaturationIs;

		public JTextField txtCalcDioIsSaturationTemp;

		public JFormattedTextField txtCalcDioIsSaturationVolt;

		public JTextArea txtCalcDioParaResText;

		public JFormattedTextField txtCalcDioThreePointIsCurr1;

		public JFormattedTextField txtCalcDioThreePointIsCurr2;

		public JFormattedTextField txtCalcDioThreePointIsCurr3;

		public JTextField txtCalcDioThreePointIsIs;

		public JTextField txtCalcDioThreePointIsN;

		public JTextField txtCalcDioThreePointIsRs;

		public JFormattedTextField txtCalcDioThreePointIsTemp;

		public JFormattedTextField txtCalcDioThreePointIsVolt1;

		public JFormattedTextField txtCalcDioThreePointIsVolt2;

		public JFormattedTextField txtCalcDioThreePointIsVolt3;

		public JFormattedTextField txtCalcDioTtCurr;

		public JFormattedTextField txtCalcDioTtIr;

		public JFormattedTextField txtCalcDioTtSlew;

		public JFormattedTextField txtCalcDioTtTrr;

		public JTextField txtCalcDioTtTt;

		public JTextField txtCalcDioXtiReverseEg;

		public JTextField txtCalcDioXtiReverseIr0;

		public JTextField txtCalcDioXtiReverseIr1;

		public JTextField txtCalcDioXtiReverseN;

		public JTextField txtCalcDioXtiReverseTemp1;

		public JTextField txtCalcDioXtiReverseTemp2;

		public JTextField txtCalcDioXtiReverseXti;

		public JTextField txtCalcXtiLargeCurr;

		public JTextField txtCalcXtiLargeEG;

		public JTextField txtCalcXtiLargeN;

		public JTextField txtCalcXtiLargeTemp1;

		public JTextField txtCalcXtiLargeTemp2;

		public JTextField txtCalcXtiLargeVolt1;

		public JTextField txtCalcXtiLargeVolt2;

		public JTextField txtCalcXtiLargeXti;

		public JTextField txtConvertBase;

		public JTextField txtConvertMicro;

		public JTextField txtConvertMilli;

		public JTextField txtConvertNano;

		public JTextField txtConvertPico;

		public JTextField txtDio;

		public JTextField txtJfet;

		public JTextField txtMosfet;

		public JTextField txtTrans;

		public MainWindowData()
		{
		}
	}

	private static final String _2_2_7_1 = "2, 2, 7, 1";

	private static final String _4_6_RIGHT_DEFAULT = "4, 6, right, default";

	private static final String _4H_SI_C_SILICON_CARBIDE = "4H-SiC silicon carbide";

	private static final String _6_6_FILL_DEFAULT = "6, 6, fill, default";

	private static final String _6H_SI_C_SILICON_CARBIDE = "6H-SiC silicon carbide";

	private static final String A = "A";

	private static final String A_M_S = "A/mS";

	private static final String A_N_S = "A/nS";

	private static final String A_P_S = "A/pS";

	private static final String A_S = "A/S";

	private static final String A_U_S = "A/uS";

	private static final Object AMOUNTFORMAT = null;

	private static final String AN_EXCEPTION_HAS_OCCURED = "An exception has occured.";

	private static final String APP_TITLE = "Mr. Steve's LTSpice helper tool";

	private static final String ARGUMENT_EXCEPTION = "Argument Exception";

	private static final String BIPOLAR = "Bipolar";

	private static final String BJT = "bjt";

	// http://www.seas.upenn.edu/~jan/spice/PSpice_ReferenceguideOrCAD.pdf
	private static String bjtLibPath;

	private static final String CALCULATE = "Calculate";

	private static final String COMPONENT_EDITOR = "Component Editor";

	private static final String CONVERT = "Convert";

	private static final String CUSTOM = "Custom";

	private static final String D_0_1_D = "\\d+\\.{0,1}\\d+";

	private static final String DIODE = "diode";

	private static final String DIODES = "Diodes";

	private static String dioLibPath;

	private static final String DONE = "Done";

	private static final String F = "F";

	public static final double FC = 0.5;

	private static final String GALLIUM_ARSENIDE = "Gallium Arsenide";

	private static final String GERMANIUM = "Germanium";

	private static final String JFET = "Jfet";

	private static final String JFET_LOWERCASE = "jfet";

	private static String jfetLibPath;

	private static final String LED_BLUE = "LED Blue";

	private static final String LED_GREEN = "LED Green";

	private static final String LED_INFRARED = "LED Infrared";

	private static final String LED_ORANGE_RED = "LED Orange-Red";

	private static final String LED_RED = "LED Red";

	private static final String LED_WHITE = "LED White";

	private static final String LED_YELLLOW_GREEN = "LED Yelllow-Green";

	private static final String LED_YELLOW = "LED Yellow";

	private static final String LOAD_LIBRARY = "Load Library";

	private static final String M_A = "mA";

	private static final String M_F = "mF";

	private static final String M_S = "mS";

	private static final String M_V = "mV";

	private static MathDio math;

	private static final String MOS = "mos";

	private static final String MOSFET = "Mosfet";

	private static String mosLibPath;

	private static JFreeChart myJFreeChart;

	private static final String N_A = "nA";

	private static final String N_F = "nF";

	private static final String N_S = "nS";

	private static final String N_V = "nV";

	private static final String NULL_STRING = "null";

	private static final String P_A = "pA";

	private static final String P_F = "pF";

	private static final String P_S = "pS";

	private static final String P_V = "pV";

	private static final String PLEASE_SELECT_A_TYPE = "Please select a type";

	private static final String S = "S";

	private static final String SAVE = "Save";

	private static final String SCHOTTKY_BARRIER = "Schottky Barrier";

	private static final String SELECT_A_LIBRARY_TO_EDIT = "Select a library to edit";

	private static final String SELENIUM = "Selenium";

	private static final String SILICON = "Silicon";

	private static final int TEN = 10;

	private static final String TYPE_SELECTION = "Type Selection";

	private static final String U_A = "uA";

	private static final String U_F = "uF";

	private static final String U_S = "uS";

	private static final String U_V = "uV";

	private static final String V = "V";

	private static final String XTI = "XTI";

	/**
	 * Converts a value into the desired unit
	 * @param value the value to convert
	 * @param type the unit to convert it to
	 * @return the converted unit
	 */
	private static double convertValue(double value, String type)
	{
		double converted = 0.00;
		switch (type)
			{
				case V:
					converted = value;
					break;
				case M_V:
					converted = MathMain.milliToMetric(value);
					break;
				case U_V:
					converted = MathMain.microToMetric(value);
					break;
				case N_V:
					converted = MathMain.nanoToMetric(value);
					break;
				case P_V:
					converted = MathMain.picoToMetric(value);
					break;
				case A:
					converted = value;
					break;
				case M_A:
					converted = MathMain.milliToMetric(value);
					break;
				case U_A:
					converted = MathMain.microToMetric(value);
					break;
				case N_A:
					converted = MathMain.nanoToMetric(value);
					break;
				case P_A:
					converted = MathMain.picoToMetric(value);
					break;
				case F:
					converted = value;
					break;
				case M_F:
					converted = MathMain.milliToMetric(value);
					break;
				case U_F:
					converted = MathMain.microToMetric(value);
					break;
				case N_F:
					converted = MathMain.nanoToMetric(value);
					break;
				case P_F:
					converted = MathMain.picoToMetric(value);
					break;
				case S:
					converted = value;
					break;
				case M_S:
					converted = MathMain.milliToMetric(value);
					break;
				case U_S:
					converted = MathMain.microToMetric(value);
					break;
				case N_S:
					converted = MathMain.nanoToMetric(value);
					break;
				case P_S:
					converted = MathMain.picoToMetric(value);
					break;
				case A_S:
					converted = value;
					break;
				case A_M_S:
					converted = value / MathMain.milliToMetric(1);
					break;
				case A_U_S:
					converted = value / MathMain.microToMetric(1);
					break;
				case A_N_S:
					converted = value / MathMain.nanoToMetric(1);
					break;
				case A_P_S:
					converted = value / MathMain.picoToMetric(1);
					break;
				default:
					converted = value;
					break;

			}
		return converted;
	}

	/**
	 * Launch the application.
	 * @param args the arguments
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run()
			{
				try
				{
					MainWindow window = new MainWindow();
					window.data.frmMrStevesLtspice.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	private MainWindowData data = new MainWindowData();

	/**
	 * Create the application.
	 */
	public MainWindow()
	{
		initialize();
	}

	/**
	 * The event handler for choosing a library
	 * @param evt the default parameter
	 */
	private void chooseFile(ActionEvent evt)
	{
		data.fc.setDialogType(JFileChooser.OPEN_DIALOG);

		data.fc.setName(MainWindow.SELECT_A_LIBRARY_TO_EDIT);
		if (data.fc.showOpenDialog(data.frmMrStevesLtspice) == JFileChooser.APPROVE_OPTION)
		{
			loadLibrary(Paths.get(data.fc.getSelectedFile().toURI()));
		}

	}

	/**
	 * Creates a new bjtWorker for processing files into lists
	 */
	private void createBjtWorker()
	{
		data.bjtWorker = new SwingWorker<Boolean, Integer>() {
			@Override
			protected Boolean doInBackground() throws Exception
			{

				data.bjtProg.setMaximum(data.bjtList.size());
				// int prog = 100 / dioList.size();
				for (int i = 0; i < data.bjtList.size(); i++)
				{

					data.bjtAwtList.add(data.bjtList.get(i).toString());
					publish(i);
				}

				// Here we can return some object of whatever type
				// we specified for the first template parameter.
				// (in this case we're auto-boxing 'true').
				return true;
			}

			// Can safely update the GUI from this method.
			@Override
			protected void done()
			{

				try
				{

					data.bjtAwtList.setMinimumSize(data.panelLibList.getMinimumSize());
					data.bjtAwtList.setMaximumSize(data.panelLibList.getMaximumSize());
					data.bjtAwtList.setSize(data.panelLibList.getSize());

					data.bjtAwtList.repaint();
					// Retrieve the return value of doInBackground.
					get();
					data.bjtProg.setString(MainWindow.DONE);
					// statusLabel.setText("Completed with status: " + status);
				}
				catch (InterruptedException e)
				{
					JOptionPane.showMessageDialog(data.frmMrStevesLtspice,
							MainWindow.AN_EXCEPTION_HAS_OCCURED + e.getLocalizedMessage(),
							MainWindow.ARGUMENT_EXCEPTION, 1);
					// This is thrown if the thread's interrupted.
				}
				catch (ExecutionException e)
				{
					JOptionPane.showMessageDialog(data.frmMrStevesLtspice,
							MainWindow.AN_EXCEPTION_HAS_OCCURED + e.getLocalizedMessage(),
							MainWindow.ARGUMENT_EXCEPTION, 1);
					// This is thrown if we throw an exception
					// from doInBackground.
				}
			}

			@Override
			// Can safely update the GUI from this method.
			protected void process(List<Integer> chunks)
			{
				// Here we receive the values that we publish().
				// They may come grouped in chunks.
				// int mostRecentValue = chunks.get(chunks.size() - 1);
				data.bjtProg.setValue(chunks.get(chunks.size() - 1));
				// dioProg.getValue() + prog);

				// countLabel1.setText(Integer.toString(mostRecentValue));
			}

		};
	}

	/**
	 * Creates a new dioWorker for processing files into lists
	 */
	private void createDioWorker()
	{
		data.dioWorker = new SwingWorker<Boolean, Integer>() {
			@Override
			protected Boolean doInBackground() throws Exception
			{

				data.dioProg.setMaximum(data.dioList.size());
				// int prog = 100 / dioList.size();
				for (int i = 0; i < data.dioList.size(); i++)
				{

					data.dioAwtList.add(data.dioList.get(i).toString());
					publish(i);
				}

				// Here we can return some object of whatever type
				// we specified for the first template parameter.
				// (in this case we're auto-boxing 'true').
				return true;
			}

			// Can safely update the GUI from this method.
			@Override
			protected void done()
			{

				// boolean status;
				try
				{

					data.dioAwtList.setMinimumSize(data.panelLibList.getMinimumSize());
					data.dioAwtList.setMaximumSize(data.panelLibList.getMaximumSize());
					data.dioAwtList.setSize(data.panelLibList.getSize());

					data.dioAwtList.repaint();
					// Retrieve the return value of doInBackground.
					if (get())
					{
						data.dioProg.setString(MainWindow.DONE);
					}
					// statusLabel.setText("Completed with status: " + status);
				}
				catch (InterruptedException e)
				{
					JOptionPane.showMessageDialog(data.frmMrStevesLtspice,
							MainWindow.AN_EXCEPTION_HAS_OCCURED + e.getLocalizedMessage(),
							MainWindow.ARGUMENT_EXCEPTION, 1);
					// This is thrown if the thread's interrupted.
				}
				catch (ExecutionException e)
				{
					JOptionPane.showMessageDialog(data.frmMrStevesLtspice,
							MainWindow.AN_EXCEPTION_HAS_OCCURED + e.getLocalizedMessage(),
							MainWindow.ARGUMENT_EXCEPTION, 1);
					// This is thrown if we throw an exception
					// from doInBackground.
				}
			}

			@Override
			// Can safely update the GUI from this method.
			protected void process(List<Integer> chunks)
			{
				// Here we receive the values that we publish().
				// They may come grouped in chunks.
				// int mostRecentValue = chunks.get(chunks.size() - 1);
				data.dioProg.setValue(chunks.get(chunks.size() - 1));
				// dioProg.getValue() + prog);

				// countLabel1.setText(Integer.toString(mostRecentValue));
			}

		};
	}

	/**
	 * Creates a new jfetWorker for processing files into lists
	 */
	private void createJfetWorker()
	{
		data.jfetWorker = new SwingWorker<Boolean, Integer>() {
			@Override
			protected Boolean doInBackground() throws Exception
			{

				data.jfetProg.setMaximum(data.jfetList.size());
				// int prog = 100 / dioList.size();
				for (int i = 0; i < data.jfetList.size(); i++)
				{

					data.jfetAwtList.add(data.jfetList.get(i).toString());
					publish(i);
				}

				// Here we can return some object of whatever type
				// we specified for the first template parameter.
				// (in this case we're auto-boxing 'true').
				return true;
			}

			// Can safely update the GUI from this method.
			@Override
			protected void done()
			{

				try
				{

					data.jfetAwtList.setMinimumSize(data.panelLibList.getMinimumSize());
					data.jfetAwtList.setMaximumSize(data.panelLibList.getMaximumSize());
					data.jfetAwtList.setSize(data.panelLibList.getSize());

					data.jfetAwtList.repaint();
					// Retrieve the return value of doInBackground.
					get();
					data.jfetProg.setString(MainWindow.DONE);
					// statusLabel.setText("Completed with status: " + status);
				}
				catch (InterruptedException e)
				{
					JOptionPane.showMessageDialog(data.frmMrStevesLtspice,
							MainWindow.AN_EXCEPTION_HAS_OCCURED + e.getLocalizedMessage(),
							MainWindow.ARGUMENT_EXCEPTION, 1);
					// This is thrown if the thread's interrupted.
				}
				catch (ExecutionException e)
				{
					JOptionPane.showMessageDialog(data.frmMrStevesLtspice,
							MainWindow.AN_EXCEPTION_HAS_OCCURED + e.getLocalizedMessage(),
							MainWindow.ARGUMENT_EXCEPTION, 1);
					// This is thrown if we throw an exception
					// from doInBackground.
				}
			}

			@Override
			// Can safely update the GUI from this method.
			protected void process(List<Integer> chunks)
			{
				// Here we receive the values that we publish().
				// They may come grouped in chunks.
				// int mostRecentValue = chunks.get(chunks.size() - 1);
				data.jfetProg.setValue(chunks.get(chunks.size() - 1));
				// dioProg.getValue() + prog);

				// countLabel1.setText(Integer.toString(mostRecentValue));
			}

		};
	}

	/**
	 * Creates a new mosWorker for processing files into lists
	 */
	private void createMosWorker()
	{
		data.mosWorker = new SwingWorker<Boolean, Integer>() {
			@Override
			protected Boolean doInBackground() throws Exception
			{

				data.mosProg.setMaximum(data.mosList.size());
				// int prog = 100 / dioList.size();
				for (int i = 0; i < data.mosList.size(); i++)
				{

					data.mosAwtList.add(data.mosList.get(i).toString());
					publish(i);
				}

				// Here we can return some object of whatever type
				// we specified for the first template parameter.
				// (in this case we're auto-boxing 'true').
				return true;
			}

			// Can safely update the GUI from this method.
			@Override
			protected void done()
			{

				try
				{

					data.mosAwtList.setMinimumSize(data.panelLibList.getMinimumSize());
					data.mosAwtList.setMaximumSize(data.panelLibList.getMaximumSize());
					data.mosAwtList.setSize(data.panelLibList.getSize());

					data.mosAwtList.repaint();
					// Retrieve the return value of doInBackground.
					get();
					data.mosProg.setString(MainWindow.DONE);
					// statusLabel.setText("Completed with status: " + status);
				}
				catch (InterruptedException e)
				{
					JOptionPane.showMessageDialog(data.frmMrStevesLtspice,
							MainWindow.AN_EXCEPTION_HAS_OCCURED + e.getLocalizedMessage(),
							MainWindow.ARGUMENT_EXCEPTION, 1);
					// This is thrown if the thread's interrupted.
				}
				catch (ExecutionException e)
				{
					JOptionPane.showMessageDialog(data.frmMrStevesLtspice,
							MainWindow.AN_EXCEPTION_HAS_OCCURED + e.getLocalizedMessage(),
							MainWindow.ARGUMENT_EXCEPTION, 1);
					// This is thrown if we throw an exception
					// from doInBackground.
				}
			}

			@Override
			// Can safely update the GUI from this method.
			protected void process(List<Integer> chunks)
			{
				// Here we receive the values that we publish().
				// They may come grouped in chunks.
				// int mostRecentValue = chunks.get(chunks.size() - 1);
				data.mosProg.setValue(chunks.get(chunks.size() - 1));
				// dioProg.getValue() + prog);

				// countLabel1.setText(Integer.toString(mostRecentValue));
			}

		};
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize()
	{
		data.prefs = Preferences.userRoot().node(this.getClass().getName());
		MainWindow.math = new MathDio();
		MainWindow.dioLibPath = loadPreference(MainWindow.DIODE);
		MainWindow.bjtLibPath = loadPreference(MainWindow.BJT);
		MainWindow.jfetLibPath = loadPreference(MainWindow.JFET_LOWERCASE);
		MainWindow.mosLibPath = loadPreference(MainWindow.MOS);
		data.amountFormat = NumberFormat.getNumberInstance();

		data.fc = new JFileChooser();
		data.frmMrStevesLtspice = new JFrame();
		data.frmMrStevesLtspice.setTitle(MainWindow.APP_TITLE);
//		data.frmMrStevesLtspice.addComponentListener(new ComponentAdapter() {
//			@Override
//			public void componentResized(ComponentEvent e)
//			{
//				// TODO: get rid of this by setting the all to form layouts
//				// list.setMinimumSize(libListPane.getMinimumSize());
//				// list.setMaximumSize(libListPane.getMaximumSize());
//				final Dimension dim = data.panelLibList.getSize();
//				data.libTabPane.setSize(dim);
//				// Diode panels
//				data.dioPanel.setSize(dim);
//				data.dioAwtList.setSize(dim);
//				// bjt
//				data.bjtPanel.setSize(dim);
//				data.bjtAwtList.setSize(dim);
//				// Jfet
//				data.jfetPanel.setSize(dim);
//				data.jfetAwtList.setSize(dim);
//				// Mos
//				data.mosPanel.setSize(dim);
//				data.mosAwtList.setSize(dim);
//
//				data.tblComponentEdit.setSize(dim);
//
//			}
//		});
		data.frmMrStevesLtspice.setBounds(100, 100, 777, 660);
		data.frmMrStevesLtspice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final JTabbedPane tabsPrimary = new JTabbedPane(SwingConstants.TOP);
		data.frmMrStevesLtspice.getContentPane().add(tabsPrimary, BorderLayout.CENTER);

		final Panel panelLibSelect = new Panel();
		tabsPrimary.addTab("Library Selector", null, panelLibSelect, null);
		panelLibSelect.setLayout(new FormLayout(new ColumnSpec[] { ColumnSpec.decode("197px"),
				FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("max(99dlu;default):grow"), }, new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("232px"), }));

		final JButton btnDiode = new JButton("Locate Diodes Library");
		btnDiode.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				chooseFile(e);
			}
		});
		panelLibSelect.add(btnDiode, "1, 1, fill, top");

		data.txtDio = new JTextField();
		data.txtDio.setEditable(false);
		data.txtDio.setColumns(MainWindow.TEN);

		panelLibSelect.add(data.txtDio, "3, 1, fill, top");

		data.btnLoadDio = new JButton(MainWindow.LOAD_LIBRARY);
		data.btnLoadDio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				loadDioLibrary();
			}
		});
		panelLibSelect.add(data.btnLoadDio, "1, 3, center, default");
		data.btnLoadDio.setEnabled(false);
		if (!MainWindow.NULL_STRING.equals(MainWindow.dioLibPath))
		{
			enableDioLoadButton();
		}

		data.dioProg = new JProgressBar();
		panelLibSelect.add(data.dioProg, "3, 3");

		final JButton btnTrans = new JButton("Locate Bipolar Library");
		btnTrans.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				chooseFile(e);
			}
		});
		panelLibSelect.add(btnTrans, "1, 5, fill, top");

		data.txtTrans = new JTextField();
		data.txtTrans.setEditable(false);
		data.txtTrans.setColumns(MainWindow.TEN);

		panelLibSelect.add(data.txtTrans, "3, 5, fill, top");

		data.btnLoadBjt = new JButton(MainWindow.LOAD_LIBRARY);
		data.btnLoadBjt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				loadBjtLibrary();
			}
		});
		panelLibSelect.add(data.btnLoadBjt, "1, 7, center, default");
		data.btnLoadBjt.setEnabled(false);
		if (MainWindow.bjtLibPath != null)
		{
			enableBjtLoadButton();
		}

		data.bjtProg = new JProgressBar();
		panelLibSelect.add(data.bjtProg, "3, 7");

		JButton btnJfet = new JButton("Locate Jfet Library");
		btnJfet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				chooseFile(e);
			}
		});
		panelLibSelect.add(btnJfet, "1, 9, fill, top");

		data.txtJfet = new JTextField();
		data.txtJfet.setEditable(false);
		data.txtJfet.setColumns(MainWindow.TEN);

		panelLibSelect.add(data.txtJfet, "3, 9, fill, top");

		data.btnLoadJfet = new JButton(MainWindow.LOAD_LIBRARY);
		data.btnLoadJfet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				loadJfetLibrary();
			}
		});
		panelLibSelect.add(data.btnLoadJfet, "1, 11, center, default");
		data.btnLoadJfet.setEnabled(false);
		if (!MainWindow.jfetLibPath.equalsIgnoreCase(MainWindow.NULL_STRING))
		{
			enableJfetLoadButton();
		}

		data.jfetProg = new JProgressBar();
		panelLibSelect.add(data.jfetProg, "3, 11");

		JButton btnMosfet = new JButton("Locate Mosfet Library");
		btnMosfet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				chooseFile(e);
			}
		});
		panelLibSelect.add(btnMosfet, "1, 13, fill, top");

		data.txtMosfet = new JTextField();
		data.txtMosfet.setEditable(false);
		data.txtMosfet.setColumns(MainWindow.TEN);

		panelLibSelect.add(data.txtMosfet, "3, 13, fill, top");

		data.btnLoadMos = new JButton(MainWindow.LOAD_LIBRARY);
		data.btnLoadMos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				loadMosLibrary();
			}
		});
		panelLibSelect.add(data.btnLoadMos, "1, 15, center, default");
		data.btnLoadMos.setEnabled(false);
		if (!MainWindow.mosLibPath.equalsIgnoreCase(MainWindow.NULL_STRING))
		{
			enableMosLoadButton();
		}
		data.mosProg = new JProgressBar();
		panelLibSelect.add(data.mosProg, "3, 15");

		data.panelLibList = new Panel();
		tabsPrimary.addTab("Library List", null, data.panelLibList, null);
		data.panelLibList.setLayout(new FormLayout(new ColumnSpec[] { ColumnSpec.decode("429px:grow"), },
				new RowSpec[] { RowSpec.decode("304px:grow"), }));

		data.libTabPane = new JTabbedPane(SwingConstants.TOP);
		data.panelLibList.add(data.libTabPane, "1, 1, fill, fill");

		data.dioPanel = new JPanel();
		data.libTabPane.addTab(MainWindow.DIODES, null, data.dioPanel, null);

		data.dioAwtList = new java.awt.List();
		data.dioAwtList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				dioAwtListItemSelect();

			}
		});
		data.dioPanel.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"), }, new RowSpec[] { RowSpec.decode("517px:grow"),
				RowSpec.decode("29px"), }));

		data.dioPanel.add(data.dioAwtList, "1, 1, 5, 1, fill, fill");

		data.btnDioNew = new JButton("New Diode");
		data.btnDioNew.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				newDiode();
			}
		});
		data.dioPanel.add(data.btnDioNew, "1, 2, default, bottom");

		data.btnDioSave = new JButton(MainWindow.SAVE);
		data.dioPanel.add(data.btnDioSave, "3, 2, fill, top");

		data.bjtPanel = new JPanel();
		data.libTabPane.addTab(MainWindow.BIPOLAR, null, data.bjtPanel, null);
		data.bjtPanel.setLayout(new BorderLayout(0, 0));

		data.bjtAwtList = new java.awt.List();
		data.bjtPanel.add(data.bjtAwtList);

		data.button = new JButton(MainWindow.SAVE);
		data.bjtPanel.add(data.button, BorderLayout.SOUTH);

		data.jfetPanel = new JPanel();
		data.jfetPanel.setLayout(new BorderLayout(0, 0));
		data.libTabPane.addTab(MainWindow.JFET, null, data.jfetPanel, null);

		data.jfetAwtList = new java.awt.List();
		data.jfetPanel.add(data.jfetAwtList);

		data.button_1 = new JButton(MainWindow.SAVE);
		data.jfetPanel.add(data.button_1, BorderLayout.SOUTH);

		data.mosPanel = new JPanel();
		data.mosPanel.setLayout(new BorderLayout(0, 0));
		data.libTabPane.addTab(MainWindow.MOSFET, null, data.mosPanel, null);

		data.mosAwtList = new java.awt.List();
		data.mosPanel.add(data.mosAwtList);

		data.button_2 = new JButton(MainWindow.SAVE);
		data.mosPanel.add(data.button_2, BorderLayout.SOUTH);

		data.panelComponentEditor = new JPanel();
		tabsPrimary.addTab(MainWindow.COMPONENT_EDITOR, null, data.panelComponentEditor, null);
		data.panelComponentEditor.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"), FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC, }, new RowSpec[] { FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"), FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, }));

		data.lblComponentEditor = new JLabel(MainWindow.COMPONENT_EDITOR);
		data.panelComponentEditor.add(data.lblComponentEditor, "4, 2");

		data.scrollPane = new JScrollPane();
		data.panelComponentEditor.add(data.scrollPane, "4, 4, 3, 3, fill, fill");

		data.tblComponentEdit = new JTable();
		data.scrollPane.setViewportView(data.tblComponentEdit);

		data.btnComponentEditSave = new JButton("Save");
		data.btnComponentEditSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		data.panelComponentEditor.add(data.btnComponentEditSave, "4, 8");

		data.panelCalculators = new JTabbedPane(SwingConstants.TOP);
		tabsPrimary.addTab("Calculators", null, data.panelCalculators, null);
		final ImageIcon img = new ImageIcon("images/data4.jpg");
		final ImageIcon threePointIs = new ImageIcon("images/threePointIs.png");
		final ImageIcon threePointCjo = new ImageIcon("images/threePointCJO.png");
		final ImageIcon xtiChartImage = new ImageIcon("images/xtiChart.png");
		final ImageIcon xtiChartImageLarge = new ImageIcon("images/dioXtiLarge.png");
		data.tabsCalcDio = new JTabbedPane(SwingConstants.TOP);
		data.panelCalculators.addTab(MainWindow.DIODES, null, data.tabsCalcDio, null);

		data.tabsCalcDioIs = new JTabbedPane(SwingConstants.TOP);
		data.tabsCalcDio.addTab("IS, N, RS", null, data.tabsCalcDioIs, null);

		data.panelCalcDioIsSaturation = new JPanel();
		data.tabsCalcDioIs.addTab("Saturation Current", null, data.panelCalcDioIsSaturation, null);
		data.panelCalcDioIsSaturation.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(190dlu;default):grow"), FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("center:max(30dlu;default)"), ColumnSpec.decode("center:max(67dlu;default):grow"), },
				new RowSpec[] { FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC, }));

		data.txtCalcDioIsSaturationCurr = new JFormattedTextField(MainWindow.AMOUNTFORMAT);
		data.panelCalcDioIsSaturation.add(data.txtCalcDioIsSaturationCurr, "2, 2, fill, default");
		data.txtCalcDioIsSaturationCurr.setColumns(MainWindow.TEN);

		data.cmbCalcDioIsSaturationCurr = new JComboBox();
		data.cmbCalcDioIsSaturationCurr.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A, MainWindow.M_A,
				MainWindow.U_A, MainWindow.N_A, MainWindow.P_A }));
		data.panelCalcDioIsSaturation.add(data.cmbCalcDioIsSaturationCurr, "4, 2, fill, default");

		data.lblCalcDioIsSaturationCurr = new JLabel("Current A");
		data.panelCalcDioIsSaturation.add(data.lblCalcDioIsSaturationCurr, "5, 2");

		data.txtCalcDioIsSaturationVolt = new JFormattedTextField(MainWindow.AMOUNTFORMAT);
		data.txtCalcDioIsSaturationVolt.setColumns(MainWindow.TEN);
		data.panelCalcDioIsSaturation.add(data.txtCalcDioIsSaturationVolt, "2, 4, fill, default");

		data.cmbCalcDioIsSaturationVolt = new JComboBox();
		data.cmbCalcDioIsSaturationVolt.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V, MainWindow.M_V,
				MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		data.panelCalcDioIsSaturation.add(data.cmbCalcDioIsSaturationVolt, "4, 4, fill, default");

		data.lblCalcDioIsSaturationVolt = new JLabel("Voltage V");
		data.panelCalcDioIsSaturation.add(data.lblCalcDioIsSaturationVolt, "5, 4");

		final JFormattedTextField txtCalcDioIsSaturationN = new JFormattedTextField(MainWindow.AMOUNTFORMAT);
		txtCalcDioIsSaturationN.setColumns(MainWindow.TEN);
		data.panelCalcDioIsSaturation.add(txtCalcDioIsSaturationN, "2, 6, fill, default");

		data.lblCalcDioIsSaturationN = new JLabel("Ideality Factor N");
		data.panelCalcDioIsSaturation.add(data.lblCalcDioIsSaturationN, "5, 6");

		data.btnCalcDioIsSaturation = new JButton(MainWindow.CALCULATE);
		data.btnCalcDioIsSaturation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				dioIsSaturation(txtCalcDioIsSaturationN);

			}
		});

		data.txtCalcDioIsSaturationTemp = new JTextField();
		data.panelCalcDioIsSaturation.add(data.txtCalcDioIsSaturationTemp, "2, 8, fill, default");
		data.txtCalcDioIsSaturationTemp.setColumns(MainWindow.TEN);

		data.lblCalcDioIsSaturationTemp = new JLabel("Temperature C");
		data.panelCalcDioIsSaturation.add(data.lblCalcDioIsSaturationTemp, "5, 8");
		data.panelCalcDioIsSaturation.add(data.btnCalcDioIsSaturation, "2, 10");

		data.txtCalcDioIsSaturationIs = new JTextField();
		data.txtCalcDioIsSaturationIs.setEditable(false);
		data.panelCalcDioIsSaturation.add(data.txtCalcDioIsSaturationIs, "2, 12, fill, default");
		data.txtCalcDioIsSaturationIs.setColumns(MainWindow.TEN);

		data.lblCalcDioIsSaturationIs = new JLabel("IS");
		data.panelCalcDioIsSaturation.add(data.lblCalcDioIsSaturationIs, "5, 12");

		// JFreeChart myJChart = new JFreeChart(plot)
		// JFreeChart asdf = new JFreeChart("test", plot);
		data.panelCalcDioIsForwardChart = new JPanel();
		data.tabsCalcDioIs.addTab("Forward Chart", null, data.panelCalcDioIsForwardChart, null);
		data.tabsCalcDioIs.setEnabledAt(1, false);
		data.panelCalcDioIsForwardChart.setLayout(new FormLayout(new ColumnSpec[] { ColumnSpec.decode("center:77px:grow"),
				FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("max(53dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("center:max(27dlu;default):grow"),
				FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("center:max(36dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("max(60dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("max(39dlu;default):grow"),
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC, }, new RowSpec[] {
				RowSpec.decode("max(15dlu;pref)"), FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(15dlu;default)"), FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.GLUE_ROWSPEC, }));

		data.lblCalcDioIsForwardChartMinVolt = new JLabel("Min V");
		data.panelCalcDioIsForwardChart.add(data.lblCalcDioIsForwardChartMinVolt, "1, 1");

		data.txtCalcDioIsForwardChartMinVolt = new JTextField();
		data.panelCalcDioIsForwardChart.add(data.txtCalcDioIsForwardChartMinVolt, "3, 1, fill, default");
		data.txtCalcDioIsForwardChartMinVolt.setColumns(MainWindow.TEN);

		data.cmbCalcDioIsForwardChartMinVolt = new JComboBox();
		data.cmbCalcDioIsForwardChartMinVolt.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V, MainWindow.M_V,
				MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		data.panelCalcDioIsForwardChart.add(data.cmbCalcDioIsForwardChartMinVolt, "5, 1, fill, default");

		data.lblCalcDioIsForwardChartMaxVolt = new JLabel("Max V");
		data.panelCalcDioIsForwardChart.add(data.lblCalcDioIsForwardChartMaxVolt, "7, 1");

		data.txtCalcDioIsForwardChartMaxVolt = new JTextField();
		data.panelCalcDioIsForwardChart.add(data.txtCalcDioIsForwardChartMaxVolt, "9, 1, fill, default");
		data.txtCalcDioIsForwardChartMaxVolt.setColumns(MainWindow.TEN);

		data.cmbCalcDioIsForwardChartMaxVolt = new JComboBox();
		data.cmbCalcDioIsForwardChartMaxVolt.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V, MainWindow.M_V,
				MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		data.panelCalcDioIsForwardChart.add(data.cmbCalcDioIsForwardChartMaxVolt, "11, 1, fill, default");

		data.lblCalcDioIsForwardChartMinCurr = new JLabel("Min I");
		data.panelCalcDioIsForwardChart.add(data.lblCalcDioIsForwardChartMinCurr, "1, 3, center, default");

		data.txtCalcDioIsForwardChartMinCurr = new JTextField();
		data.panelCalcDioIsForwardChart.add(data.txtCalcDioIsForwardChartMinCurr, "3, 3, fill, default");
		data.txtCalcDioIsForwardChartMinCurr.setColumns(MainWindow.TEN);

		data.cmbCalcDioIsForwardChartMinCurr = new JComboBox();
		data.cmbCalcDioIsForwardChartMinCurr.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A, MainWindow.M_A,
				MainWindow.U_A, MainWindow.N_A, MainWindow.P_A }));
		data.panelCalcDioIsForwardChart.add(data.cmbCalcDioIsForwardChartMinCurr, "5, 3, fill, default");

		data.lblCalcDioIsForwardChartMaxCurr = new JLabel("Max I");
		data.panelCalcDioIsForwardChart.add(data.lblCalcDioIsForwardChartMaxCurr, "7, 3");

		data.txtCalcDioIsForwardChartMaxCurr = new JTextField();
		data.panelCalcDioIsForwardChart.add(data.txtCalcDioIsForwardChartMaxCurr, "9, 3, fill, default");
		data.txtCalcDioIsForwardChartMaxCurr.setColumns(MainWindow.TEN);

		data.btnCalcDioIsForwardChart = new JButton("Draw");
		data.btnCalcDioIsForwardChart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				isForwardChart(txtCalcDioIsSaturationN);

			}
		});

		data.cmbCalcDioIsForwardChartMaxCurr = new JComboBox();
		data.cmbCalcDioIsForwardChartMaxCurr.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A, MainWindow.M_A,
				MainWindow.U_A, MainWindow.N_A, MainWindow.P_A }));
		data.panelCalcDioIsForwardChart.add(data.cmbCalcDioIsForwardChartMaxCurr, "11, 3, fill, default");
		data.panelCalcDioIsForwardChart.add(data.btnCalcDioIsForwardChart, "3, 5");

		data.panelCalcDioParaRes = new JPanel();
		data.tabsCalcDioIs.addTab("Parasitic Resistance", null, data.panelCalcDioParaRes, null);
		data.panelCalcDioParaRes.setLayout(new FormLayout(new ColumnSpec[] { ColumnSpec.decode("max(200dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("236px:grow"), ColumnSpec.decode("18px"), },
				new RowSpec[] { FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("16px:grow"), }));

		data.lblCalcDioParaResImage = new JLabel("");
		data.lblCalcDioParaResImage.setIcon(img);
		data.panelCalcDioParaRes.add(data.lblCalcDioParaResImage, "1, 2, fill, fill");

		data.txtCalcDioParaResText = new JTextArea();
		data.txtCalcDioParaResText.setLineWrap(true);
		data.txtCalcDioParaResText
				.setText("\"We can estimate RS as voltage difference on the green line drawn at the point of the knee of the curve, and the red line, divided by the corresponding current, hence:\n\nRS =0.1V/0.1A = 1 Ohm\" - http://www.youspice.com/ys/diodefromdatasheet.3sp?pageNum=1\n\nThe red line is drawn through what is called the \"ideal diode\", the linear section of the F I-V curve. The green line is drawn where the top portion of the curve begins to curve heavily. You subtract the voltage where the red line crosses the green from the voltage where the 'knee' interscets the green line, then divde the result by the current (of the green line).");
		data.panelCalcDioParaRes.add(data.txtCalcDioParaResText, "3, 2, fill, fill");

		data.panelCalcDioThreePointIs = new JPanel();
		data.tabsCalcDioIs.addTab("Three Point Method", null, data.panelCalcDioThreePointIs, null);
		data.panelCalcDioThreePointIs.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(164dlu;default)"), FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("center:default"), FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(76dlu;default):grow"), FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(37dlu;default)"), }, new RowSpec[] { FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"), }));

		data.lblCalcDioThreePointIsHeader1 = new JLabel("Input voltages and currents at points similar to the chart below.");
		data.panelCalcDioThreePointIs.add(data.lblCalcDioThreePointIsHeader1, "2, 2, 5, 1, center, default");

		data.lblCalcDioThreePointIsHeader2 = new JLabel(
				"Must have logrithmic current axis. Ignore the point between 2 and 3.");
		data.panelCalcDioThreePointIs.add(data.lblCalcDioThreePointIsHeader2, "2, 4, 5, 1, center, default");

		data.lblCalcDioThreePointIsVolt1 = new JLabel("V1");
		data.panelCalcDioThreePointIs.add(data.lblCalcDioThreePointIsVolt1, "4, 6");

		data.txtCalcDioThreePointIsVolt1 = new JFormattedTextField(data.amountFormat);
		data.lblCalcDioThreePointIsVolt1.setLabelFor(data.txtCalcDioThreePointIsVolt1);
		data.panelCalcDioThreePointIs.add(data.txtCalcDioThreePointIsVolt1, MainWindow._6_6_FILL_DEFAULT);
		data.txtCalcDioThreePointIsVolt1.setColumns(MainWindow.TEN);

		data.cmbCalcDioThreePointIsVolt1 = new JComboBox();
		data.cmbCalcDioThreePointIsVolt1.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V, MainWindow.M_V,
				MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		data.panelCalcDioThreePointIs.add(data.cmbCalcDioThreePointIsVolt1, "8, 6, fill, default");

		data.lblCalcDioThreePointIsVolt2 = new JLabel("V2");
		data.panelCalcDioThreePointIs.add(data.lblCalcDioThreePointIsVolt2, "4, 8");

		data.txtCalcDioThreePointIsVolt2 = new JFormattedTextField(data.amountFormat);
		data.lblCalcDioThreePointIsVolt2.setLabelFor(data.txtCalcDioThreePointIsVolt2);
		data.panelCalcDioThreePointIs.add(data.txtCalcDioThreePointIsVolt2, "6, 8, fill, default");
		data.txtCalcDioThreePointIsVolt2.setColumns(MainWindow.TEN);

		data.cmbCalcDioThreePointIsVolt2 = new JComboBox();
		data.cmbCalcDioThreePointIsVolt2.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V, MainWindow.M_V,
				MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		data.panelCalcDioThreePointIs.add(data.cmbCalcDioThreePointIsVolt2, "8, 8, fill, default");

		data.lblCalcDioThreePointIsVolt3 = new JLabel("V3");
		data.panelCalcDioThreePointIs.add(data.lblCalcDioThreePointIsVolt3, "4, 10");

		data.txtCalcDioThreePointIsVolt3 = new JFormattedTextField(data.amountFormat);
		data.panelCalcDioThreePointIs.add(data.txtCalcDioThreePointIsVolt3, "6, 10, fill, default");
		data.txtCalcDioThreePointIsVolt3.setColumns(MainWindow.TEN);

		data.cmbCalcDioThreePointIsVolt3 = new JComboBox();
		data.cmbCalcDioThreePointIsVolt3.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V, MainWindow.M_V,
				MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		data.panelCalcDioThreePointIs.add(data.cmbCalcDioThreePointIsVolt3, "8, 10, fill, default");

		data.lblCalcDioThreePointIsCurr1 = new JLabel("I1");
		data.panelCalcDioThreePointIs.add(data.lblCalcDioThreePointIsCurr1, "4, 12");

		data.txtCalcDioThreePointIsCurr1 = new JFormattedTextField(data.amountFormat);
		data.panelCalcDioThreePointIs.add(data.txtCalcDioThreePointIsCurr1, "6, 12, fill, default");
		data.txtCalcDioThreePointIsCurr1.setColumns(MainWindow.TEN);

		data.cmbCalcDioThreePointIsCurr1 = new JComboBox();
		data.cmbCalcDioThreePointIsCurr1.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A, MainWindow.M_A,
				MainWindow.U_A, MainWindow.N_A, MainWindow.P_A }));
		data.panelCalcDioThreePointIs.add(data.cmbCalcDioThreePointIsCurr1, "8, 12, fill, default");

		data.lblCalcDioThreePointIsCurr2 = new JLabel("I2");
		data.panelCalcDioThreePointIs.add(data.lblCalcDioThreePointIsCurr2, "4, 14");

		data.txtCalcDioThreePointIsCurr2 = new JFormattedTextField(data.amountFormat);
		data.panelCalcDioThreePointIs.add(data.txtCalcDioThreePointIsCurr2, "6, 14, fill, default");
		data.txtCalcDioThreePointIsCurr2.setColumns(MainWindow.TEN);

		data.cmbCalcDioThreePointIsCurr2 = new JComboBox();
		data.cmbCalcDioThreePointIsCurr2.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A, MainWindow.M_A,
				MainWindow.U_A, MainWindow.N_A, MainWindow.P_A }));
		data.panelCalcDioThreePointIs.add(data.cmbCalcDioThreePointIsCurr2, "8, 14, fill, default");

		data.lblCalcDioThreePointIsCurr3 = new JLabel("I3");
		data.panelCalcDioThreePointIs.add(data.lblCalcDioThreePointIsCurr3, "4, 16");

		data.txtCalcDioThreePointIsCurr3 = new JFormattedTextField(data.amountFormat);
		data.panelCalcDioThreePointIs.add(data.txtCalcDioThreePointIsCurr3, "6, 16, fill, default");
		data.txtCalcDioThreePointIsCurr3.setColumns(MainWindow.TEN);

		data.btnCalcDioThreePointIs = new JButton(MainWindow.CALCULATE);
		data.btnCalcDioThreePointIs.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				dioCalcThreePointIs();

			}
		});

		data.cmbCalcDioThreePointIsCurr3 = new JComboBox();
		data.cmbCalcDioThreePointIsCurr3.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A, MainWindow.M_A,
				MainWindow.U_A, MainWindow.N_A, MainWindow.P_A }));
		data.panelCalcDioThreePointIs.add(data.cmbCalcDioThreePointIsCurr3, "8, 16, fill, default");

		data.lblCalcDioThreePointIsTemp = new JLabel("Temp");
		data.panelCalcDioThreePointIs.add(data.lblCalcDioThreePointIsTemp, "4, 18, right, default");

		data.txtCalcDioThreePointIsTemp = new JFormattedTextField(data.amountFormat);
		data.panelCalcDioThreePointIs.add(data.txtCalcDioThreePointIsTemp, "6, 18, fill, default");
		data.txtCalcDioThreePointIsTemp.setColumns(MainWindow.TEN);

		data.lblCalcDioThreePointIsTempUnit = new JLabel("Celcius");
		data.panelCalcDioThreePointIs.add(data.lblCalcDioThreePointIsTempUnit, "8, 18, center, default");
		data.panelCalcDioThreePointIs.add(data.btnCalcDioThreePointIs, "6, 20");

		data.lblCalcDioThreePointIsImage = new JLabel("");
		data.lblCalcDioThreePointIsImage.setIcon(threePointIs);
		data.panelCalcDioThreePointIs.add(data.lblCalcDioThreePointIsImage, "2, 6, 1, 23, default, fill");

		data.lblCalcDioThreePointIsRs = new JLabel("RS");
		data.panelCalcDioThreePointIs.add(data.lblCalcDioThreePointIsRs, "4, 22");

		data.txtCalcDioThreePointIsRs = new JTextField();
		data.lblCalcDioThreePointIsRs.setLabelFor(data.txtCalcDioThreePointIsRs);
		data.panelCalcDioThreePointIs.add(data.txtCalcDioThreePointIsRs, "6, 22, fill, default");
		data.txtCalcDioThreePointIsRs.setColumns(MainWindow.TEN);

		data.lblCalcDioThreePointIsN = new JLabel("N");
		data.panelCalcDioThreePointIs.add(data.lblCalcDioThreePointIsN, "4, 24");

		data.txtCalcDioThreePointIsN = new JTextField();
		data.lblCalcDioThreePointIsN.setLabelFor(data.txtCalcDioThreePointIsN);
		data.panelCalcDioThreePointIs.add(data.txtCalcDioThreePointIsN, "6, 24, fill, default");
		data.txtCalcDioThreePointIsN.setColumns(MainWindow.TEN);

		data.lblCalcDioThreePointIsIs = new JLabel("IS");
		data.panelCalcDioThreePointIs.add(data.lblCalcDioThreePointIsIs, "4, 26");

		data.txtCalcDioThreePointIsIs = new JTextField();
		data.lblCalcDioThreePointIsIs.setLabelFor(data.txtCalcDioThreePointIsIs);
		data.panelCalcDioThreePointIs.add(data.txtCalcDioThreePointIsIs, "6, 26, fill, default");
		data.txtCalcDioThreePointIsIs.setColumns(MainWindow.TEN);

		data.panelCalcDioCjo = new JPanel();
		data.tabsCalcDio.addTab("CJO, VJ, M, FC", null, data.panelCalcDioCjo, null);
		data.panelCalcDioCjo.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(122dlu;default)"), FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("center:default"), FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(166dlu;default):grow"), FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC, }, new RowSpec[] { FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"), }));

		data.lblCalcDioCjoHeader1 = new JLabel(
				"Input capacitance and reverse voltages at points similar to the C-V chart below.");
		data.panelCalcDioCjo.add(data.lblCalcDioCjoHeader1, "2, 2, 5, 1, center, default");

		data.lblCalcDioCjoHeader2 = new JLabel("Both C and V must be logrithmic.");
		data.panelCalcDioCjo.add(data.lblCalcDioCjoHeader2, "2, 4, 5, 1, center, default");

		data.lblCalcDioCjoImage = new JLabel("");
		data.lblCalcDioCjoImage.setIcon(threePointCjo);
		data.panelCalcDioCjo.add(data.lblCalcDioCjoImage, "2, 6, 1, 23");

		data.lblCalcDioCjoVolt1 = new JLabel("V1");
		data.panelCalcDioCjo.add(data.lblCalcDioCjoVolt1, "4, 6");

		data.txtCalcDioCjoVolt1 = new JFormattedTextField();
		data.panelCalcDioCjo.add(data.txtCalcDioCjoVolt1, MainWindow._6_6_FILL_DEFAULT);
		data.txtCalcDioCjoVolt1.setColumns(MainWindow.TEN);

		data.cmbCalcDioCjoVolt1 = new JComboBox();
		data.cmbCalcDioCjoVolt1.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V, MainWindow.M_V,
				MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		data.panelCalcDioCjo.add(data.cmbCalcDioCjoVolt1, "8, 6, fill, default");

		data.lblCalcDioCjoVolt2 = new JLabel("V2");
		data.panelCalcDioCjo.add(data.lblCalcDioCjoVolt2, "4, 8");

		data.txtCalcDioCjoVolt2 = new JFormattedTextField();
		data.panelCalcDioCjo.add(data.txtCalcDioCjoVolt2, "6, 8, fill, default");
		data.txtCalcDioCjoVolt2.setColumns(MainWindow.TEN);

		data.cmbCalcDioCjoVolt2 = new JComboBox();
		data.cmbCalcDioCjoVolt2.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V, MainWindow.M_V,
				MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		data.panelCalcDioCjo.add(data.cmbCalcDioCjoVolt2, "8, 8, fill, default");

		data.lblCalcDioCjoVolt3 = new JLabel("V3");
		data.panelCalcDioCjo.add(data.lblCalcDioCjoVolt3, "4, 10");

		data.txtCalcDioCjoVolt3 = new JFormattedTextField();
		data.txtCalcDioCjoVolt3.setColumns(MainWindow.TEN);
		data.panelCalcDioCjo.add(data.txtCalcDioCjoVolt3, "6, 10, fill, default");

		data.cmbCalcDioCjoVolt3 = new JComboBox();
		data.cmbCalcDioCjoVolt3.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V, MainWindow.M_V,
				MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		data.panelCalcDioCjo.add(data.cmbCalcDioCjoVolt3, "8, 10, fill, default");

		data.lblCalcDioCjoCap1 = new JLabel("C1");
		data.panelCalcDioCjo.add(data.lblCalcDioCjoCap1, "4, 12");

		data.txtCalcDioCjoCap1 = new JFormattedTextField();
		data.txtCalcDioCjoCap1.setColumns(MainWindow.TEN);
		data.panelCalcDioCjo.add(data.txtCalcDioCjoCap1, "6, 12, fill, default");

		data.cmbCalcDioCjoCap1 = new JComboBox();
		data.cmbCalcDioCjoCap1.setModel(new DefaultComboBoxModel(new String[] { MainWindow.F, MainWindow.M_F,
				MainWindow.U_F, MainWindow.N_F, MainWindow.P_F }));
		data.panelCalcDioCjo.add(data.cmbCalcDioCjoCap1, "8, 12, fill, default");

		data.lblCalcDioCjoCap2 = new JLabel("C2");
		data.panelCalcDioCjo.add(data.lblCalcDioCjoCap2, "4, 14");

		data.txtCalcDioCjoCap2 = new JFormattedTextField();
		data.txtCalcDioCjoCap2.setColumns(MainWindow.TEN);
		data.panelCalcDioCjo.add(data.txtCalcDioCjoCap2, "6, 14, fill, default");

		data.cmbCalcDioCjoCap2 = new JComboBox();
		data.cmbCalcDioCjoCap2.setModel(new DefaultComboBoxModel(new String[] { MainWindow.F, MainWindow.M_F,
				MainWindow.U_F, MainWindow.N_F, MainWindow.P_F }));
		data.panelCalcDioCjo.add(data.cmbCalcDioCjoCap2, "8, 14, fill, default");

		data.lblCalcDioCjoCap3 = new JLabel("C3");
		data.panelCalcDioCjo.add(data.lblCalcDioCjoCap3, "4, 16");

		data.txtCalcDioCjoCap3 = new JFormattedTextField();
		data.txtCalcDioCjoCap3.setColumns(MainWindow.TEN);
		data.panelCalcDioCjo.add(data.txtCalcDioCjoCap3, "6, 16, fill, default");

		data.cmbCalcDioCjoCap3 = new JComboBox();
		data.cmbCalcDioCjoCap3.setModel(new DefaultComboBoxModel(new String[] { MainWindow.F, MainWindow.M_F,
				MainWindow.U_F, MainWindow.N_F, MainWindow.P_F }));
		data.panelCalcDioCjo.add(data.cmbCalcDioCjoCap3, "8, 16, fill, default");

		data.btnCalcDioCjo = new JButton(MainWindow.CALCULATE);
		data.btnCalcDioCjo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{

				dioCalcCjo();
			}
		});
		data.panelCalcDioCjo.add(data.btnCalcDioCjo, "6, 18");

		data.lblCalcDioCjoCjo = new JLabel("CJO");
		data.panelCalcDioCjo.add(data.lblCalcDioCjoCjo, "4, 20");

		data.txtCalcDioCjoCjo = new JTextField();
		data.lblCalcDioCjoCjo.setLabelFor(data.txtCalcDioCjoCjo);
		data.panelCalcDioCjo.add(data.txtCalcDioCjoCjo, "6, 20, fill, default");
		data.txtCalcDioCjoCjo.setColumns(MainWindow.TEN);

		data.lblCalcDioCjoVj = new JLabel("VJ");
		data.panelCalcDioCjo.add(data.lblCalcDioCjoVj, "4, 22");

		data.txtCalcDioCjoVj = new JTextField();
		data.txtCalcDioCjoVj.setColumns(MainWindow.TEN);
		data.panelCalcDioCjo.add(data.txtCalcDioCjoVj, "6, 22, fill, default");

		data.lblCalcDioCjoM = new JLabel("M");
		data.panelCalcDioCjo.add(data.lblCalcDioCjoM, "4, 24");

		data.txtCalcDioCjoM = new JTextField();
		data.txtCalcDioCjoM.setColumns(MainWindow.TEN);
		data.panelCalcDioCjo.add(data.txtCalcDioCjoM, "6, 24, fill, default");

		data.lblCalcDioCjoFc = new JLabel("FC");
		data.panelCalcDioCjo.add(data.lblCalcDioCjoFc, "4, 26");

		data.txtCalcDioCjoFc = new JTextField();
		data.txtCalcDioCjoFc.setColumns(MainWindow.TEN);
		data.panelCalcDioCjo.add(data.txtCalcDioCjoFc, "6, 26, fill, default");

		data.panelCalcDioTt = new JPanel();
		data.tabsCalcDio.addTab("TT", null, data.panelCalcDioTt, null);
		data.panelCalcDioTt.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("165px"), FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("426px"),
				FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("99px"), }, new RowSpec[] { RowSpec.decode("31px"),
				RowSpec.decode("28px"), FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("28px"),
				FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("28px"), FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("28px"), FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("29px"),
				FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("28px"), }));

		data.lblCalcDioTtCurr = new JLabel("Forward Bias Current");
		data.panelCalcDioTt.add(data.lblCalcDioTtCurr, "2, 2, center, center");

		data.txtCalcDioTtCurr = new JFormattedTextField(MainWindow.AMOUNTFORMAT);
		data.txtCalcDioTtCurr.setToolTipText("Forward bias diode current");
		data.panelCalcDioTt.add(data.txtCalcDioTtCurr, "4, 2, fill, top");
		data.txtCalcDioTtCurr.setColumns(MainWindow.TEN);

		data.cmbCalcDioTtCurr = new JComboBox();
		data.cmbCalcDioTtCurr.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A, MainWindow.M_A, MainWindow.U_A,
				MainWindow.N_A, MainWindow.P_A }));
		data.panelCalcDioTt.add(data.cmbCalcDioTtCurr, "6, 2, fill, top");

		data.lblCalcDioTtSlew = new JLabel("Slew Rate");
		data.panelCalcDioTt.add(data.lblCalcDioTtSlew, "2, 4, center, center");

		data.txtCalcDioTtSlew = new JFormattedTextField(MainWindow.AMOUNTFORMAT);
		data.txtCalcDioTtSlew.setToolTipText("Peak reverse current");
		data.panelCalcDioTt.add(data.txtCalcDioTtSlew, "4, 4, fill, top");
		data.txtCalcDioTtSlew.setColumns(MainWindow.TEN);

		data.cmbCalcDioTtSlew = new JComboBox();
		data.cmbCalcDioTtSlew.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A_S, MainWindow.A_M_S,
				MainWindow.A_U_S, MainWindow.A_N_S, MainWindow.A_P_S }));
		data.panelCalcDioTt.add(data.cmbCalcDioTtSlew, "6, 4, fill, top");

		data.lblCalcDioTtIr = new JLabel("Maximum Reverse Current");
		data.panelCalcDioTt.add(data.lblCalcDioTtIr, "2, 6, right, center");

		data.txtCalcDioTtIr = new JFormattedTextField(MainWindow.AMOUNTFORMAT);
		data.txtCalcDioTtIr.setToolTipText("Peak reverse current");
		data.txtCalcDioTtIr.setColumns(MainWindow.TEN);
		data.panelCalcDioTt.add(data.txtCalcDioTtIr, "4, 6, fill, top");

		data.cmbCalcDioTtIr = new JComboBox();
		data.cmbCalcDioTtIr.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A, MainWindow.M_A, MainWindow.U_A,
				MainWindow.N_A, MainWindow.P_A }));
		data.panelCalcDioTt.add(data.cmbCalcDioTtIr, "6, 6, fill, top");

		data.lblCalcDioTtTrr = new JLabel("Reverse Recovery Time");
		data.panelCalcDioTt.add(data.lblCalcDioTtTrr, "2, 8, center, center");

		data.txtCalcDioTtTrr = new JFormattedTextField(MainWindow.AMOUNTFORMAT);
		data.txtCalcDioTtTrr.setToolTipText("Reverse recovery time");
		data.panelCalcDioTt.add(data.txtCalcDioTtTrr, "4, 8, fill, top");
		data.txtCalcDioTtTrr.setColumns(MainWindow.TEN);

		data.cmbCalcDioTtTrr = new JComboBox();
		data.cmbCalcDioTtTrr.setModel(new DefaultComboBoxModel(new String[] { MainWindow.S, MainWindow.M_S, MainWindow.U_S,
				MainWindow.N_S, MainWindow.P_S }));
		data.panelCalcDioTt.add(data.cmbCalcDioTtTrr, "6, 8, fill, top");

		final JButton btnCalcDioTt = new JButton(MainWindow.CALCULATE);
		btnCalcDioTt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				dioCalcTt();
			}
		});
		data.panelCalcDioTt.add(btnCalcDioTt, "4, 10, fill, top");

		data.lblCalcDioTtTt = new JLabel("TT");
		data.panelCalcDioTt.add(data.lblCalcDioTtTt, "2, 12, center, center");

		data.txtCalcDioTtTt = new JTextField();
		data.panelCalcDioTt.add(data.txtCalcDioTtTt, "4, 12, fill, top");
		data.txtCalcDioTtTt.setColumns(MainWindow.TEN);

		data.tabsCalcDioXti = new JTabbedPane(SwingConstants.TOP);
		data.tabsCalcDio.addTab(MainWindow.XTI, null, data.tabsCalcDioXti, null);

		data.panelCalcDioXtiReverse = new JPanel();
		data.tabsCalcDioXti.addTab("Reverse Current Method", null, data.panelCalcDioXtiReverse, null);
		data.panelCalcDioXtiReverse.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"), FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("center:max(151dlu;default)"), }, new RowSpec[] { FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"), }));

		data.lblCalcDioXtiReverseHeader = new JLabel("Input values from Reverse current Vs. Temperature");
		data.panelCalcDioXtiReverse.add(data.lblCalcDioXtiReverseHeader, MainWindow._2_2_7_1);

		data.lblCalcDioXtiReverseIr0 = new JLabel("IR (Temp 1 C)");
		data.panelCalcDioXtiReverse.add(data.lblCalcDioXtiReverseIr0, MainWindow._4_6_RIGHT_DEFAULT);

		data.txtCalcDioXtiReverseIr0 = new JTextField();
		data.panelCalcDioXtiReverse.add(data.txtCalcDioXtiReverseIr0, MainWindow._6_6_FILL_DEFAULT);
		data.txtCalcDioXtiReverseIr0.setColumns(MainWindow.TEN);

		data.cmbCalcDioXtiReverseIr0 = new JComboBox();
		data.cmbCalcDioXtiReverseIr0.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A, MainWindow.M_A,
				MainWindow.U_A, MainWindow.N_A, MainWindow.P_A }));
		data.panelCalcDioXtiReverse.add(data.cmbCalcDioXtiReverseIr0, "8, 6, fill, default");

		data.lblCalcDioXtiReverseIr1 = new JLabel("IR (Temp 2 C)");
		data.panelCalcDioXtiReverse.add(data.lblCalcDioXtiReverseIr1, "4, 8, right, default");

		data.txtCalcDioXtiReverseIr1 = new JTextField();
		data.panelCalcDioXtiReverse.add(data.txtCalcDioXtiReverseIr1, "6, 8, fill, default");
		data.txtCalcDioXtiReverseIr1.setColumns(MainWindow.TEN);

		data.cmbCalcDioXtiReverseIr1 = new JComboBox();
		data.cmbCalcDioXtiReverseIr1.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A, MainWindow.M_A,
				MainWindow.U_A, MainWindow.N_A, MainWindow.P_A }));
		data.panelCalcDioXtiReverse.add(data.cmbCalcDioXtiReverseIr1, "8, 8, fill, default");

		data.lblCalcDioXtiReverseTemp1 = new JLabel("Temp 1");
		data.panelCalcDioXtiReverse.add(data.lblCalcDioXtiReverseTemp1, "4, 10, right, default");

		data.txtCalcDioXtiReverseTemp1 = new JTextField();
		data.txtCalcDioXtiReverseTemp1.setColumns(MainWindow.TEN);
		data.panelCalcDioXtiReverse.add(data.txtCalcDioXtiReverseTemp1, "6, 10, fill, default");

		data.lblCalcDioXtiReverseTempUnit = new JLabel("Celcius");
		data.panelCalcDioXtiReverse.add(data.lblCalcDioXtiReverseTempUnit, "8, 10");

		data.lblCalcDioXtiReverseTemp2 = new JLabel("Temp 2");
		data.panelCalcDioXtiReverse.add(data.lblCalcDioXtiReverseTemp2, "4, 12, right, default");

		data.txtCalcDioXtiReverseTemp2 = new JTextField();
		data.panelCalcDioXtiReverse.add(data.txtCalcDioXtiReverseTemp2, "6, 12, fill, default");
		data.txtCalcDioXtiReverseTemp2.setColumns(MainWindow.TEN);

		data.lblCalcDioXtiReverseTempUnit2 = new JLabel("Celcius");
		data.panelCalcDioXtiReverse.add(data.lblCalcDioXtiReverseTempUnit2, "8, 12");

		data.lblCalcDioXtiReverseN = new JLabel("N");
		data.panelCalcDioXtiReverse.add(data.lblCalcDioXtiReverseN, "4, 14, right, default");

		data.txtCalcDioXtiReverseN = new JTextField();
		data.panelCalcDioXtiReverse.add(data.txtCalcDioXtiReverseN, "6, 14, fill, default");
		data.txtCalcDioXtiReverseN.setColumns(MainWindow.TEN);

		data.lblCalcDioXtiReverseEg = new JLabel("EG");
		data.panelCalcDioXtiReverse.add(data.lblCalcDioXtiReverseEg, "4, 16, right, default");

		data.txtCalcDioXtiReverseEg = new JTextField();
		data.txtCalcDioXtiReverseEg.setEnabled(false);
		data.txtCalcDioXtiReverseEg.setEditable(false);
		data.txtCalcDioXtiReverseEg.setText(MainWindow.PLEASE_SELECT_A_TYPE);
		data.panelCalcDioXtiReverse.add(data.txtCalcDioXtiReverseEg, "6, 16, fill, default");
		data.txtCalcDioXtiReverseEg.setColumns(MainWindow.TEN);

		data.cmbCalcDioXtiReverseEg = new JComboBox();
		data.cmbCalcDioXtiReverseEg.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e)
			{
				dioReverseXtiEgChange();
			}
		});
		data.cmbCalcDioXtiReverseEg.setModel(new DefaultComboBoxModel(new String[] { MainWindow.TYPE_SELECTION,
				MainWindow.SILICON, MainWindow._4H_SI_C_SILICON_CARBIDE, MainWindow._6H_SI_C_SILICON_CARBIDE,
				MainWindow.GERMANIUM, MainWindow.GALLIUM_ARSENIDE, MainWindow.SELENIUM, MainWindow.SCHOTTKY_BARRIER,
				MainWindow.LED_GREEN, MainWindow.LED_YELLLOW_GREEN, MainWindow.LED_YELLOW, MainWindow.LED_ORANGE_RED,
				MainWindow.LED_RED, MainWindow.LED_INFRARED, MainWindow.LED_BLUE, MainWindow.LED_WHITE,
				MainWindow.CUSTOM, }));
		data.panelCalcDioXtiReverse.add(data.cmbCalcDioXtiReverseEg, "8, 16, fill, default");

		data.btnCalcDioXtiReverse = new JButton(MainWindow.CALCULATE);
		data.btnCalcDioXtiReverse.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				dioCalcXtiReverse();

			}
		});
		data.panelCalcDioXtiReverse.add(data.btnCalcDioXtiReverse, "6, 18");

		data.lblCalcDioXtiReverseXti = new JLabel(MainWindow.XTI);
		data.panelCalcDioXtiReverse.add(data.lblCalcDioXtiReverseXti, "4, 20, right, default");

		data.txtCalcDioXtiReverseXti = new JTextField();
		data.txtCalcDioXtiReverseXti.setColumns(MainWindow.TEN);
		data.panelCalcDioXtiReverse.add(data.txtCalcDioXtiReverseXti, "6, 20, fill, default");

		data.lblCalcDioXtiReverseImage = new JLabel("");
		data.lblCalcDioXtiReverseImage.setIcon(xtiChartImage);
		data.panelCalcDioXtiReverse.add(data.lblCalcDioXtiReverseImage, "2, 4, 1, 19");

		data.panelCalcDioXtiLarge = new JPanel();
		data.tabsCalcDioXti.addTab("Large Scale TCV", null, data.panelCalcDioXtiLarge, null);
		data.panelCalcDioXtiLarge.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("center:default"),
				FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"), FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("center:default"), }, new RowSpec[] { FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"), }));

		data.lblCalcXtiLargeHeader = new JLabel("Input values from the Forward-bias Diode Voltage chart");
		data.panelCalcDioXtiLarge.add(data.lblCalcXtiLargeHeader, MainWindow._2_2_7_1);

		data.lblCalcXtiLargeImage = new JLabel("");
		data.lblCalcXtiLargeImage.setIcon(xtiChartImageLarge);
		data.panelCalcDioXtiLarge.add(data.lblCalcXtiLargeImage, "2, 6, 1, 19");

		data.lblCalcXtiLargeTemp1 = new JLabel("Temperature 1");
		data.panelCalcDioXtiLarge.add(data.lblCalcXtiLargeTemp1, "4, 6");

		data.txtCalcXtiLargeTemp1 = new JTextField();
		data.panelCalcDioXtiLarge.add(data.txtCalcXtiLargeTemp1, MainWindow._6_6_FILL_DEFAULT);
		data.txtCalcXtiLargeTemp1.setColumns(MainWindow.TEN);

		data.lblCalcXtiLargeTemp2 = new JLabel("Temperature 2");
		data.panelCalcDioXtiLarge.add(data.lblCalcXtiLargeTemp2, "4, 8");

		data.txtCalcXtiLargeTemp2 = new JTextField();
		data.panelCalcDioXtiLarge.add(data.txtCalcXtiLargeTemp2, "6, 8, fill, default");
		data.txtCalcXtiLargeTemp2.setColumns(MainWindow.TEN);

		data.lblCalcXtiLargeVolt1 = new JLabel("Voltage 1");
		data.panelCalcDioXtiLarge.add(data.lblCalcXtiLargeVolt1, "4, 10");

		data.txtCalcXtiLargeVolt1 = new JTextField();
		data.txtCalcXtiLargeVolt1.setColumns(MainWindow.TEN);
		data.panelCalcDioXtiLarge.add(data.txtCalcXtiLargeVolt1, "6, 10, fill, default");

		data.cmbCalcXtiLargeVolt1 = new JComboBox();
		data.cmbCalcXtiLargeVolt1.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V, MainWindow.M_V,
				MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		data.panelCalcDioXtiLarge.add(data.cmbCalcXtiLargeVolt1, "8, 10, fill, default");

		data.lblCalcXtiLargeVolt2 = new JLabel("Voltage 2");
		data.panelCalcDioXtiLarge.add(data.lblCalcXtiLargeVolt2, "4, 12");

		data.txtCalcXtiLargeVolt2 = new JTextField();
		data.txtCalcXtiLargeVolt2.setColumns(MainWindow.TEN);
		data.panelCalcDioXtiLarge.add(data.txtCalcXtiLargeVolt2, "6, 12, fill, default");

		data.cmbCalcXtiLargeVolt2 = new JComboBox();
		data.cmbCalcXtiLargeVolt2.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V, MainWindow.M_V,
				MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		data.panelCalcDioXtiLarge.add(data.cmbCalcXtiLargeVolt2, "8, 12, fill, default");

		data.lblCalcXtiLargeCurr = new JLabel("Current");
		data.panelCalcDioXtiLarge.add(data.lblCalcXtiLargeCurr, "4, 14");

		data.txtCalcXtiLargeCurr = new JTextField();
		data.txtCalcXtiLargeCurr.setColumns(MainWindow.TEN);
		data.panelCalcDioXtiLarge.add(data.txtCalcXtiLargeCurr, "6, 14, fill, default");

		data.cmbCalcXtiLargeCurr = new JComboBox();
		data.cmbCalcXtiLargeCurr.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A, MainWindow.M_A,
				MainWindow.U_A, MainWindow.N_A, MainWindow.P_A }));
		data.panelCalcDioXtiLarge.add(data.cmbCalcXtiLargeCurr, "8, 14, fill, default");

		data.lblCalcXtiLargeN = new JLabel("N");
		data.panelCalcDioXtiLarge.add(data.lblCalcXtiLargeN, "4, 16");

		data.txtCalcXtiLargeN = new JTextField();
		data.txtCalcXtiLargeN.setColumns(MainWindow.TEN);
		data.panelCalcDioXtiLarge.add(data.txtCalcXtiLargeN, "6, 16, fill, default");

		data.lblCalcXtiLargeEg = new JLabel("EG");
		data.panelCalcDioXtiLarge.add(data.lblCalcXtiLargeEg, "4, 18");

		data.txtCalcXtiLargeEG = new JTextField();
		data.txtCalcXtiLargeEG.setColumns(MainWindow.TEN);
		data.panelCalcDioXtiLarge.add(data.txtCalcXtiLargeEG, "6, 18, fill, default");

		data.cmbCalcXtiLargeEG = new JComboBox();
		data.cmbCalcXtiLargeEG.setModel(new DefaultComboBoxModel(new String[] { MainWindow.TYPE_SELECTION,
				MainWindow.SILICON, MainWindow._4H_SI_C_SILICON_CARBIDE, MainWindow._6H_SI_C_SILICON_CARBIDE,
				MainWindow.GERMANIUM, MainWindow.GALLIUM_ARSENIDE, MainWindow.SELENIUM, MainWindow.SCHOTTKY_BARRIER,
				MainWindow.LED_GREEN, MainWindow.LED_YELLLOW_GREEN, MainWindow.LED_YELLOW, MainWindow.LED_ORANGE_RED,
				MainWindow.LED_RED, MainWindow.LED_INFRARED, MainWindow.LED_BLUE, MainWindow.LED_WHITE,
				MainWindow.CUSTOM }));
		data.cmbCalcXtiLargeEG.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e)
			{
				dioXtiEgChange();
			}
		});
		data.panelCalcDioXtiLarge.add(data.cmbCalcXtiLargeEG, "8, 18, fill, default");

		data.btnCalcXtiLarge = new JButton(MainWindow.CALCULATE);
		data.btnCalcXtiLarge.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				calculateXti();
			}
		});
		data.panelCalcDioXtiLarge.add(data.btnCalcXtiLarge, "6, 20");

		data.lblCalcXtiLargeXti = new JLabel(MainWindow.XTI);
		data.panelCalcDioXtiLarge.add(data.lblCalcXtiLargeXti, "4, 22");

		data.txtCalcXtiLargeXti = new JTextField();
		data.txtCalcXtiLargeXti.setColumns(MainWindow.TEN);
		data.panelCalcDioXtiLarge.add(data.txtCalcXtiLargeXti, "6, 22, fill, default");

		data.tabsCalcBipolar = new JTabbedPane(SwingConstants.TOP);
		data.panelCalculators.addTab(MainWindow.BIPOLAR, null, data.tabsCalcBipolar, null);

		data.tabsCalcJfet = new JTabbedPane(SwingConstants.TOP);
		data.panelCalculators.addTab(MainWindow.JFET, null, data.tabsCalcJfet, null);

		data.tabsCalcMosfet = new JTabbedPane(SwingConstants.TOP);
		data.panelCalculators.addTab(MainWindow.MOSFET, null, data.tabsCalcMosfet, null);

		data.panelConvert = new JPanel();
		tabsPrimary.addTab("Unit Conversions", null, data.panelConvert, null);
		data.panelConvert.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(154dlu;default):grow"), FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC, }, new RowSpec[] { FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, }));

		data.lblConvertBase = new JLabel("Base");
		data.panelConvert.add(data.lblConvertBase, "2, 4, right, default");

		data.txtConvertBase = new JTextField();
		data.txtConvertBase.setColumns(MainWindow.TEN);
		data.panelConvert.add(data.txtConvertBase, "4, 4, fill, default");

		data.btnConvertBase = new JButton(MainWindow.CONVERT);
		data.btnConvertBase.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				baseConvert();
			}
		});
		data.panelConvert.add(data.btnConvertBase, "6, 4, center, bottom");

		data.lblConvertMilli = new JLabel("Milli");
		data.panelConvert.add(data.lblConvertMilli, "2, 6, right, default");

		data.txtConvertMilli = new JTextField();
		data.txtConvertMilli.setColumns(MainWindow.TEN);
		data.panelConvert.add(data.txtConvertMilli, "4, 6, fill, default");

		data.btnConvertMilli = new JButton(MainWindow.CONVERT);
		data.btnConvertMilli.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				milliConvert();
			}
		});
		data.panelConvert.add(data.btnConvertMilli, "6, 6");

		data.lblConvertMicro = new JLabel("Micro");
		data.panelConvert.add(data.lblConvertMicro, "2, 8, right, default");

		data.txtConvertMicro = new JTextField();
		data.txtConvertMicro.setColumns(MainWindow.TEN);
		data.panelConvert.add(data.txtConvertMicro, "4, 8, fill, default");

		data.btnConvertMicro = new JButton(MainWindow.CONVERT);
		data.btnConvertMicro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				microConvert();
			}
		});
		data.panelConvert.add(data.btnConvertMicro, "6, 8");

		data.lblConvertNano = new JLabel("Nano");
		data.panelConvert.add(data.lblConvertNano, "2, 10, right, default");

		data.txtConvertNano = new JTextField();
		data.panelConvert.add(data.txtConvertNano, "4, 10, fill, default");
		data.txtConvertNano.setColumns(MainWindow.TEN);

		data.btnConvertNano = new JButton(MainWindow.CONVERT);
		data.btnConvertNano.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				nanoConvert();
			}
		});
		data.panelConvert.add(data.btnConvertNano, "6, 10");

		data.lblConvertPico = new JLabel("Pico");
		data.panelConvert.add(data.lblConvertPico, "2, 12, right, default");

		data.txtConvertPico = new JTextField();
		data.txtConvertPico.setColumns(MainWindow.TEN);
		data.panelConvert.add(data.txtConvertPico, "4, 12, fill, default");

		data.btnConvertPico = new JButton(MainWindow.CONVERT);
		data.btnConvertPico.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				picoConvert();
			}
		});
		data.panelConvert.add(data.btnConvertPico, "6, 12");

		data.panelAbout = new JPanel();
		tabsPrimary.addTab("About", null, data.panelAbout, null);
		data.panelAbout.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"), },
				new RowSpec[] { FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
						RowSpec.decode("default:grow"), }));

		data.txtAbout = new JTextPane();
		data.txtAbout.setText("Various formulas and images take from:\nhttp://www.youspice.com/ys/diodefromdatasheet.3sp?pageNum=1\nhttp://www-ee.uta.edu/online/jung/EE3444/pdfs/SPICEdiodeModel.pdf");
		data.panelAbout.add(data.txtAbout, "16, 18, fill, fill");

		data.jFreeChartPanelS = new ChartPanel((JFreeChart)null);

	}

	private void enableDioLoadButton()
	{
		data.txtDio.setText(MainWindow.dioLibPath);
		data.btnLoadDio.setEnabled(true);
	}

	private void enableBjtLoadButton()
	{
		data.txtTrans.setText(MainWindow.bjtLibPath);
		data.btnLoadBjt.setEnabled(true);
	}

	private void enableJfetLoadButton()
	{
		data.txtJfet.setText(MainWindow.jfetLibPath);
		data.btnLoadJfet.setEnabled(true);
	}

	private void enableMosLoadButton()
	{
		data.txtMosfet.setText(MainWindow.mosLibPath);
		data.btnLoadMos.setEnabled(true);
	}

	private void loadLibrary(Path path)
	{
		data.filePath = path;
		// SwingUtilities.invokeLater(procFile);

		switch (process(data.filePath))
			{
				case 0:
					data.dioList = data.procFile.getDioList();
					createDioWorker();
					data.dioWorker.execute();
					data.txtDio.setText(data.filePath.toString());
					storePreference(MainWindow.DIODE, data.filePath.toString());
					break;
				case 1:
					data.bjtList = data.procFile.getBjtList();
					createBjtWorker();
					data.bjtWorker.execute();
					data.txtTrans.setText(data.filePath.toString());
					storePreference(MainWindow.BJT, data.filePath.toString());
					break;
				case 2:
					data.jfetList = data.procFile.getJfetList();
					createJfetWorker();
					data.jfetWorker.execute();
					data.txtJfet.setText(data.filePath.toString());
					storePreference(MainWindow.JFET_LOWERCASE, data.filePath.toString());
					break;
				case 3:
					data.mosList = data.procFile.getMosList();
					createMosWorker();
					data.mosWorker.execute();
					data.txtMosfet.setText(data.filePath.toString());
					storePreference(MainWindow.MOS, data.filePath.toString());
					break;
				default:
					break;

			}
	}

	private String loadPreference(String prefName)
	{
		return data.prefs.get(prefName, MainWindow.NULL_STRING);
	}

	private int process(Path path)
	{
		data.executor = Executors.newSingleThreadExecutor();
		data.procFile = new ProcessFile(path);
		data.executor.execute(data.procFile);
		data.executor.shutdown();
		while (!data.executor.isTerminated())
		{
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
				JOptionPane
						.showMessageDialog(data.frmMrStevesLtspice,
								MainWindow.AN_EXCEPTION_HAS_OCCURED + e.getLocalizedMessage(),
								MainWindow.ARGUMENT_EXCEPTION, 1);
			}
		}
		return ProcessFile.getLibType();
	}

	private void storePreference(String prefName, String perfValue)
	{
		data.prefs.put(prefName, perfValue);
	}

	private void newDiode()
	{
		Diode newDiode = new Diode();
		newDiode.setLINE(data.dioList.get(data.dioAwtList.getItemCount()).getLINE() + 1);
		data.tblComponentEdit.setModel(newDiode.getTableModel());
	}

	private void dioAwtListItemSelect()
	{
		final int index = data.dioAwtList.getSelectedIndex();
		data.tblComponentEdit.setModel(data.dioList.get(index).getTableModel());
		// table = new JTable(dioList.get(index).getData(),
		// dioList.get(index).getParameters());
	}

	private void loadMosLibrary()
	{
		loadLibrary(Paths.get(MainWindow.mosLibPath));
	}

	private void loadJfetLibrary()
	{
		loadLibrary(Paths.get(MainWindow.jfetLibPath));
	}

	private void picoConvert()
	{
		double amount = Double.parseDouble(data.txtConvertPico.getText());
		List<String> array = MathMain.picoConvert(amount);
		data.txtConvertBase.setText(array.get(0).substring(0, array.get(0).length() - 2));
		data.txtConvertMilli.setText(array.get(1).substring(0, array.get(1).length() - 3));
		data.txtConvertMicro.setText(array.get(2).substring(0, array.get(2).length() - 3));
		data.txtConvertNano.setText(array.get(3).substring(0, array.get(3).length() - 3));
		data.txtConvertPico.setText(array.get(4).substring(0, array.get(4).length() - 3));
	}

	private void nanoConvert()
	{
		double amount = Double.parseDouble(data.txtConvertNano.getText());
		List<String> array = MathMain.nanoConvert(amount);
		data.txtConvertBase.setText(array.get(0).substring(0, array.get(0).length() - 2));
		data.txtConvertMilli.setText(array.get(1).substring(0, array.get(1).length() - 3));
		data.txtConvertMicro.setText(array.get(2).substring(0, array.get(2).length() - 3));
		data.txtConvertNano.setText(array.get(3).substring(0, array.get(3).length() - 3));
		data.txtConvertPico.setText(array.get(4).substring(0, array.get(4).length() - 3));
	}

	private void microConvert()
	{
		double amount = Double.parseDouble(data.txtConvertMicro.getText());
		List<String> array = MathMain.microConvert(amount);
		data.txtConvertBase.setText(array.get(0).substring(0, array.get(0).length() - 2));
		data.txtConvertMilli.setText(array.get(1).substring(0, array.get(1).length() - 3));
		data.txtConvertMicro.setText(array.get(2).substring(0, array.get(2).length() - 3));
		data.txtConvertNano.setText(array.get(3).substring(0, array.get(3).length() - 3));
		data.txtConvertPico.setText(array.get(4).substring(0, array.get(4).length() - 3));
	}

	private void milliConvert()
	{
		double amount = Double.parseDouble(data.txtConvertMilli.getText());
		List<String> array = MathMain.milliConvert(amount);
		data.txtConvertBase.setText(array.get(0).substring(0, array.get(0).length() - 2));
		data.txtConvertMilli.setText(array.get(1).substring(0, array.get(1).length() - 3));
		data.txtConvertMicro.setText(array.get(2).substring(0, array.get(2).length() - 3));
		data.txtConvertNano.setText(array.get(3).substring(0, array.get(3).length() - 3));
		data.txtConvertPico.setText(array.get(4).substring(0, array.get(4).length() - 3));
	}

	private void baseConvert()
	{
		double amount = Double.parseDouble(data.txtConvertBase.getText());
		List<String> array = MathMain.metricConvert(amount);
		data.txtConvertBase.setText(array.get(0).substring(0, array.get(0).length() - 2));
		data.txtConvertMilli.setText(array.get(1).substring(0, array.get(1).length() - 3));
		data.txtConvertMicro.setText(array.get(2).substring(0, array.get(2).length() - 3));
		data.txtConvertNano.setText(array.get(3).substring(0, array.get(3).length() - 3));
		data.txtConvertPico.setText(array.get(4).substring(0, array.get(4).length() - 3));
	}

	private void calculateXti()
	{
		if (data.txtCalcXtiLargeEG.getText().equalsIgnoreCase(MainWindow.TYPE_SELECTION))
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice, "Please provide an energy gap",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (data.txtCalcXtiLargeTemp1.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice, "Please provide temperature 1",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (data.txtCalcXtiLargeTemp2.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice, "Please provide temperature 2",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (data.txtCalcXtiLargeVolt1.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice,
					"Please provide the voltage for the first temperature at the chosen current.",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (data.txtCalcXtiLargeVolt2.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice,
					"Please provide the voltage for the second temperature at the chosen current.",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (data.txtCalcXtiLargeCurr.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice, "Please provide the chosen current.",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (data.txtCalcXtiLargeN.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice, "Please provide the ideality (N)",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}

		else if (data.txtCalcXtiLargeEG.getText().matches(MainWindow.D_0_1_D))
		{
			double voltageOne = MainWindow.convertValue(Double.parseDouble(data.txtCalcXtiLargeVolt1.getText()),
					data.cmbCalcXtiLargeVolt1.getSelectedItem().toString());
			double voltageTwo = MainWindow.convertValue(Double.parseDouble(data.txtCalcXtiLargeVolt2.getText()),
					data.cmbCalcXtiLargeVolt2.getSelectedItem().toString());
			double current = MainWindow.convertValue(Double.parseDouble(data.txtCalcXtiLargeCurr.getText()),
					data.cmbCalcXtiLargeCurr.getSelectedItem().toString());
			double temperatureOne = Double.parseDouble(data.txtCalcXtiLargeTemp1.getText());
			double temperatureTwo = Double.parseDouble(data.txtCalcXtiLargeTemp2.getText());
			double N = Double.parseDouble(data.txtCalcXtiLargeN.getText());
			double EG = Double.parseDouble(data.txtCalcXtiLargeEG.getText());

			double XTI = MainWindow.math.dioCalcXtiLargeScaleTcv(temperatureOne, temperatureTwo, voltageOne,
					voltageTwo, current, EG, N);
			data.txtCalcXtiLargeXti.setText(String.valueOf(XTI));
		}
	}

	private void dioXtiEgChange()
	{
		switch (data.cmbCalcXtiLargeEG.getSelectedItem().toString())
			{
				case TYPE_SELECTION:
					data.txtCalcXtiLargeEG.setText(MainWindow.PLEASE_SELECT_A_TYPE);
					data.txtCalcXtiLargeEG.setEnabled(false);
					data.txtCalcXtiLargeEG.setEditable(false);
					break;
				case SILICON:
					data.txtCalcXtiLargeEG.setText("1.11");
					data.txtCalcXtiLargeEG.setEnabled(false);
					data.txtCalcXtiLargeEG.setEditable(false);
					break;
				case _4H_SI_C_SILICON_CARBIDE:
					data.txtCalcXtiLargeEG.setText("3.23");
					data.txtCalcXtiLargeEG.setEnabled(false);
					data.txtCalcXtiLargeEG.setEditable(false);
					break;
				case _6H_SI_C_SILICON_CARBIDE:
					data.txtCalcXtiLargeEG.setText("3.00");
					data.txtCalcXtiLargeEG.setEnabled(false);
					data.txtCalcXtiLargeEG.setEditable(false);
					break;
				case GERMANIUM:
					data.txtCalcXtiLargeEG.setText("0.67");
					data.txtCalcXtiLargeEG.setEnabled(false);
					data.txtCalcXtiLargeEG.setEditable(false);
					break;
				case GALLIUM_ARSENIDE:
					data.txtCalcXtiLargeEG.setText("1.43");
					data.txtCalcXtiLargeEG.setEnabled(false);
					data.txtCalcXtiLargeEG.setEditable(false);
					break;
				case SELENIUM:
					data.txtCalcXtiLargeEG.setText("1.74");
					data.txtCalcXtiLargeEG.setEnabled(false);
					data.txtCalcXtiLargeEG.setEditable(false);
					break;
				case SCHOTTKY_BARRIER:
					data.txtCalcXtiLargeEG.setText("0.69");
					data.txtCalcXtiLargeEG.setEnabled(false);
					data.txtCalcXtiLargeEG.setEditable(false);
					break;
				case LED_GREEN:
					data.txtCalcXtiLargeEG.setText("2.22");
					data.txtCalcXtiLargeEG.setEnabled(false);
					data.txtCalcXtiLargeEG.setEditable(false);
					break;
				case LED_YELLLOW_GREEN:
					data.txtCalcXtiLargeEG.setText("2.17");
					data.txtCalcXtiLargeEG.setEnabled(false);
					data.txtCalcXtiLargeEG.setEditable(false);
					break;
				case LED_YELLOW:
					data.txtCalcXtiLargeEG.setText("2.10");
					data.txtCalcXtiLargeEG.setEnabled(false);
					data.txtCalcXtiLargeEG.setEditable(false);
					break;
				case LED_ORANGE_RED:
					data.txtCalcXtiLargeEG.setText("1.99");
					data.txtCalcXtiLargeEG.setEnabled(false);
					data.txtCalcXtiLargeEG.setEditable(false);
					break;
				case LED_RED:
					data.txtCalcXtiLargeEG.setText("1.92");
					data.txtCalcXtiLargeEG.setEnabled(false);
					data.txtCalcXtiLargeEG.setEditable(false);
					break;
				case LED_INFRARED:
					data.txtCalcXtiLargeEG.setText("1.30");
					data.txtCalcXtiLargeEG.setEnabled(false);
					data.txtCalcXtiLargeEG.setEditable(false);
					break;
				case LED_BLUE:
					data.txtCalcXtiLargeEG.setText("3.50");
					data.txtCalcXtiLargeEG.setEnabled(false);
					data.txtCalcXtiLargeEG.setEditable(false);
					break;
				case LED_WHITE:
					data.txtCalcXtiLargeEG.setText("4.20");
					data.txtCalcXtiLargeEG.setEnabled(false);
					data.txtCalcXtiLargeEG.setEditable(false);
					break;
				case CUSTOM:
					data.txtCalcXtiLargeEG.setText("");
					data.txtCalcXtiLargeEG.setEnabled(true);
					data.txtCalcXtiLargeEG.setEditable(true);
					break;
				default:
					data.txtCalcXtiLargeEG.setText(MainWindow.PLEASE_SELECT_A_TYPE);
					data.txtCalcXtiLargeEG.setEnabled(false);
					data.txtCalcXtiLargeEG.setEditable(false);
					break;

			}
	}

	private void dioCalcXtiReverse()
	{
		if (data.txtCalcDioXtiReverseEg.getText().equalsIgnoreCase(MainWindow.TYPE_SELECTION))
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice, "Please provide an energy gap",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (data.txtCalcDioXtiReverseIr0.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice,
					"Please provide the 27 Celcius reverse current measurement", MainWindow.ARGUMENT_EXCEPTION,
					1);
		}
		else if (data.txtCalcDioXtiReverseIr1.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice,
					"Please provide the second reverse current measurement", MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (data.txtCalcDioXtiReverseTemp1.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice,
					"Please provide the temperature of the first reverse current measurement",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (data.txtCalcDioXtiReverseTemp2.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice,
					"Please provide the temperature of the second reverse current measurement",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (data.txtCalcDioXtiReverseN.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice, "Please provide N",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (data.txtCalcDioXtiReverseEg.getText().matches(MainWindow.D_0_1_D))
		{
			double reverseCurrentZero = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioXtiReverseIr0
					.getText()), data.cmbCalcDioXtiReverseIr0.getSelectedItem().toString());
			double reverseCurrentOne = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioXtiReverseIr1
					.getText()), data.cmbCalcDioXtiReverseIr1.getSelectedItem().toString());
			double temperatureOne = Double.parseDouble(data.txtCalcDioXtiReverseTemp1.getText());
			double temperatureTwo = Double.parseDouble(data.txtCalcDioXtiReverseTemp2.getText());
			double N = Double.parseDouble(data.txtCalcDioXtiReverseN.getText());
			double EG = Double.parseDouble(data.txtCalcDioXtiReverseEg.getText());

			double XTI = MainWindow.math.dioCalcXtiReverseCurrent(temperatureOne, temperatureTwo,
					reverseCurrentZero, reverseCurrentOne, N, EG);
			data.txtCalcDioXtiReverseXti.setText(String.valueOf(XTI));
		}
	}

	private void dioCalcCjo()
	{
		final double voltageOne = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioCjoVolt1.getText()),
				data.cmbCalcDioCjoVolt1.getSelectedItem().toString());
		final double voltageTwo = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioCjoVolt2.getText()),
				data.cmbCalcDioCjoVolt2.getSelectedItem().toString());
		final double voltageThree = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioCjoVolt3.getText()),
				data.cmbCalcDioCjoVolt3.getSelectedItem().toString());
		final double capOne = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioCjoCap1.getText()),
				data.cmbCalcDioCjoCap1.getSelectedItem().toString());
		final double capTwo = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioCjoCap2.getText()),
				data.cmbCalcDioCjoCap2.getSelectedItem().toString());
		final double capThree = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioCjoCap3.getText()),
				data.cmbCalcDioCjoCap3.getSelectedItem().toString());

		final double M = MainWindow.math.dioThreePointM(voltageOne, voltageTwo, voltageThree, capOne, capTwo,
				capThree);
		final double VJ = MainWindow.math.dioThreePointVJ(voltageOne, voltageTwo, voltageThree, capOne, capTwo,
				capThree, M);
		final double CJO = MainWindow.math.dioThreePointCJO(voltageOne, voltageTwo, voltageThree, capOne,
				capTwo, capThree, M, VJ);

		data.txtCalcDioCjoM.setText(String.valueOf(M));
		data.txtCalcDioCjoVj.setText(String.valueOf(VJ));
		data.txtCalcDioCjoCjo.setText(String.valueOf(CJO));
		data.txtCalcDioCjoFc.setText(String.valueOf(MainWindow.FC));
	}

	private void dioCalcThreePointIs()
	{
		if (data.txtCalcDioThreePointIsVolt1.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice, "Please provide voltage 1",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (data.txtCalcDioThreePointIsVolt2.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice, "Please provide voltage 2",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (data.txtCalcDioThreePointIsVolt3.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice, "Please provide voltage 3",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (data.txtCalcDioThreePointIsCurr1.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice, "Please provide current 1",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (data.txtCalcDioThreePointIsCurr2.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice, "Please provide current 2",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (data.txtCalcDioThreePointIsCurr3.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice, "Please provide current 3",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (data.txtCalcDioThreePointIsTemp.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice, "Please provide temperature",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else
		{
			final double voltage1 = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioThreePointIsVolt1
					.getText()), data.cmbCalcDioThreePointIsVolt1.getSelectedItem().toString());
			final double voltage2 = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioThreePointIsVolt2
					.getText()), data.cmbCalcDioThreePointIsVolt2.getSelectedItem().toString());
			final double voltage3 = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioThreePointIsVolt3
					.getText()), data.cmbCalcDioThreePointIsVolt3.getSelectedItem().toString());
			final double current1 = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioThreePointIsCurr1
					.getText()), data.cmbCalcDioThreePointIsCurr1.getSelectedItem().toString());
			final double current2 = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioThreePointIsCurr2
					.getText()), data.cmbCalcDioThreePointIsCurr2.getSelectedItem().toString());
			final double current3 = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioThreePointIsCurr3
					.getText()), data.cmbCalcDioThreePointIsCurr3.getSelectedItem().toString());
			final double temp = Double.parseDouble(data.txtCalcDioThreePointIsTemp.getText());
			final double RS = MainWindow.math.dioThreePointRS(voltage1, voltage2, voltage3, current1, current2,
					current3);
			final double N = MainWindow.math.dioThreePointN(voltage1, voltage2, current1, current2, temp, RS);
			final double IS = MainWindow.math.dioThreePointIS(voltage1, current1, current2, temp, N, RS);

			data.txtCalcDioThreePointIsRs.setText(String.valueOf(RS));
			data.txtCalcDioThreePointIsN.setText(String.valueOf(N));
			data.txtCalcDioThreePointIsIs.setText(String.valueOf(IS));
		}
	}

	private void isForwardChart(final JFormattedTextField txtCalcDioIsSaturationN)
	{
		data.jFreeChartPanelS.removeAll();
		final double volMin = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioIsForwardChartMinVolt
				.getText()), data.cmbCalcDioIsForwardChartMinVolt.getSelectedItem().toString());
		final double volMax = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioIsForwardChartMaxVolt
				.getText()), data.cmbCalcDioIsForwardChartMaxVolt.getSelectedItem().toString());
		final double curMin = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioIsForwardChartMinCurr
				.getText()), data.cmbCalcDioIsForwardChartMinCurr.getSelectedItem().toString());
		// double curMax =
		// convertValue(Double.parseDouble(txtJFreeCurMax.getText()),
		// comboMaxCur.getSelectedItem().toString());
		final XYSeries series = new XYSeries("Series");
		final double volStep = (volMax - volMin) / 1000;
		// double curStep = (curMax - curMin) / 1000;
		double x;
		double y;
		for (int i = 0; i < 1000; i++)
		{
			x = (volStep * i) + volMin;
			y = MainWindow.math.dioCalculateID(Double.parseDouble(data.txtCalcDioIsSaturationIs.getText()), x,
					Double.parseDouble(txtCalcDioIsSaturationN.getText()),
					Double.parseDouble(data.txtCalcDioIsSaturationTemp.getText()));
			if (y == 0)
			{
				y = curMin;
			}
			series.add(x, y);
		}

		final XYSeriesCollection collection = new XYSeriesCollection(series);
		final XYPlot plot1 = new XYPlot();
		plot1.setDataset(collection);
		plot1.setRenderer(0, new StandardXYItemRenderer());

		try
		{
			data.panelCalcDioIsForwardChart.remove(data.jFreeChartPanelS);
		}
		catch (Exception e2)
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice,
					MainWindow.AN_EXCEPTION_HAS_OCCURED + e2.getLocalizedMessage(),
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}

		MainWindow.myJFreeChart = ChartFactory.createXYLineChart("Forward", "Voltage", "Current", collection);
		final XYPlot plot2 = (XYPlot)MainWindow.myJFreeChart.getPlot();
		final LogAxis yAxis = new LogAxis();
		yAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		yAxis.setMinorTickCount(100);
		yAxis.setAutoRange(true);
		plot2.setRangeAxis(yAxis);
		plot2.setRangeMinorGridlinesVisible(true);

		final DecimalFormatSymbols newSymbols = new DecimalFormatSymbols();
		newSymbols.setExponentSeparator("E");
		final DecimalFormat decForm = new DecimalFormat("0.##E0#");
		decForm.setDecimalFormatSymbols(newSymbols);
		yAxis.setNumberFormatOverride(decForm);
		data.jFreeChartPanelS = new ChartPanel(MainWindow.myJFreeChart);
		data.jFreeChartPanelS.updateUI();
		data.panelCalcDioIsForwardChart.add(data.jFreeChartPanelS, "1, 7, 13, 1, fill, fill");
	}

	private void dioIsSaturation(final JFormattedTextField txtCalcDioIsSaturationN)
	{
		try
		{
			final double current = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioIsSaturationCurr
					.getText()), data.cmbCalcDioIsSaturationCurr.getSelectedItem().toString());
			final double voltage = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioIsSaturationVolt
					.getText()), data.cmbCalcDioIsSaturationVolt.getSelectedItem().toString());
			final double val = MainWindow.math.dioCalculateIS(current, voltage,
					Double.parseDouble(txtCalcDioIsSaturationN.getText()),
					Double.parseDouble(data.txtCalcDioIsSaturationTemp.getText()));
			data.txtCalcDioIsSaturationIs.setText(MathMain.convertSciNot(Double.toString(val)));
			data.tabsCalcDioIs.setEnabledAt(1, true);
		}
		catch (NumberFormatException numE)
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice, "Please enter a valid number",
					"Number exception", 1);
		}
	}

	private void loadDioLibrary()
	{
		loadLibrary(Paths.get(MainWindow.dioLibPath));
	}

	private void dioReverseXtiEgChange()
	{
		switch (data.cmbCalcDioXtiReverseEg.getSelectedItem().toString())
			{

				case TYPE_SELECTION:
					data.txtCalcDioXtiReverseEg.setText(MainWindow.PLEASE_SELECT_A_TYPE);
					data.txtCalcDioXtiReverseEg.setEnabled(false);
					data.txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case SILICON:
					data.txtCalcDioXtiReverseEg.setText("1.11");
					data.txtCalcDioXtiReverseEg.setEnabled(false);
					data.txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case _4H_SI_C_SILICON_CARBIDE:
					data.txtCalcDioXtiReverseEg.setText("3.23");
					data.txtCalcDioXtiReverseEg.setEnabled(false);
					data.txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case _6H_SI_C_SILICON_CARBIDE:
					data.txtCalcDioXtiReverseEg.setText("3.00");
					data.txtCalcDioXtiReverseEg.setEnabled(false);
					data.txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case GERMANIUM:
					data.txtCalcDioXtiReverseEg.setText("0.67");
					data.txtCalcDioXtiReverseEg.setEnabled(false);
					data.txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case GALLIUM_ARSENIDE:
					data.txtCalcDioXtiReverseEg.setText("1.43");
					data.txtCalcDioXtiReverseEg.setEnabled(false);
					data.txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case SELENIUM:
					data.txtCalcDioXtiReverseEg.setText("1.74");
					data.txtCalcDioXtiReverseEg.setEnabled(false);
					data.txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case SCHOTTKY_BARRIER:
					data.txtCalcDioXtiReverseEg.setText("0.69");
					data.txtCalcDioXtiReverseEg.setEnabled(false);
					data.txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case LED_GREEN:
					data.txtCalcDioXtiReverseEg.setText("2.22");
					data.txtCalcDioXtiReverseEg.setEnabled(false);
					data.txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case LED_YELLLOW_GREEN:
					data.txtCalcDioXtiReverseEg.setText("2.17");
					data.txtCalcDioXtiReverseEg.setEnabled(false);
					data.txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case LED_YELLOW:
					data.txtCalcDioXtiReverseEg.setText("2.10");
					data.txtCalcDioXtiReverseEg.setEnabled(false);
					data.txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case LED_ORANGE_RED:
					data.txtCalcDioXtiReverseEg.setText("1.99");
					data.txtCalcDioXtiReverseEg.setEnabled(false);
					data.txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case LED_RED:
					data.txtCalcDioXtiReverseEg.setText("1.92");
					data.txtCalcDioXtiReverseEg.setEnabled(false);
					data.txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case LED_INFRARED:
					data.txtCalcDioXtiReverseEg.setText("1.30");
					data.txtCalcDioXtiReverseEg.setEnabled(false);
					data.txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case LED_BLUE:
					data.txtCalcDioXtiReverseEg.setText("3.50");
					data.txtCalcDioXtiReverseEg.setEnabled(false);
					data.txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case LED_WHITE:
					data.txtCalcDioXtiReverseEg.setText("4.20");
					data.txtCalcDioXtiReverseEg.setEnabled(false);
					data.txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case CUSTOM:
					data.txtCalcDioXtiReverseEg.setText("");
					data.txtCalcDioXtiReverseEg.setEnabled(true);
					data.txtCalcDioXtiReverseEg.setEditable(true);
					break;
				default:
					data.txtCalcDioXtiReverseEg.setText(MainWindow.PLEASE_SELECT_A_TYPE);
					data.txtCalcDioXtiReverseEg.setEnabled(false);
					data.txtCalcDioXtiReverseEg.setEditable(false);
					break;

			}
	}

	private void dioCalcTt()
	{
		// There is apparently some way to get this using reverse
		// current instead of slew rate, but I'm not sure which reverse
		// current is needed.
		if (data.txtCalcDioTtSlew.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice, "Please provide Slew",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (data.txtCalcDioTtCurr.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice, "Please provide IF",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (data.txtCalcDioTtTrr.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(data.frmMrStevesLtspice, "Please provide Trr",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else
		{
			final double IF = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioTtCurr.getText()),
					data.cmbCalcDioTtCurr.getSelectedItem().toString());
			final double slew = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioTtSlew.getText()),
					data.cmbCalcDioTtSlew.getSelectedItem().toString());

			final double TRR = MainWindow.convertValue(Double.parseDouble(data.txtCalcDioTtTrr.getText()),
					data.cmbCalcDioTtTrr.getSelectedItem().toString());

			final double TT = MainWindow.math.dioCalculateTt(IF, slew, TRR);

			data.txtCalcDioTtTt.setText(String.valueOf(TT));

		}
	}

	private void loadBjtLibrary()
	{
		loadLibrary(Paths.get(MainWindow.bjtLibPath));
	}
}
