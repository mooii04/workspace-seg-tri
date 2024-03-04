package ejercicio04;


import java.util.HashMap;
import java.util.Map;


import ejercicio02.Socio;
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
		Contacto c1 = new Contacto("Peter");
		Contacto c2 = new Contacto("Malito");
		Contacto c3 = new Contacto("Manue");
		CrudContacto cc = new CrudContacto(agenda);
		agenda.put(c1, "123");
		agenda.put(c2, "456");
		agenda.put(c3, "789");
	
		
		do {
			System.out.println("""
					1) Añadir nuevo contacto
					2) Ver lista de contactos
					3) Modificar nombre de un contacto
					4) Modificar teléfono de un contacto
					5) Borrar un contacto
					6) Buscar todos los contactos con un nombre
					0) Salir
					""");
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
			
			case 6:
				System.out.println("Diga nombre para buscar");
				nombre=Leer.dato();		
				System.out.println(cc.buscarPorNombreLista(nombre));
			
			case 0:
				System.out.println("Adiós");
			break;
			
			default:
				System.out.println("La opción elegida no es válida. Indique otra opción.");
			}
		}while(eleccion!=0);
	}


}
