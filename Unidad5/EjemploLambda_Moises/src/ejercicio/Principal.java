package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		int dos=2;
		
		z -> z + dos;
		() -> System.out.println("Hola");
		*/

		String saludo = "Hola bro";
		int c = 3, d = 5;
		
		
		IBienvenida bienvenida = (x) -> System.out.println(x);
	
		bienvenida.mostrarBienvenida(saludo);
		
		
		ISuma suma = (a, b) -> a+b;
		
		System.out.println(suma.suma(c, d));
		
		
		//Ahora un Supplier, que es un proovedor
		Supplier <Double> sup = () -> 50.0; 
		
		System.out.println(sup.get());
		
		
		//Ahora un Consumer
		Consumer <String> mostrar = (x) -> System.out.println(x); ;
		
		mostrar.accept(saludo);
		
		List <String> listaNombres = new ArrayList <String>();
		listaNombres.add("Moisés");
		listaNombres.add("Bruno");
		listaNombres.add("Manuel");
		listaNombres.add("Víctor");
		listaNombres.add("Carlos");
		listaNombres.add("Joaquín");
		listaNombres.add("Fran");
		listaNombres.add("Joseca");
		
		Consumer <String> mostrarNombres = (x) ->System.out.println(x);
		for (String string : listaNombres) {
			mostrarNombres.accept(string);
		}
		
		
		//Ahora un Function
		Function <Double, Double> algo = (a) -> 10.0*5.0;
		Function <Double, Double> algo2 = (a) -> 10.0/5.0;
		
		//En el null iría un double
		System.out.println(algo.apply(null));
		
		//En el null iría un double
		System.out.println(algo.andThen(algo2).apply(null));
		
		
		//Ahora un BiFunction
		//las dos primeras es lo que pasamos y la tercera es lo que devuelve
		BiFunction <Integer, Double, Double> multiplicacion = (e, f) -> e*f;
		
		//Mirar bien el documento de Fran y Pablo para entender mejor
		System.out.println(multiplicacion.apply(null, null));
		
		
		//Predicated
		//Mirar mejor en el PDF ya que se tiene que usar con otra clase más
		//Predicated<Objeto> nombre = (Objeto o) -> o.getParámetro >= num;
		
	}

}
