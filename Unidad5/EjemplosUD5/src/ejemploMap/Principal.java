package ejemploMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1
		Map <String, String> lista = new HashMap <String, String> (); 
		
		//2
		Set <String> listaClaves = lista.keySet();
		
		//3
		Collection listaValores = lista.values();
		
		//4
		Set<Entry<String, String>>set2 = lista.entrySet();
		
		//1
		lista.put("Uno", "One");
		lista.put("Dos", "Two");
		//lista.put("Uno", "Ummm");
		lista.put("First", "One");

		System.out.println(lista);
		
		//2
		System.out.println(listaClaves);
		
		//3
		System.out.println(listaValores);
		
		//4
		System.out.println(listaClaves + "\n" + listaValores + "\n" + set2);
	}

}
