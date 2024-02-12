package ejercicio02;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Socio> lista = new ArrayList <Socio> ();
		
		CrudSocio cs = new CrudSocio (lista);
		
		Club c = new Club ("MANOLO LAMA", cs);
		
		int op, anioActual, anioEntrada;
		String nombre, apellidos, dni;
		double precioCuota = 150.0;
		double nuevaCuota;
		
		do {
			imprimirMenu();
			op = Leer.datoInt();
			
			switch(op) {
			case 1:
				System.out.println("Diga su nombre");
				nombre = Leer.dato();
				System.out.println("Diga sus apellidos");
				apellidos = Leer.dato();
				System.out.println("Diga su dni");
				dni= Leer.dato();
				Socio s = new Socio (nombre, apellidos, dni, precioCuota);
				cs.agregar(s);
			break;
			
			case 2:
				cs.mostrarSocio();
			break;
			
			case 3:
				System.out.println("Diga el dni del Socio a modificar la Cuota Base");
				dni = Leer.dato();
				System.out.println("Diga el nuevo precio");
				nuevaCuota = Leer.datoDouble();
				
				cs.modificarCuotaBase(dni, nuevaCuota);
			break;
			
			case 4:
				System.out.println("Diga el dni del Socio a borrar");
				dni = Leer.dato();
				
				cs.borrar(dni);
			break;
			
			case 5:
				System.out.println("Diga que año es");
				anioActual = Leer.datoInt();
				System.out.println("Diga desde que año es  socio");
				anioEntrada = Leer.datoInt();
				System.out.println("Diga su dni");
				dni = Leer.dato();
				
				c.calcularDineroTotalGastado(dni, anioActual, anioEntrada);
			break;
			
			case 0:
				System.out.println("Gracias por confiar en nosotros!!!");
			break;
			
			default:
				System.out.println("Número no comentado anteriormente");
			break;
			}
			
		}while(op != 0);
		
	}
	
	public static void imprimirMenu() {
		System.out.println("(1)\tGuardar un Socio");
		System.out.println("(2)\tMostrar Lista de Socios");
		System.out.println("(3)\tModificar Precio Base");
		System.out.println("(4)\tBorrar un Socio");
		System.out.println("(5)\tCalcular cuanto se ha gastado en el Club");
		System.out.println("(0)\tSalir del programa del Club");
	}

}
