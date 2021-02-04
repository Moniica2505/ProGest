package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Toolkit;
import java.awt.Rectangle;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Imagenes extends JFrame {
	
	private JFrame frmProgest;
	public JFrame getFrame() {
		return frmProgest;
	}
	private JToolBar tbBarraDibujo;
	private JButton btnAnotacion;
	private JScrollPane scrollPane;
	private MiAreaDibujo miAreaDibujo;
	private ImageIcon imagen;
	int modo = -1;
	private final int TEXTO = 1;
	private Toolkit toolkit;
	private Image imagTexto;
	private Cursor cursorTexto;
	private JTextField txtTexto =new JTextField();
	private JButton btnCargarFoto;
	private int x,y;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Imagenes window = new Imagenes();
					window.frmProgest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Imagenes() {
		initialize();
	}
	public void initialize() {
		
		frmProgest = new JFrame();
		frmProgest.setTitle("ProGest");
		frmProgest.setIconImage(Toolkit.getDefaultToolkit().getImage(Imagenes.class.getResource("/presentacion/logo.PNG")));
		frmProgest.setBounds(new Rectangle(0, 0, 700, 700));
		frmProgest.setBounds(100, 100, 450, 300);
		frmProgest.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		{
			tbBarraDibujo = new JToolBar();
			frmProgest.getContentPane().add(tbBarraDibujo, BorderLayout.NORTH);
			{
				btnAnotacion = new JButton("");
				btnAnotacion.addActionListener(new BtnAnotacionActionListener());
				{
					btnCargarFoto = new JButton("");
					btnCargarFoto.addActionListener(new BtnCargarFotoActionListener());
					btnCargarFoto.setIcon(new ImageIcon(Imagenes.class.getResource("/presentacion/photo-camera.png")));
					tbBarraDibujo.add(btnCargarFoto);
				}
				btnAnotacion.setIcon(new ImageIcon(Imagenes.class.getResource("/presentacion/aniadirAnotacion.png")));
				tbBarraDibujo.add(btnAnotacion);
			}
		}
		{
			scrollPane = new JScrollPane();
			frmProgest.getContentPane().add(scrollPane, BorderLayout.CENTER);
			miAreaDibujo = new MiAreaDibujo();
			miAreaDibujo.addMouseListener(new MiAreaDibujoMouseListener());
			miAreaDibujo.setIcon(null);
			scrollPane.setViewportView(miAreaDibujo);
		}
		toolkit = Toolkit.getDefaultToolkit();
		imagTexto = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/aniadirAnotacion.png"));
		cursorTexto = toolkit.createCustomCursor(imagTexto, new Point (0,0), "CURSOR_TEXTO");
	}
		
	private class BtnCargarFotoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser fcAbrir= new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(frmProgest);
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				imagen = new ImageIcon(file.getAbsolutePath());
				miAreaDibujo.setIcon(imagen);
			}
		}
	}
	private class BtnAnotacionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = TEXTO;
			frmProgest.setCursor(cursorTexto);
		}
	}
	private class MiAreaDibujoMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			x=e.getX();
			y=e.getY();
			if (imagen !=null) {
				switch (modo) {
				case TEXTO:
					txtTexto.setBounds(x, y, 200, 30);
					txtTexto.setVisible(true);
					txtTexto.requestFocus();
					txtTexto.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg) {
							if(!txtTexto.getText().equals(""))
								miAreaDibujo.addObjetoGrafico(new TextoGrafico(x,y+15,txtTexto.getText(),Color.BLUE));
							txtTexto.setText("");
							txtTexto.setVisible(false);
							miAreaDibujo.repaint();
						}
					});
					miAreaDibujo.add(txtTexto);
				}
			}
		}
	}

}
