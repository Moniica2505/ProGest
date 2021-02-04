package presentacion;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


public class pnlProyectos extends JPanel {

	JButton btnEliminarProyecto;
	JList listProyectos;
	static String seleccion;
	DefaultListModel modelo = new DefaultListModel();
	/**
	 * Create the panel.
	 */
	public pnlProyectos() {
		setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{408, 103, 0, 0};
		gridBagLayout.rowHeights = new int[]{60, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblProyectos = new JLabel(MessagesPnlProyectosInter.getString("pnlProyectos.lblProyectos.text")); //$NON-NLS-1$
		lblProyectos.setHorizontalAlignment(SwingConstants.CENTER);
		lblProyectos.setFont(new Font("Century Gothic", Font.BOLD, 20));
		GridBagConstraints gbc_lblProyectos = new GridBagConstraints();
		gbc_lblProyectos.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblProyectos.gridwidth = 3;
		gbc_lblProyectos.insets = new Insets(0, 0, 5, 5);
		gbc_lblProyectos.gridx = 0;
		gbc_lblProyectos.gridy = 0;
		add(lblProyectos, gbc_lblProyectos);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);
		
		listProyectos = new JList();
		listProyectos.addMouseListener(new ListProyectosMouseListener());
		listProyectos.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		modelo.addElement("AniMusic");
		modelo.addElement("TFG");
		modelo.addElement("Cena de Navidad");
		modelo.addElement("Encuestas de Alicante");
		listProyectos.setModel(modelo);
		scrollPane.setViewportView(listProyectos);
		
		btnEliminarProyecto = new JButton(MessagesPnlProyectosInter.getString("pnlProyectos.btnEliminarProyecto.text")); //$NON-NLS-1$
		btnEliminarProyecto.addActionListener(new BtnEliminarProyectoActionListener());
		btnEliminarProyecto.setEnabled(false);
		btnEliminarProyecto.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_btnEliminarProyecto = new GridBagConstraints();
		gbc_btnEliminarProyecto.insets = new Insets(0, 0, 0, 5);
		gbc_btnEliminarProyecto.gridx = 1;
		gbc_btnEliminarProyecto.gridy = 2;
		add(btnEliminarProyecto, gbc_btnEliminarProyecto);
		
		JButton btnAadirProyecto = new JButton(MessagesPnlProyectosInter.getString("pnlProyectos.btnAadirProyecto.text")); //$NON-NLS-1$
		btnAadirProyecto.addActionListener(new BtnAadirProyectoActionListener());
		btnAadirProyecto.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_btnAadirProyecto = new GridBagConstraints();
		gbc_btnAadirProyecto.fill = GridBagConstraints.BOTH;
		gbc_btnAadirProyecto.gridx = 2;
		gbc_btnAadirProyecto.gridy = 2;
		add(btnAadirProyecto, gbc_btnAadirProyecto);

	}

	private class ListProyectosMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			btnEliminarProyecto.setEnabled(true);
			seleccion = (String)listProyectos.getSelectedValue();
			if (e.getClickCount() == 2) {
					JFrame inforProy = new inforProy();
					inforProy.setVisible(true);
			}
		}
	}
	private class BtnAadirProyectoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			NuevoProy ventana= new NuevoProy();
			ventana.setVisible(true);
		}
	}
	private class BtnEliminarProyectoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) { 
			String proy = listProyectos.getSelectedValue().toString();	
			if (proy == "AniMusic") {
				int num = listProyectos.getSelectedIndex();
				modelo.remove(num);
			}else if (proy == "TFG") {
				int num = listProyectos.getSelectedIndex();
				modelo.remove(num);
			}else if (proy == "Cena de Navidad") {
				int num = listProyectos.getSelectedIndex();
				modelo.remove(num);
			}else {
				int num = listProyectos.getSelectedIndex();
				modelo.remove(num);
			}
		
		}
	}

}
