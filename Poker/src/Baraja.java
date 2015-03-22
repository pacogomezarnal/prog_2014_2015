
public class Baraja {
	//Mazo Cartas
	private Carta cartas[];
	private int numCartas;
	
	//TIPOS BARAJAS
	static final int FRANCESA=52;
	
	public Baraja() {
		this.numCartas=Baraja.FRANCESA;
		cartas=new Carta[this.numCartas];
	}
	
	public void ordenar(){
		int posicion=0;
		for(int i=0;i<Carta.PALOS.length;i++)
		{
			for(int j=1;j<14;j++){
				Carta cartaActual=new Carta(j,Carta.PALOS[i]);
				cartas[posicion]=cartaActual;
				posicion++;
			}
		}
	}
}
