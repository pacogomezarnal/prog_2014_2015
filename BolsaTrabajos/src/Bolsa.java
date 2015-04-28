import java.util.ArrayList;
import java.util.Iterator;


public class Bolsa implements Iterable{
	
	ArrayList lista = new ArrayList();
	int maximo=0;

	public Bolsa(int maximo) {
		this.maximo=maximo;
	}
	
	public void add(Object objeto ) {
		if (lista.size()<=maximo) {
			lista.add(objeto);
		}else { 
			throw new RuntimeException("no caben mas");
		}
	}

	@Override
	public Iterator iterator() {
		return lista.iterator();
	}

}
