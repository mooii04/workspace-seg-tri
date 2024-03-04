package ejercicio06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Trabajador> trabajadores = new ArrayList<Trabajador>();
		
		trabajadores.add(new Trabajador("NOMBRE", "1A", 40, 1700));
		trabajadores.add(new Trabajador("NOMBRE2", "2A", 34, 1520));
		trabajadores.add(new Trabajador("NOMBRE3", "3A", 45, 3200));
		
		Collections.sort(trabajadores, new ComparaPorSueldo());
		for (Trabajador t : trabajadores) {
			System.out.println(t);
		}
	}

}
