package ejercicio;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int id;
		String nombre;
		String significado;
		int op;
		String nuevoSignificado;
		
		List <Palabra> listaPalabras = new ArrayList <Palabra>();
		
		Diccionario d = new Diccionario (listaPalabras);
		
		do {
			imprimirMenu();
			op = Leer.datoInt();
			
			switch(op) {
				case 1:
					d.imprimirLista();
				break;
				
				case 2:
					System.out.println("Diga el nombre de la palabra a buscar");
					nombre = Leer.dato();
					
					System.out.println(d.buscarPorNombre(nombre));
				break;
					
				case 3:
					System.out.println("Diga el id de la palabra");
					id = Leer.datoInt();
					System.out.println("Diga la palabra en inglés");
					nombre = Leer.dato();
					System.out.println("Diga el significado en español");
					significado = Leer.dato();
					
					d.agregarLista(new Palabra (id, nombre, significado));
				break;
					
				case 4:
					System.out.println("Diga el nombre de la palabra a cambiar");
					nombre = Leer.dato();
					
					System.out.println("Diga el significado nuevo de la palabra");
					nuevoSignificado = Leer.dato();
					
					d.modificarSignificado(nombre, nuevoSignificado);
				break;
				
				case 5:
				break;
				
				case 6:
					System.out.println("Diga el nombre de la palabra a borrar");
					nombre = Leer.dato();
					
					d.borrarPalabra(nombre);
				break;
				
				case 0:
					System.out.println("Número no mencionado anteriormente");
				break;
				
				default:
					System.out.println("Nos vemos pronto!!!");
				break;
			}
			
			
		}while(op != 0);
		
	}
	
	public static void imprimirMenu() {
		System.out.println("-------- Diccionario --------");
		System.out.println("(1)\tImprimir todas las palabras");
		System.out.println("(2)\tBuscar significado de una palabra");
		System.out.println("(3)\tAñadir una palabra");
		System.out.println("(4)\tModificar significado de una palabra");
		System.out.println("(5)\tOrdenar la lista por el 'nombre' de la palabra");
		System.out.println("(6)\tBorrar una palabra");
		System.out.println("(0)\tSalir del programa");
	}

}
