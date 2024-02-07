package ejemploSet;

import java.util.HashSet;
import java.util.Set;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <String> lista = new HashSet <String>();
		
		Set <Persona> listaP = new HashSet <Persona>();
		int dni;
		
		//EJEMPLO con String
		/*
		lista.add("Uno");
		lista.add("Dos");
		lista.add("Uno");
		lista.add("Tres");
		lista.add("Catorce");
		
		//Mostrar lista
		System.out.println(lista);
		
		//Borrar el tres
		lista.remove("Tres");
		
		//Mostrar lista
		System.out.println(lista);

		//Booleano si contiene Uno
		System.out.println(lista.contains("Uno"));
		
		//Booleano si contiene Mil
		System.out.println(lista.contains("Mil"));
		*/
		
		listaP.add(new Persona ("Ánegl", 34, "123A"));
		listaP.add(new Persona ("Rafa", 37, "123B"));
		listaP.add(new Persona ("Miguel", 67, "123C"));
		
		System.out.println(listaP);
		
		System.out.println("Diga el dni a buscar");
		dni = Leer.datoInt();
		
		if(listaP.contains(dni)) {
			System.out.println("dfgdf");
		}
	}

}
