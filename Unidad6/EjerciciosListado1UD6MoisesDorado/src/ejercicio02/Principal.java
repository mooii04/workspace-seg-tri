package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double temperaturaC, temperaturaF;
		double limite=273;
		
		System.out.println("Introduzca temperatura en Grados Celdius");
		temperaturaC = Leer.datoDouble();
		
		try {
			if(temperaturaC < -limite) {
				throw new TemperaturaException("No puede haber temperaturas menores a -273 ºC");
			}
			temperaturaF = temperaturaC * 9/5 + 32;
			
			System.out.printf("En Fahrenheit es: %.2f",temperaturaF);
		}catch(TemperaturaException e){
			System.err.println(e.getMessage());
		}
		
	}

}
