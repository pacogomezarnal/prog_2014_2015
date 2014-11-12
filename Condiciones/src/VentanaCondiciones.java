import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaCondiciones extends JFrame{
	private JPanel contentPane;
	private JTextField textNum;
	private JTextField textMsg;
	

	public VentanaCondiciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 209);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNum = new JTextField();
		textNum.setBounds(10, 46, 178, 20);
		contentPane.add(textNum);
		textNum.setColumns(10);
		
		JLabel lblIntroduceUnNumero = new JLabel("Introduce un numero positivo");
		lblIntroduceUnNumero.setBounds(10, 21, 178, 14);
		contentPane.add(lblIntroduceUnNumero);
		
		JLabel lblMensage = new JLabel("Mensage");
		lblMensage.setBounds(10, 92, 178, 14);
		contentPane.add(lblMensage);
		
		textMsg = new JTextField();
		textMsg.setEditable(false);
		textMsg.setBounds(10, 127, 178, 20);
		contentPane.add(textMsg);
		textMsg.setColumns(10);
		
		JButton btnNewButton = new JButton("Comprobar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txtCja="";
				int numCaja=0;
				
				txtCja=textNum.getText();
				numCaja=Integer.parseInt(txtCja);
				
				System.out.println(numCaja);
				
				//Condicion
				if(numCaja>=0){
					//Si es verdadera la condicion
					textMsg.setText("OK");
				}else{
					//Si no es verdadera que hago
					textMsg.setText("No es un numero positivo");
				}
			}
		});
		btnNewButton.setBounds(218, 45, 89, 23);
		contentPane.add(btnNewButton);
	}
}
