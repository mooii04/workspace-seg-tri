package ejercicio;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		
		List <Trastero> listaTrasteros = new ArrayList <Trastero>();
				
		Oficina o = new Oficina (listaTrasteros);
		
		do {
			imprimirMenu();
			op = Leer.datoInt();
			
		}while (op != 0);
		
	}

	public static void imprimirMenu() {
		System.out.println("--------- Alquiler Trasteros ---------");
		System.out.println("(1)\tAñadir trastero");
		System.out.println("(2)\tBuscar trastero por precio");
		System.out.println("(3)\t");
	}
	
}
