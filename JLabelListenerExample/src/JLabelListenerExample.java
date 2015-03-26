import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class JLabelListenerExample extends 	JFrame{
	// Objetos visuales del ejemplo
	private	JPanel topPanel;
	private JLabel label;
	
	public JLabelListenerExample() {
		// Caracteristicas gen;erales
		setTitle( "JLabel Listener Ejemplo" );
		setSize( 300, 200 );
		setBackground( Color.gray );
		
		// Contenedor del JTable
		topPanel = new JPanel();
		topPanel.setLayout( new BorderLayout() );
		getContentPane().add( topPanel );
		
		//Etiqueta
		label=new JLabel("Prueba de listener");
		topPanel.add( label, BorderLayout.CENTER );
		
		label.addMouseListener(new MouseAdapter(){
		    public void mouseClicked(MouseEvent evnt) {
		        if (evnt.getClickCount() == 1) {
		        	//Codigo que se quiera poner
		         }
		     }
		});		
	}

	public static void main(String[] args) {
		// Create an instance of the test application
		JLabelListenerExample mainFrame	= new JLabelListenerExample();
		mainFrame.setVisible( true );

	}

}
