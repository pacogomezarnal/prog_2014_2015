import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


// La ventana principal debe implementar el KeyEventDispatcher para manejar
// todos los disparadores de KEy
public class VentanaPrincipal extends JFrame implements KeyEventDispatcher{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;



	public VentanaPrincipal() {
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmPrincipal = new JMenuItem("Principal");
		menuBar.add(mntmPrincipal);
		//Caracteristicas del JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel ventanaCentral = new JPanel();
		contentPane.add(ventanaCentral, BorderLayout.CENTER);
		ventanaCentral.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Etiqueta");
		lblNewLabel.setBounds(10, 11, 83, 14);
		ventanaCentral.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 36, 117, 20);
		ventanaCentral.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Boton");
		btnNewButton.setBounds(10, 65, 89, 23);
		ventanaCentral.add(btnNewButton);
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, BorderLayout.SOUTH);
		textField_1.setColumns(10);
		
		//CApturamos todos los eventos de Teclado desde nuestro método
		//Los registramos en el KeyboardFocusManager
		KeyboardFocusManager manager =
		         KeyboardFocusManager.getCurrentKeyboardFocusManager();
		manager.addKeyEventDispatcher( this );
		
	}

	
	//PROGRAMAMOS LO QUE QUERAMOS HACER
	@Override
	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) 
		    System.out.println("Apretamos la tecla: "+e.getKeyChar());

		if (e.getID() == KeyEvent.KEY_RELEASED) {
			System.out.println("Soltamos la tecla");
		 } 
		//Al devolver false, permitimos que otro componente después de este método tenga un
		//KeyListener
        return false;
	}
}
