package ejercicio05;

import java.util.Comparator;

public class CompararPorAnioNacimiento implements Comparator<Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {
		// TODO Auto-generated method stub
		if(p1.getAnioNacimiento()<p2.getAnioNacimiento()) {
			return -1;		
			}if(p1.getAnioNacimiento()>p2.getAnioNacimiento()) {
				return 1;
			}else {
				p1.compareTo(p2);
			}
			return 0;
	}
	

	
}
