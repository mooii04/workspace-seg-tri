package ejercicio;

import java.util.Comparator;

public class OrdenaPorPrecio implements Comparator<Double>{

	@Override
	public int compare(Double precio1, Double precio2) {
		// TODO Auto-generated method stub
		
		if (precio1 < precio2) {
			return -1;
		} else {
			if (precio1 > precio2) {
				return 1;
			}
			return 0;
		}
	}

}
