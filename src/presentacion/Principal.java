package presentacion;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import javax.swing.JSplitPane;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Principal {

	private JFrame frmProgest;
	public JFrame getFrame() {
		return frmProgest;
	}
	public Container pnlContenido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmProgest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProgest = new JFrame();
		frmProgest.addWindowListener(new FrmProgestWindowListener());
		frmProgest.addWindowListener(new FrmProgestWindowListener());
		frmProgest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProgest.setTitle(MessagesPrincipalInter.getString("Principal.0")); //$NON-NLS-1$
		frmProgest.setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource(MessagesPrincipalInter.getString("Principal.1")))); //$NON-NLS-1$
		frmProgest.setBounds(100, 100, 970, 757);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setEnabled(false);
		frmProgest.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		splitPane.setLeftComponent(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{141, 0};
		gbl_panel.rowHeights = new int[]{0, 116, 116, 116, 116, 60, 52, 44, 48, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnPrincipal = new JButton(MessagesPrincipalInter.getString("Principal.btnPrincipal.text")); //$NON-NLS-1$
		btnPrincipal.setFont(new Font(MessagesPrincipalInter.getString("Principal.2"), Font.PLAIN, 15)); //$NON-NLS-1$
		btnPrincipal.setIcon(new ImageIcon(Principal.class.getResource(MessagesPrincipalInter.getString("Principal.3")))); //$NON-NLS-1$
		btnPrincipal.addActionListener(new BtnPanelActionListener());
		GridBagConstraints gbc_btnPrincipal = new GridBagConstraints();
		gbc_btnPrincipal.fill = GridBagConstraints.BOTH;
		gbc_btnPrincipal.insets = new Insets(0, 0, 5, 0);
		gbc_btnPrincipal.gridx = 0;
		gbc_btnPrincipal.gridy = 0;
		panel.add(btnPrincipal, gbc_btnPrincipal);
		
		JButton btnProyectos = new JButton(MessagesPrincipalInter.getString("Principal.btnProyectos.text")); //$NON-NLS-1$
		btnProyectos.setIcon(new ImageIcon(Principal.class.getResource(MessagesPrincipalInter.getString("Principal.4")))); //$NON-NLS-1$
		btnProyectos.addActionListener(new BtnPanelActionListener());
		btnProyectos.setFont(new Font(MessagesPrincipalInter.getString("Principal.5"), Font.PLAIN, 18)); //$NON-NLS-1$
		GridBagConstraints gbc_btnProyectos = new GridBagConstraints();
		gbc_btnProyectos.fill = GridBagConstraints.BOTH;
		gbc_btnProyectos.insets = new Insets(0, 0, 5, 0);
		gbc_btnProyectos.gridx = 0;
		gbc_btnProyectos.gridy = 1;
		panel.add(btnProyectos, gbc_btnProyectos);
		
		JButton btnTareas = new JButton(MessagesPrincipalInter.getString("Principal.btnTareas.text")); //$NON-NLS-1$
		btnTareas.setIcon(new ImageIcon(Principal.class.getResource(MessagesPrincipalInter.getString("Principal.6")))); //$NON-NLS-1$
		btnTareas.addActionListener(new BtnPanelActionListener());
		btnTareas.setFont(new Font(MessagesPrincipalInter.getString("Principal.7"), Font.PLAIN, 18)); //$NON-NLS-1$
		GridBagConstraints gbc_btnTareas = new GridBagConstraints();
		gbc_btnTareas.fill = GridBagConstraints.BOTH;
		gbc_btnTareas.insets = new Insets(0, 0, 5, 0);
		gbc_btnTareas.gridx = 0;
		gbc_btnTareas.gridy = 2;
		panel.add(btnTareas, gbc_btnTareas);
		
		JButton btnUsuarios = new JButton(MessagesPrincipalInter.getString("Principal.btnUsuarios.text")); //$NON-NLS-1$
		btnUsuarios.setIcon(new ImageIcon(Principal.class.getResource(MessagesPrincipalInter.getString("Principal.8")))); //$NON-NLS-1$
		btnUsuarios.addActionListener(new BtnPanelActionListener());
		btnUsuarios.setFont(new Font(MessagesPrincipalInter.getString("Principal.9"), Font.PLAIN, 18)); //$NON-NLS-1$
		GridBagConstraints gbc_btnUsuarios = new GridBagConstraints();
		gbc_btnUsuarios.fill = GridBagConstraints.BOTH;
		gbc_btnUsuarios.insets = new Insets(0, 0, 5, 0);
		gbc_btnUsuarios.gridx = 0;
		gbc_btnUsuarios.gridy = 3;
		panel.add(btnUsuarios, gbc_btnUsuarios);
		
		JButton btnAyuda = new JButton(MessagesPrincipalInter.getString("Principal.btnAyuda.text")); //$NON-NLS-1$
		btnAyuda.setIcon(new ImageIcon(Principal.class.getResource(MessagesPrincipalInter.getString("Principal.10")))); //$NON-NLS-1$
		btnAyuda.addActionListener(new BtnPanelActionListener());
		btnAyuda.setFont(new Font(MessagesPrincipalInter.getString("Principal.11"), Font.PLAIN, 18)); //$NON-NLS-1$
		GridBagConstraints gbc_btnAyuda = new GridBagConstraints();
		gbc_btnAyuda.insets = new Insets(0, 0, 5, 0);
		gbc_btnAyuda.fill = GridBagConstraints.BOTH;
		gbc_btnAyuda.gridx = 0;
		gbc_btnAyuda.gridy = 4;
		panel.add(btnAyuda, gbc_btnAyuda);
		
		JLabel lblFoto = new JLabel(MessagesPrincipalInter.getString("Principal.12")); //$NON-NLS-1$
		lblFoto.setIcon(new ImageIcon(Principal.class.getResource(MessagesPrincipalInter.getString("Principal.13")))); //$NON-NLS-1$
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.insets = new Insets(0, 0, 5, 0);
		gbc_lblFoto.gridx = 0;
		gbc_lblFoto.gridy = 5;
		panel.add(lblFoto, gbc_lblFoto);
		
		JLabel lblMnicaRomeroNjera = new JLabel(MessagesPrincipalInter.getString("Principal.14")); //$NON-NLS-1$
		lblMnicaRomeroNjera.setFont(new Font(MessagesPrincipalInter.getString("Principal.15"), Font.PLAIN, 13)); //$NON-NLS-1$
		GridBagConstraints gbc_lblMnicaRomeroNjera = new GridBagConstraints();
		gbc_lblMnicaRomeroNjera.insets = new Insets(0, 0, 5, 0);
		gbc_lblMnicaRomeroNjera.gridx = 0;
		gbc_lblMnicaRomeroNjera.gridy = 6;
		panel.add(lblMnicaRomeroNjera, gbc_lblMnicaRomeroNjera);
		
		JLabel lblMonicahotmailcom = new JLabel(MessagesPrincipalInter.getString("Principal.16")); //$NON-NLS-1$
		lblMonicahotmailcom.setFont(new Font(MessagesPrincipalInter.getString("Principal.17"), Font.PLAIN, 13)); //$NON-NLS-1$
		GridBagConstraints gbc_lblMonicahotmailcom = new GridBagConstraints();
		gbc_lblMonicahotmailcom.insets = new Insets(0, 0, 5, 0);
		gbc_lblMonicahotmailcom.gridx = 0;
		gbc_lblMonicahotmailcom.gridy = 7;
		panel.add(lblMonicahotmailcom, gbc_lblMonicahotmailcom);
		
		JLabel lblNewLabel = new JLabel(MessagesPrincipalInter.getString("Principal.18")); //$NON-NLS-1$
		lblNewLabel.setFont(new Font(MessagesPrincipalInter.getString("Principal.19"), Font.PLAIN, 13)); //$NON-NLS-1$
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 8;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		pnlContenido = new JPanel();
		splitPane.setRightComponent(pnlContenido);
		pnlContenido.setLayout(new CardLayout(0, 0));
		
		pnlPrincipal pnlPrincipal = new pnlPrincipal();
		pnlContenido.add(pnlPrincipal, MessagesPrincipalInter.getString(MessagesPrincipalInter.getString("Principal.20"))); //$NON-NLS-1$
		
		pnlProyectos pnlProyectos = new pnlProyectos();
		pnlContenido.add(pnlProyectos, MessagesPrincipalInter.getString(MessagesPrincipalInter.getString("Principal.21"))); //$NON-NLS-1$
		
		pnlTareas pnlTareas = new pnlTareas();
		pnlContenido.add(pnlTareas, MessagesPrincipalInter.getString(MessagesPrincipalInter.getString("Principal.22"))); //$NON-NLS-1$
		
		pnlUsuarios pnlUsuarios = new pnlUsuarios();
		pnlContenido.add(pnlUsuarios, MessagesPrincipalInter.getString(MessagesPrincipalInter.getString("Principal.23"))); //$NON-NLS-1$
		
		pnlAyuda pnlAyuda = new pnlAyuda();
		pnlContenido.add(pnlAyuda, MessagesPrincipalInter.getString(MessagesPrincipalInter.getString("Principal.24"))); //$NON-NLS-1$
	}

	private class BtnPanelActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(pnlContenido.getLayout());
			cl.show(pnlContenido, e.getActionCommand());
			
		}
	}
	private class FrmProgestWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			JOptionPane.showMessageDialog(frmProgest,MessagesPrincipalInter.getString("Principal.MensajeOptionPane"), MessagesPrincipalInter.getString("Principal.TituloOptionPaneCerrar"), JOptionPane.PLAIN_MESSAGE); //$NON-NLS-1$ //$NON-NLS-2$
			System.exit(0);
		}
	}

}
