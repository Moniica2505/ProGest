package presentacion;

import javax.swing.JPanel;
import com.toedter.calendar.JCalendar;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JSplitPane;


public class pnlCalendario extends JPanel {
	private JSplitPane splitPane;
	private JPanel panel;
	private JCalendar calendar;
	private JScrollPane scrollPane;
	private JList list;

	/**
	 * Create the panel.
	 */
	public pnlCalendario() {
		setLayout(new BorderLayout(0, 0));
		
		splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		add(splitPane, BorderLayout.CENTER);
		
		panel = new JPanel();
		splitPane.setLeftComponent(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		calendar = new JCalendar();
		calendar.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		panel.add(calendar, BorderLayout.NORTH);
		
		scrollPane = new JScrollPane();
		splitPane.setRightComponent(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
	}

}
