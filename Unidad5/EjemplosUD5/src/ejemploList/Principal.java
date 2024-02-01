package ejemploList;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> lista = new ArrayList <String> ();
		
		Alumno a1 = new Alumno ("Moisés", "Dorado Gutiérrez", 1);
		Alumno a2 = new Alumno ("Bruno", "Delgado Herrero", 2);
		Alumno a3 = new Alumno ("Joaquín", "Carrascal Franco", 3);
		Alumno a4 = new Alumno ("Victor", "Medina Lejeune", 4);
		
		List <Alumno> listaAlum = new ArrayList <Alumno> ();
		
		//Lista de String
		lista.add("Ángel");
		lista.add("Miguel");
		
		System.out.println(lista.contains("Miguel"));
		
		System.out.println(lista);
		
		System.out.println(lista.size());
		
		lista.remove(0);
				
		System.out.println(lista);

		System.out.println(lista.size());
		
		System.out.println("");
		System.out.println("");
		
		//Lista de Alumno
		listaAlum.add(a1);
		listaAlum.add(a2);
		listaAlum.add(a3);
		listaAlum.add(a4);
		
		System.out.println(listaAlum.contains(a1));
		
		System.out.println(listaAlum);
		
		System.out.println(lista.size());
		
		lista.remove(0);
		
		System.out.println(listaAlum);
		
		System.out.println(lista.size());

	}

}
