package presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.BorderLayout;


public class pnlPrincipal extends JPanel {
	LocalDate hoy = LocalDate.now();
	String fechaFormato = (String)hoy.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	
	/**
	 * Create the panel.
	 */
	public pnlPrincipal() {
		setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{207, 331, 0};
		gbl_panel.rowHeights = new int[]{114, 51, 62, 60, 82, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblFoto = new JLabel("");
		lblFoto.setIcon(new ImageIcon(pnlPrincipal.class.getResource("/presentacion/user (1).png")));
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.insets = new Insets(0, 0, 5, 0);
		gbc_lblFoto.gridx = 1;
		gbc_lblFoto.gridy = 0;
		panel.add(lblFoto, gbc_lblFoto);
		
		JLabel lblltimaConexin = new JLabel(MessagesPnlPrincipalInter.getString("pnlPrincipal.lblltimaConexin.text")); //$NON-NLS-1$
		lblltimaConexin.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_lblltimaConexin = new GridBagConstraints();
		gbc_lblltimaConexin.anchor = GridBagConstraints.EAST;
		gbc_lblltimaConexin.insets = new Insets(0, 0, 5, 5);
		gbc_lblltimaConexin.gridx = 0;
		gbc_lblltimaConexin.gridy = 1;
		panel.add(lblltimaConexin, gbc_lblltimaConexin);
		
		JLabel lblFecha = new JLabel(fechaFormato);
		lblFecha.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.insets = new Insets(0, 0, 5, 0);
		gbc_lblFecha.gridx = 1;
		gbc_lblFecha.gridy = 1;
		panel.add(lblFecha, gbc_lblFecha);
		
		JLabel lblMnicaRomeroNjera = new JLabel("Mónica Romero Nájera");
		lblMnicaRomeroNjera.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_lblMnicaRomeroNjera = new GridBagConstraints();
		gbc_lblMnicaRomeroNjera.insets = new Insets(0, 0, 5, 0);
		gbc_lblMnicaRomeroNjera.gridx = 1;
		gbc_lblMnicaRomeroNjera.gridy = 2;
		panel.add(lblMnicaRomeroNjera, gbc_lblMnicaRomeroNjera);
		
		JLabel lblMonicahotmailcom = new JLabel("monica250911@hotmail.com");
		lblMonicahotmailcom.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_lblMonicahotmailcom = new GridBagConstraints();
		gbc_lblMonicahotmailcom.insets = new Insets(0, 0, 5, 0);
		gbc_lblMonicahotmailcom.gridx = 1;
		gbc_lblMonicahotmailcom.gridy = 3;
		panel.add(lblMonicahotmailcom, gbc_lblMonicahotmailcom);
		
		JLabel label = new JLabel("626 732 527");
		label.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridx = 1;
		gbc_label.gridy = 4;
		panel.add(label, gbc_label);

	}

}
