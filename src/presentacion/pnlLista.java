package presentacion;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;

public class pnlLista extends JPanel {

	private JList listTareas;
	public static String seleccionT;
	static JList list;
	private JScrollPane scrollPane;
	static DefaultListModel modeloT = new DefaultListModel();

	/**
	 * Create the panel.
	 */
	public pnlLista() {
		setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		list = new JList();
		list.addMouseListener(new ListMouseListener());
		
		modeloT.addElement("Buscar restaurante");
		modeloT.addElement("Diagramas iteración 2");
		modeloT.addElement("Entender el enunciado");
		modeloT.addElement("Hacer la iteración 1");
		modeloT.addElement("Hacer una lista de alergias");
		modeloT.addElement("Ir a tutorías");
		modeloT.addElement("Llamar a los empleados");
		modeloT.addElement("Pasar la información de la encuesta a PDF");
		modeloT.addElement("Realizar el informe");
		modeloT.addElement("Realizar la primera parte");
		list.setModel(modeloT);
		list.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		scrollPane.setViewportView(list);

	}
	private class ListMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			seleccionT = (String)list.getSelectedValue();
			if (e.getClickCount() == 2) {
					JFrame inforTareas = new inforTareas();
					inforTareas.setVisible(true);
			}
		}
	}

}
