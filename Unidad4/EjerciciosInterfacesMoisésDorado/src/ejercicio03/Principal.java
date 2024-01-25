package ejercicio03;

import java.util.Random;

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rnd = new Random(System.nanoTime());
		int tam = 10;
		
		double desde = rnd.nextDouble();
		double hasta = rnd.nextDouble();
		
		double[]lista = new double[tam];
		
		ArrayReales a = new ArrayReales(lista);
		
		
		
		a.rellenarArray(desde, hasta);
		
		System.out.println("Lista:");
		System.out.println();
		a.imprimirArray();
		
		System.out.println();
		
		
		System.out.println("Máximo:");
		System.out.println(a.calcularMaximo());
		
		System.out.println();
		
		System.out.println("Mínimo:");
		System.out.println(a.calcularMinimo());
		
		System.out.println();
		
		System.out.println("Sumatorio:");
		System.out.println(a.calcularSumatorio());
		
	}
}
