
public class Ciudad {

	//ATRIBUTOS
	private String nombreCiudad;
	public int poblacion=0;
	
	//CONSTRUCTOR
	public Ciudad(String defCiudad) {
		//Inicialización
		this.nombreCiudad=defCiudad;
	}
	
	//METODOS
	public void setNombreCiudad(String defCiudad){
		this.nombreCiudad=defCiudad;
	}
	public String getNombreCiudad(){
		return this.nombreCiudad;
	}
	
	public void setPoblacion(int valorPoblacion)
	{
		if(valorPoblacion>0) this.poblacion=valorPoblacion;
	}
}
