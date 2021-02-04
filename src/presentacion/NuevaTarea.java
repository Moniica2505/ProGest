package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevaTarea extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNombre;
	private JLabel lblFechaDeCreacin;
	private JLabel lblFechaDeFin;
	private JLabel lblProyectoAsociado;
	private JLabel lblEncargado;
	private JTextField txtNombre;
	private JDateChooser FechaCreacion;
	private JDateChooser FechaFin;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JButton btnNewButton;
	private JButton btnAadir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevaTarea frame = new NuevaTarea();
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
	public NuevaTarea() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NuevaTarea.class.getResource("/presentacion/logo.PNG")));
		setTitle("ProGest");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 798, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{46, 42, 43, 52, 37, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblNombre = new JLabel(MessagesNuevaTareaInter.getString("NuevaTarea.lblNombre.text")); //$NON-NLS-1$
		lblNombre.setFont(new Font("Century Gothic", Font.BOLD, 15));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 0;
		panel.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 2;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 1;
		gbc_txtNombre.gridy = 0;
		panel.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		lblFechaDeCreacin = new JLabel(MessagesNuevaTareaInter.getString("NuevaTarea.lblFechaDeCreacin.text")); //$NON-NLS-1$
		lblFechaDeCreacin.setFont(new Font("Century Gothic", Font.BOLD, 15));
		GridBagConstraints gbc_lblFechaDeCreacin = new GridBagConstraints();
		gbc_lblFechaDeCreacin.anchor = GridBagConstraints.EAST;
		gbc_lblFechaDeCreacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaDeCreacin.gridx = 0;
		gbc_lblFechaDeCreacin.gridy = 1;
		panel.add(lblFechaDeCreacin, gbc_lblFechaDeCreacin);
		
		FechaCreacion = new JDateChooser();
		FechaCreacion.setDateFormatString("dd/MMM/yyyy");
		GridBagConstraints gbc_FechaCreacion = new GridBagConstraints();
		gbc_FechaCreacion.gridwidth = 2;
		gbc_FechaCreacion.insets = new Insets(0, 0, 5, 5);
		gbc_FechaCreacion.fill = GridBagConstraints.BOTH;
		gbc_FechaCreacion.gridx = 1;
		gbc_FechaCreacion.gridy = 1;
		panel.add(FechaCreacion, gbc_FechaCreacion);
		
		lblFechaDeFin = new JLabel(MessagesNuevaTareaInter.getString("NuevaTarea.lblFechaDeFin.text")); //$NON-NLS-1$
		lblFechaDeFin.setFont(new Font("Century Gothic", Font.BOLD, 15));
		GridBagConstraints gbc_lblFechaDeFin = new GridBagConstraints();
		gbc_lblFechaDeFin.anchor = GridBagConstraints.EAST;
		gbc_lblFechaDeFin.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaDeFin.gridx = 0;
		gbc_lblFechaDeFin.gridy = 2;
		panel.add(lblFechaDeFin, gbc_lblFechaDeFin);
		
		FechaFin = new JDateChooser();
		FechaFin.setDateFormatString("dd/MMM/yyyy");
		GridBagConstraints gbc_FechaFin = new GridBagConstraints();
		gbc_FechaFin.gridwidth = 2;
		gbc_FechaFin.insets = new Insets(0, 0, 5, 5);
		gbc_FechaFin.fill = GridBagConstraints.BOTH;
		gbc_FechaFin.gridx = 1;
		gbc_FechaFin.gridy = 2;
		panel.add(FechaFin, gbc_FechaFin);
		
		lblProyectoAsociado = new JLabel(MessagesNuevaTareaInter.getString("NuevaTarea.lblProyectoAsociado.text")); //$NON-NLS-1$
		lblProyectoAsociado.setFont(new Font("Century Gothic", Font.BOLD, 15));
		GridBagConstraints gbc_lblProyectoAsociado = new GridBagConstraints();
		gbc_lblProyectoAsociado.anchor = GridBagConstraints.EAST;
		gbc_lblProyectoAsociado.insets = new Insets(0, 0, 5, 5);
		gbc_lblProyectoAsociado.gridx = 0;
		gbc_lblProyectoAsociado.gridy = 3;
		panel.add(lblProyectoAsociado, gbc_lblProyectoAsociado);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"AniMusic", "TFG", "Cena de Navidad", "Encuestas de Alicante"}));
		comboBox.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 3;
		panel.add(comboBox, gbc_comboBox);
		
		lblEncargado = new JLabel(MessagesNuevaTareaInter.getString("NuevaTarea.lblEncargado.text")); //$NON-NLS-1$
		lblEncargado.setFont(new Font("Century Gothic", Font.BOLD, 15));
		GridBagConstraints gbc_lblEncargado = new GridBagConstraints();
		gbc_lblEncargado.anchor = GridBagConstraints.EAST;
		gbc_lblEncargado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEncargado.gridx = 0;
		gbc_lblEncargado.gridy = 4;
		panel.add(lblEncargado, gbc_lblEncargado);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Alejandro Velasco Rodríguez", "Mónica Romero Nájera", "Fernando Ruiz Ruiz", "Jorge Mena Muñoz", "Manolo García Pérez", "Perico Palotes", "Ana Pérez Lucas", "Belén Valverde Almazán", "Jorge Cabal Fernández", "Eliezer López Pérez"}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.gridwidth = 2;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 4;
		panel.add(comboBox_1, gbc_comboBox_1);
		
		btnNewButton = new JButton(MessagesNuevaTareaInter.getString("NuevaTarea.btnNewButton.text")); //$NON-NLS-1$
		btnNewButton.addActionListener(new BtnNewButtonActionListener());
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 5;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		btnAadir = new JButton(MessagesNuevaTareaInter.getString("NuevaTarea.btnAadir.text")); //$NON-NLS-1$
		btnAadir.addActionListener(new BtnAadirActionListener());
		btnAadir.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_btnAadir = new GridBagConstraints();
		gbc_btnAadir.gridx = 2;
		gbc_btnAadir.gridy = 5;
		panel.add(btnAadir, gbc_btnAadir);
	}

	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
	private class BtnAadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
}
