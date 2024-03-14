package ejercicio02;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Nombre> lista = new ArrayList <Nombre> ();		
		
		Agenda a = new Agenda (lista);
		
		int op=0;
		String nombre;
		
		lista.add(new Nombre ("Moisés"));
		lista.add(new Nombre ("Bruno"));
		lista.add(new Nombre ("Manuel"));
		lista.add(new Nombre ("Víctor"));
		lista.add(new Nombre ("Carlos"));
		lista.add(new Nombre ("Joaquín"));
		
		do {
			imprimirMenu();
			op=Leer.datoInt();
			
			switch(op) {
				case 1:
					System.out.println(a.odenarPorOrdenAlfabetico());
					break;
					
				case 2:
					System.out.println("Diga nombre");
					nombre = Leer.dato();
					
					System.out.println(a.findByNombre(nombre));
					break;
					
				case 3:
					break;
					
				case 4:
					System.out.println("Estos son los nombres impares que se van a borrar");
					System.out.println(a.longitudImpar());
					
					a.borrarImpares();
					break;
					
				case 5:
					a.setLista(a.mostrarNombresMayusculas());
					System.out.println(a.mostrarNombresMayusculas());
					break;
					
				case 0:
					System.out.println("Nos vemos");
					break;
					
				default:
					System.out.println("Número no comentado anteriormente");
					break;
			}
		}while (op != 0);
		
	}
	
	public static void imprimirMenu() {
		System.out.println("");
		System.out.println("--------  Agenda  --------");
		System.out.println("(1)\tOrdenar por orden alfabético");
		System.out.println("(2)\tBuscar nombre");
		System.out.println("(3)\tMétodo raro");
		System.out.println("(4)\tBorrar nombres con longitud impar");
		System.out.println("(5)\tPasar todos los nombres a mayúsculas (todas las letras)");
		System.out.println("(0)\tSalir del programa");
		System.out.println("");
	}

}
