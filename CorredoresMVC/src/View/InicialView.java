package View;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JComboBox;

public class InicialView extends JPanel {
	private JTextField textField;
	private ArrayList<String> usuarios;
	JComboBox comboBox;

	/**
	 * Create the panel.
	 */
	public InicialView() {
		setBounds(0, 0, 400, 300);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(24, 0, 86, 14);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setAlignmentX(0.5f);
		lblPassword.setBounds(24, 56, 86, 14);
		add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(24, 81, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setBounds(24, 25, 86, 20);
		add(comboBox);
	}
	
	//Añadir Usuarios
	public void putUsuarios(ArrayList<String> usuarios){
		comboBox.removeAllItems();
	    for(String s:usuarios){
	    	comboBox.addItem(s);
	    }
	    this.repaint();
	}
}
