package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.util.Calendar;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class inforTareas extends JFrame {

	private JPanel contentPane;
	JPanel panel;
	JLabel lblTitulo;
	JLabel lblFechaIni;
	JLabel lblProyAso;
	JLabel lblEncTa;
	JLabel lblFechaFin;
	JLabel lblFechaDeFin;
	JComboBox comboBox;
	Calendar c = Calendar.getInstance();
	int dia = (c.get(Calendar.DATE));
	int mes = (c.get(Calendar.MONTH));
	int ano = (c.get(Calendar.YEAR));
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inforTareas frame = new inforTareas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public inforTareas() {
		setTitle("ProGest");
		setIconImage(Toolkit.getDefaultToolkit().getImage(inforTareas.class.getResource("/presentacion/logo.PNG")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 771, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{42, 53, 0, 46, 0};
		gbl_panel.rowHeights = new int[]{80, 0, 0, 0, 102, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		
		if (pnlLista.seleccionT =="Buscar restaurante") {
			lblTitulo = new JLabel("Buscar restaurante");
		}else if(pnlLista.seleccionT == "Diagramas iteración 2") {
			lblTitulo = new JLabel("Diagramas iteración 2");
		}else if (pnlLista.seleccionT =="Entender el enunciado") {
			lblTitulo = new JLabel("Entender el enunciado");
		}else if (pnlLista.seleccionT == "Hacer la iteración 1") {
			lblTitulo = new JLabel("Hacer la iteración 1");
		}else if (pnlLista.seleccionT == "Hacer una lista de alergias") {
			lblTitulo = new JLabel("Hacer una lista de alergias");
		}else if (pnlLista.seleccionT == "Ir a tutorías") { 
			lblTitulo = new JLabel("Ir a tutorías"); 
		}else if (pnlLista.seleccionT == "Llamar a los empleados") {
			lblTitulo = new JLabel("Llamar a los empleados");
		}else if (pnlLista.seleccionT == "Pasar la información de la encuesta a PDF") {
			lblTitulo = new JLabel("Pasar la información de la encuesta a PDF");
		}else if (pnlLista.seleccionT == "Realizar el informe") {
			lblTitulo = new JLabel("Realizar el informe");
		}else {
			lblTitulo = new JLabel("Realizar la primera parte");
		}
		
		lblTitulo.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 30));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.gridheight = 2;
		gbc_lblTitulo.gridwidth = 2;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 0;
		gbc_lblTitulo.gridy = 0;
		panel.add(lblTitulo, gbc_lblTitulo);
		
		JLabel lblFechaDeCreacin = new JLabel(MessagesInforTareasInter.getString("inforTareas.lblFechaDeCreacin.text")); //$NON-NLS-1$
		lblFechaDeCreacin.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_lblFechaDeCreacin = new GridBagConstraints();
		gbc_lblFechaDeCreacin.anchor = GridBagConstraints.EAST;
		gbc_lblFechaDeCreacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaDeCreacin.gridx = 2;
		gbc_lblFechaDeCreacin.gridy = 0;
		panel.add(lblFechaDeCreacin, gbc_lblFechaDeCreacin);
		
		if (pnlLista.seleccionT =="Buscar restaurante") {
			lblFechaIni = new JLabel("25/09/2017");
		}else if(pnlLista.seleccionT == "Diagramas iteración 2") {
			lblFechaIni = new JLabel("22/05/2017");
		}else if (pnlLista.seleccionT =="Entender el enunciado") {
			lblFechaIni = new JLabel("06/12/2017");
		}else if (pnlLista.seleccionT == "Hacer la iteración 1") {
			lblFechaIni = new JLabel("22/05/2017");
		}else if (pnlLista.seleccionT == "Hacer una lista de alergias") {
			lblFechaIni = new JLabel("25/09/2017");
		}else if (pnlLista.seleccionT == "Ir a tutorías") {
			lblFechaIni = new JLabel("06/12/2017");
		}else if (pnlLista.seleccionT == "Llamar a los empleados") {
			lblFechaIni = new JLabel("25/09/2017");
		}else if (pnlLista.seleccionT == "Pasar la información de la encuesta a PDF") {
			lblFechaIni = new JLabel("06/03/2017");
		}else if (pnlLista.seleccionT == "Realizar el informe") {
			lblFechaIni = new JLabel("06/03/2017");
		}else {
			lblFechaIni = new JLabel("06/12/2017");
		}
				
		lblFechaIni.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_lblFechaIni = new GridBagConstraints();
		gbc_lblFechaIni.insets = new Insets(0, 0, 5, 0);
		gbc_lblFechaIni.gridx = 3;
		gbc_lblFechaIni.gridy = 0;
		panel.add(lblFechaIni, gbc_lblFechaIni);
		
		lblFechaDeFin = new JLabel(MessagesInforTareasInter.getString("inforTareas.lblFechaDeFin.text")); //$NON-NLS-1$
		lblFechaDeFin.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_lblFechaDeFin = new GridBagConstraints();
		gbc_lblFechaDeFin.anchor = GridBagConstraints.EAST;
		gbc_lblFechaDeFin.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaDeFin.gridx = 2;
		gbc_lblFechaDeFin.gridy = 1;
		panel.add(lblFechaDeFin, gbc_lblFechaDeFin);
		
		if (pnlLista.seleccionT =="Buscar restaurante") {
			lblFechaFin = new JLabel("10/01/2018");
		}else if(pnlLista.seleccionT == "Diagramas iteración 2") {
			lblFechaFin = new JLabel("25/12/2017");
		}else if (pnlLista.seleccionT =="Entender el enunciado") {
			lblFechaFin = new JLabel("01/01/2018");
		}else if (pnlLista.seleccionT == "Hacer la iteración 1") {
			lblFechaFin = new JLabel("20/12/2017");
		}else if (pnlLista.seleccionT == "Hacer una lista de alergias") {
			lblFechaFin = new JLabel("09/01/2018");
		}else if (pnlLista.seleccionT == "Ir a tutorías") {
			lblFechaFin = new JLabel("10/06/2018");
		}else if (pnlLista.seleccionT == "Llamar a los empleados") {
			lblFechaFin = new JLabel("07/01/2018");
		}else if (pnlLista.seleccionT == "Pasar la información de la encuesta a PDF") {
			lblFechaFin = new JLabel("10/09/2017");
		}else if (pnlLista.seleccionT =="Realizar el informe") {
			lblFechaFin = new JLabel("10/11/2017");
		}else {
			lblFechaFin = new JLabel("01/01/2018");
		}
		
		GridBagConstraints gbc_lblFechaFin = new GridBagConstraints();
		gbc_lblFechaFin.insets = new Insets(0, 0, 5, 0);
		gbc_lblFechaFin.gridx = 3;
		gbc_lblFechaFin.gridy = 1;
		panel.add(lblFechaFin, gbc_lblFechaFin);
		
		JLabel lblProyectoAsociado = new JLabel(MessagesInforTareasInter.getString("inforTareas.lblProyectoAsociado.text")); //$NON-NLS-1$
		lblProyectoAsociado.setFont(new Font("Century Gothic", Font.BOLD, 15));
		GridBagConstraints gbc_lblProyectoAsociado = new GridBagConstraints();
		gbc_lblProyectoAsociado.anchor = GridBagConstraints.EAST;
		gbc_lblProyectoAsociado.insets = new Insets(0, 0, 5, 5);
		gbc_lblProyectoAsociado.gridx = 0;
		gbc_lblProyectoAsociado.gridy = 2;
		panel.add(lblProyectoAsociado, gbc_lblProyectoAsociado);
		
		if (pnlLista.seleccionT =="Buscar restaurante") {
			lblProyAso = new JLabel("Cena de Navidad");
		}else if(pnlLista.seleccionT == "Diagramas iteración 2") {
			lblProyAso = new JLabel("AniMusic");
		}else if (pnlLista.seleccionT =="Entender el enunciado") {
			lblProyAso = new JLabel("TFG");
		}else if (pnlLista.seleccionT == "Hacer la iteración 1") {
			lblProyAso = new JLabel("AniMusic");
		}else if (pnlLista.seleccionT == "Hacer una lista de alergias") {
			lblProyAso = new JLabel("Cena de Navidad");
		}else if (pnlLista.seleccionT == "Ir a tutorías") {
			lblProyAso = new JLabel("TFG");
		}else if (pnlLista.seleccionT == "Llamar a los empleados") {
			lblProyAso = new JLabel("Cena de Navidad");
		}else if (pnlLista.seleccionT == "Pasar la información de la encuesta a PDF") {
			lblProyAso = new JLabel("Encuestas de Alicante");
		}else if (pnlLista.seleccionT == "Realizar el informe") {
			lblProyAso = new JLabel("Encuestas de Alicante");
		}else {
			lblProyAso = new JLabel("TFG");
		}
		
		lblProyAso.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		GridBagConstraints gbc_lblProyAso = new GridBagConstraints();
		gbc_lblProyAso.insets = new Insets(0, 0, 5, 5);
		gbc_lblProyAso.gridx = 1;
		gbc_lblProyAso.gridy = 2;
		panel.add(lblProyAso, gbc_lblProyAso);
		
		JLabel lblEstado = new JLabel(MessagesInforTareasInter.getString("inforTareas.lblEstado.text")); //$NON-NLS-1$
		lblEstado.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.anchor = GridBagConstraints.EAST;
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.gridx = 2;
		gbc_lblEstado.gridy = 2;
		panel.add(lblEstado, gbc_lblEstado);
		
		comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.text);
		comboBox.addItemListener(new ComboBoxItemListener());
		comboBox.addItem(MessagesInforTareasInter.getString("inforTareas.comboBoxPendiente")); //$NON-NLS-1$
		comboBox.addItem(MessagesInforTareasInter.getString("inforTareas.comboBoxFinalizada")); //$NON-NLS-1$
		comboBox.addItem(MessagesInforTareasInter.getString("inforTareas.comboBoxSinFinalizar")); //$NON-NLS-1$
		comboBox.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 2;
		panel.add(comboBox, gbc_comboBox);
		
		
		JLabel lblEncargado = new JLabel(MessagesInforTareasInter.getString("inforTareas.lblEncargado.text")); //$NON-NLS-1$
		lblEncargado.setFont(new Font("Century Gothic", Font.BOLD, 15));
		GridBagConstraints gbc_lblEncargado = new GridBagConstraints();
		gbc_lblEncargado.anchor = GridBagConstraints.EAST;
		gbc_lblEncargado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEncargado.gridx = 0;
		gbc_lblEncargado.gridy = 3;
		panel.add(lblEncargado, gbc_lblEncargado);
		
		if (pnlLista.seleccionT =="Buscar restaurante") {
			lblEncTa = new JLabel("Ana Pérez Lucas");
		}else if(pnlLista.seleccionT == "Diagramas iteración 2") {
			lblEncTa = new JLabel("Fernando Ruiz Ruiz");
		}else if (pnlLista.seleccionT =="Entender el enunciado") {
			lblEncTa = new JLabel("Mónica Romero Nájera");
		}else if (pnlLista.seleccionT == "Hacer la iteración 1") {
			lblEncTa = new JLabel("Jorge Mena Muñoz");
		}else if (pnlLista.seleccionT == "Hacer una lista de alergias") {
			lblEncTa = new JLabel("Belén Valverde Almazán");
		}else if (pnlLista.seleccionT == "Ir a tutorías") {
			lblEncTa = new JLabel("Mónica Romero Nájera");
		}else if (pnlLista.seleccionT == "Llamar a los empleados") {
			lblEncTa = new JLabel("Belén Valverde Almazán");
		}else if (pnlLista.seleccionT == "Pasar la información de la encuesta a PDF") {
			lblEncTa = new JLabel("Jorge Cabal Fernández");
		}else if (pnlLista.seleccionT == "Realizar el informe") {
			lblEncTa = new JLabel("Eliezer López Pérez");
		}else {
			lblEncTa = new JLabel("Mónica Romero Nájera");
		}
		
		lblEncTa.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		GridBagConstraints gbc_lblEncTa = new GridBagConstraints();
		gbc_lblEncTa.insets = new Insets(0, 0, 5, 5);
		gbc_lblEncTa.gridx = 1;
		gbc_lblEncTa.gridy = 3;
		panel.add(lblEncTa, gbc_lblEncTa);
		
		JLabel lblComentarios = new JLabel(MessagesInforTareasInter.getString("inforTareas.lblComentarios.text")); //$NON-NLS-1$
		lblComentarios.setFont(new Font("Century Gothic", Font.BOLD, 15));
		GridBagConstraints gbc_lblComentarios = new GridBagConstraints();
		gbc_lblComentarios.anchor = GridBagConstraints.EAST;
		gbc_lblComentarios.insets = new Insets(0, 0, 5, 5);
		gbc_lblComentarios.gridx = 0;
		gbc_lblComentarios.gridy = 4;
		panel.add(lblComentarios, gbc_lblComentarios);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 4;
		panel.add(scrollPane, gbc_scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lblImgenes = new JLabel(MessagesInforTareasInter.getString("inforTareas.lblImgenes.text")); //$NON-NLS-1$
		lblImgenes.setFont(new Font("Century Gothic", Font.BOLD, 15));
		GridBagConstraints gbc_lblImgenes = new GridBagConstraints();
		gbc_lblImgenes.anchor = GridBagConstraints.EAST;
		gbc_lblImgenes.insets = new Insets(0, 0, 0, 5);
		gbc_lblImgenes.gridx = 0;
		gbc_lblImgenes.gridy = 5;
		panel.add(lblImgenes, gbc_lblImgenes);
		
		JButton btnImagenes = new JButton();
		btnImagenes.addActionListener(new BtnImagenesActionListener());
		btnImagenes.setIcon(new ImageIcon(inforTareas.class.getResource("/presentacion/photo-camera (1).png"))); //$NON-NLS-1$
		btnImagenes.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_btnImagenes = new GridBagConstraints();
		gbc_btnImagenes.insets = new Insets(0, 0, 0, 5);
		gbc_btnImagenes.gridx = 1;
		gbc_btnImagenes.gridy = 5;
		panel.add(btnImagenes, gbc_btnImagenes);
	}

	private class ComboBoxItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getItem()==MessagesInforTareasInter.getString("inforTareas.comboBoxFinalizada")) { //$NON-NLS-1$
				panel.setBackground(new Color(240,255,240));
				lblFechaFin.setFont(new Font("Century Gothic", Font.PLAIN, 15));
			}else if (e.getItem() == MessagesInforTareasInter.getString("inforTareas.comboBoxSinFinalizar")) { //$NON-NLS-1$
				panel.setBackground(new Color(255,153,153));
				lblFechaFin.setFont(new Font("Century Gothic", Font.BOLD, 15));
			}else {
				panel.setBackground(new Color(240,240,240));
				lblFechaFin.setFont(new Font("Century Gothic" , Font.PLAIN, 15));
			}
		}
	}
	private class BtnImagenesActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Imagenes ventana= new Imagenes();
			ventana.getFrame().setVisible(true);
		}
	}
}
