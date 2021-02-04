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

import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextArea;

public class inforUsuarios extends JFrame {

	private JPanel contentPane;
	JLabel lblNomUsu;
	JLabel lblTele;
	JLabel lblEmail;
	JList listPro;
	JList listTar;
	DefaultListModel modeloUs = new DefaultListModel();
	DefaultListModel modeloTaU = new DefaultListModel();
	JScrollPane scrollPane;
	JScrollPane scrollPane_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inforUsuarios frame = new inforUsuarios();
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
	public inforUsuarios() {
		setTitle("ProGest");
		setIconImage(Toolkit.getDefaultToolkit().getImage(inforUsuarios.class.getResource("/presentacion/logo.PNG")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 714, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{111, 69, 0};
		gbl_panel.rowHeights = new int[]{63, 49, 74, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblFoto = new JLabel("");
		lblFoto.setIcon(new ImageIcon(inforUsuarios.class.getResource("/presentacion/user (1).png")));
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.gridheight = 3;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 0;
		gbc_lblFoto.gridy = 0;
		panel.add(lblFoto, gbc_lblFoto);
		
		if (pnlUsuarios.seleccionU =="Alejandro Velasco Rodríguez") {
			lblNomUsu = new JLabel("Alejandro Velasco Rodríguez");
		}else if(pnlUsuarios.seleccionU == "Mónica Romero Nájera") {
			lblNomUsu = new JLabel("Mónica Romero Nájera");
		}else if (pnlUsuarios.seleccionU =="Fernando Ruiz Ruiz") {
			lblNomUsu = new JLabel("Fernando Ruiz Ruiz");
		}else if (pnlUsuarios.seleccionU == "Jorge Mena Muñoz") {
			lblNomUsu = new JLabel("Jorge Mena Muñoz");
		}else if (pnlUsuarios.seleccionU == "Manolo García Pérez") {
			lblNomUsu = new JLabel("Manolo García Pérez");
		}else if (pnlUsuarios.seleccionU == "Perico Palotes") {
			lblNomUsu = new JLabel("Perico Palotes");
		}else if (pnlUsuarios.seleccionU == "Ana Pérez Lucas") {
			lblNomUsu = new JLabel("Ana Pérez Lucas");
		}else if (pnlUsuarios.seleccionU == "Belén Valverde Almazán") {
			lblNomUsu = new JLabel("Belén Valverde Almazán");
		}else if (pnlUsuarios.seleccionU == "Jorge Cabal Fernández") {
			lblNomUsu = new JLabel("Jorge Cabal Fernández");
		}else {
			lblNomUsu = new JLabel("Eliezer López Pérez");
		}
		
		lblNomUsu.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNomUsu = new GridBagConstraints();
		gbc_lblNomUsu.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomUsu.gridx = 1;
		gbc_lblNomUsu.gridy = 0;
		panel.add(lblNomUsu, gbc_lblNomUsu);
		
		if (pnlUsuarios.seleccionU =="Alejandro Velasco Rodríguez") {
			lblTele = new JLabel("678 987 645");
		}else if(pnlUsuarios.seleccionU == "Mónica Romero Nájera") {
			lblTele = new JLabel("626 732 527");
		}else if (pnlUsuarios.seleccionU =="Fernando Ruiz Ruiz") {
			lblTele = new JLabel("690 890 344");
		}else if (pnlUsuarios.seleccionU == "Jorge Mena Muñoz") {
			lblTele = new JLabel("612 321 423");
		}else if (pnlUsuarios.seleccionU == "Manolo García Pérez") {
			lblTele = new JLabel("690 412 445");
		}else if (pnlUsuarios.seleccionU == "Perico Palotes") {
			lblTele = new JLabel("621 756 765");
		}else if (pnlUsuarios.seleccionU == "Ana Pérez Lucas") {
			lblTele = new JLabel("634 513 865");
		}else if (pnlUsuarios.seleccionU == "Belén Valverde Almazán") {
			lblTele = new JLabel("675 764 324");
		}else if (pnlUsuarios.seleccionU == "Jorge Cabal Fernández") {
			lblTele = new JLabel("634 865 098");
		}else {
			lblTele = new JLabel("684 564 355");
		}
		
		lblTele.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		GridBagConstraints gbc_lblTele = new GridBagConstraints();
		gbc_lblTele.insets = new Insets(0, 0, 5, 5);
		gbc_lblTele.gridx = 1;
		gbc_lblTele.gridy = 2;
		panel.add(lblTele, gbc_lblTele);
		
		if (pnlUsuarios.seleccionU =="Alejandro Velasco Rodríguez") {
			lblEmail = new JLabel("alejandro@velasco.com");
		}else if(pnlUsuarios.seleccionU == "Mónica Romero Nájera") {
			lblEmail = new JLabel("monica250911@hotmail.com");
		}else if (pnlUsuarios.seleccionU =="Fernando Ruiz Ruiz") {
			lblEmail = new JLabel("fernando@ruiz.com");
		}else if (pnlUsuarios.seleccionU == "Jorge Mena Muñoz") {
			lblEmail = new JLabel("jorge@mena.com");
		}else if (pnlUsuarios.seleccionU == "Manolo García Pérez") {
			lblEmail = new JLabel("manolo@garcia.com");
		}else if (pnlUsuarios.seleccionU == "Perico Palotes") {
			lblEmail = new JLabel("perico@palotes.com");
		}else if (pnlUsuarios.seleccionU == "Ana Pérez Lucas") {
			lblEmail = new JLabel("ana@perez.com");
		}else if (pnlUsuarios.seleccionU == "Belén Valverde Almazán") {
			lblEmail = new JLabel("belen@almazan.com");
		}else if (pnlUsuarios.seleccionU == "Jorge Cabal Fernández") {
			lblEmail = new JLabel("jorge@cabal.com");
		}else {
			lblEmail = new JLabel("eliezer@lopez.com");
		}
		
		lblEmail.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 0);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 1;
		panel.add(lblEmail, gbc_lblEmail);
		
		JLabel lblProyectos = new JLabel(MessagesInforUsuariosInter.getString("inforUsuarios.lblProyectos.text")); //$NON-NLS-1$
		lblProyectos.setFont(new Font("Century Gothic", Font.BOLD, 15));
		GridBagConstraints gbc_lblProyectos = new GridBagConstraints();
		gbc_lblProyectos.anchor = GridBagConstraints.EAST;
		gbc_lblProyectos.insets = new Insets(0, 0, 5, 5);
		gbc_lblProyectos.gridx = 0;
		gbc_lblProyectos.gridy = 3;
		panel.add(lblProyectos, gbc_lblProyectos);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		panel.add(scrollPane, gbc_scrollPane);
				
		if (pnlUsuarios.seleccionU =="Alejandro Velasco Rodríguez") {
			listPro = new JList();
			scrollPane.setViewportView(listPro);
			listPro.setEnabled(false);
			listPro.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			modeloUs.addElement("AniMusic");
			listPro.setModel(modeloUs);
			

		}else if(pnlUsuarios.seleccionU == "Mónica Romero Nájera") {
			listPro = new JList();
			scrollPane.setViewportView(listPro);
			listPro.setEnabled(false);
			listPro.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			modeloUs.addElement("AniMusic");
			modeloUs.addElement("TFG");
			modeloUs.addElement("Encuestas de Alicante");
			listPro.setModel(modeloUs);

		}else if (pnlUsuarios.seleccionU =="Fernando Ruiz Ruiz") {
			listPro = new JList();
			scrollPane.setViewportView(listPro);
			listPro.setEnabled(false);
			listPro.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			modeloUs.addElement("AniMusic");
			listPro.setModel(modeloUs);
			
		}else if (pnlUsuarios.seleccionU == "Jorge Mena Muñoz") {
			listPro = new JList();
			scrollPane.setViewportView(listPro);
			listPro.setEnabled(false);
			listPro.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			modeloUs.addElement("AniMusic");
			listPro.setModel(modeloUs);
			
		}else if (pnlUsuarios.seleccionU == "Manolo García Pérez") {
			listPro = new JList();
			scrollPane.setViewportView(listPro);
			listPro.setEnabled(false);
			listPro.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			modeloUs.addElement("TFG");
			listPro.setModel(modeloUs);
			
		}else if (pnlUsuarios.seleccionU == "Perico Palotes") {
			listPro = new JList();
			scrollPane.setViewportView(listPro);
			listPro.setEnabled(false);
			listPro.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			modeloUs.addElement("TFG");
			listPro.setModel(modeloUs);
			
		}else if (pnlUsuarios.seleccionU == "Ana Pérez Lucas") {
			listPro = new JList();
			scrollPane.setViewportView(listPro);
			listPro.setEnabled(false);
			listPro.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			modeloUs.addElement("Cena de Navidad");
			listPro.setModel(modeloUs);
			
		}else if (pnlUsuarios.seleccionU == "Belén Valverde Almazán") {
			listPro = new JList();
			scrollPane.setViewportView(listPro);
			listPro.setEnabled(false);
			listPro.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			modeloUs.addElement("Cena de Navidad");
			listPro.setModel(modeloUs);
			
		}else if (pnlUsuarios.seleccionU == "Jorge Cabal Fernández") {
			listPro = new JList();
			scrollPane.setViewportView(listPro);
			listPro.setEnabled(false);
			listPro.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			modeloUs.addElement("Encuestas de Alicante");
			listPro.setModel(modeloUs);
			
		}else {
			listPro = new JList();
			scrollPane.setViewportView(listPro);
			listPro.setEnabled(false);
			listPro.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			modeloUs.addElement("Encuestas de Alicante");
			listPro.setModel(modeloUs);
		}
		
		JLabel lblTareas = new JLabel(MessagesInforUsuariosInter.getString("inforUsuarios.lblTareas.text")); //$NON-NLS-1$
		lblTareas.setFont(new Font("Century Gothic", Font.BOLD, 15));
		GridBagConstraints gbc_lblTareas = new GridBagConstraints();
		gbc_lblTareas.anchor = GridBagConstraints.EAST;
		gbc_lblTareas.insets = new Insets(0, 0, 5, 5);
		gbc_lblTareas.gridx = 0;
		gbc_lblTareas.gridy = 4;
		panel.add(lblTareas, gbc_lblTareas);
		
		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 4;
		panel.add(scrollPane_1, gbc_scrollPane_1);
		
		JLabel lblMensajes = new JLabel(MessagesInforUsuariosInter.getString("inforUsuarios.lblMensajes.text")); //$NON-NLS-1$
		lblMensajes.setFont(new Font("Century Gothic", Font.BOLD, 15));
		GridBagConstraints gbc_lblMensajes = new GridBagConstraints();
		gbc_lblMensajes.anchor = GridBagConstraints.EAST;
		gbc_lblMensajes.insets = new Insets(0, 0, 0, 5);
		gbc_lblMensajes.gridx = 0;
		gbc_lblMensajes.gridy = 5;
		panel.add(lblMensajes, gbc_lblMensajes);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx = 1;
		gbc_scrollPane_2.gridy = 5;
		panel.add(scrollPane_2, gbc_scrollPane_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textArea.setText("");
		scrollPane_2.setViewportView(textArea);
		
		if (pnlUsuarios.seleccionU =="Alejandro Velasco Rodríguez") {
			listTar = new JList();
			scrollPane_1.setViewportView(listTar);
			listTar.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			listTar.setEnabled(false);
			modeloTaU.addElement("");
			listTar.setModel(modeloTaU);

		}else if(pnlUsuarios.seleccionU == "Mónica Romero Nájera") {
			listTar = new JList();
			scrollPane_1.setViewportView(listTar);
			listTar.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			listTar.setEnabled(false);
			modeloTaU.addElement("Entender el enunciado");
			
		}else if (pnlUsuarios.seleccionU =="Fernando Ruiz Ruiz") {
			listTar = new JList();
			scrollPane_1.setViewportView(listTar);
			listTar.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			listTar.setEnabled(false);
			modeloTaU.addElement("Hacer la iteración 1");
			listTar.setModel(modeloTaU);
			
		}else if (pnlUsuarios.seleccionU == "Jorge Mena Muñoz") {
			listTar = new JList();
			scrollPane_1.setViewportView(listTar);
			listTar.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			listTar.setEnabled(false);
			modeloTaU.addElement("Diagramas de la iteración 2");
			listTar.setModel(modeloTaU);
			
		}else if (pnlUsuarios.seleccionU == "Manolo García Pérez") {
			listTar = new JList();
			scrollPane_1.setViewportView(listTar);
			listTar.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			listTar.setEnabled(false);
			modeloTaU.addElement("Ir a tutorías");
			listTar.setModel(modeloTaU);
			
		}else if (pnlUsuarios.seleccionU == "Perico Palotes") {
			listTar = new JList();
			scrollPane_1.setViewportView(listTar);
			listTar.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			listTar.setEnabled(false);
			modeloTaU.addElement("Realizar la primera parte");
			listTar.setModel(modeloTaU);
			
		}else if (pnlUsuarios.seleccionU == "Ana Pérez Lucas") {
			listTar = new JList();
			scrollPane_1.setViewportView(listTar);
			listTar.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			listTar.setEnabled(false);
			modeloTaU.addElement("Buscar resturante");
			listTar.setModel(modeloTaU);
			
		}else if (pnlUsuarios.seleccionU == "Belén Valverde Almazán") {
			listTar = new JList();
			scrollPane_1.setViewportView(listTar);
			listTar.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			listTar.setEnabled(false);
			modeloTaU.addElement("Llamar a empleados");
			modeloTaU.addElement("Hacer una lista de alergias");
			listTar.setModel(modeloTaU);

		}else if (pnlUsuarios.seleccionU == "Jorge Cabal Fernández") {
			listTar = new JList();
			scrollPane_1.setViewportView(listTar);
			listTar.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			listTar.setEnabled(false);
			modeloTaU.addElement("Pasar la información de la encuesta a PDF");
			listTar.setModel(modeloTaU);

		}else {
			listTar = new JList();
			scrollPane_1.setViewportView(listTar);
			listTar.setFont(new Font("Century Gothic", Font.PLAIN, 18));
			listTar.setEnabled(false);
			modeloTaU.addElement("Realizar el informe");
			listTar.setModel(modeloTaU);
		}
	
	}

}
