
public class Juego {

	public static void main(String[] args) {
		//GEneramos la baraja de juego
		Baraja b=new Baraja();
		b.ordenar();
		
		//Un nuevo Jugador
		Jugador j=new Jugador();
		j.cartaNueva(b);
		
		//Imprimimos
		System.out.println(b);
	}

}
