
public class Carta {
	//Numero de la baraja
	//el 0 es el JOKER
	private int numero;
	//Palo de la baraja
	private String palo;
	static final String PICAS="PICAS";
	static final String CORAZONES="CORAZONES";
	static final String DIAMANTES="DIAMANTES";
	static final String TREBOLES="TREBOLES";
	
	public Carta() {
		this(1,Carta.PICAS);
		//this.numero=1;
		//this.palo=Carta.PICAS;
	}
	
	public Carta(int numero,String palo){
		this.numero=numero;
		this.palo=palo;		
	}

}
