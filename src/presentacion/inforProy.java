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
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;

public class inforProy extends JFrame {

	private JPanel contentPane;
	JLabel lblNombreProy;
	JLabel lblNombreResp;
	JLabel lblFechaProy;
	JTextPane txtDescrip;
	static JList listUsua;
	JList listTareas;
	JButton btnEliminarUsuario;
	JButton btnEliminarTarea;
	static DefaultListModel modelo = new DefaultListModel();
	DefaultListModel modeloTa = new DefaultListModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inforProy frame = new inforProy();
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
	public inforProy() {
		setTitle("ProGest");
		setIconImage(Toolkit.getDefaultToolkit().getImage(inforProy.class.getResource("/presentacion/logo.PNG")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 873, 775);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{57, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{59, 46, 71, 115, 71, 72, 52, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		if (pnlProyectos.seleccion =="AniMusic") {
			lblNombreProy = new JLabel("AniMusic");
		}else if(pnlProyectos.seleccion == "TFG") {
			lblNombreProy = new JLabel("TFG");
		}else if (pnlProyectos.seleccion =="Cena de Navidad") {
			lblNombreProy = new JLabel("Cena de Navidad");
			}else {
				lblNombreProy = new JLabel("Encuestas de Alicante");
			}
		
		lblNombreProy.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNombreProy.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 30));
		GridBagConstraints gbc_lblNombreProy = new GridBagConstraints();
		gbc_lblNombreProy.gridwidth=2;
		gbc_lblNombreProy.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreProy.gridx = 0;
		gbc_lblNombreProy.gridy = 0;
		panel.add(lblNombreProy, gbc_lblNombreProy);

		
		JLabel lblFechaDeCreacin = new JLabel(MessagesInforProyInter.getString("inforProy.lblFechaDeCreacin.text")); //$NON-NLS-1$
		lblFechaDeCreacin.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_lblFechaDeCreacin = new GridBagConstraints();
		gbc_lblFechaDeCreacin.anchor = GridBagConstraints.EAST;
		gbc_lblFechaDeCreacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaDeCreacin.gridx = 2;
		gbc_lblFechaDeCreacin.gridy = 0;
		panel.add(lblFechaDeCreacin, gbc_lblFechaDeCreacin);
		
		if (pnlProyectos.seleccion =="AniMusic") {
			lblFechaProy = new JLabel("22/05/2017");
		}else if(pnlProyectos.seleccion == "TFG") {
			lblFechaProy = new JLabel("06/12/2017");
		}else if (pnlProyectos.seleccion =="Cena de Navidad") {
			lblFechaProy = new JLabel("25/09/2007");
			}else {
				lblFechaProy = new JLabel("06/03/2017");
			}
		
		lblFechaProy.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_lblFechaProy = new GridBagConstraints();
		gbc_lblFechaProy.insets = new Insets(0, 0, 5, 0);
		gbc_lblFechaProy.gridx = 3;
		gbc_lblFechaProy.gridy = 0;
		panel.add(lblFechaProy, gbc_lblFechaProy);
		
		JLabel lblResponsable = new JLabel(MessagesInforProyInter.getString("inforProy.lblResponsable.text")); //$NON-NLS-1$
		lblResponsable.setFont(new Font("Century Gothic", Font.BOLD, 15));
		GridBagConstraints gbc_lblResponsable = new GridBagConstraints();
		gbc_lblResponsable.anchor = GridBagConstraints.EAST;
		gbc_lblResponsable.insets = new Insets(0, 0, 5, 5);
		gbc_lblResponsable.gridx = 0;
		gbc_lblResponsable.gridy = 1;
		panel.add(lblResponsable, gbc_lblResponsable);
		
		if (pnlProyectos.seleccion =="AniMusic") {
			lblNombreResp = new JLabel("Alejandro Velasco Rodriguez");
		}else if(pnlProyectos.seleccion == "TFG") {
			lblNombreResp = new JLabel("Mónica Romero Nájera");
		}else if (pnlProyectos.seleccion =="Cena de Navidad") {
			lblNombreResp = new JLabel("Ana Pérez Lucas");
			}else {
				lblNombreResp = new JLabel("Jorge Cabal Fernández");
			}
		
		lblNombreResp.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNombreResp = new GridBagConstraints();
		gbc_lblNombreResp.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreResp.gridx = 1;
		gbc_lblNombreResp.gridy = 1;
		panel.add(lblNombreResp, gbc_lblNombreResp);
		
		JLabel lblDescripcion = new JLabel(MessagesInforProyInter.getString("inforProy.lblDescripcion.text")); //$NON-NLS-1$
		lblDescripcion.setFont(new Font("Century Gothic", Font.BOLD, 15));
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.gridheight = 2;
		gbc_lblDescripcion.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 0;
		gbc_lblDescripcion.gridy = 2;
		panel.add(lblDescripcion, gbc_lblDescripcion);
		
		JScrollPane scrollDescrp = new JScrollPane();
		GridBagConstraints gbc_scrollDescrp = new GridBagConstraints();
		gbc_scrollDescrp.gridwidth = 2;
		gbc_scrollDescrp.gridheight = 2;
		gbc_scrollDescrp.insets = new Insets(0, 0, 5, 5);
		gbc_scrollDescrp.fill = GridBagConstraints.BOTH;
		gbc_scrollDescrp.gridx = 1;
		gbc_scrollDescrp.gridy = 2;
		panel.add(scrollDescrp, gbc_scrollDescrp);

		txtDescrip = new JTextPane();
		txtDescrip.setEditable(false);
		txtDescrip.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		if (pnlProyectos.seleccion =="AniMusic") {
			txtDescrip.setText("Proyecto de reproductor de música, en el cual se puede comprar la misma. \nUn porcentaje el dinero del recaudado va para protectoras de animales.");
		}else if(pnlProyectos.seleccion == "TFG") {
			txtDescrip.setText("Trabajo de Fin de Grado. \nEl TFG consiste en redes neuronales.");
		}else if (pnlProyectos.seleccion =="Cena de Navidad") {
			txtDescrip.setText("Organizacion de la cena de Navidad de la empresa.");
			}else {
				txtDescrip.setText("Recoger toda la información de las encuestas en un informe.");
			}
		
		scrollDescrp.setViewportView(txtDescrip);
		
		if (pnlProyectos.seleccion =="AniMusic") {
				
				listUsua = new JList();
				listUsua.addMouseListener(new ListUsuaMouseListener());
				modelo.addElement("Alejandro Velasco Rodriguez");
				modelo.addElement("Mónica Romero Nájera");
				modelo.addElement("Fernando Ruiz Ruiz");
				modelo.addElement("Jorge Mena Muñoz");
				listUsua.setModel(modelo);
			
		}else if(pnlProyectos.seleccion == "TFG") {
				listUsua = new JList();
				listUsua.addMouseListener(new ListUsuaMouseListener());
				modelo.addElement("Mónica Romero Nájera");
				modelo.addElement("Manolo García Pérez");
				modelo.addElement("Perico Palotes");
				listUsua.setModel(modelo);

		}else if (pnlProyectos.seleccion =="Cena de Navidad") {
				listUsua = new JList();
				listUsua.addMouseListener(new ListUsuaMouseListener());
				modelo.addElement("Ana Pérez Lucas");
				modelo.addElement("Belén Valverde Almazán");
				listUsua.setModel(modelo);

		}else {
				listUsua = new JList();
				listUsua.addMouseListener(new ListUsuaMouseListener());
				modelo.addElement("Jorge Cabal Fernández");
				modelo.addElement("Mónica Romero Nájera");
				modelo.addElement("Eliezer López Pérez");
				listUsua.setModel(modelo);

		}


		listUsua.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		
		if (pnlProyectos.seleccion =="AniMusic") {
			listTareas = new JList();
			listTareas.addMouseListener(new ListTareasMouseListener());
			modeloTa.addElement("Hacer la iteración 1");
			modeloTa.addElement("Diagramas iteración 2");
			listTareas.setModel(modeloTa);
			
		}else if(pnlProyectos.seleccion == "TFG") {
			listTareas = new JList();
			listTareas.addMouseListener(new ListTareasMouseListener());
			modeloTa.addElement("Entender el enunciado");
			modeloTa.addElement("Ir a tutorías");
			modeloTa.addElement("Realizar la primera parte");
			listTareas.setModel(modeloTa);
			
		}else if (pnlProyectos.seleccion =="Cena de Navidad") {
			listTareas = new JList();
			listTareas.addMouseListener(new ListTareasMouseListener());
			modeloTa.addElement("Llamar a los empleados");
			modeloTa.addElement("Buscar restaurante");
			modeloTa.addElement("Hacer una lista de alergias");
			listTareas.setModel(modeloTa);

		}else {
			listTareas = new JList();
			listTareas.addMouseListener(new ListTareasMouseListener());
			modeloTa.addElement("Pasar la información de la encuesta a PDF");
			modeloTa.addElement("Realizar el informe");
			listTareas.setModel(modeloTa);
		}

		listTareas.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		
		JButton btnModificar = new JButton(MessagesInforProyInter.getString("inforProy.btnModificar.text")); //$NON-NLS-1$
		btnModificar.addMouseListener(new BtnModificarMouseListener());
		btnModificar.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.insets = new Insets(0, 0, 5, 0);
		gbc_btnModificar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnModificar.gridx = 3;
		gbc_btnModificar.gridy = 2;
		panel.add(btnModificar, gbc_btnModificar);
		
		JLabel lblUsuarios = new JLabel(MessagesInforProyInter.getString("inforProy.lblUsuarios.text")); //$NON-NLS-1$
		lblUsuarios.setFont(new Font("Century Gothic", Font.BOLD, 15));
		GridBagConstraints gbc_lblUsuarios = new GridBagConstraints();
		gbc_lblUsuarios.gridheight = 2;
		gbc_lblUsuarios.anchor = GridBagConstraints.EAST;
		gbc_lblUsuarios.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuarios.gridx = 0;
		gbc_lblUsuarios.gridy = 4;
		panel.add(lblUsuarios, gbc_lblUsuarios);
		
		JScrollPane scrollUsu = new JScrollPane();
		GridBagConstraints gbc_scrollUsu = new GridBagConstraints();
		gbc_scrollUsu.gridwidth = 2;
		gbc_scrollUsu.gridheight = 2;
		gbc_scrollUsu.insets = new Insets(0, 0, 5, 5);
		gbc_scrollUsu.fill = GridBagConstraints.BOTH;
		gbc_scrollUsu.gridx = 1;
		gbc_scrollUsu.gridy = 4;
		panel.add(scrollUsu, gbc_scrollUsu);
		scrollUsu.setViewportView(listUsua);
		
		JButton btnAadirUsuario = new JButton(MessagesInforProyInter.getString("inforProy.btnAadirUsuario.text")); //$NON-NLS-1$
		btnAadirUsuario.addActionListener(new BtnAadirUsuarioActionListener());
		btnAadirUsuario.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_btnAadirUsuario = new GridBagConstraints();
		gbc_btnAadirUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAadirUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_btnAadirUsuario.gridx = 3;
		gbc_btnAadirUsuario.gridy = 4;
		panel.add(btnAadirUsuario, gbc_btnAadirUsuario);
		
		btnEliminarUsuario = new JButton(MessagesInforProyInter.getString("inforProy.btnEliminarUsuario.text")); //$NON-NLS-1$
		btnEliminarUsuario.addActionListener(new BtnEliminarUsuarioActionListener());
		btnEliminarUsuario.setEnabled(false);
		btnEliminarUsuario.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_btnEliminarUsuario = new GridBagConstraints();
		gbc_btnEliminarUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEliminarUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_btnEliminarUsuario.gridx = 3;
		gbc_btnEliminarUsuario.gridy = 5;
		panel.add(btnEliminarUsuario, gbc_btnEliminarUsuario);
		
		JLabel lblTareas = new JLabel(MessagesInforProyInter.getString("inforProy.lblTareas.text")); //$NON-NLS-1$
		lblTareas.setFont(new Font("Century Gothic", Font.BOLD, 15));
		GridBagConstraints gbc_lblTareas = new GridBagConstraints();
		gbc_lblTareas.gridheight = 2;
		gbc_lblTareas.anchor = GridBagConstraints.EAST;
		gbc_lblTareas.insets = new Insets(0, 0, 0, 5);
		gbc_lblTareas.gridx = 0;
		gbc_lblTareas.gridy = 6;
		panel.add(lblTareas, gbc_lblTareas);
		
		JScrollPane scrollTareas = new JScrollPane();
		GridBagConstraints gbc_scrollTareas = new GridBagConstraints();
		gbc_scrollTareas.gridwidth = 2;
		gbc_scrollTareas.gridheight = 2;
		gbc_scrollTareas.insets = new Insets(0, 0, 0, 5);
		gbc_scrollTareas.fill = GridBagConstraints.BOTH;
		gbc_scrollTareas.gridx = 1;
		gbc_scrollTareas.gridy = 6;
		panel.add(scrollTareas, gbc_scrollTareas);
		scrollTareas.setViewportView(listTareas);
		
		JButton btnAadirTarea = new JButton(MessagesInforProyInter.getString("inforProy.btnAadirTarea.text")); //$NON-NLS-1$
		btnAadirTarea.addActionListener(new BtnAadirTareaActionListener());
		btnAadirTarea.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_btnAadirTarea = new GridBagConstraints();
		gbc_btnAadirTarea.insets = new Insets(0, 0, 5, 0);
		gbc_btnAadirTarea.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAadirTarea.gridx = 3;
		gbc_btnAadirTarea.gridy = 6;
		panel.add(btnAadirTarea, gbc_btnAadirTarea);
		
		btnEliminarTarea = new JButton(MessagesInforProyInter.getString("inforProy.btnEliminarTarea.text")); //$NON-NLS-1$
		btnEliminarTarea.addActionListener(new BtnEliminarTareaActionListener());
		btnEliminarTarea.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		btnEliminarTarea.setEnabled(false);
		GridBagConstraints gbc_btnEliminarTarea = new GridBagConstraints();
		gbc_btnEliminarTarea.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEliminarTarea.gridx = 3;
		gbc_btnEliminarTarea.gridy = 7;
		panel.add(btnEliminarTarea, gbc_btnEliminarTarea);
	}

	private class BtnModificarMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			txtDescrip.setEditable(true);
		}
	}
	private class ListUsuaMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			btnEliminarUsuario.setEnabled(true);
			btnEliminarTarea.setEnabled(false);
			listTareas.clearSelection();
		}
		
	}
	private class ListTareasMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			btnEliminarTarea.setEnabled(true);
			btnEliminarUsuario.setEnabled(false);
			listUsua.clearSelection();
		}
		
	}
	private class BtnEliminarUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String usu = listUsua.getSelectedValue().toString();
			if(usu == "Alejandro Velasco Rodríguez") {
				int num = listUsua.getSelectedIndex();
				modelo.remove(num);
			}else if (usu == "Mónica Romero Nájera") {
				int num = listUsua.getSelectedIndex();
				modelo.remove(num);
			}else if(usu == "Fernando Ruiz Ruiz") {
				int num = listUsua.getSelectedIndex();
				modelo.remove(num);
			}else if(usu == "Jorge Mena Muñoz") {
				int num = listUsua.getSelectedIndex();
				modelo.remove(num);
			}else if (usu == "Manolo García Pérez") {
				int num = listUsua.getSelectedIndex();
				modelo.remove(num);
			}else if (usu == "Perico Palotes") {
				int num = listUsua.getSelectedIndex();
				modelo.remove(num);
			}else if (usu == "Ana Pérez Lucas") {
				int num = listUsua.getSelectedIndex();
				modelo.remove(num);
			}else if (usu == "Belén Valverde Almazán") {
				int num = listUsua.getSelectedIndex();
				modelo.remove(num);
			}else if (usu == "Jorge Cabal Fernández") {
				int num = listUsua.getSelectedIndex();
				modelo.remove(num);
			}else {
				int num = listUsua.getSelectedIndex();
				modelo.remove(num);
			}

		}
	}
	private class BtnEliminarTareaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String tar = listTareas.getSelectedValue().toString();
			if(tar == "Buscar restaurante") {
				int num = listTareas.getSelectedIndex();
				modeloTa.remove(num);
			}else if (tar == "Diagramas iteración 2") {
				int num = listTareas.getSelectedIndex();
				modeloTa.remove(num);
			}else if(tar == "Entender el enunciado") {
				int num = listTareas.getSelectedIndex();
				modeloTa.remove(num);
			}else if(tar == "Hacer la iteración 1") {
				int num = listTareas.getSelectedIndex();
				modeloTa.remove(num);
			}else if (tar == "Hacer una lista de alergias") {
				int num = listTareas.getSelectedIndex();
				modeloTa.remove(num);
			}else if (tar == "Ir a tutorías") {
				int num = listTareas.getSelectedIndex();
				modeloTa.remove(num);
			}else if (tar == "Llamar a los empleados") {
				int num = listTareas.getSelectedIndex();
				modeloTa.remove(num);
			}else if (tar == "Pasar la información de la encuesta a PDF") {
				int num = listTareas.getSelectedIndex();
				modeloTa.remove(num);
			}else if (tar == "Realizar el informe") {
				int num = listTareas.getSelectedIndex();
				modeloTa.remove(num);
			}else {
				int num = listTareas.getSelectedIndex();
				modeloTa.remove(num);
			}
		}
	}
	private class BtnAadirUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			NuevoUsuario ventanaN = new NuevoUsuario();
			ventanaN.setVisible(true);
		}
	}
	private class BtnAadirTareaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			NuevaTarea ventanaT = new NuevaTarea();
			ventanaT.setVisible(true);
		}
	}
}