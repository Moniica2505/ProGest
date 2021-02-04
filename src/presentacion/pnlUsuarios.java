package presentacion;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;

public class pnlUsuarios extends JPanel {

	JList listUsuarios;
	static String seleccionU;
	DefaultListModel modeloU = new DefaultListModel();
	/**
	 * Create the panel.
	 */
	public pnlUsuarios() {
		setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{60, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblUsuarios = new JLabel(MessagesPnlUsuariosInter.getString("pnlUsuarios.lblUsuarios.text")); //$NON-NLS-1$
		lblUsuarios.setFont(new Font("Century Gothic", Font.BOLD, 20));
		GridBagConstraints gbc_lblUsuarios = new GridBagConstraints();
		gbc_lblUsuarios.gridwidth = 2;
		gbc_lblUsuarios.insets = new Insets(0, 0, 5, 0);
		gbc_lblUsuarios.gridx = 0;
		gbc_lblUsuarios.gridy = 0;
		add(lblUsuarios, gbc_lblUsuarios);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);
		
		listUsuarios = new JList();
		listUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listUsuarios.setValueIsAdjusting(true);
		listUsuarios.addMouseListener(new ListUsuariosMouseListener());
		listUsuarios.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		modeloU.addElement("Alejandro Velasco Rodríguez");
		modeloU.addElement("Mónica Romero Nájera");
		modeloU.addElement("Fernando Ruiz Ruiz");
		modeloU.addElement("Jorge Mena Muñoz");
		modeloU.addElement("Manolo García Pérez");
		modeloU.addElement("Perico Palotes");
		modeloU.addElement("Ana Pérez Lucas");
		modeloU.addElement("Belén Valverde Almazán");
		modeloU.addElement("Jorge Cabal Fernández");
		modeloU.addElement("Eliezer López Pérez");
		listUsuarios.setModel(modeloU);
		scrollPane.setViewportView(listUsuarios);

	}

	private class ListUsuariosMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			seleccionU = (String)listUsuarios.getSelectedValue();
			if (e.getClickCount() == 2) {
					JFrame inforUsuarios = new inforUsuarios();
					inforUsuarios.setVisible(true);
			}
		}
	}
}
