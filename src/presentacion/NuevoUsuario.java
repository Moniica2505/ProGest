package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;

public class NuevoUsuario extends JFrame {
	private JFrame frame;
	public JFrame getFrame() {
		return frame;
	}
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JList list;
	DefaultListModel modeloNU = new DefaultListModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevoUsuario frame = new NuevoUsuario();
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
	public NuevoUsuario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NuevoUsuario.class.getResource("/presentacion/logo.PNG")));
		setTitle("ProGest");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 417, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addMouseListener(new ListMouseListener());
		list.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		scrollPane.setViewportView(list);
		modeloNU.addElement("Alejandro Velasco Rodríguez");
		modeloNU.addElement("Mónica Romero Nájera");
		modeloNU.addElement("Fernando Ruiz Ruiz");
		modeloNU.addElement("Jorge Mena Muñoz");
		modeloNU.addElement("Manolo García Pérez");
		modeloNU.addElement("Perico Palotes");
		modeloNU.addElement("Ana Pérez Lucas");
		modeloNU.addElement("Belén Valverde Almazán");
		modeloNU.addElement("Jorge Cabal Fernández");
		modeloNU.addElement("Eliezer López Pérez");
		list.setModel(modeloNU);
	}

	private class ListMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount()==2) {
				Object usuario = list.getSelectedValue();
				inforProy.modelo.addElement(usuario);
				dispose();
			}
		}
	}
}
