package ejercicio04;

import java.util.HashMap;
import java.util.Map;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int eleccion;
		String nuevoNombre;
		String nombre;
		String telefono;
		String nuevoTlf;
		
		Map <Contacto, String> agenda = new HashMap<>();
		
		Contacto c1 = new Contacto("Moisés");
		Contacto c2 = new Contacto("Ángel");
		Contacto c3 = new Contacto("Rafa");
		
		CrudContacto cc = new CrudContacto(agenda);
		
		agenda.put(c1, "123");
		agenda.put(c2, "456");
		agenda.put(c3, "789");
		
		do {
			imprimirMenu();
			eleccion=Leer.datoInt();
			switch(eleccion) {
			
			case 1:
				System.out.println("Diga telefono");
				telefono=Leer.dato();
				System.out.println("Diga nombre ");
				nombre=Leer.dato();
				Contacto c = new Contacto (nombre);
				cc.agregar(c, telefono);
				
			break;
			
			case 2:
				cc.imprimirAgenda();
				
			break;
			
			case 3:
				System.out.println("Diga nombre del contacto");
				nombre = Leer.dato();
				System.out.println("Diga nuevo nombre");
				nuevoNombre=Leer.dato();
				cc.modificarNombre(nombre, nuevoNombre);
			
			break;
			
			case 4:
				System.out.println("Diga nombre del contacto");
				nombre = Leer.dato();
				System.out.println("Diga nuevo teléfono");
				nuevoTlf=Leer.dato();
				cc.modificarTlf(nombre, nuevoTlf);
			break;
			
			case 5:
				System.out.println("Diga nombre del contacto");
				nombre = Leer.dato();
				cc.borrar(nombre);
			break;
			
			case 0:
				System.out.println("Adiós");
			break;
			
			default:
				System.out.println("El número marcado anteriormente no se comentó");
			}
		}while(eleccion!=0);
	}

	public static void imprimirMenu() {
		System.out.println("""
				(1) Añadir nuevo contacto
				(2) Ver lista de contactos
				(3) Modificar nombre de un contacto
				(4) Modificar teléfono de un contacto
				(5) Borrar un contacto
				(0) Salir
				""");
	}
	
}
