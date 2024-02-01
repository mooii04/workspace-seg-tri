package ejemploList;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> lista = new ArrayList <String> ();
		
		lista.add("Ángel");
		lista.add("Miguel");
		
		System.out.println(lista.contains("Miguel"));
		
		System.out.println(lista);
		
		System.out.println(lista.size());
		
		lista.remove(0);
				
		System.out.println(lista);

		System.out.println(lista.size());
		
	}

}
