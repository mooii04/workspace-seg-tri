package ejercicio03;

import java.util.Random;

public class ArrayReales implements IEstadisticas {
	
	private double[] num;
	public ArrayReales(double[] num) {
		super();
		this.num = num;
	}
	
	public double[] rellenarArray(double desde, double hasta) {		
		Random rnd = new Random (System.nanoTime());
		for (int i = 0; i < num.length; i++) {
			num[i]=rnd.nextDouble(hasta-desde+1)+desde;
			
		}
		return num;
	}
	
	public void imprimirArray() {
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
	@Override
	public double calcularMinimo() {
		// TODO Auto-generated method stub
		double menor = 0;
		for (int i = 0; i < num.length; i++) {
			if(i==0) {
				menor=num[i];
			}
			if(menor > num[i]){
				menor = num[i];
			}
		}
		return menor;
	}
	
	
	@Override
	public double calcularMaximo() {
		double mayor=0;
		// TODO Auto-generated method stub
		for (int i = 0; i < num.length; i++) {
			if(i==0) {
				mayor=num[i];
			}
			if(mayor < num[i]){
				mayor = num[i];
			}
		}
		return mayor;
	}
	@Override
	public double calcularSumatorio() {
		double suma = 0;
		// TODO Auto-generated method stub
		for (int i = 0; i < num.length; i++) {
			suma += num[i];
		}
		return suma;
	}
}
