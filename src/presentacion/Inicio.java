package presentacion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;


import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUsuario;
	private Border bordeRojo = BorderFactory.createLineBorder(Color.RED);
	private Border bordeVerde = BorderFactory.createLineBorder(Color.GREEN);
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField passwordField;
	private JButton btnEntrar;
	private String pass;
	private JRadioButton español;
	private JRadioButton ingles;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Inicio dialog = new Inicio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Inicio() {
		setResizable(false);
		setFont(new Font("Century Gothic", Font.PLAIN, 12));
		setTitle("ProGest");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Inicio.class.getResource("/presentacion/logo.PNG")));
		setBounds(100, 100, 529, 417);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 39, 0};
			gbl_panel.rowHeights = new int[]{48, 0, 0, 30, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				español = new JRadioButton("");
				buttonGroup.add(español);
				español.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/banderaEsp.gif")));
				GridBagConstraints gbc_español = new GridBagConstraints();
				gbc_español.insets = new Insets(0, 0, 5, 5);
				gbc_español.gridx = 4;
				gbc_español.gridy = 0;
				panel.add(español, gbc_español);
			}
			{
				ingles = new JRadioButton("");
				ingles.addActionListener(new InglesActionListener());
				buttonGroup.add(ingles);
				ingles.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/banderaIng.gif")));
				GridBagConstraints gbc_ingles = new GridBagConstraints();
				gbc_ingles.insets = new Insets(0, 0, 5, 0);
				gbc_ingles.gridx = 5;
				gbc_ingles.gridy = 0;
				panel.add(ingles, gbc_ingles);
			}
			{
				JLabel lblLogo = new JLabel("");
				lblLogo.setIcon(new ImageIcon(Inicio.class.getResource("/presentacion/logo.PNG")));
				GridBagConstraints gbc_lblLogo = new GridBagConstraints();
				gbc_lblLogo.insets = new Insets(0, 0, 5, 5);
				gbc_lblLogo.gridx = 1;
				gbc_lblLogo.gridy = 1;
				panel.add(lblLogo, gbc_lblLogo);
			}
			{
				JLabel lblProgest = new JLabel("ProGest");
				lblProgest.setFont(new Font("Century Gothic", Font.BOLD, 30));
				GridBagConstraints gbc_lblProgest = new GridBagConstraints();
				gbc_lblProgest.insets = new Insets(0, 0, 5, 5);
				gbc_lblProgest.gridx = 1;
				gbc_lblProgest.gridy = 2;
				panel.add(lblProgest, gbc_lblProgest);
			}
			{
				JLabel lblUsuario = new JLabel(MessagesInicioInter.getString("Inicio.lblUsuario.text")); //$NON-NLS-1$
				lblUsuario.setFont(new Font("Century Gothic", Font.PLAIN, 15));
				GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
				gbc_lblUsuario.anchor = GridBagConstraints.EAST;
				gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
				gbc_lblUsuario.gridx = 0;
				gbc_lblUsuario.gridy = 4;
				panel.add(lblUsuario, gbc_lblUsuario);
			}
			{
				txtUsuario = new JTextField();
				txtUsuario.setFont(new Font("Century Gothic", Font.PLAIN, 15));
				txtUsuario.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent e) {
						txtUsuario.setBackground(new Color(250,250,210));
					}
					@Override
					public void focusLost(FocusEvent e) {
						txtUsuario.setBackground(new Color(250,250,250));
					}
				});
				txtUsuario.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(KeyEvent e) {
						if (txtUsuario.getText().equals("Monica")) {
							txtUsuario.setBorder(bordeVerde);
						}else {
							txtUsuario.setBorder(bordeRojo);
						}
					}
				});
				GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
				gbc_txtUsuario.insets = new Insets(0, 0, 5, 5);
				gbc_txtUsuario.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtUsuario.gridx = 1;
				gbc_txtUsuario.gridy = 4;
				panel.add(txtUsuario, gbc_txtUsuario);
				txtUsuario.setColumns(10);
			}
			{
				btnEntrar = new JButton(MessagesInicioInter.getString("Inicio.btnEntrar.text")); //$NON-NLS-1$ //$NON-NLS-1$
				btnEntrar.setEnabled(false);
				btnEntrar.addActionListener(new BtnEntrarActionListener());
				btnEntrar.setFont(new Font("Century Gothic", Font.PLAIN, 18));
				GridBagConstraints gbc_btnEntrar = new GridBagConstraints();
				gbc_btnEntrar.fill = GridBagConstraints.BOTH;
				gbc_btnEntrar.gridheight = 2;
				gbc_btnEntrar.gridwidth = 4;
				gbc_btnEntrar.gridx = 2;
				gbc_btnEntrar.gridy = 4;
				panel.add(btnEntrar, gbc_btnEntrar);
			}
			{
				JLabel lblContrasea = new JLabel(MessagesInicioInter.getString("Inicio.lblContrasea.text")); //$NON-NLS-1$
				lblContrasea.setFont(new Font("Century Gothic", Font.PLAIN, 15));
				GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
				gbc_lblContrasea.anchor = GridBagConstraints.EAST;
				gbc_lblContrasea.insets = new Insets(0, 0, 0, 5);
				gbc_lblContrasea.gridx = 0;
				gbc_lblContrasea.gridy = 5;
				panel.add(lblContrasea, gbc_lblContrasea);
			}
			{
				passwordField = new JPasswordField();
				passwordField.addKeyListener(new KeyAdapter() {

					@Override
					public void keyReleased(KeyEvent e) {
					    pass = new String(passwordField.getPassword());
						if (pass.equals("1234")) {
							passwordField.setBorder(bordeVerde);
							if(txtUsuario.getText().equals("Monica")) btnEntrar.setEnabled(true);
						}else {
							passwordField.setBorder(bordeRojo);
						}
					}
				});

				passwordField.setFont(new Font("Century Gothic", Font.PLAIN, 15));
				passwordField.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent e) {
						passwordField.setBackground(new Color(250,250,210));
					}
					@Override
					public void focusLost(FocusEvent e) {
						passwordField.setBackground(new Color(250,250,250));
					}

				});
				GridBagConstraints gbc_passwordField = new GridBagConstraints();
				gbc_passwordField.insets = new Insets(0, 0, 0, 5);
				gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
				gbc_passwordField.gridx = 1;
				gbc_passwordField.gridy = 5;
				panel.add(passwordField, gbc_passwordField);
			}
			

		}
	}
	private class InglesActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(ingles.isSelected()) 
				MessagesInicioInter.setIdioma("inglés");				
		}
	}
	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			if(ingles.isSelected()) {
				MessagesPrincipalInter.setIdioma("inglés");
				MessagesPnlPrincipalInter.setIdioma("inglés");
				MessagesPnlProyectosInter.setIdioma("inglés");
				MessagesInforProyInter.setIdioma("inglés");
				MessagesNuevoProyInter.setIdioma("inglés");
				MessagesPnlTareasInter.setIdioma("inglés");
				MessagesPnlUsuariosInter.setIdioma("inglés");
				MessagesPnlAyudaInter.setIdioma("inglés");
				MessagesInforTareasInter.setIdioma("inglés");
				MessagesInforUsuariosInter.setIdioma("inglés");
				MessagesNuevaTareaInter.setIdioma("inglés");
			}

				Principal ventana = new Principal();
				ventana.getFrame().setVisible(true);;
				dispose();
		}
	}
}
