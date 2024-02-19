package ejercicio05;

import java.util.Comparator;

public class ComparaPorEdad  implements Comparator <Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		// TODO Auto-generated method stub
		double edadp1 = p1.getEdad();
		double edadp2 = p2.getEdad();
	
		if (edadp1 < edadp2) {
			return -1;
		} else {
			if (edadp1 > edadp2) {
				return 1;
			}
			return 0;
		}
	}

}
