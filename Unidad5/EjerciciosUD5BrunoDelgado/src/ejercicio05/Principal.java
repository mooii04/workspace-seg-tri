package ejercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Persona> personas = new ArrayList<Persona>();
		/*String dni;
		String nombre;
		String apellidos;
		int edad;
		int anioNacimiento;*/
		personas.add(new Persona ("1A", "Bruno", "Delgado", 18, 2005));
		personas.add(new Persona ("2A", "Cristiano", "Ronaldo", 39, 1985));
		personas.add(new Persona ("3A", "Cristiano", "Jr", 13, 2010));
		personas.add(new Persona ("4A", "Anuel", "AA", 31, 1992));
		
		
		System.out.println();

		for (Persona pers : personas) {
			System.out.println(pers);
		}
		
		System.out.println();
		
		System.out.println("ORDENADOS POR AÑO DE NACIMIENTO (NATURAL)");
		Collections.sort(personas);
		System.out.println();
		for (Persona pers : personas) {
			System.out.println(pers);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("ORDENADOS POR EDAD (NO NATURAL)");
		
		Collections.sort(personas, new CompararPorAnioNacimiento());
		System.out.println();
		for (Persona pers : personas) {
			System.out.println(pers);
		}
		
		System.out.println();
		

		System.out.println();
		System.out.println();
		System.out.println("ORDENADOS POR NOMBRE (NO NATURAL)");
		
		Collections.sort(personas, new ComparaPorNombre());
		System.out.println();
		for (Persona pers : personas) {
			System.out.println(pers);
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Volvemos a ver la lista");
		System.out.println(personas);
		for (Persona pers : personas) {
			System.out.println(pers);
		}
		
	}

}
