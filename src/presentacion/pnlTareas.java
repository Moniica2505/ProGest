package presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.AbstractButton;
import javax.swing.AbstractListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenu;
import javax.swing.ButtonGroup;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pnlTareas extends JPanel {
	static String seleccionT;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPanel pnlContenido;
	/**
	 * Create the panel.
	 */
	public pnlTareas() {
		setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{60, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblTareas = new JLabel(MessagesPnlTareasInter.getString("pnlTareas.lblTareas.text")); //$NON-NLS-1$
		lblTareas.setFont(new Font("Century Gothic", Font.BOLD, 20));
		GridBagConstraints gbc_lblTareas = new GridBagConstraints();
		gbc_lblTareas.gridwidth = 3;
		gbc_lblTareas.insets = new Insets(0, 0, 5, 0);
		gbc_lblTareas.gridx = 0;
		gbc_lblTareas.gridy = 0;
		add(lblTareas, gbc_lblTareas);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);
		
		pnlContenido = new JPanel();
		scrollPane.setViewportView(pnlContenido);
		pnlContenido.setLayout(new CardLayout(0, 0));
		
		pnlLista pnlLista = new pnlLista();
		pnlContenido.add(pnlLista, "Lista");
		
		pnlCalendario pnlCalendario = new pnlCalendario();
		pnlContenido.add(pnlCalendario, "Calendario");
		
		JButton btnLista = new JButton(MessagesPnlTareasInter.getString("pnlTareas.btnLista.text")); //$NON-NLS-1$
		btnLista.addActionListener(new BtnListaActionListener());
		btnLista.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_btnLista = new GridBagConstraints();
		gbc_btnLista.insets = new Insets(0, 0, 0, 5);
		gbc_btnLista.gridx = 0;
		gbc_btnLista.gridy = 2;
		add(btnLista, gbc_btnLista);
		
		JButton btnCalendario = new JButton(MessagesPnlTareasInter.getString("pnlTareas.btnCalendario.text")); //$NON-NLS-1$
		btnCalendario.addActionListener(new BtnCalendarioActionListener());
		btnCalendario.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_btnCalendario = new GridBagConstraints();
		gbc_btnCalendario.insets = new Insets(0, 0, 0, 5);
		gbc_btnCalendario.gridx = 1;
		gbc_btnCalendario.gridy = 2;
		add(btnCalendario, gbc_btnCalendario);

	}

	private class BtnListaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(pnlContenido.getLayout());
			cl.show(pnlContenido, "Lista");
		}
	}
	private class BtnCalendarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(pnlContenido.getLayout());
			cl.show(pnlContenido, "Calendario");
		}
	}
}
