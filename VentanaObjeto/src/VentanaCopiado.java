import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaCopiado extends JFrame  {
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblCampo;
	private JLabel label;
	private JTextField textField_1;
	private JButton btnNewButton;
	
	public VentanaCopiado() {
		//Ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 269, 167);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Cajas de textos
		textField = new JTextField();
		textField.setBounds(10, 36, 103, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 90, 103, 20);
		contentPane.add(textField_1);
		
		//Etiquetas
		lblCampo = new JLabel("Campo1");
		lblCampo.setBounds(10, 21, 103, 14);
		contentPane.add(lblCampo);
		
		label = new JLabel("Campo1");
		label.setBounds(10, 75, 103, 14);
		contentPane.add(label);
		
		//Boton
		btnNewButton = new JButton("Copiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setText(textField.getText());
			}
		});
		btnNewButton.setBounds(148, 35, 89, 23);
		contentPane.add(btnNewButton);
		

	}
}
