package presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.border.BevelBorder;
import javax.swing.text.html.HTML;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class pnlAyuda extends JPanel {

	/**
	 * Create the panel.
	 */
	public pnlAyuda() {
		setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{446, 0};
		gridBagLayout.rowHeights = new int[]{54, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblAyuda = new JLabel(MessagesPnlAyudaInter.getString("pnlAyuda.lblAyuda.text")); //$NON-NLS-1$
		lblAyuda.setFont(new Font("Century Gothic", Font.BOLD, 18));
		GridBagConstraints gbc_lblAyuda = new GridBagConstraints();
		gbc_lblAyuda.insets = new Insets(0, 0, 5, 0);
		gbc_lblAyuda.gridx = 0;
		gbc_lblAyuda.gridy = 0;
		add(lblAyuda, gbc_lblAyuda);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);
		
		JTextArea textArea = new JTextArea();
	
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textArea.setText("Manual de usuario \n\n"
				+ "Pantalla de inicio\n"
				+ "En la pantalla inicial hay que autenticarse, para ello los datos son:\n\n"
				+ "Usuario: Monica\n"
				+ "Contraseña: 1234\n\n"
				+ "En esta pantalla también se podrá elegir el idioma deseado, si no se selecciona nada, el idioma por defecto será el español, seleccionando la bandera inglesa, la aplicación aparecerá en inglés.\n\n"
				+ "Pantalla principal\n"
				+ "En esta pantalla aparecerá los datos del usuario autenticado, foto, nombre, e – mail y teléfono.\n"
				+ "Además, en el lado derecho habrá 5 botones. \n\n"
				+ "El primero “Pantalla principal”, seleccionando este, se volverá a la pantalla principal que se muestra al iniciar la sesión.\n\n"
				+ "El segundo “Proyectos”, nos llevará a una pantalla con un listado de proyectos.\n"
				+ "En dicha pantalla se podrá seleccionar un proyecto y eliminar el mismo.\n"
				+ "Dándole al botón añadir proyecto, se abrirá una nueva ventana en la cual se podrá insertar el nombre, la descripción, las tareas y los usuarios. Si se pulsa cancelar sale de dicha ventana y no guarda nada. Dándole a añadir se añade el nuevo proyecto.\n"
				+ "Abriendo uno de los proyectos de la lista, se podrá ver su información, además de poder modificarse, se podrá borrar tareas y usuarios, seleccionando los mismos y pulsando sobre eliminar tarea o eliminar usuario. También se pueden añadir nuevas tareas y usuarios. Pulsando sobre añadir usuario, saldrá una lista con los usuarios disponibles, pulsando sobre uno y dándole a añadir, se añadirá el mismo. Pulsando sobre añadir tarea, se abrirá una ventana en la que habrá que registrar los datos de la nueva tarea.\n\n"
				+ "El tercero “Tareas”, nos llevará a una pantalla con un listado de tareas.\n"
				+ "En dicha pantalla se podrá cambiar la visualización de las tareas, dándole a calendario, saldrá el mismo, pulsando sobre los días pondrá si hay tareas o no, en la visión por lista, se podrá agrupar por secciones o categorías.\n"
				+ "Abriendo una tarea, se verá su información. Se podrá cambiar el estado de la tarea, seleccionando el deseado:\n\n"
				+ "Pendiente: tarea que aun no se ha realizado y aun no ha llegado la fecha de fin.\n"
				+ "Finalizada: tarea realizada.\n"
				+ "Sin finalizar: tarea que aun no se ha realizado y se ha pasado la fecha de fin.\n\n"
				+ "Se podrán escribir comentarios sobre dicha tarea.\n"
				+ "Se podrán añadir imágenes, pulsando sobre el botón con la cámara, se abrirá una nueva ventana, en la que se podrá cargar una imagen, y hacer anotaciones en la misma.\n\n"
				+ "El cuarto “Usuarios”, nos llevará a una pantalla con un listado de usuarios.\n"
				+ "Abriendo uno de los usuarios se podrá ver su información, además se podrán mandar mensajes al mismo.\n\n"
				+ "El quinto “Ayuda”, donde aparecerá este manual de usuario.\n\n"
				+ "En todo momento se contará con la opción de salida, pulsando sobre la X de la pantalla.\n"
				+ "También estará la información del usuario identificado en la esquina inferior izquierda.");
		textArea.setLineWrap(true);
		scrollPane.setViewportView(textArea);

	}

}
