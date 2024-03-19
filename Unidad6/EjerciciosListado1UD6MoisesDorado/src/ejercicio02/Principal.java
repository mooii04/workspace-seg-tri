package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double temperaturaC, temperaturaF;
		double limite=273;
		boolean fin=false;
		
		do {
			try {
				System.out.println("Introduzca temperatura en Grados Celdius");
				temperaturaC = Leer.datoDouble();
				
				if(temperaturaC < -limite) {
					throw new TemperaturaException("No puede haber temperaturas menores a -273 ºC");
				}
				
			temperaturaF = temperaturaC * 9.0/5.0 + 32.0;
					
			System.out.printf("En Fahrenheit es: %.2f",temperaturaF);
			fin = true;
				
			}catch(TemperaturaException e){
				System.out.println(e.getMessage());
				
			}catch(NumberFormatException e) {
				System.out.println("Introduce un número");
			}
		}while(!fin);
		
	}

}
