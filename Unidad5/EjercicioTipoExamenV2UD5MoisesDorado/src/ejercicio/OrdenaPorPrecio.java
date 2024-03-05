package ejercicio;

import java.util.Comparator;

public class OrdenaPorPrecio implements Comparator<Trastero>{

	@Override
	public int compare(Trastero t1, Trastero t2) {
		// TODO Auto-generated method stub
		if(t1.getPrecio() < t2.getPrecio()) {
			return -1;
		}
		if(t1.getPrecio() > t2.getPrecio()) {
			return 1;
		}else {
			return 0;
		}
	}

}
