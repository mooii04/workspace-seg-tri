package ejemploList2;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Persona> lista = new ArrayList <Persona> ();
		
		String dni;
		
		CrudPersona cp = new CrudPersona (lista);
		
		Persona p= new Persona ("Ángel", 36, "123456789A");
		lista.add(p);
		lista.add(p);
		
		lista.add(new Persona ("Ángel", 36, "123456789A"));
		lista.add(new Persona ("Miguel", 32, "123456789B"));
		lista.add(new Persona ("Ángel", 36, "123456789A"));
		
		System.out.println(lista);

		System.out.println(lista.get(0));
		
		System.out.println("·······················");
		
		
		System.out.println("Diga el dni de la persona que quiere encontrar");
		dni = Leer.dato();
		
		System.out.println(cp.buscarByDni(dni));	
		
		System.out.println("·······················");
		
		
		cp.imprimirLista();
		
		System.out.println("·······················");

		
		System.out.println("Diga el dni que desea borrar");
		dni = Leer.dato();
		
		cp.borrar(dni);
		
		cp.imprimirLista();
	}

}
