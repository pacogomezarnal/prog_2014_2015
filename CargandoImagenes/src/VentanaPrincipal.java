import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import Hilos.CargaImagen;


public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("IMG1");
		
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(10, 11, 227, 240);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("IMG2");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setBounds(251, 11, 227, 240);
		contentPane.add(lbl2);
		
        Thread hiloA = new Thread( new CargaImagen(lbl1,"/ima/formentera_peq.jpg"),"hiloA" );
        Thread hiloB = new Thread( new CargaImagen(lbl2,"/ima/formentera_grande.jpg"),"hiloB" );
        
        hiloA.start();
        hiloB.start();
		
	}

}
