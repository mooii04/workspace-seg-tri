package ejercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Crear una pequeña lista con los datos personales de algunas Personas, y mostrarla por pantalla de
			forma NO ordenada y de forma ordenada (elegid la forma de ordenar vosotros, podéis empezar con
			orden natural, es decir, alfabéticamente y después crear otra “no natural”).*/
		
		List<Persona> personas = new ArrayList<Persona>();
		
		personas.add(new Persona("Moisés", "Dorado Gutiérrez", "29584143W", 19));
		personas.add(new Persona("Bruno", "Delgado Herrero", "29584143P", 18));
		personas.add(new Persona("Luismi", "Lopez Magaña", "29584143H", 40));
		personas.add(new Persona("Miguel", "Campos Fields", "29584143A", 39));
		personas.add(new Persona("Ángel", "Naranjo González", "29584143Z", 48));
		
		System.out.println("Ordenado por EDAD (NO  natural)");
		Collections.sort(personas, new ComparaPorEdad());
		System.out.println();
		for (Persona p : personas) {
			System.out.println(p);
		}
		
		System.out.println("Ordenado por DNI (natural)");
		Collections.sort(personas);
		System.out.println();
		for (Persona p : personas) {
			System.out.println(p);
		}
	}

}
