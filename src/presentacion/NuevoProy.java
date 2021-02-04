package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import javax.swing.JTextPane;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class NuevoProy extends JFrame {
	private JFrame frmProgest;
	public JFrame getFrame() {
		return frmProgest;
	}
	private JPanel contentPane;
	private JTextField txtNombProy;
	private JList listUNProy;
	private JList listTNProy;
	DefaultListModel model = new DefaultListModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevoProy frame = new NuevoProy();
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
	public NuevoProy() {
		setTitle("ProGest");
		setIconImage(Toolkit.getDefaultToolkit().getImage(NuevoProy.class.getResource("/presentacion/logo.PNG")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 590, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), MessagesNuevoProyInter.getString("NuevoProy.panel.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.textHighlight)); //$NON-NLS-2$
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNombre = new JLabel(MessagesNuevoProyInter.getString("NuevoProy.lblNombre.text")); //$NON-NLS-1$
		lblNombre.setFont(new Font("Century Gothic", Font.BOLD, 15));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 0;
		panel.add(lblNombre, gbc_lblNombre);
		
		txtNombProy = new JTextField();
		txtNombProy.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_txtNombProy = new GridBagConstraints();
		gbc_txtNombProy.gridwidth = 3;
		gbc_txtNombProy.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombProy.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombProy.gridx = 1;
		gbc_txtNombProy.gridy = 0;
		panel.add(txtNombProy, gbc_txtNombProy);
		txtNombProy.setColumns(10);
		
		JLabel lblDescripcin = new JLabel(MessagesNuevoProyInter.getString("NuevoProy.lblDescripcin.text")); //$NON-NLS-1$
		lblDescripcin.setFont(new Font("Century Gothic", Font.BOLD, 15));
		GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
		gbc_lblDescripcin.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcin.gridx = 0;
		gbc_lblDescripcin.gridy = 1;
		panel.add(lblDescripcin, gbc_lblDescripcin);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		panel.add(scrollPane, gbc_scrollPane);
		
		JTextPane txtDescNProy = new JTextPane();
		txtDescNProy.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		scrollPane.setViewportView(txtDescNProy);
		
		JLabel lblTareas = new JLabel(MessagesNuevoProyInter.getString("NuevoProy.lblTareas.text")); //$NON-NLS-1$
		lblTareas.setFont(new Font("Century Gothic", Font.BOLD, 15));
		GridBagConstraints gbc_lblTareas = new GridBagConstraints();
		gbc_lblTareas.anchor = GridBagConstraints.EAST;
		gbc_lblTareas.insets = new Insets(0, 0, 5, 5);
		gbc_lblTareas.gridx = 0;
		gbc_lblTareas.gridy = 2;
		panel.add(lblTareas, gbc_lblTareas);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridwidth = 3;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 2;
		panel.add(scrollPane_1, gbc_scrollPane_1);
		
		listTNProy = new JList();


		listTNProy.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listTNProy.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		scrollPane_1.setViewportView(listTNProy);
		
		JLabel lblUsuarios = new JLabel(MessagesNuevoProyInter.getString("NuevoProy.lblUsuarios.text")); //$NON-NLS-1$
		lblUsuarios.setFont(new Font("Century Gothic", Font.BOLD, 15));
		GridBagConstraints gbc_lblUsuarios = new GridBagConstraints();
		gbc_lblUsuarios.anchor = GridBagConstraints.EAST;
		gbc_lblUsuarios.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuarios.gridx = 0;
		gbc_lblUsuarios.gridy = 3;
		panel.add(lblUsuarios, gbc_lblUsuarios);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.gridwidth = 3;
		gbc_scrollPane_2.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx = 1;
		gbc_scrollPane_2.gridy = 3;
		panel.add(scrollPane_2, gbc_scrollPane_2);
		
		listUNProy = new JList();

		listUNProy.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listUNProy.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		scrollPane_2.setViewportView(listUNProy);
		
		JButton btnCancelar = new JButton(MessagesNuevoProyInter.getString("NuevoProy.btnCancelar.text")); //$NON-NLS-1$
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		btnCancelar.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 2;
		gbc_btnCancelar.gridy = 4;
		panel.add(btnCancelar, gbc_btnCancelar);
		
		JButton btnAadir = new JButton(MessagesNuevoProyInter.getString("NuevoProy.btnAadir.text")); //$NON-NLS-1$
		btnAadir.addActionListener(new BtnAadirActionListener());
		btnAadir.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_btnAadir = new GridBagConstraints();
		gbc_btnAadir.gridx = 3;
		gbc_btnAadir.gridy = 4;
		panel.add(btnAadir, gbc_btnAadir);
	}

	private class BtnCancelarActionListener implements ActionListener {
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
