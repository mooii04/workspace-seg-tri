package ejercicio06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear una clase Trabajador con los siguientes atributos: nombre, DNI, Horas trabajadas y
		 * sueldo final (este se puede calcular de cualquier manera sencilla de las que hemos
		 * visto anteriormente en otros ejercicios). Guardar varios trabajadores en una colección
		 * y mostrar los trabajadores ordenados según el número de horas trabajadas(de menor a mayor
		 * y viceversa) y según el sueldo (del que más al que menos cobra). Se deben usar las
		 * interfaces comparable y/o comparator.
		 */
		
		//FALTAN COSAS PONERLO BIEN
		List<Trabajador> trabajadores = new ArrayList<Trabajador>();
		
		trabajadores.add(new Trabajador("Moisés", "123A", 6, 1000));
		trabajadores.add(new Trabajador("Ángel", "123B", 8, 1800));
		trabajadores.add(new Trabajador("Miguel", "123C", 12, 1500));
		trabajadores.add(new Trabajador("Luismi", "123D", 8, 1300));
		trabajadores.add(new Trabajador("Rafa", "123E", 6, 1300));
		trabajadores.add(new Trabajador("Jesús", "123F", 8, 1200));
		trabajadores.add(new Trabajador("Moisés", "123G", 6, 1300));
		trabajadores.add(new Trabajador("Moisés", "123H", 8, 1200));
		
		System.out.println("Ordenado por NOMBRE, si es igual por SUELDO (no natural)");
		Collections.sort(trabajadores);
		System.out.println();
		for(Trabajador t : trabajadores) {
			System.out.println(t);
		}
		
	}

}
