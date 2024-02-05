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
		
		lista.add(new Persona ("Ángel", 36, "123456789A"));
		lista.add(new Persona ("Miguel", 32, "123456789B"));
		
		System.out.println(lista);

		System.out.println(lista.get(0));
		
		System.out.println("Diga el dni de la persona que quiere encontrar");
		dni = Leer.dato();
		
		cp.buscarByDni(dni);	
	
	}

}
