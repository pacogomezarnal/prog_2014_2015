
public class CondicionesV2 {

	public static void main(String[] args) {
		int a=10;
		int b=101;
		
		//El mayor de dos números
		if(a>b){
			System.out.println("El mayor es a: "+a);
		}else if(a==b){
			System.out.println("Los dos números son iguales: "+b);
		}else{
			System.out.println("El mayor es b: "+b);
		}
		
		String palabra1="Nuestra casa";
		String palabra2="Nuestra casa";
		
		//Comparacion entre string
		if(palabra1.compareTo(palabra2)==0){
			System.out.println("Las dos frases son iguales");
		}else{
			System.out.println("Las dos frases no son iguales");
		}
	}

}
