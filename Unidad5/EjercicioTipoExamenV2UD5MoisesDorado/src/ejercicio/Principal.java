package ejercicio;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		double capacidad;
		String direccion;
		int numTrastero;
		double precio;
		int ocupado; //1 ocupado - 2 libre
		double precioNuevo;
		
		List <Trastero> listaTrasteros = new ArrayList <Trastero>();
				
		Oficina o = new Oficina (listaTrasteros);

		do {
			imprimirMenu();
			op = Leer.datoInt();
			
			switch(op) {
				case 1:
					System.out.println("Diga la capacidad del trastero");
					capacidad = Leer.datoDouble();
					System.out.println("Diga dirección del trastero");
					direccion = Leer.dato();
					System.out.println("Diga número del trastero");
					numTrastero = Leer.datoInt();
					System.out.println("Diga el precio del trastero");
					precio = Leer.datoDouble();
					System.out.println("Diga si esta ocupado o no");
					System.out.println("(1) Ocupado - (2) Libre");
					ocupado = Leer.datoInt();
					
					o.agregarTrastero(new Trastero (capacidad, direccion , numTrastero, precio, ocupado));
				break;
				
				case 2:
					System.out.println("Diga el precio del trastero a buscar");
					precio = Leer.datoDouble();
					
					System.out.println(o.buscarByPrecio(precio));
				break;
					
				case 3:
					System.out.println("Diga el número del trastero a buscar");
					numTrastero = Leer.datoInt();
					
					System.out.println(o.buscarByNum(numTrastero));
				break;
					
				case 4:
					System.out.println(o.devolverMasCaro());
				break;
					
				case 5:
					System.out.println("Diga el número del trastero a eliminar");
					numTrastero = Leer.datoInt();
					
					o.eliminarPorNum(numTrastero);
				break;
					
				case 6:
					System.out.println("Diga el número del trastero a modificar el precio");
					numTrastero = Leer.datoInt();
					
					System.out.println("Diga el precio nuevo del trastero");
					precioNuevo = Leer.datoDouble();
					
					o.modificarPrecioTrastero(numTrastero, precioNuevo);
				break;
					
				case 7:
				break;
					
				case 8:
					o.mostrarTrasterosNoOcupados();
				break;
					
				case 0:
					System.out.println("Gracias por confiar en nosotros!!");
				break;
				
				default:
					System.out.println("Inserte un número comentado anteriormente");
				break;
			}
			
		}while (op != 0);
		
	}

	public static void imprimirMenu() {
		System.out.println("--------- Alquiler Trasteros ---------");
		System.out.println("(1)\tAñadir trastero");
		System.out.println("(2)\tBuscar trastero por precio");
		System.out.println("(3)\tBuscar trastero por número");
		System.out.println("(4)\tBuscar trastero más caro");
		System.out.println("(5)\tElimnar un trastero");
		System.out.println("(6)\tModificar precio de un trastero");
		System.out.println("(7)\tOrdenar trasteros por número y precio (mayor a menor)");
		System.out.println("(8)\tMostrar trasteros no ocupados");
		System.out.println("(0)\tSalir del sistema");
	}
	
}
