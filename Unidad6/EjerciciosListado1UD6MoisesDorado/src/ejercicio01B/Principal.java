package ejercicio01B;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora c = new Calculadora();
		
		int num, den, op=0;
		
		do {
			
			try {
				System.out.println("Diga numerador");
				num = Leer.datoInt();
				
				System.out.println("Diga denominador");
				den = Leer.datoInt();
				
				System.out.println(c.dividir(num, den));
				//System.out.println(c.raizCuadrada(4));
				
			}catch (ArithmeticException e){
				System.err.println("No pongas 0 PAYASO");
			}catch (Exception e) {
				System.err.println("Error inesperado");
			}
			
		}while(op != 0);
		
		try {
			System.out.println(c.raizCuadrada(4));
		}catch (ArithmeticException e){
			System.err.println("No pongas negativos PAYASO");
		}
			
	}

}
