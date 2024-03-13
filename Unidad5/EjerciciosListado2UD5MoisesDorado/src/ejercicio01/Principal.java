package ejercicio01;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Alumno> lista = new ArrayList <Alumno> ();
		
		Secretaria s = new Secretaria(lista);
		
		int op;
		int edad;
		String inicial;
		
		lista.add(new Alumno("Moisés", "Dorado Gutiérrez", "1DAM", 9.3, 19));
		lista.add(new Alumno("Alvaro", "Castilla Gutiérrez", "2DAM", 7.9, 17));
		lista.add(new Alumno("Brudelzzzzzzz", "Delgado Gutiérrez", "1AyF", 3.3, 18));
		lista.add(new Alumno("Manuel", "Gómez Gutiérrez", "2AyF", 1.3, 20));
		lista.add(new Alumno("Víctor", "Medina Gutiérrez", "1DAM", 0.7, 19));
		
		do {
			imprimirMenu();
			op = Leer.datoInt();
			
			switch (op) {
				case 1:
					System.out.println("Diga la edad del alumno");
					edad = Leer.datoInt();
						
					System.out.println(s.findByEdadFilter(edad));
					break;
					
				case 2:
					s.mostrarAlumnos();
					break;
					
				case 3:
					System.out.println("Diga la inicial del alumno");
					inicial = Leer.dato();
						
					System.out.println(s.findByInicial(inicial));
					break;
					
				case 4:
					System.out.println(s.contarAlumnos());
					break;
					
				case 5:
					System.out.println(s.mostrarAlumnosMediaMayor9());
					break;
					
				case 6:
					System.out.println(s.mostrar3Alumnos());
					break;
					
				case 7:
					System.out.println(s.mostrarAlumnoMenor());
					break;
					
				case 8:
					System.out.println(s.mostrarPrimerAlumno());
					break;
					
				case 9:
					System.out.println(s.mostrarNombresMayor10Letras());
					break;
					
				case 10:
					System.out.println(s.mostrarAlumnosEmpiecenAMayorIgual6Letras());
					break;
					
				case 0:
					System.out.println("Nos vemos");
					break;
					
				default:
					System.out.println("Inserte un número comentado anteriormente");
					break;
			}
			
		}while(op != 0);
	}

	public static void imprimirMenu() {
		System.out.println("");
		System.out.println("--------  Secretaría --------");
		System.out.println("(1)\tBuscar alumnos por edad ");
		System.out.println("(2)\tMostrar todos los alumnos");
		System.out.println("(3)\tBuscar alumnos por inicial");
		System.out.println("(4)\tContar cuantos alumnos hay");
		System.out.println("(5)\tMostrar alumnos con media superior a 9");
		System.out.println("(6)\tMostrar 3 primeros alumnos");
		System.out.println("(7)\tMostrar alumno más joven");
		System.out.println("(8)\tMostrar 1º alumno");
		System.out.println("(9)\tMostrar alumnos con más de 10 letras en el nombre");
		System.out.println("(10)\tMostrar alumnos con 6 o más letras en el nombre y empiecen por A");
		System.out.println("(0)\tSalir del programa");
	}
	
}
