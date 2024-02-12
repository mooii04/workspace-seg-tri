package ejemploMap2;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Número de clase, Alumno
		Map <Integer, Alumno> lista2 = new HashMap <> ();
		
		Alumno a = new Alumno (1, "Ángel", 3.2);
		
		//lista2.put(6, new Alumno (1, "Ángel", 3.2));
		
		lista2.put(6, a);
		
		System.out.println(lista2);
		
		a.setNombre("Rafa");
		
		System.out.println(lista2);
		
	}

}
