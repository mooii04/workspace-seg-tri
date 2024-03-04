package ejercicio02;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Socio> lista = new ArrayList();
		CRUDSocio cs = new CRUDSocio(lista);
		Club c = new Club(cs, "Club Brrr");
		int eleccion;
		String dni;
		String nombre;
		String apellidos;
		double cuota;
		int anio;
		do {
			System.out.println("""
					1) Añadir nuevo socio
					2) Ver lista
					3) Modificar cuota de un socio
					4) Borrar un socio
					5) Calcular total gastado por un socio
					0) Salir
					""");
			eleccion=Leer.datoInt();
			switch(eleccion) {
			
			case 1:
				System.out.println("Diga dni");
				dni=Leer.dato();
				System.out.println("Diga nombre");
				nombre=Leer.dato();
				System.out.println("Diga apellidos");
				apellidos=Leer.dato();
				System.out.println("Diga cuota");
				cuota=Leer.datoDouble();
				Socio s = new Socio (dni, nombre, apellidos, cuota);
				cs.agregar(s);
				
			break;
			
			case 2:
				cs.imprimirLista();
				
			break;
			
			case 3:
				System.out.println("Diga dni del socio");
				dni = Leer.dato();
				System.out.println("Diga nueva cuota");
				cuota=Leer.datoDouble();
				cs.modificarCuotas(dni, cuota);
			
			break;
			
			case 4:
				System.out.println("Diga dni del socio");
				dni = Leer.dato();
				cs.borrar(dni);
				
			break;
			
			case 5:
				System.out.println("Diga dni del socio");
				dni = Leer.dato();
				System.out.println("Diga en que año entró al club");
				anio=Leer.datoInt();
				System.out.println(c.calcularDineroGastado(anio, dni));
				
			break;
			
			case 0:
				System.out.println("Adiós");
			break;
			
			default:
				System.out.println("La opción elegida no es válida. Indique otra opción.");
			}
		}while(eleccion!=0);

	}

}
