package ejercicio03;

import java.util.HashSet;
import java.util.Set;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
 		Realizar un programa que guarde Alumnos de una clase.
 		Se deben poder mostrar, modificar y borrar
		los que se quiera de forma individual, es decir,
		el usuario debe decir quién quiere mostrar, modificar
		o borrar. Se puede crear otra clase con funcionalidades
		como sacar nota media del curso, dar el número
		de suspensos en total, media de suspensos, etc. Usa la
		interfaz Set implementada por HashSet.
		 */
		
		Set <Alumno> lista = new HashSet <Alumno>();
		
		CrudAlumno ca = new CrudAlumno (lista);
		
		int codAlum;
		String nombre;
		
		lista.add(new Alumno("Moisés", "Dorado Gutiérrez", 1));
		lista.add(new Alumno("Bruno", "Delgado Herrero", 2));
		lista.add(new Alumno("Miguel", "Campo Fields", 3));
		lista.add(new Alumno("Luismi", "López Magaña", 4));
		
		System.out.println("Diga el código del alumno que desea ver");
		codAlum = Leer.datoInt();
		
		System.out.println(ca.buscarPorCodAlum(codAlum));
		
		System.out.println("Diga el código del alumno que desea borrar");
		codAlum = Leer.datoInt();
		
		ca.borrar(codAlum);
		
		System.out.println("Diga el código del alumno que quiere cambiar el nombre");
		codAlum = Leer.datoInt();
		
		System.out.println("Diga el nombre nuevo");
		nombre = Leer.dato();
		
		ca.modificarNombre(codAlum, nombre);
	}

}
