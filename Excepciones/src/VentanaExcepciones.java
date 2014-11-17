import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class VentanaExcepciones extends JFrame {

	private JPanel contentPane;
	private JTextField cajaA;
	private JTextField cajaB;
	private JTextField cajaC;
	private JTextField txtOp;

	/**
	 * Create the frame.
	 */
	public VentanaExcepciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cajaA = new JTextField();
		cajaA.setBounds(10, 27, 86, 20);
		contentPane.add(cajaA);
		cajaA.setColumns(10);
		
		cajaB = new JTextField();
		cajaB.setBounds(10, 83, 86, 20);
		contentPane.add(cajaB);
		cajaB.setColumns(10);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=0;
				int b=0;
				int c=0;
				
				try{
					a=Integer.parseInt(cajaA.getText());
					b=Integer.parseInt(cajaB.getText());
				
					c=a*b;
				
					cajaC.setText(String.valueOf(c));
				
					//FENOMENAL
					txtOp.setText("TODO DE PM");
				}catch(Exception e){
					//FENOMENAL
					txtOp.setText("Algo ha ido mal");			
				}
			}
		});
		btnX.setBounds(116, 55, 89, 23);
		contentPane.add(btnX);
		
		cajaC = new JTextField();
		cajaC.setBounds(225, 56, 86, 20);
		contentPane.add(cajaC);
		cajaC.setColumns(10);
		
		txtOp = new JTextField();
		txtOp.setBounds(10, 165, 86, 20);
		contentPane.add(txtOp);
		txtOp.setColumns(10);
		
		JLabel lblMensaje = new JLabel("Mensaje");
		lblMensaje.setBounds(10, 140, 46, 14);
		contentPane.add(lblMensaje);
	}
}
