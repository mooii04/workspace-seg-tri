package ejercicio01;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int id=0;
		int eleccion;
		String titulo;
		String cuerpo;
		
		List <Nota> lista = new ArrayList<>();
		
		/*Nota n1 = new Nota("Hola", 1, "Bruno");
		
		Nota n2 = new Nota("Prueba", 2, "Messi");
		
		Nota n3 = new Nota("Adiós", 3, "Bruno");*/
		
		CrudNota cn = new CrudNota (lista);
		
		/*cn.agregar(n1);
		cn.agregar(n2);
		cn.agregar(n3);
		
		cn.imprimirNotas();
		
		System.out.println();
		
		System.out.println(cn.aumentarContador());
		
		
		System.out.println("Cual borras");
		
		id=Leer.datoInt();
		
		cn.borrar(id);
		
		cn.imprimirNotas();
		
		System.out.println();
		
		System.out.println(cn.aumentarContador());*/
		
		do {
			System.out.println("""
					1) Ver las notas
					2) Borrar una
					3) Ver cuantas hay
					4) Crear una nota
					5) Ver nota por id
					6) Modificar
					0) Salir
					""");
			eleccion=Leer.datoInt();
			switch(eleccion) {
			
			case 1:
				//cn.imprimirNotas();
				cn.imprimir2();
				break;
			case 2:
				System.out.println("Cual borras");
				
				id=Leer.datoInt();
				cn.borrar(id);
				break;
			case 3:
				System.out.println(cn.mostrarTamano());
				break;
				
			case 4:
				System.out.println("Indique titulo");
				titulo=Leer.dato();
				System.out.println("Diga cuerpo");
				cuerpo=Leer.dato();
				Nota n = new Nota (cuerpo, id, titulo);
				cn.crearNota(n);
				id++;
				break;
				
			case 5:
				System.out.println("Diga indice");
				id=Leer.datoInt();
				cn.verNotaPorIndice(id);
				break;
				
			case 0:
				System.out.println("Adiós");
				break;
				default: System.out.println("Pon otro número.");
				
			}
			
			
		}while(eleccion!=0);
	}

}
