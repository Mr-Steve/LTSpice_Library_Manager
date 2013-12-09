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
		

		public MainWindowData()
		{
		}
	}

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
					window.frmMrStevesLtspice.setVisible(true);
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
		fc.setDialogType(JFileChooser.OPEN_DIALOG);

		fc.setName(MainWindow.SELECT_A_LIBRARY_TO_EDIT);
		if (fc.showOpenDialog(frmMrStevesLtspice) == JFileChooser.APPROVE_OPTION)
		{
			loadLibrary(Paths.get(fc.getSelectedFile().toURI()));
		}

	}

	private void convertBase()
	{
		double amount = Double.parseDouble(txtConvertBase.getText());
		List<String> array = MathMain.metricConvert(amount);
		txtConvertBase.setText(array.get(0).substring(0, array.get(0).length() - 2));
		txtConvertMilli.setText(array.get(1).substring(0, array.get(1).length() - 3));
		txtConvertMicro.setText(array.get(2).substring(0, array.get(2).length() - 3));
		txtConvertNano.setText(array.get(3).substring(0, array.get(3).length() - 3));
		txtConvertPico.setText(array.get(4).substring(0, array.get(4).length() - 3));
	}

	private void convertMicro()
	{
		double amount = Double.parseDouble(txtConvertMicro.getText());
		List<String> array = MathMain.microConvert(amount);
		txtConvertBase.setText(array.get(0).substring(0, array.get(0).length() - 2));
		txtConvertMilli.setText(array.get(1).substring(0, array.get(1).length() - 3));
		txtConvertMicro.setText(array.get(2).substring(0, array.get(2).length() - 3));
		txtConvertNano.setText(array.get(3).substring(0, array.get(3).length() - 3));
		txtConvertPico.setText(array.get(4).substring(0, array.get(4).length() - 3));
	}

	private void convertMilli()
	{
		double amount = Double.parseDouble(txtConvertMilli.getText());
		List<String> array = MathMain.milliConvert(amount);
		txtConvertBase.setText(array.get(0).substring(0, array.get(0).length() - 2));
		txtConvertMilli.setText(array.get(1).substring(0, array.get(1).length() - 3));
		txtConvertMicro.setText(array.get(2).substring(0, array.get(2).length() - 3));
		txtConvertNano.setText(array.get(3).substring(0, array.get(3).length() - 3));
		txtConvertPico.setText(array.get(4).substring(0, array.get(4).length() - 3));
	}

	private void convertNano()
	{
		double amount = Double.parseDouble(txtConvertNano.getText());
		List<String> array = MathMain.nanoConvert(amount);
		txtConvertBase.setText(array.get(0).substring(0, array.get(0).length() - 2));
		txtConvertMilli.setText(array.get(1).substring(0, array.get(1).length() - 3));
		txtConvertMicro.setText(array.get(2).substring(0, array.get(2).length() - 3));
		txtConvertNano.setText(array.get(3).substring(0, array.get(3).length() - 3));
		txtConvertPico.setText(array.get(4).substring(0, array.get(4).length() - 3));
	}

	private void convertPico()
	{
		double amount = Double.parseDouble(txtConvertPico.getText());
		List<String> array = MathMain.picoConvert(amount);
		txtConvertBase.setText(array.get(0).substring(0, array.get(0).length() - 2));
		txtConvertMilli.setText(array.get(1).substring(0, array.get(1).length() - 3));
		txtConvertMicro.setText(array.get(2).substring(0, array.get(2).length() - 3));
		txtConvertNano.setText(array.get(3).substring(0, array.get(3).length() - 3));
		txtConvertPico.setText(array.get(4).substring(0, array.get(4).length() - 3));
	}

	/**
	 * Creates a new bjtWorker for processing files into lists
	 */
	private void createBjtWorker()
	{
		bjtWorker = new SwingWorker<Boolean, Integer>() {
			@Override
			protected Boolean doInBackground() throws Exception
			{

				bjtProg.setMaximum(bjtList.size());
				// int prog = 100 / dioList.size();
				for (int i = 0; i < bjtList.size(); i++)
				{

					bjtAwtList.add(bjtList.get(i).toString());
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

					bjtAwtList.setMinimumSize(panelLibList.getMinimumSize());
					bjtAwtList.setMaximumSize(panelLibList.getMaximumSize());
					bjtAwtList.setSize(panelLibList.getSize());

					bjtAwtList.repaint();
					// Retrieve the return value of doInBackground.
					get();
					bjtProg.setString(MainWindow.DONE);
					// statusLabel.setText("Completed with status: " + status);
				}
				catch (InterruptedException e)
				{
					JOptionPane.showMessageDialog(frmMrStevesLtspice,
							MainWindow.AN_EXCEPTION_HAS_OCCURED + e.getLocalizedMessage(),
							MainWindow.ARGUMENT_EXCEPTION, 1);
					// This is thrown if the thread's interrupted.
				}
				catch (ExecutionException e)
				{
					JOptionPane.showMessageDialog(frmMrStevesLtspice,
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
				bjtProg.setValue(chunks.get(chunks.size() - 1));
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
		dioWorker = new SwingWorker<Boolean, Integer>() {
			@Override
			protected Boolean doInBackground() throws Exception
			{

				dioProg.setMaximum(dioList.size());
				// int prog = 100 / dioList.size();
				for (int i = 0; i < dioList.size(); i++)
				{

					dioAwtList.add(dioList.get(i).toString());
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

					dioAwtList.setMinimumSize(panelLibList.getMinimumSize());
					dioAwtList.setMaximumSize(panelLibList.getMaximumSize());
					dioAwtList.setSize(panelLibList.getSize());

					dioAwtList.repaint();
					// Retrieve the return value of doInBackground.
					if (get())
					{
						dioProg.setString(MainWindow.DONE);
					}
					// statusLabel.setText("Completed with status: " + status);
				}
				catch (InterruptedException e)
				{
					JOptionPane.showMessageDialog(frmMrStevesLtspice,
							MainWindow.AN_EXCEPTION_HAS_OCCURED + e.getLocalizedMessage(),
							MainWindow.ARGUMENT_EXCEPTION, 1);
					// This is thrown if the thread's interrupted.
				}
				catch (ExecutionException e)
				{
					JOptionPane.showMessageDialog(frmMrStevesLtspice,
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
				dioProg.setValue(chunks.get(chunks.size() - 1));
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
		jfetWorker = new SwingWorker<Boolean, Integer>() {
			@Override
			protected Boolean doInBackground() throws Exception
			{

				jfetProg.setMaximum(jfetList.size());
				// int prog = 100 / dioList.size();
				for (int i = 0; i < jfetList.size(); i++)
				{

					jfetAwtList.add(jfetList.get(i).toString());
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

					jfetAwtList.setMinimumSize(panelLibList.getMinimumSize());
					jfetAwtList.setMaximumSize(panelLibList.getMaximumSize());
					jfetAwtList.setSize(panelLibList.getSize());

					jfetAwtList.repaint();
					// Retrieve the return value of doInBackground.
					get();
					jfetProg.setString(MainWindow.DONE);
					// statusLabel.setText("Completed with status: " + status);
				}
				catch (InterruptedException e)
				{
					JOptionPane.showMessageDialog(frmMrStevesLtspice,
							MainWindow.AN_EXCEPTION_HAS_OCCURED + e.getLocalizedMessage(),
							MainWindow.ARGUMENT_EXCEPTION, 1);
					// This is thrown if the thread's interrupted.
				}
				catch (ExecutionException e)
				{
					JOptionPane.showMessageDialog(frmMrStevesLtspice,
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
				jfetProg.setValue(chunks.get(chunks.size() - 1));
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
		mosWorker = new SwingWorker<Boolean, Integer>() {
			@Override
			protected Boolean doInBackground() throws Exception
			{

				mosProg.setMaximum(mosList.size());
				// int prog = 100 / dioList.size();
				for (int i = 0; i < mosList.size(); i++)
				{

					mosAwtList.add(mosList.get(i).toString());
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

					mosAwtList.setMinimumSize(panelLibList.getMinimumSize());
					mosAwtList.setMaximumSize(panelLibList.getMaximumSize());
					mosAwtList.setSize(panelLibList.getSize());

					mosAwtList.repaint();
					// Retrieve the return value of doInBackground.
					get();
					mosProg.setString(MainWindow.DONE);
					// statusLabel.setText("Completed with status: " + status);
				}
				catch (InterruptedException e)
				{
					JOptionPane.showMessageDialog(frmMrStevesLtspice,
							MainWindow.AN_EXCEPTION_HAS_OCCURED + e.getLocalizedMessage(),
							MainWindow.ARGUMENT_EXCEPTION, 1);
					// This is thrown if the thread's interrupted.
				}
				catch (ExecutionException e)
				{
					JOptionPane.showMessageDialog(frmMrStevesLtspice,
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
				mosProg.setValue(chunks.get(chunks.size() - 1));
				// dioProg.getValue() + prog);

				// countLabel1.setText(Integer.toString(mostRecentValue));
			}

		};
	}

	private void dioAwtListItemSelect()
	{
		final int index = dioAwtList.getSelectedIndex();
		tblComponentEdit.setModel(dioList.get(index).getTableModel());
		// table = new JTable(dioList.get(index).getData(),
		// dioList.get(index).getParameters());
	}

	private void dioCalcCjo()
	{
		final double voltageOne = MainWindow.convertValue(Double.parseDouble(txtCalcDioCjoVolt1.getText()),
				cmbCalcDioCjoVolt1.getSelectedItem().toString());
		final double voltageTwo = MainWindow.convertValue(Double.parseDouble(txtCalcDioCjoVolt2.getText()),
				cmbCalcDioCjoVolt2.getSelectedItem().toString());
		final double voltageThree = MainWindow.convertValue(Double.parseDouble(txtCalcDioCjoVolt3.getText()),
				cmbCalcDioCjoVolt3.getSelectedItem().toString());
		final double capOne = MainWindow.convertValue(Double.parseDouble(txtCalcDioCjoCap1.getText()),
				cmbCalcDioCjoCap1.getSelectedItem().toString());
		final double capTwo = MainWindow.convertValue(Double.parseDouble(txtCalcDioCjoCap2.getText()),
				cmbCalcDioCjoCap2.getSelectedItem().toString());
		final double capThree = MainWindow.convertValue(Double.parseDouble(txtCalcDioCjoCap3.getText()),
				cmbCalcDioCjoCap3.getSelectedItem().toString());

		final double M = MainWindow.math.dioThreePointM(voltageOne, voltageTwo, voltageThree, capOne, capTwo, capThree);
		final double VJ = MainWindow.math.dioThreePointVJ(voltageOne, voltageTwo, voltageThree, capOne, capTwo,
				capThree, M);
		final double CJO = MainWindow.math.dioThreePointCJO(voltageOne, voltageTwo, voltageThree, capOne, capTwo,
				capThree, M, VJ);

		txtCalcDioCjoM.setText(String.valueOf(M));
		txtCalcDioCjoVj.setText(String.valueOf(VJ));
		txtCalcDioCjoCjo.setText(String.valueOf(CJO));
		txtCalcDioCjoFc.setText(String.valueOf(MainWindow.FC));
	}

	private void dioCalcThreePointIs()
	{
		if (txtCalcDioThreePointIsVolt1.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice, "Please provide voltage 1",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (txtCalcDioThreePointIsVolt2.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice, "Please provide voltage 2",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (txtCalcDioThreePointIsVolt3.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice, "Please provide voltage 3",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (txtCalcDioThreePointIsCurr1.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice, "Please provide current 1",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (txtCalcDioThreePointIsCurr2.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice, "Please provide current 2",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (txtCalcDioThreePointIsCurr3.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice, "Please provide current 3",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (txtCalcDioThreePointIsTemp.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice, "Please provide temperature",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else
		{
			final double voltage1 = MainWindow.convertValue(Double.parseDouble(txtCalcDioThreePointIsVolt1
					.getText()), cmbCalcDioThreePointIsVolt1.getSelectedItem().toString());
			final double voltage2 = MainWindow.convertValue(Double.parseDouble(txtCalcDioThreePointIsVolt2
					.getText()), cmbCalcDioThreePointIsVolt2.getSelectedItem().toString());
			final double voltage3 = MainWindow.convertValue(Double.parseDouble(txtCalcDioThreePointIsVolt3
					.getText()), cmbCalcDioThreePointIsVolt3.getSelectedItem().toString());
			final double current1 = MainWindow.convertValue(Double.parseDouble(txtCalcDioThreePointIsCurr1
					.getText()), cmbCalcDioThreePointIsCurr1.getSelectedItem().toString());
			final double current2 = MainWindow.convertValue(Double.parseDouble(txtCalcDioThreePointIsCurr2
					.getText()), cmbCalcDioThreePointIsCurr2.getSelectedItem().toString());
			final double current3 = MainWindow.convertValue(Double.parseDouble(txtCalcDioThreePointIsCurr3
					.getText()), cmbCalcDioThreePointIsCurr3.getSelectedItem().toString());
			final double temp = Double.parseDouble(txtCalcDioThreePointIsTemp.getText());
			final double RS = MainWindow.math.dioThreePointRS(voltage1, voltage2, voltage3, current1, current2,
					current3);
			final double N = MainWindow.math.dioThreePointN(voltage1, voltage2, current1, current2, temp, RS);
			final double IS = MainWindow.math.dioThreePointIS(voltage1, current1, current2, temp, N, RS);

			txtCalcDioThreePointIsRs.setText(String.valueOf(RS));
			txtCalcDioThreePointIsN.setText(String.valueOf(N));
			txtCalcDioThreePointIsIs.setText(String.valueOf(IS));
		}
	}

	private void dioCalcTt()
	{
		// There is apparently some way to get this using reverse
		// current instead of slew rate, but I'm not sure which reverse
		// current is needed.
		if (txtCalcDioTtSlew.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice, "Please provide Slew",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (txtCalcDioTtCurr.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice, "Please provide IF", MainWindow.ARGUMENT_EXCEPTION,
					1);
		}
		else if (txtCalcDioTtTrr.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice, "Please provide Trr", MainWindow.ARGUMENT_EXCEPTION,
					1);
		}
		else
		{
			final double IF = MainWindow.convertValue(Double.parseDouble(txtCalcDioTtCurr.getText()),
					cmbCalcDioTtCurr.getSelectedItem().toString());
			final double slew = MainWindow.convertValue(Double.parseDouble(txtCalcDioTtSlew.getText()),
					cmbCalcDioTtSlew.getSelectedItem().toString());

			final double TRR = MainWindow.convertValue(Double.parseDouble(txtCalcDioTtTrr.getText()),
					cmbCalcDioTtTrr.getSelectedItem().toString());

			final double TT = MainWindow.math.dioCalculateTt(IF, slew, TRR);

			txtCalcDioTtTt.setText(String.valueOf(TT));

		}
	}

	private void dioCalculateXti()
	{
		if (txtCalcXtiLargeEG.getText().equalsIgnoreCase(MainWindow.TYPE_SELECTION))
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice, "Please provide an energy gap",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (txtCalcXtiLargeTemp1.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice, "Please provide temperature 1",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (txtCalcXtiLargeTemp2.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice, "Please provide temperature 2",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (txtCalcXtiLargeVolt1.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice,
					"Please provide the voltage for the first temperature at the chosen current.",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (txtCalcXtiLargeVolt2.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice,
					"Please provide the voltage for the second temperature at the chosen current.",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (txtCalcXtiLargeCurr.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice, "Please provide the chosen current.",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (txtCalcXtiLargeN.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice, "Please provide the ideality (N)",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}

		else if (txtCalcXtiLargeEG.getText().matches(MainWindow.D_0_1_D))
		{
			double voltageOne = MainWindow.convertValue(Double.parseDouble(txtCalcXtiLargeVolt1.getText()),
					cmbCalcXtiLargeVolt1.getSelectedItem().toString());
			double voltageTwo = MainWindow.convertValue(Double.parseDouble(txtCalcXtiLargeVolt2.getText()),
					cmbCalcXtiLargeVolt2.getSelectedItem().toString());
			double current = MainWindow.convertValue(Double.parseDouble(txtCalcXtiLargeCurr.getText()),
					cmbCalcXtiLargeCurr.getSelectedItem().toString());
			double temperatureOne = Double.parseDouble(txtCalcXtiLargeTemp1.getText());
			double temperatureTwo = Double.parseDouble(txtCalcXtiLargeTemp2.getText());
			double N = Double.parseDouble(txtCalcXtiLargeN.getText());
			double EG = Double.parseDouble(txtCalcXtiLargeEG.getText());

			double XTI = MainWindow.math.dioCalcXtiLargeScaleTcv(temperatureOne, temperatureTwo, voltageOne,
					voltageTwo, current, EG, N);
			txtCalcXtiLargeXti.setText(String.valueOf(XTI));
		}
	}

	private void dioCalcXtiReverse()
	{
		if (txtCalcDioXtiReverseEg.getText().equalsIgnoreCase(MainWindow.TYPE_SELECTION))
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice, "Please provide an energy gap",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (txtCalcDioXtiReverseIr0.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice,
					"Please provide the 27 Celcius reverse current measurement", MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (txtCalcDioXtiReverseIr1.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice,
					"Please provide the second reverse current measurement", MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (txtCalcDioXtiReverseTemp1.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice,
					"Please provide the temperature of the first reverse current measurement",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (txtCalcDioXtiReverseTemp2.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice,
					"Please provide the temperature of the second reverse current measurement",
					MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (txtCalcDioXtiReverseN.getText().isEmpty())
		{
			JOptionPane
					.showMessageDialog(frmMrStevesLtspice, "Please provide N", MainWindow.ARGUMENT_EXCEPTION, 1);
		}
		else if (txtCalcDioXtiReverseEg.getText().matches(MainWindow.D_0_1_D))
		{
			double reverseCurrentZero = MainWindow.convertValue(Double.parseDouble(txtCalcDioXtiReverseIr0
					.getText()), cmbCalcDioXtiReverseIr0.getSelectedItem().toString());
			double reverseCurrentOne = MainWindow.convertValue(Double.parseDouble(txtCalcDioXtiReverseIr1
					.getText()), cmbCalcDioXtiReverseIr1.getSelectedItem().toString());
			double temperatureOne = Double.parseDouble(txtCalcDioXtiReverseTemp1.getText());
			double temperatureTwo = Double.parseDouble(txtCalcDioXtiReverseTemp2.getText());
			double N = Double.parseDouble(txtCalcDioXtiReverseN.getText());
			double EG = Double.parseDouble(txtCalcDioXtiReverseEg.getText());

			double XTI = MainWindow.math.dioCalcXtiReverseCurrent(temperatureOne, temperatureTwo, reverseCurrentZero,
					reverseCurrentOne, N, EG);
			txtCalcDioXtiReverseXti.setText(String.valueOf(XTI));
		}
	}

	private void dioIsForwardChart(final JFormattedTextField txtCalcDioIsSaturationN)
	{
		jFreeChartPanelS.removeAll();
		final double volMin = MainWindow.convertValue(
				Double.parseDouble(txtCalcDioIsForwardChartMinVolt.getText()),
				cmbCalcDioIsForwardChartMinVolt.getSelectedItem().toString());
		final double volMax = MainWindow.convertValue(
				Double.parseDouble(txtCalcDioIsForwardChartMaxVolt.getText()),
				cmbCalcDioIsForwardChartMaxVolt.getSelectedItem().toString());
		final double curMin = MainWindow.convertValue(
				Double.parseDouble(txtCalcDioIsForwardChartMinCurr.getText()),
				cmbCalcDioIsForwardChartMinCurr.getSelectedItem().toString());
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
			y = MainWindow.math.dioCalculateID(Double.parseDouble(txtCalcDioIsSaturationIs.getText()), x,
					Double.parseDouble(txtCalcDioIsSaturationN.getText()),
					Double.parseDouble(txtCalcDioIsSaturationTemp.getText()));
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
			panelCalcDioIsForwardChart.remove(jFreeChartPanelS);
		}
		catch (Exception e2)
		{
			JOptionPane.showMessageDialog(frmMrStevesLtspice,
					MainWindow.AN_EXCEPTION_HAS_OCCURED + e2.getLocalizedMessage(), MainWindow.ARGUMENT_EXCEPTION, 1);
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
		jFreeChartPanelS = new ChartPanel(MainWindow.myJFreeChart);
		jFreeChartPanelS.updateUI();
		panelCalcDioIsForwardChart.add(jFreeChartPanelS, "1, 7, 13, 1, fill, fill");
	}

	private void dioIsSaturation(final JFormattedTextField txtCalcDioIsSaturationN)
	{
		try
		{
			final double current = MainWindow.convertValue(
					Double.parseDouble(txtCalcDioIsSaturationCurr.getText()), cmbCalcDioIsSaturationCurr
							.getSelectedItem().toString());
			final double voltage = MainWindow.convertValue(
					Double.parseDouble(txtCalcDioIsSaturationVolt.getText()), cmbCalcDioIsSaturationVolt
							.getSelectedItem().toString());
			final double val = MainWindow.math.dioCalculateIS(current, voltage,
					Double.parseDouble(txtCalcDioIsSaturationN.getText()),
					Double.parseDouble(txtCalcDioIsSaturationTemp.getText()));
			txtCalcDioIsSaturationIs.setText(MathMain.convertSciNot(Double.toString(val)));
			tabsCalcDioIs.setEnabledAt(1, true);
		}
		catch (NumberFormatException numE)
		{
			JOptionPane
					.showMessageDialog(frmMrStevesLtspice, "Please enter a valid number", "Number exception", 1);
		}
	}

	private void dioReverseXtiEgChange()
	{
		switch (cmbCalcDioXtiReverseEg.getSelectedItem().toString())
			{

				case TYPE_SELECTION:
					txtCalcDioXtiReverseEg.setText(MainWindow.PLEASE_SELECT_A_TYPE);
					txtCalcDioXtiReverseEg.setEnabled(false);
					txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case SILICON:
					txtCalcDioXtiReverseEg.setText("1.11");
					txtCalcDioXtiReverseEg.setEnabled(false);
					txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case _4H_SI_C_SILICON_CARBIDE:
					txtCalcDioXtiReverseEg.setText("3.23");
					txtCalcDioXtiReverseEg.setEnabled(false);
					txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case _6H_SI_C_SILICON_CARBIDE:
					txtCalcDioXtiReverseEg.setText("3.00");
					txtCalcDioXtiReverseEg.setEnabled(false);
					txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case GERMANIUM:
					txtCalcDioXtiReverseEg.setText("0.67");
					txtCalcDioXtiReverseEg.setEnabled(false);
					txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case GALLIUM_ARSENIDE:
					txtCalcDioXtiReverseEg.setText("1.43");
					txtCalcDioXtiReverseEg.setEnabled(false);
					txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case SELENIUM:
					txtCalcDioXtiReverseEg.setText("1.74");
					txtCalcDioXtiReverseEg.setEnabled(false);
					txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case SCHOTTKY_BARRIER:
					txtCalcDioXtiReverseEg.setText("0.69");
					txtCalcDioXtiReverseEg.setEnabled(false);
					txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case LED_GREEN:
					txtCalcDioXtiReverseEg.setText("2.22");
					txtCalcDioXtiReverseEg.setEnabled(false);
					txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case LED_YELLLOW_GREEN:
					txtCalcDioXtiReverseEg.setText("2.17");
					txtCalcDioXtiReverseEg.setEnabled(false);
					txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case LED_YELLOW:
					txtCalcDioXtiReverseEg.setText("2.10");
					txtCalcDioXtiReverseEg.setEnabled(false);
					txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case LED_ORANGE_RED:
					txtCalcDioXtiReverseEg.setText("1.99");
					txtCalcDioXtiReverseEg.setEnabled(false);
					txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case LED_RED:
					txtCalcDioXtiReverseEg.setText("1.92");
					txtCalcDioXtiReverseEg.setEnabled(false);
					txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case LED_INFRARED:
					txtCalcDioXtiReverseEg.setText("1.30");
					txtCalcDioXtiReverseEg.setEnabled(false);
					txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case LED_BLUE:
					txtCalcDioXtiReverseEg.setText("3.50");
					txtCalcDioXtiReverseEg.setEnabled(false);
					txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case LED_WHITE:
					txtCalcDioXtiReverseEg.setText("4.20");
					txtCalcDioXtiReverseEg.setEnabled(false);
					txtCalcDioXtiReverseEg.setEditable(false);
					break;
				case CUSTOM:
					txtCalcDioXtiReverseEg.setText("");
					txtCalcDioXtiReverseEg.setEnabled(true);
					txtCalcDioXtiReverseEg.setEditable(true);
					break;
				default:
					txtCalcDioXtiReverseEg.setText(MainWindow.PLEASE_SELECT_A_TYPE);
					txtCalcDioXtiReverseEg.setEnabled(false);
					txtCalcDioXtiReverseEg.setEditable(false);
					break;

			}
	}

	private void dioXtiEgChange()
	{
		switch (cmbCalcXtiLargeEG.getSelectedItem().toString())
			{
				case TYPE_SELECTION:
					txtCalcXtiLargeEG.setText(MainWindow.PLEASE_SELECT_A_TYPE);
					txtCalcXtiLargeEG.setEnabled(false);
					txtCalcXtiLargeEG.setEditable(false);
					break;
				case SILICON:
					txtCalcXtiLargeEG.setText("1.11");
					txtCalcXtiLargeEG.setEnabled(false);
					txtCalcXtiLargeEG.setEditable(false);
					break;
				case _4H_SI_C_SILICON_CARBIDE:
					txtCalcXtiLargeEG.setText("3.23");
					txtCalcXtiLargeEG.setEnabled(false);
					txtCalcXtiLargeEG.setEditable(false);
					break;
				case _6H_SI_C_SILICON_CARBIDE:
					txtCalcXtiLargeEG.setText("3.00");
					txtCalcXtiLargeEG.setEnabled(false);
					txtCalcXtiLargeEG.setEditable(false);
					break;
				case GERMANIUM:
					txtCalcXtiLargeEG.setText("0.67");
					txtCalcXtiLargeEG.setEnabled(false);
					txtCalcXtiLargeEG.setEditable(false);
					break;
				case GALLIUM_ARSENIDE:
					txtCalcXtiLargeEG.setText("1.43");
					txtCalcXtiLargeEG.setEnabled(false);
					txtCalcXtiLargeEG.setEditable(false);
					break;
				case SELENIUM:
					txtCalcXtiLargeEG.setText("1.74");
					txtCalcXtiLargeEG.setEnabled(false);
					txtCalcXtiLargeEG.setEditable(false);
					break;
				case SCHOTTKY_BARRIER:
					txtCalcXtiLargeEG.setText("0.69");
					txtCalcXtiLargeEG.setEnabled(false);
					txtCalcXtiLargeEG.setEditable(false);
					break;
				case LED_GREEN:
					txtCalcXtiLargeEG.setText("2.22");
					txtCalcXtiLargeEG.setEnabled(false);
					txtCalcXtiLargeEG.setEditable(false);
					break;
				case LED_YELLLOW_GREEN:
					txtCalcXtiLargeEG.setText("2.17");
					txtCalcXtiLargeEG.setEnabled(false);
					txtCalcXtiLargeEG.setEditable(false);
					break;
				case LED_YELLOW:
					txtCalcXtiLargeEG.setText("2.10");
					txtCalcXtiLargeEG.setEnabled(false);
					txtCalcXtiLargeEG.setEditable(false);
					break;
				case LED_ORANGE_RED:
					txtCalcXtiLargeEG.setText("1.99");
					txtCalcXtiLargeEG.setEnabled(false);
					txtCalcXtiLargeEG.setEditable(false);
					break;
				case LED_RED:
					txtCalcXtiLargeEG.setText("1.92");
					txtCalcXtiLargeEG.setEnabled(false);
					txtCalcXtiLargeEG.setEditable(false);
					break;
				case LED_INFRARED:
					txtCalcXtiLargeEG.setText("1.30");
					txtCalcXtiLargeEG.setEnabled(false);
					txtCalcXtiLargeEG.setEditable(false);
					break;
				case LED_BLUE:
					txtCalcXtiLargeEG.setText("3.50");
					txtCalcXtiLargeEG.setEnabled(false);
					txtCalcXtiLargeEG.setEditable(false);
					break;
				case LED_WHITE:
					txtCalcXtiLargeEG.setText("4.20");
					txtCalcXtiLargeEG.setEnabled(false);
					txtCalcXtiLargeEG.setEditable(false);
					break;
				case CUSTOM:
					txtCalcXtiLargeEG.setText("");
					txtCalcXtiLargeEG.setEnabled(true);
					txtCalcXtiLargeEG.setEditable(true);
					break;
				default:
					txtCalcXtiLargeEG.setText(MainWindow.PLEASE_SELECT_A_TYPE);
					txtCalcXtiLargeEG.setEnabled(false);
					txtCalcXtiLargeEG.setEditable(false);
					break;

			}
	}

	private void enableBjtLoadButton()
	{
		txtTrans.setText(MainWindow.bjtLibPath);
		btnLoadBjt.setEnabled(true);
	}

	private void enableDioLoadButton()
	{
		txtDio.setText(MainWindow.dioLibPath);
		btnLoadDio.setEnabled(true);
	}

	private void enableJfetLoadButton()
	{
		txtJfet.setText(MainWindow.jfetLibPath);
		btnLoadJfet.setEnabled(true);
	}

	private void enableMosLoadButton()
	{
		txtMosfet.setText(MainWindow.mosLibPath);
		btnLoadMos.setEnabled(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize()
	{
		prefs = Preferences.userRoot().node(this.getClass().getName());
		MainWindow.math = new MathDio();
		MainWindow.dioLibPath = loadPreference(MainWindow.DIODE);
		MainWindow.bjtLibPath = loadPreference(MainWindow.BJT);
		MainWindow.jfetLibPath = loadPreference(MainWindow.JFET_LOWERCASE);
		MainWindow.mosLibPath = loadPreference(MainWindow.MOS);
		amountFormat = NumberFormat.getNumberInstance();

		fc = new JFileChooser();
		frmMrStevesLtspice = new JFrame();
		frmMrStevesLtspice.setTitle(MainWindow.APP_TITLE);

		 frmMrStevesLtspice.addComponentListener(new ComponentAdapter() {
		 @Override
		 public void componentResized(ComponentEvent e)
		 {
		 // TODO: get rid of this by setting the all to form layouts
		 // list.setMinimumSize(libListPane.getMinimumSize());
		 // list.setMaximumSize(libListPane.getMaximumSize());
		 final Dimension dim = panelLibList.getSize();
		 libTabPane.setSize(dim);
		 // Diode panels
		 dioPanel.setSize(dim);
		 dioAwtList.setSize(dim);
		 // bjt
		 bjtPanel.setSize(dim);
		 bjtAwtList.setSize(dim);
		 // Jfet
		 jfetPanel.setSize(dim);
		 jfetAwtList.setSize(dim);
		 // Mos
		 mosPanel.setSize(dim);
		 mosAwtList.setSize(dim);
		
		 tblComponentEdit.setSize(dim);
		
		 }
		 });
		frmMrStevesLtspice.setBounds(100, 100, 777, 660);
		frmMrStevesLtspice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final JTabbedPane tabsPrimary = new JTabbedPane(SwingConstants.TOP);
		frmMrStevesLtspice.getContentPane().add(tabsPrimary, BorderLayout.CENTER);

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

		txtDio = new JTextField();
		txtDio.setEditable(false);
		txtDio.setColumns(MainWindow.TEN);

		panelLibSelect.add(txtDio, "3, 1, fill, top");

		btnLoadDio = new JButton(MainWindow.LOAD_LIBRARY);
		btnLoadDio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				loadDioLibrary();
			}
		});
		panelLibSelect.add(btnLoadDio, "1, 3, center, default");
		btnLoadDio.setEnabled(false);
		if (!MainWindow.NULL_STRING.equals(MainWindow.dioLibPath))
		{
			enableDioLoadButton();
		}

		dioProg = new JProgressBar();
		panelLibSelect.add(dioProg, "3, 3");

		final JButton btnTrans = new JButton("Locate Bipolar Library");
		btnTrans.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				chooseFile(e);
			}
		});
		panelLibSelect.add(btnTrans, "1, 5, fill, top");

		txtTrans = new JTextField();
		txtTrans.setEditable(false);
		txtTrans.setColumns(MainWindow.TEN);

		panelLibSelect.add(txtTrans, "3, 5, fill, top");

		btnLoadBjt = new JButton(MainWindow.LOAD_LIBRARY);
		btnLoadBjt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				loadBjtLibrary();
			}
		});
		panelLibSelect.add(btnLoadBjt, "1, 7, center, default");
		btnLoadBjt.setEnabled(false);
		if (MainWindow.bjtLibPath != null)
		{
			enableBjtLoadButton();
		}

		bjtProg = new JProgressBar();
		panelLibSelect.add(bjtProg, "3, 7");

		JButton btnJfet = new JButton("Locate Jfet Library");
		btnJfet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				chooseFile(e);
			}
		});
		panelLibSelect.add(btnJfet, "1, 9, fill, top");

		txtJfet = new JTextField();
		txtJfet.setEditable(false);
		txtJfet.setColumns(MainWindow.TEN);

		panelLibSelect.add(txtJfet, "3, 9, fill, top");

		btnLoadJfet = new JButton(MainWindow.LOAD_LIBRARY);
		btnLoadJfet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				loadJfetLibrary();
			}
		});
		panelLibSelect.add(btnLoadJfet, "1, 11, center, default");
		btnLoadJfet.setEnabled(false);
		if (!MainWindow.jfetLibPath.equalsIgnoreCase(MainWindow.NULL_STRING))
		{
			enableJfetLoadButton();
		}

		jfetProg = new JProgressBar();
		panelLibSelect.add(jfetProg, "3, 11");

		JButton btnMosfet = new JButton("Locate Mosfet Library");
		btnMosfet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				chooseFile(e);
			}
		});
		panelLibSelect.add(btnMosfet, "1, 13, fill, top");

		txtMosfet = new JTextField();
		txtMosfet.setEditable(false);
		txtMosfet.setColumns(MainWindow.TEN);

		panelLibSelect.add(txtMosfet, "3, 13, fill, top");

		btnLoadMos = new JButton(MainWindow.LOAD_LIBRARY);
		btnLoadMos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				loadMosLibrary();
			}
		});
		panelLibSelect.add(btnLoadMos, "1, 15, center, default");
		btnLoadMos.setEnabled(false);
		if (!MainWindow.mosLibPath.equalsIgnoreCase(MainWindow.NULL_STRING))
		{
			enableMosLoadButton();
		}
		mosProg = new JProgressBar();
		panelLibSelect.add(mosProg, "3, 15");

		panelLibList = new Panel();
		tabsPrimary.addTab("Library List", null, panelLibList, null);
		panelLibList.setLayout(new FormLayout(new ColumnSpec[] { ColumnSpec.decode("429px:grow"), },
				new RowSpec[] { RowSpec.decode("304px:grow"), }));

		libTabPane = new JTabbedPane(SwingConstants.TOP);
		panelLibList.add(libTabPane, "1, 1, fill, fill");

		dioPanel = new JPanel();
		libTabPane.addTab(MainWindow.DIODES, null, dioPanel, null);

		dioAwtList = new java.awt.List();
		dioAwtList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				dioAwtListItemSelect();

			}
		});
		dioPanel.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"), }, new RowSpec[] { RowSpec.decode("517px:grow"),
				RowSpec.decode("29px"), }));

		dioPanel.add(dioAwtList, "1, 1, 5, 1, fill, fill");

		btnDioNew = new JButton("New Diode");
		btnDioNew.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				newDiode();
			}
		});
		dioPanel.add(btnDioNew, "1, 2, default, bottom");

		btnDioSave = new JButton(MainWindow.SAVE);
		dioPanel.add(btnDioSave, "3, 2, fill, top");

		bjtPanel = new JPanel();
		libTabPane.addTab(MainWindow.BIPOLAR, null, bjtPanel, null);
		bjtPanel.setLayout(new BorderLayout(0, 0));

		bjtAwtList = new java.awt.List();
		bjtPanel.add(bjtAwtList);

		button = new JButton(MainWindow.SAVE);
		bjtPanel.add(button, BorderLayout.SOUTH);

		jfetPanel = new JPanel();
		jfetPanel.setLayout(new BorderLayout(0, 0));
		libTabPane.addTab(MainWindow.JFET, null, jfetPanel, null);

		jfetAwtList = new java.awt.List();
		jfetPanel.add(jfetAwtList);

		button_1 = new JButton(MainWindow.SAVE);
		jfetPanel.add(button_1, BorderLayout.SOUTH);

		mosPanel = new JPanel();
		mosPanel.setLayout(new BorderLayout(0, 0));
		libTabPane.addTab(MainWindow.MOSFET, null, mosPanel, null);

		mosAwtList = new java.awt.List();
		mosPanel.add(mosAwtList);

		button_2 = new JButton(MainWindow.SAVE);
		mosPanel.add(button_2, BorderLayout.SOUTH);

		panelComponentEditor = new JPanel();
		tabsPrimary.addTab(MainWindow.COMPONENT_EDITOR, null, panelComponentEditor, null);
		panelComponentEditor.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"), FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC, }, new RowSpec[] { FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"), FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, }));

		lblComponentEditor = new JLabel(MainWindow.COMPONENT_EDITOR);
		panelComponentEditor.add(lblComponentEditor, "4, 2");

		scrollPane = new JScrollPane();
		panelComponentEditor.add(scrollPane, "4, 4, 3, 3, fill, fill");

		tblComponentEdit = new JTable();
		scrollPane.setViewportView(tblComponentEdit);

		btnComponentEditSave = new JButton("Save");
		btnComponentEditSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				saveComponent();
			}
		});
		panelComponentEditor.add(btnComponentEditSave, "4, 8");

		panelCalculators = new JTabbedPane(SwingConstants.TOP);
		tabsPrimary.addTab("Calculators", null, panelCalculators, null);
		final ImageIcon img = new ImageIcon("images/data4.jpg");
		final ImageIcon threePointIs = new ImageIcon("images/threePointIs.png");
		final ImageIcon threePointCjo = new ImageIcon("images/threePointCJO.png");
		final ImageIcon xtiChartImage = new ImageIcon("images/xtiChart.png");
		final ImageIcon xtiChartImageLarge = new ImageIcon("images/dioXtiLarge.png");
		tabsCalcDio = new JTabbedPane(SwingConstants.TOP);
		panelCalculators.addTab(MainWindow.DIODES, null, tabsCalcDio, null);

		tabsCalcDioIs = new JTabbedPane(SwingConstants.TOP);
		tabsCalcDio.addTab("IS, N, RS", null, tabsCalcDioIs, null);

		panelCalcDioIsSaturation = new JPanel();
		tabsCalcDioIs.addTab("Saturation Current", null, panelCalcDioIsSaturation, null);
		panelCalcDioIsSaturation.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(190dlu;default):grow"), FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("center:max(30dlu;default)"), ColumnSpec.decode("center:max(67dlu;default):grow"), },
				new RowSpec[] { FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC, }));

		txtCalcDioIsSaturationCurr = new JFormattedTextField(MainWindow.AMOUNTFORMAT);
		panelCalcDioIsSaturation.add(txtCalcDioIsSaturationCurr, "2, 2, fill, default");
		txtCalcDioIsSaturationCurr.setColumns(MainWindow.TEN);

		cmbCalcDioIsSaturationCurr = new JComboBox();
		cmbCalcDioIsSaturationCurr.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A, MainWindow.M_A,
				MainWindow.U_A, MainWindow.N_A, MainWindow.P_A }));
		panelCalcDioIsSaturation.add(cmbCalcDioIsSaturationCurr, "4, 2, fill, default");

		lblCalcDioIsSaturationCurr = new JLabel("Current A");
		panelCalcDioIsSaturation.add(lblCalcDioIsSaturationCurr, "5, 2");

		txtCalcDioIsSaturationVolt = new JFormattedTextField(MainWindow.AMOUNTFORMAT);
		txtCalcDioIsSaturationVolt.setColumns(MainWindow.TEN);
		panelCalcDioIsSaturation.add(txtCalcDioIsSaturationVolt, "2, 4, fill, default");

		cmbCalcDioIsSaturationVolt = new JComboBox();
		cmbCalcDioIsSaturationVolt.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V, MainWindow.M_V,
				MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		panelCalcDioIsSaturation.add(cmbCalcDioIsSaturationVolt, "4, 4, fill, default");

		lblCalcDioIsSaturationVolt = new JLabel("Voltage V");
		panelCalcDioIsSaturation.add(lblCalcDioIsSaturationVolt, "5, 4");

		final JFormattedTextField txtCalcDioIsSaturationN = new JFormattedTextField(MainWindow.AMOUNTFORMAT);
		txtCalcDioIsSaturationN.setColumns(MainWindow.TEN);
		panelCalcDioIsSaturation.add(txtCalcDioIsSaturationN, "2, 6, fill, default");

		lblCalcDioIsSaturationN = new JLabel("Ideality Factor N");
		panelCalcDioIsSaturation.add(lblCalcDioIsSaturationN, "5, 6");

		btnCalcDioIsSaturation = new JButton(MainWindow.CALCULATE);
		btnCalcDioIsSaturation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				dioIsSaturation(txtCalcDioIsSaturationN);

			}
		});

		txtCalcDioIsSaturationTemp = new JTextField();
		panelCalcDioIsSaturation.add(txtCalcDioIsSaturationTemp, "2, 8, fill, default");
		txtCalcDioIsSaturationTemp.setColumns(MainWindow.TEN);

		lblCalcDioIsSaturationTemp = new JLabel("Temperature C");
		panelCalcDioIsSaturation.add(lblCalcDioIsSaturationTemp, "5, 8");
		panelCalcDioIsSaturation.add(btnCalcDioIsSaturation, "2, 10");

		txtCalcDioIsSaturationIs = new JTextField();
		txtCalcDioIsSaturationIs.setEditable(false);
		panelCalcDioIsSaturation.add(txtCalcDioIsSaturationIs, "2, 12, fill, default");
		txtCalcDioIsSaturationIs.setColumns(MainWindow.TEN);

		lblCalcDioIsSaturationIs = new JLabel("IS");
		panelCalcDioIsSaturation.add(lblCalcDioIsSaturationIs, "5, 12");

		// JFreeChart myJChart = new JFreeChart(plot)
		// JFreeChart asdf = new JFreeChart("test", plot);
		panelCalcDioIsForwardChart = new JPanel();
		tabsCalcDioIs.addTab("Forward Chart", null, panelCalcDioIsForwardChart, null);
		tabsCalcDioIs.setEnabledAt(1, false);
		panelCalcDioIsForwardChart.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("center:77px:grow"), FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(53dlu;default)"), FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("center:max(27dlu;default):grow"), FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("center:max(36dlu;default)"), FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(60dlu;default)"), FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(39dlu;default):grow"), FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC, }, new RowSpec[] { RowSpec.decode("max(15dlu;pref)"),
				FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("max(15dlu;default)"), FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.GLUE_ROWSPEC, }));

		lblCalcDioIsForwardChartMinVolt = new JLabel("Min V");
		panelCalcDioIsForwardChart.add(lblCalcDioIsForwardChartMinVolt, "1, 1");

		txtCalcDioIsForwardChartMinVolt = new JTextField();
		panelCalcDioIsForwardChart.add(txtCalcDioIsForwardChartMinVolt, "3, 1, fill, default");
		txtCalcDioIsForwardChartMinVolt.setColumns(MainWindow.TEN);

		cmbCalcDioIsForwardChartMinVolt = new JComboBox();
		cmbCalcDioIsForwardChartMinVolt.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V,
				MainWindow.M_V, MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		panelCalcDioIsForwardChart.add(cmbCalcDioIsForwardChartMinVolt, "5, 1, fill, default");

		lblCalcDioIsForwardChartMaxVolt = new JLabel("Max V");
		panelCalcDioIsForwardChart.add(lblCalcDioIsForwardChartMaxVolt, "7, 1");

		txtCalcDioIsForwardChartMaxVolt = new JTextField();
		panelCalcDioIsForwardChart.add(txtCalcDioIsForwardChartMaxVolt, "9, 1, fill, default");
		txtCalcDioIsForwardChartMaxVolt.setColumns(MainWindow.TEN);

		cmbCalcDioIsForwardChartMaxVolt = new JComboBox();
		cmbCalcDioIsForwardChartMaxVolt.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V,
				MainWindow.M_V, MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		panelCalcDioIsForwardChart.add(cmbCalcDioIsForwardChartMaxVolt, "11, 1, fill, default");

		lblCalcDioIsForwardChartMinCurr = new JLabel("Min I");
		panelCalcDioIsForwardChart.add(lblCalcDioIsForwardChartMinCurr, "1, 3, center, default");

		txtCalcDioIsForwardChartMinCurr = new JTextField();
		panelCalcDioIsForwardChart.add(txtCalcDioIsForwardChartMinCurr, "3, 3, fill, default");
		txtCalcDioIsForwardChartMinCurr.setColumns(MainWindow.TEN);

		cmbCalcDioIsForwardChartMinCurr = new JComboBox();
		cmbCalcDioIsForwardChartMinCurr.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A,
				MainWindow.M_A, MainWindow.U_A, MainWindow.N_A, MainWindow.P_A }));
		panelCalcDioIsForwardChart.add(cmbCalcDioIsForwardChartMinCurr, "5, 3, fill, default");

		lblCalcDioIsForwardChartMaxCurr = new JLabel("Max I");
		panelCalcDioIsForwardChart.add(lblCalcDioIsForwardChartMaxCurr, "7, 3");

		txtCalcDioIsForwardChartMaxCurr = new JTextField();
		panelCalcDioIsForwardChart.add(txtCalcDioIsForwardChartMaxCurr, "9, 3, fill, default");
		txtCalcDioIsForwardChartMaxCurr.setColumns(MainWindow.TEN);

		btnCalcDioIsForwardChart = new JButton("Draw");
		btnCalcDioIsForwardChart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				dioIsForwardChart(txtCalcDioIsSaturationN);

			}
		});

		cmbCalcDioIsForwardChartMaxCurr = new JComboBox();
		cmbCalcDioIsForwardChartMaxCurr.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A,
				MainWindow.M_A, MainWindow.U_A, MainWindow.N_A, MainWindow.P_A }));
		panelCalcDioIsForwardChart.add(cmbCalcDioIsForwardChartMaxCurr, "11, 3, fill, default");
		panelCalcDioIsForwardChart.add(btnCalcDioIsForwardChart, "3, 5");

		panelCalcDioParaRes = new JPanel();
		tabsCalcDioIs.addTab("Parasitic Resistance", null, panelCalcDioParaRes, null);
		panelCalcDioParaRes.setLayout(new FormLayout(new ColumnSpec[] { ColumnSpec.decode("max(200dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("236px:grow"), ColumnSpec.decode("18px"), },
				new RowSpec[] { FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("16px:grow"), }));

		lblCalcDioParaResImage = new JLabel("");
		lblCalcDioParaResImage.setIcon(img);
		panelCalcDioParaRes.add(lblCalcDioParaResImage, "1, 2, fill, fill");

		txtCalcDioParaResText = new JTextArea();
		txtCalcDioParaResText.setLineWrap(true);
		txtCalcDioParaResText
				.setText("\"We can estimate RS as voltage difference on the green line drawn at the point of the knee of the curve, and the red line, divided by the corresponding current, hence:\n\nRS =0.1V/0.1A = 1 Ohm\" - http://www.youspice.com/ys/diodefromdatasheet.3sp?pageNum=1\n\nThe red line is drawn through what is called the \"ideal diode\", the linear section of the F I-V curve. The green line is drawn where the top portion of the curve begins to curve heavily. You subtract the voltage where the red line crosses the green from the voltage where the 'knee' interscets the green line, then divde the result by the current (of the green line).");
		panelCalcDioParaRes.add(txtCalcDioParaResText, "3, 2, fill, fill");

		panelCalcDioThreePointIs = new JPanel();
		tabsCalcDioIs.addTab("Three Point Method", null, panelCalcDioThreePointIs, null);
		panelCalcDioThreePointIs.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
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

		lblCalcDioThreePointIsHeader1 = new JLabel(
				"Input voltages and currents at points similar to the chart below.");
		panelCalcDioThreePointIs.add(lblCalcDioThreePointIsHeader1, "2, 2, 5, 1, center, default");

		lblCalcDioThreePointIsHeader2 = new JLabel(
				"Must have logrithmic current axis. Ignore the point between 2 and 3.");
		panelCalcDioThreePointIs.add(lblCalcDioThreePointIsHeader2, "2, 4, 5, 1, center, default");

		lblCalcDioThreePointIsVolt1 = new JLabel("V1");
		panelCalcDioThreePointIs.add(lblCalcDioThreePointIsVolt1, "4, 6");

		txtCalcDioThreePointIsVolt1 = new JFormattedTextField(amountFormat);
		lblCalcDioThreePointIsVolt1.setLabelFor(txtCalcDioThreePointIsVolt1);
		panelCalcDioThreePointIs.add(txtCalcDioThreePointIsVolt1, MainWindow._6_6_FILL_DEFAULT);
		txtCalcDioThreePointIsVolt1.setColumns(MainWindow.TEN);

		cmbCalcDioThreePointIsVolt1 = new JComboBox();
		cmbCalcDioThreePointIsVolt1.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V, MainWindow.M_V,
				MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		panelCalcDioThreePointIs.add(cmbCalcDioThreePointIsVolt1, "8, 6, fill, default");

		lblCalcDioThreePointIsVolt2 = new JLabel("V2");
		panelCalcDioThreePointIs.add(lblCalcDioThreePointIsVolt2, "4, 8");

		txtCalcDioThreePointIsVolt2 = new JFormattedTextField(amountFormat);
		lblCalcDioThreePointIsVolt2.setLabelFor(txtCalcDioThreePointIsVolt2);
		panelCalcDioThreePointIs.add(txtCalcDioThreePointIsVolt2, "6, 8, fill, default");
		txtCalcDioThreePointIsVolt2.setColumns(MainWindow.TEN);

		cmbCalcDioThreePointIsVolt2 = new JComboBox();
		cmbCalcDioThreePointIsVolt2.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V, MainWindow.M_V,
				MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		panelCalcDioThreePointIs.add(cmbCalcDioThreePointIsVolt2, "8, 8, fill, default");

		lblCalcDioThreePointIsVolt3 = new JLabel("V3");
		panelCalcDioThreePointIs.add(lblCalcDioThreePointIsVolt3, "4, 10");

		txtCalcDioThreePointIsVolt3 = new JFormattedTextField(amountFormat);
		panelCalcDioThreePointIs.add(txtCalcDioThreePointIsVolt3, "6, 10, fill, default");
		txtCalcDioThreePointIsVolt3.setColumns(MainWindow.TEN);

		cmbCalcDioThreePointIsVolt3 = new JComboBox();
		cmbCalcDioThreePointIsVolt3.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V, MainWindow.M_V,
				MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		panelCalcDioThreePointIs.add(cmbCalcDioThreePointIsVolt3, "8, 10, fill, default");

		lblCalcDioThreePointIsCurr1 = new JLabel("I1");
		panelCalcDioThreePointIs.add(lblCalcDioThreePointIsCurr1, "4, 12");

		txtCalcDioThreePointIsCurr1 = new JFormattedTextField(amountFormat);
		panelCalcDioThreePointIs.add(txtCalcDioThreePointIsCurr1, "6, 12, fill, default");
		txtCalcDioThreePointIsCurr1.setColumns(MainWindow.TEN);

		cmbCalcDioThreePointIsCurr1 = new JComboBox();
		cmbCalcDioThreePointIsCurr1.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A, MainWindow.M_A,
				MainWindow.U_A, MainWindow.N_A, MainWindow.P_A }));
		panelCalcDioThreePointIs.add(cmbCalcDioThreePointIsCurr1, "8, 12, fill, default");

		lblCalcDioThreePointIsCurr2 = new JLabel("I2");
		panelCalcDioThreePointIs.add(lblCalcDioThreePointIsCurr2, "4, 14");

		txtCalcDioThreePointIsCurr2 = new JFormattedTextField(amountFormat);
		panelCalcDioThreePointIs.add(txtCalcDioThreePointIsCurr2, "6, 14, fill, default");
		txtCalcDioThreePointIsCurr2.setColumns(MainWindow.TEN);

		cmbCalcDioThreePointIsCurr2 = new JComboBox();
		cmbCalcDioThreePointIsCurr2.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A, MainWindow.M_A,
				MainWindow.U_A, MainWindow.N_A, MainWindow.P_A }));
		panelCalcDioThreePointIs.add(cmbCalcDioThreePointIsCurr2, "8, 14, fill, default");

		lblCalcDioThreePointIsCurr3 = new JLabel("I3");
		panelCalcDioThreePointIs.add(lblCalcDioThreePointIsCurr3, "4, 16");

		txtCalcDioThreePointIsCurr3 = new JFormattedTextField(amountFormat);
		panelCalcDioThreePointIs.add(txtCalcDioThreePointIsCurr3, "6, 16, fill, default");
		txtCalcDioThreePointIsCurr3.setColumns(MainWindow.TEN);

		btnCalcDioThreePointIs = new JButton(MainWindow.CALCULATE);
		btnCalcDioThreePointIs.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				dioCalcThreePointIs();

			}
		});

		cmbCalcDioThreePointIsCurr3 = new JComboBox();
		cmbCalcDioThreePointIsCurr3.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A, MainWindow.M_A,
				MainWindow.U_A, MainWindow.N_A, MainWindow.P_A }));
		panelCalcDioThreePointIs.add(cmbCalcDioThreePointIsCurr3, "8, 16, fill, default");

		lblCalcDioThreePointIsTemp = new JLabel("Temp");
		panelCalcDioThreePointIs.add(lblCalcDioThreePointIsTemp, "4, 18, right, default");

		txtCalcDioThreePointIsTemp = new JFormattedTextField(amountFormat);
		panelCalcDioThreePointIs.add(txtCalcDioThreePointIsTemp, "6, 18, fill, default");
		txtCalcDioThreePointIsTemp.setColumns(MainWindow.TEN);

		lblCalcDioThreePointIsTempUnit = new JLabel("Celcius");
		panelCalcDioThreePointIs.add(lblCalcDioThreePointIsTempUnit, "8, 18, center, default");
		panelCalcDioThreePointIs.add(btnCalcDioThreePointIs, "6, 20");

		lblCalcDioThreePointIsImage = new JLabel("");
		lblCalcDioThreePointIsImage.setIcon(threePointIs);
		panelCalcDioThreePointIs.add(lblCalcDioThreePointIsImage, "2, 6, 1, 23, default, fill");

		lblCalcDioThreePointIsRs = new JLabel("RS");
		panelCalcDioThreePointIs.add(lblCalcDioThreePointIsRs, "4, 22");

		txtCalcDioThreePointIsRs = new JTextField();
		lblCalcDioThreePointIsRs.setLabelFor(txtCalcDioThreePointIsRs);
		panelCalcDioThreePointIs.add(txtCalcDioThreePointIsRs, "6, 22, fill, default");
		txtCalcDioThreePointIsRs.setColumns(MainWindow.TEN);

		lblCalcDioThreePointIsN = new JLabel("N");
		panelCalcDioThreePointIs.add(lblCalcDioThreePointIsN, "4, 24");

		txtCalcDioThreePointIsN = new JTextField();
		lblCalcDioThreePointIsN.setLabelFor(txtCalcDioThreePointIsN);
		panelCalcDioThreePointIs.add(txtCalcDioThreePointIsN, "6, 24, fill, default");
		txtCalcDioThreePointIsN.setColumns(MainWindow.TEN);

		lblCalcDioThreePointIsIs = new JLabel("IS");
		panelCalcDioThreePointIs.add(lblCalcDioThreePointIsIs, "4, 26");

		txtCalcDioThreePointIsIs = new JTextField();
		lblCalcDioThreePointIsIs.setLabelFor(txtCalcDioThreePointIsIs);
		panelCalcDioThreePointIs.add(txtCalcDioThreePointIsIs, "6, 26, fill, default");
		txtCalcDioThreePointIsIs.setColumns(MainWindow.TEN);

		panelCalcDioCjo = new JPanel();
		tabsCalcDio.addTab("CJO, VJ, M, FC", null, panelCalcDioCjo, null);
		panelCalcDioCjo.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
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

		lblCalcDioCjoHeader1 = new JLabel(
				"Input capacitance and reverse voltages at points similar to the C-V chart below.");
		panelCalcDioCjo.add(lblCalcDioCjoHeader1, "2, 2, 5, 1, center, default");

		lblCalcDioCjoHeader2 = new JLabel("Both C and V must be logrithmic.");
		panelCalcDioCjo.add(lblCalcDioCjoHeader2, "2, 4, 5, 1, center, default");

		lblCalcDioCjoImage = new JLabel("");
		lblCalcDioCjoImage.setIcon(threePointCjo);
		panelCalcDioCjo.add(lblCalcDioCjoImage, "2, 6, 1, 23");

		lblCalcDioCjoVolt1 = new JLabel("V1");
		panelCalcDioCjo.add(lblCalcDioCjoVolt1, "4, 6");

		txtCalcDioCjoVolt1 = new JFormattedTextField();
		panelCalcDioCjo.add(txtCalcDioCjoVolt1, MainWindow._6_6_FILL_DEFAULT);
		txtCalcDioCjoVolt1.setColumns(MainWindow.TEN);

		cmbCalcDioCjoVolt1 = new JComboBox();
		cmbCalcDioCjoVolt1.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V, MainWindow.M_V,
				MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		panelCalcDioCjo.add(cmbCalcDioCjoVolt1, "8, 6, fill, default");

		lblCalcDioCjoVolt2 = new JLabel("V2");
		panelCalcDioCjo.add(lblCalcDioCjoVolt2, "4, 8");

		txtCalcDioCjoVolt2 = new JFormattedTextField();
		panelCalcDioCjo.add(txtCalcDioCjoVolt2, "6, 8, fill, default");
		txtCalcDioCjoVolt2.setColumns(MainWindow.TEN);

		cmbCalcDioCjoVolt2 = new JComboBox();
		cmbCalcDioCjoVolt2.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V, MainWindow.M_V,
				MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		panelCalcDioCjo.add(cmbCalcDioCjoVolt2, "8, 8, fill, default");

		lblCalcDioCjoVolt3 = new JLabel("V3");
		panelCalcDioCjo.add(lblCalcDioCjoVolt3, "4, 10");

		txtCalcDioCjoVolt3 = new JFormattedTextField();
		txtCalcDioCjoVolt3.setColumns(MainWindow.TEN);
		panelCalcDioCjo.add(txtCalcDioCjoVolt3, "6, 10, fill, default");

		cmbCalcDioCjoVolt3 = new JComboBox();
		cmbCalcDioCjoVolt3.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V, MainWindow.M_V,
				MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		panelCalcDioCjo.add(cmbCalcDioCjoVolt3, "8, 10, fill, default");

		lblCalcDioCjoCap1 = new JLabel("C1");
		panelCalcDioCjo.add(lblCalcDioCjoCap1, "4, 12");

		txtCalcDioCjoCap1 = new JFormattedTextField();
		txtCalcDioCjoCap1.setColumns(MainWindow.TEN);
		panelCalcDioCjo.add(txtCalcDioCjoCap1, "6, 12, fill, default");

		cmbCalcDioCjoCap1 = new JComboBox();
		cmbCalcDioCjoCap1.setModel(new DefaultComboBoxModel(new String[] { MainWindow.F, MainWindow.M_F,
				MainWindow.U_F, MainWindow.N_F, MainWindow.P_F }));
		panelCalcDioCjo.add(cmbCalcDioCjoCap1, "8, 12, fill, default");

		lblCalcDioCjoCap2 = new JLabel("C2");
		panelCalcDioCjo.add(lblCalcDioCjoCap2, "4, 14");

		txtCalcDioCjoCap2 = new JFormattedTextField();
		txtCalcDioCjoCap2.setColumns(MainWindow.TEN);
		panelCalcDioCjo.add(txtCalcDioCjoCap2, "6, 14, fill, default");

		cmbCalcDioCjoCap2 = new JComboBox();
		cmbCalcDioCjoCap2.setModel(new DefaultComboBoxModel(new String[] { MainWindow.F, MainWindow.M_F,
				MainWindow.U_F, MainWindow.N_F, MainWindow.P_F }));
		panelCalcDioCjo.add(cmbCalcDioCjoCap2, "8, 14, fill, default");

		lblCalcDioCjoCap3 = new JLabel("C3");
		panelCalcDioCjo.add(lblCalcDioCjoCap3, "4, 16");

		txtCalcDioCjoCap3 = new JFormattedTextField();
		txtCalcDioCjoCap3.setColumns(MainWindow.TEN);
		panelCalcDioCjo.add(txtCalcDioCjoCap3, "6, 16, fill, default");

		cmbCalcDioCjoCap3 = new JComboBox();
		cmbCalcDioCjoCap3.setModel(new DefaultComboBoxModel(new String[] { MainWindow.F, MainWindow.M_F,
				MainWindow.U_F, MainWindow.N_F, MainWindow.P_F }));
		panelCalcDioCjo.add(cmbCalcDioCjoCap3, "8, 16, fill, default");

		btnCalcDioCjo = new JButton(MainWindow.CALCULATE);
		btnCalcDioCjo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{

				dioCalcCjo();
			}
		});
		panelCalcDioCjo.add(btnCalcDioCjo, "6, 18");

		lblCalcDioCjoCjo = new JLabel("CJO");
		panelCalcDioCjo.add(lblCalcDioCjoCjo, "4, 20");

		txtCalcDioCjoCjo = new JTextField();
		lblCalcDioCjoCjo.setLabelFor(txtCalcDioCjoCjo);
		panelCalcDioCjo.add(txtCalcDioCjoCjo, "6, 20, fill, default");
		txtCalcDioCjoCjo.setColumns(MainWindow.TEN);

		lblCalcDioCjoVj = new JLabel("VJ");
		panelCalcDioCjo.add(lblCalcDioCjoVj, "4, 22");

		txtCalcDioCjoVj = new JTextField();
		txtCalcDioCjoVj.setColumns(MainWindow.TEN);
		panelCalcDioCjo.add(txtCalcDioCjoVj, "6, 22, fill, default");

		lblCalcDioCjoM = new JLabel("M");
		panelCalcDioCjo.add(lblCalcDioCjoM, "4, 24");

		txtCalcDioCjoM = new JTextField();
		txtCalcDioCjoM.setColumns(MainWindow.TEN);
		panelCalcDioCjo.add(txtCalcDioCjoM, "6, 24, fill, default");

		lblCalcDioCjoFc = new JLabel("FC");
		panelCalcDioCjo.add(lblCalcDioCjoFc, "4, 26");

		txtCalcDioCjoFc = new JTextField();
		txtCalcDioCjoFc.setColumns(MainWindow.TEN);
		panelCalcDioCjo.add(txtCalcDioCjoFc, "6, 26, fill, default");

		panelCalcDioTt = new JPanel();
		tabsCalcDio.addTab("TT", null, panelCalcDioTt, null);
		panelCalcDioTt.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("165px"), FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("426px"),
				FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("99px"), }, new RowSpec[] { RowSpec.decode("31px"),
				RowSpec.decode("28px"), FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("28px"),
				FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("28px"), FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("28px"), FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("29px"),
				FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("28px"), }));

		lblCalcDioTtCurr = new JLabel("Forward Bias Current");
		panelCalcDioTt.add(lblCalcDioTtCurr, "2, 2, center, center");

		txtCalcDioTtCurr = new JFormattedTextField(MainWindow.AMOUNTFORMAT);
		txtCalcDioTtCurr.setToolTipText("Forward bias diode current");
		panelCalcDioTt.add(txtCalcDioTtCurr, "4, 2, fill, top");
		txtCalcDioTtCurr.setColumns(MainWindow.TEN);

		cmbCalcDioTtCurr = new JComboBox();
		cmbCalcDioTtCurr.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A, MainWindow.M_A,
				MainWindow.U_A, MainWindow.N_A, MainWindow.P_A }));
		panelCalcDioTt.add(cmbCalcDioTtCurr, "6, 2, fill, top");

		lblCalcDioTtSlew = new JLabel("Slew Rate");
		panelCalcDioTt.add(lblCalcDioTtSlew, "2, 4, center, center");

		txtCalcDioTtSlew = new JFormattedTextField(MainWindow.AMOUNTFORMAT);
		txtCalcDioTtSlew.setToolTipText("Peak reverse current");
		panelCalcDioTt.add(txtCalcDioTtSlew, "4, 4, fill, top");
		txtCalcDioTtSlew.setColumns(MainWindow.TEN);

		cmbCalcDioTtSlew = new JComboBox();
		cmbCalcDioTtSlew.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A_S, MainWindow.A_M_S,
				MainWindow.A_U_S, MainWindow.A_N_S, MainWindow.A_P_S }));
		panelCalcDioTt.add(cmbCalcDioTtSlew, "6, 4, fill, top");

		lblCalcDioTtIr = new JLabel("Maximum Reverse Current");
		panelCalcDioTt.add(lblCalcDioTtIr, "2, 6, right, center");

		txtCalcDioTtIr = new JFormattedTextField(MainWindow.AMOUNTFORMAT);
		txtCalcDioTtIr.setToolTipText("Peak reverse current");
		txtCalcDioTtIr.setColumns(MainWindow.TEN);
		panelCalcDioTt.add(txtCalcDioTtIr, "4, 6, fill, top");

		cmbCalcDioTtIr = new JComboBox();
		cmbCalcDioTtIr.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A, MainWindow.M_A,
				MainWindow.U_A, MainWindow.N_A, MainWindow.P_A }));
		panelCalcDioTt.add(cmbCalcDioTtIr, "6, 6, fill, top");

		lblCalcDioTtTrr = new JLabel("Reverse Recovery Time");
		panelCalcDioTt.add(lblCalcDioTtTrr, "2, 8, center, center");

		txtCalcDioTtTrr = new JFormattedTextField(MainWindow.AMOUNTFORMAT);
		txtCalcDioTtTrr.setToolTipText("Reverse recovery time");
		panelCalcDioTt.add(txtCalcDioTtTrr, "4, 8, fill, top");
		txtCalcDioTtTrr.setColumns(MainWindow.TEN);

		cmbCalcDioTtTrr = new JComboBox();
		cmbCalcDioTtTrr.setModel(new DefaultComboBoxModel(new String[] { MainWindow.S, MainWindow.M_S,
				MainWindow.U_S, MainWindow.N_S, MainWindow.P_S }));
		panelCalcDioTt.add(cmbCalcDioTtTrr, "6, 8, fill, top");

		final JButton btnCalcDioTt = new JButton(MainWindow.CALCULATE);
		btnCalcDioTt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				dioCalcTt();
			}
		});
		panelCalcDioTt.add(btnCalcDioTt, "4, 10, fill, top");

		lblCalcDioTtTt = new JLabel("TT");
		panelCalcDioTt.add(lblCalcDioTtTt, "2, 12, center, center");

		txtCalcDioTtTt = new JTextField();
		panelCalcDioTt.add(txtCalcDioTtTt, "4, 12, fill, top");
		txtCalcDioTtTt.setColumns(MainWindow.TEN);

		tabsCalcDioXti = new JTabbedPane(SwingConstants.TOP);
		tabsCalcDio.addTab(MainWindow.XTI, null, tabsCalcDioXti, null);

		panelCalcDioXtiReverse = new JPanel();
		tabsCalcDioXti.addTab("Reverse Current Method", null, panelCalcDioXtiReverse, null);
		panelCalcDioXtiReverse.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
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

		lblCalcDioXtiReverseHeader = new JLabel("Input values from Reverse current Vs. Temperature");
		panelCalcDioXtiReverse.add(lblCalcDioXtiReverseHeader, MainWindow._2_2_7_1);

		lblCalcDioXtiReverseIr0 = new JLabel("IR (Temp 1 C)");
		panelCalcDioXtiReverse.add(lblCalcDioXtiReverseIr0, MainWindow._4_6_RIGHT_DEFAULT);

		txtCalcDioXtiReverseIr0 = new JTextField();
		panelCalcDioXtiReverse.add(txtCalcDioXtiReverseIr0, MainWindow._6_6_FILL_DEFAULT);
		txtCalcDioXtiReverseIr0.setColumns(MainWindow.TEN);

		cmbCalcDioXtiReverseIr0 = new JComboBox();
		cmbCalcDioXtiReverseIr0.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A, MainWindow.M_A,
				MainWindow.U_A, MainWindow.N_A, MainWindow.P_A }));
		panelCalcDioXtiReverse.add(cmbCalcDioXtiReverseIr0, "8, 6, fill, default");

		lblCalcDioXtiReverseIr1 = new JLabel("IR (Temp 2 C)");
		panelCalcDioXtiReverse.add(lblCalcDioXtiReverseIr1, "4, 8, right, default");

		txtCalcDioXtiReverseIr1 = new JTextField();
		panelCalcDioXtiReverse.add(txtCalcDioXtiReverseIr1, "6, 8, fill, default");
		txtCalcDioXtiReverseIr1.setColumns(MainWindow.TEN);

		cmbCalcDioXtiReverseIr1 = new JComboBox();
		cmbCalcDioXtiReverseIr1.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A, MainWindow.M_A,
				MainWindow.U_A, MainWindow.N_A, MainWindow.P_A }));
		panelCalcDioXtiReverse.add(cmbCalcDioXtiReverseIr1, "8, 8, fill, default");

		lblCalcDioXtiReverseTemp1 = new JLabel("Temp 1");
		panelCalcDioXtiReverse.add(lblCalcDioXtiReverseTemp1, "4, 10, right, default");

		txtCalcDioXtiReverseTemp1 = new JTextField();
		txtCalcDioXtiReverseTemp1.setColumns(MainWindow.TEN);
		panelCalcDioXtiReverse.add(txtCalcDioXtiReverseTemp1, "6, 10, fill, default");

		lblCalcDioXtiReverseTempUnit = new JLabel("Celcius");
		panelCalcDioXtiReverse.add(lblCalcDioXtiReverseTempUnit, "8, 10");

		lblCalcDioXtiReverseTemp2 = new JLabel("Temp 2");
		panelCalcDioXtiReverse.add(lblCalcDioXtiReverseTemp2, "4, 12, right, default");

		txtCalcDioXtiReverseTemp2 = new JTextField();
		panelCalcDioXtiReverse.add(txtCalcDioXtiReverseTemp2, "6, 12, fill, default");
		txtCalcDioXtiReverseTemp2.setColumns(MainWindow.TEN);

		lblCalcDioXtiReverseTempUnit2 = new JLabel("Celcius");
		panelCalcDioXtiReverse.add(lblCalcDioXtiReverseTempUnit2, "8, 12");

		lblCalcDioXtiReverseN = new JLabel("N");
		panelCalcDioXtiReverse.add(lblCalcDioXtiReverseN, "4, 14, right, default");

		txtCalcDioXtiReverseN = new JTextField();
		panelCalcDioXtiReverse.add(txtCalcDioXtiReverseN, "6, 14, fill, default");
		txtCalcDioXtiReverseN.setColumns(MainWindow.TEN);

		lblCalcDioXtiReverseEg = new JLabel("EG");
		panelCalcDioXtiReverse.add(lblCalcDioXtiReverseEg, "4, 16, right, default");

		txtCalcDioXtiReverseEg = new JTextField();
		txtCalcDioXtiReverseEg.setEnabled(false);
		txtCalcDioXtiReverseEg.setEditable(false);
		txtCalcDioXtiReverseEg.setText(MainWindow.PLEASE_SELECT_A_TYPE);
		panelCalcDioXtiReverse.add(txtCalcDioXtiReverseEg, "6, 16, fill, default");
		txtCalcDioXtiReverseEg.setColumns(MainWindow.TEN);

		cmbCalcDioXtiReverseEg = new JComboBox();
		cmbCalcDioXtiReverseEg.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e)
			{
				dioReverseXtiEgChange();
			}
		});
		cmbCalcDioXtiReverseEg.setModel(new DefaultComboBoxModel(new String[] { MainWindow.TYPE_SELECTION,
				MainWindow.SILICON, MainWindow._4H_SI_C_SILICON_CARBIDE, MainWindow._6H_SI_C_SILICON_CARBIDE,
				MainWindow.GERMANIUM, MainWindow.GALLIUM_ARSENIDE, MainWindow.SELENIUM, MainWindow.SCHOTTKY_BARRIER,
				MainWindow.LED_GREEN, MainWindow.LED_YELLLOW_GREEN, MainWindow.LED_YELLOW, MainWindow.LED_ORANGE_RED,
				MainWindow.LED_RED, MainWindow.LED_INFRARED, MainWindow.LED_BLUE, MainWindow.LED_WHITE,
				MainWindow.CUSTOM, }));
		panelCalcDioXtiReverse.add(cmbCalcDioXtiReverseEg, "8, 16, fill, default");

		btnCalcDioXtiReverse = new JButton(MainWindow.CALCULATE);
		btnCalcDioXtiReverse.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				dioCalcXtiReverse();

			}
		});
		panelCalcDioXtiReverse.add(btnCalcDioXtiReverse, "6, 18");

		lblCalcDioXtiReverseXti = new JLabel(MainWindow.XTI);
		panelCalcDioXtiReverse.add(lblCalcDioXtiReverseXti, "4, 20, right, default");

		txtCalcDioXtiReverseXti = new JTextField();
		txtCalcDioXtiReverseXti.setColumns(MainWindow.TEN);
		panelCalcDioXtiReverse.add(txtCalcDioXtiReverseXti, "6, 20, fill, default");

		lblCalcDioXtiReverseImage = new JLabel("");
		lblCalcDioXtiReverseImage.setIcon(xtiChartImage);
		panelCalcDioXtiReverse.add(lblCalcDioXtiReverseImage, "2, 4, 1, 19");

		panelCalcDioXtiLarge = new JPanel();
		tabsCalcDioXti.addTab("Large Scale TCV", null, panelCalcDioXtiLarge, null);
		panelCalcDioXtiLarge.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
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

		lblCalcXtiLargeHeader = new JLabel("Input values from the Forward-bias Diode Voltage chart");
		panelCalcDioXtiLarge.add(lblCalcXtiLargeHeader, MainWindow._2_2_7_1);

		lblCalcXtiLargeImage = new JLabel("");
		lblCalcXtiLargeImage.setIcon(xtiChartImageLarge);
		panelCalcDioXtiLarge.add(lblCalcXtiLargeImage, "2, 6, 1, 19");

		lblCalcXtiLargeTemp1 = new JLabel("Temperature 1");
		panelCalcDioXtiLarge.add(lblCalcXtiLargeTemp1, "4, 6");

		txtCalcXtiLargeTemp1 = new JTextField();
		panelCalcDioXtiLarge.add(txtCalcXtiLargeTemp1, MainWindow._6_6_FILL_DEFAULT);
		txtCalcXtiLargeTemp1.setColumns(MainWindow.TEN);

		lblCalcXtiLargeTemp2 = new JLabel("Temperature 2");
		panelCalcDioXtiLarge.add(lblCalcXtiLargeTemp2, "4, 8");

		txtCalcXtiLargeTemp2 = new JTextField();
		panelCalcDioXtiLarge.add(txtCalcXtiLargeTemp2, "6, 8, fill, default");
		txtCalcXtiLargeTemp2.setColumns(MainWindow.TEN);

		lblCalcXtiLargeVolt1 = new JLabel("Voltage 1");
		panelCalcDioXtiLarge.add(lblCalcXtiLargeVolt1, "4, 10");

		txtCalcXtiLargeVolt1 = new JTextField();
		txtCalcXtiLargeVolt1.setColumns(MainWindow.TEN);
		panelCalcDioXtiLarge.add(txtCalcXtiLargeVolt1, "6, 10, fill, default");

		cmbCalcXtiLargeVolt1 = new JComboBox();
		cmbCalcXtiLargeVolt1.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V, MainWindow.M_V,
				MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		panelCalcDioXtiLarge.add(cmbCalcXtiLargeVolt1, "8, 10, fill, default");

		lblCalcXtiLargeVolt2 = new JLabel("Voltage 2");
		panelCalcDioXtiLarge.add(lblCalcXtiLargeVolt2, "4, 12");

		txtCalcXtiLargeVolt2 = new JTextField();
		txtCalcXtiLargeVolt2.setColumns(MainWindow.TEN);
		panelCalcDioXtiLarge.add(txtCalcXtiLargeVolt2, "6, 12, fill, default");

		cmbCalcXtiLargeVolt2 = new JComboBox();
		cmbCalcXtiLargeVolt2.setModel(new DefaultComboBoxModel(new String[] { MainWindow.V, MainWindow.M_V,
				MainWindow.U_V, MainWindow.N_V, MainWindow.P_V }));
		panelCalcDioXtiLarge.add(cmbCalcXtiLargeVolt2, "8, 12, fill, default");

		lblCalcXtiLargeCurr = new JLabel("Current");
		panelCalcDioXtiLarge.add(lblCalcXtiLargeCurr, "4, 14");

		txtCalcXtiLargeCurr = new JTextField();
		txtCalcXtiLargeCurr.setColumns(MainWindow.TEN);
		panelCalcDioXtiLarge.add(txtCalcXtiLargeCurr, "6, 14, fill, default");

		cmbCalcXtiLargeCurr = new JComboBox();
		cmbCalcXtiLargeCurr.setModel(new DefaultComboBoxModel(new String[] { MainWindow.A, MainWindow.M_A,
				MainWindow.U_A, MainWindow.N_A, MainWindow.P_A }));
		panelCalcDioXtiLarge.add(cmbCalcXtiLargeCurr, "8, 14, fill, default");

		lblCalcXtiLargeN = new JLabel("N");
		panelCalcDioXtiLarge.add(lblCalcXtiLargeN, "4, 16");

		txtCalcXtiLargeN = new JTextField();
		txtCalcXtiLargeN.setColumns(MainWindow.TEN);
		panelCalcDioXtiLarge.add(txtCalcXtiLargeN, "6, 16, fill, default");

		lblCalcXtiLargeEg = new JLabel("EG");
		panelCalcDioXtiLarge.add(lblCalcXtiLargeEg, "4, 18");

		txtCalcXtiLargeEG = new JTextField();
		txtCalcXtiLargeEG.setColumns(MainWindow.TEN);
		panelCalcDioXtiLarge.add(txtCalcXtiLargeEG, "6, 18, fill, default");

		cmbCalcXtiLargeEG = new JComboBox();
		cmbCalcXtiLargeEG.setModel(new DefaultComboBoxModel(new String[] { MainWindow.TYPE_SELECTION,
				MainWindow.SILICON, MainWindow._4H_SI_C_SILICON_CARBIDE, MainWindow._6H_SI_C_SILICON_CARBIDE,
				MainWindow.GERMANIUM, MainWindow.GALLIUM_ARSENIDE, MainWindow.SELENIUM, MainWindow.SCHOTTKY_BARRIER,
				MainWindow.LED_GREEN, MainWindow.LED_YELLLOW_GREEN, MainWindow.LED_YELLOW, MainWindow.LED_ORANGE_RED,
				MainWindow.LED_RED, MainWindow.LED_INFRARED, MainWindow.LED_BLUE, MainWindow.LED_WHITE,
				MainWindow.CUSTOM }));
		cmbCalcXtiLargeEG.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e)
			{
				dioXtiEgChange();
			}
		});
		panelCalcDioXtiLarge.add(cmbCalcXtiLargeEG, "8, 18, fill, default");

		btnCalcXtiLarge = new JButton(MainWindow.CALCULATE);
		btnCalcXtiLarge.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				dioCalculateXti();
			}
		});
		panelCalcDioXtiLarge.add(btnCalcXtiLarge, "6, 20");

		lblCalcXtiLargeXti = new JLabel(MainWindow.XTI);
		panelCalcDioXtiLarge.add(lblCalcXtiLargeXti, "4, 22");

		txtCalcXtiLargeXti = new JTextField();
		txtCalcXtiLargeXti.setColumns(MainWindow.TEN);
		panelCalcDioXtiLarge.add(txtCalcXtiLargeXti, "6, 22, fill, default");

		tabsCalcBipolar = new JTabbedPane(SwingConstants.TOP);
		panelCalculators.addTab(MainWindow.BIPOLAR, null, tabsCalcBipolar, null);

		tabsCalcJfet = new JTabbedPane(SwingConstants.TOP);
		panelCalculators.addTab(MainWindow.JFET, null, tabsCalcJfet, null);

		tabsCalcMosfet = new JTabbedPane(SwingConstants.TOP);
		panelCalculators.addTab(MainWindow.MOSFET, null, tabsCalcMosfet, null);

		panelConvert = new JPanel();
		tabsPrimary.addTab("Unit Conversions", null, panelConvert, null);
		panelConvert.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(154dlu;default):grow"), FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC, }, new RowSpec[] { FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, }));

		lblConvertBase = new JLabel("Base");
		panelConvert.add(lblConvertBase, "2, 4, right, default");

		txtConvertBase = new JTextField();
		txtConvertBase.setColumns(MainWindow.TEN);
		panelConvert.add(txtConvertBase, "4, 4, fill, default");

		btnConvertBase = new JButton(MainWindow.CONVERT);
		btnConvertBase.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				convertBase();
			}
		});
		panelConvert.add(btnConvertBase, "6, 4, center, bottom");

		lblConvertMilli = new JLabel("Milli");
		panelConvert.add(lblConvertMilli, "2, 6, right, default");

		txtConvertMilli = new JTextField();
		txtConvertMilli.setColumns(MainWindow.TEN);
		panelConvert.add(txtConvertMilli, "4, 6, fill, default");

		btnConvertMilli = new JButton(MainWindow.CONVERT);
		btnConvertMilli.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				convertMilli();
			}
		});
		panelConvert.add(btnConvertMilli, "6, 6");

		lblConvertMicro = new JLabel("Micro");
		panelConvert.add(lblConvertMicro, "2, 8, right, default");

		txtConvertMicro = new JTextField();
		txtConvertMicro.setColumns(MainWindow.TEN);
		panelConvert.add(txtConvertMicro, "4, 8, fill, default");

		btnConvertMicro = new JButton(MainWindow.CONVERT);
		btnConvertMicro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				convertMicro();
			}
		});
		panelConvert.add(btnConvertMicro, "6, 8");

		lblConvertNano = new JLabel("Nano");
		panelConvert.add(lblConvertNano, "2, 10, right, default");

		txtConvertNano = new JTextField();
		panelConvert.add(txtConvertNano, "4, 10, fill, default");
		txtConvertNano.setColumns(MainWindow.TEN);

		btnConvertNano = new JButton(MainWindow.CONVERT);
		btnConvertNano.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				convertNano();
			}
		});
		panelConvert.add(btnConvertNano, "6, 10");

		lblConvertPico = new JLabel("Pico");
		panelConvert.add(lblConvertPico, "2, 12, right, default");

		txtConvertPico = new JTextField();
		txtConvertPico.setColumns(MainWindow.TEN);
		panelConvert.add(txtConvertPico, "4, 12, fill, default");

		btnConvertPico = new JButton(MainWindow.CONVERT);
		btnConvertPico.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				convertPico();
			}
		});
		panelConvert.add(btnConvertPico, "6, 12");

		panelAbout = new JPanel();
		tabsPrimary.addTab("About", null, panelAbout, null);
		panelAbout.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
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

		txtAbout = new JTextPane();
		txtAbout
				.setText("Various formulas and images take from:\nhttp://www.youspice.com/ys/diodefromdatasheet.3sp?pageNum=1\nhttp://www-ee.uta.edu/online/jung/EE3444/pdfs/SPICEdiodeModel.pdf");
		panelAbout.add(txtAbout, "16, 18, fill, fill");

		jFreeChartPanelS = new ChartPanel((JFreeChart)null);

	}

	private void loadBjtLibrary()
	{
		loadLibrary(Paths.get(MainWindow.bjtLibPath));
	}

	private void loadDioLibrary()
	{
		loadLibrary(Paths.get(MainWindow.dioLibPath));
	}

	private void loadJfetLibrary()
	{
		loadLibrary(Paths.get(MainWindow.jfetLibPath));
	}

	private void loadLibrary(Path path)
	{
		filePath = path;
		// SwingUtilities.invokeLater(procFile);

		switch (process(filePath))
			{
				case 0:
					dioList = procFile.getDioList();
					createDioWorker();
					dioWorker.execute();
					txtDio.setText(filePath.toString());
					storePreference(MainWindow.DIODE, filePath.toString());
					break;
				case 1:
					bjtList = procFile.getBjtList();
					createBjtWorker();
					bjtWorker.execute();
					txtTrans.setText(filePath.toString());
					storePreference(MainWindow.BJT, filePath.toString());
					break;
				case 2:
					jfetList = procFile.getJfetList();
					createJfetWorker();
					jfetWorker.execute();
					txtJfet.setText(filePath.toString());
					storePreference(MainWindow.JFET_LOWERCASE, filePath.toString());
					break;
				case 3:
					mosList = procFile.getMosList();
					createMosWorker();
					mosWorker.execute();
					txtMosfet.setText(filePath.toString());
					storePreference(MainWindow.MOS, filePath.toString());
					break;
				default:
					break;

			}
	}

	private void loadMosLibrary()
	{
		loadLibrary(Paths.get(MainWindow.mosLibPath));
	}

	private String loadPreference(String prefName)
	{
		return prefs.get(prefName, MainWindow.NULL_STRING);
	}

	private void newDiode()
	{
		Diode newDiode = new Diode();
		newDiode.setLINE(dioList.get(dioAwtList.getItemCount()).getLINE() + 1);
		tblComponentEdit.setModel(newDiode.getTableModel());
	}

	private int process(Path path)
	{
		executor = Executors.newSingleThreadExecutor();
		procFile = new ProcessFile(path);
		executor.execute(procFile);
		executor.shutdown();
		while (!executor.isTerminated())
		{
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
				JOptionPane
						.showMessageDialog(frmMrStevesLtspice,
								MainWindow.AN_EXCEPTION_HAS_OCCURED + e.getLocalizedMessage(),
								MainWindow.ARGUMENT_EXCEPTION, 1);
			}
		}
		return ProcessFile.getLibType();
	}

	protected void saveComponent()
	{
		// TODO Auto-generated method stub
		
	}

	private void storePreference(String prefName, String perfValue)
	{
		prefs.put(prefName, perfValue);
	}
}
