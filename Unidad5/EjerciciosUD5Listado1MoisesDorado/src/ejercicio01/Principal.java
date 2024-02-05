package ejercicio01;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int id=0;
		
		List <Nota> lista = new ArrayList<>();
		
		Nota n1 = new Nota("Hola", 1, "Bruno");
		Nota n2 = new Nota("Prueba", 2, "Messi");
		Nota n3 = new Nota("Adiós", 3, "Bruno");
		
		CrudNota cn = new CrudNota (lista);
		
		cn.agregar(n1);
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
		
		System.out.println(cn.aumentarContador());
		
		
	}

}
