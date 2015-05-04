package Controller;

import java.util.ArrayList;

import Model.ConexionDB;
import Model.UsuariosModel;
import View.MainAppView;


public class MainController {
	
	//Instancia unica
	private static MainController instance = null;
	//Atributos de bases de datos
	ConexionDB corredoresDB;
	
	//VentanaPrincipal
	private MainAppView vMain;

	private MainController() {
		//Creamos la conexion con la base de datos
		corredoresDB=ConexionDB.getInstance("localhost","corredoresDB","root","");
		if(corredoresDB.connectDB()==true) {
			System.out.println("CONECTADOS CON EXITO");
		}else{
			System.out.println("ERROR EN LA CONEXION");
		}
		this.showMain();
	}
	
	
	//Implementar SingleTon
	public static MainController getInstance() {
	      if(instance == null) {
	         instance = new MainController();
	      }
	      return instance;
	}
	
	//Lanzar vista Inicial
	public void showMain(){
		//Consultamos los usuarios
		UsuariosModel uModel=new UsuariosModel();
		ArrayList<String> usuarios=uModel.getUsuarios();
		//Lanzamos la ventana principal
		vMain = new MainAppView();
		//Cargamos datos de Usuarios
		vMain.showInicial(usuarios);
		//Hacemos visiblela pantalla inicial
		vMain.setVisible(true);	
	}
}
