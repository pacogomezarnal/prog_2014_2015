package Hilos;


import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CargaImagen implements Runnable{
	JLabel lbl;
	String res;

	public CargaImagen(JLabel lbl,String res) {
		this.lbl=lbl;
		this.res=res;
	}

	@Override
	public void run() {
		lbl.setIcon(new ImageIcon(CargaImagen.class.getResource(res)));
	}

}
