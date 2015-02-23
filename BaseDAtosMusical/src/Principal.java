
public class Principal {

	public static void main(String[] args) {
		
		//Genero una cancion
		Cancion cancion1=new Cancion();
		//Poner nombre cancion
		cancion1.setNombre("Madness");
		
		//Imprimir nombre cancion
		System.out.println(cancion1.getNombre());
		System.out.println("El nombre de la cancion1 es: "+cancion1.getNombre());

	}

}
