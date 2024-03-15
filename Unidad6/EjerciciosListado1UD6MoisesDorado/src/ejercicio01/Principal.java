package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		int sol;
		int op;
		
		do {
			imprimirMenu();
			op = Leer.datoInt();
			
			switch(op) {
				case 1:
					System.out.println("Diga primer número");
					num1 = Leer.datoInt();
					
					System.out.println("Diga segundo número");
					num2 = Leer.datoInt();
					
					try {
						sol = num1+num2;
						System.out.println("La solución es: %.2f"+ sol);
					}catch(Exception e){
						System.err.println("Porfavor inserte un número entero");
					}
					break;
					
				case 2:
					System.out.println("Diga primer número");
					num1 = Leer.datoInt();
					
					System.out.println("Diga segundo número");
					num2 = Leer.datoInt();
					
					try {
						sol = num1-num2;
						System.out.println("La solución es: %.2f"+ sol);
					}catch(Exception e){
						System.err.println("Porfavor inserte un número entero");
					}
					break;
					
				case 3:
					System.out.println("Diga primer número");
					num1 = Leer.datoInt();
					
					System.out.println("Diga segundo número");
					num2 = Leer.datoInt();
					
					try {
						sol = num1*num2;
						System.out.println("La solución es: %.2f"+ sol);
					}catch(Exception e){
						System.err.println("Porfavor inserte un número entero");
					}
					break;
					
				case 4:
					System.out.println("Diga primer número");
					num1 = Leer.datoInt();
					
					System.out.println("Diga segundo número");
					num2 = Leer.datoInt();
					
					try {
						sol = num1/num2;
						System.out.println("La solución es: %.2f"+ sol);
					}catch(Exception e){
						System.err.println("Porfavor inserte un número entero");
					}catch(RuntimeException rt) {
						System.out.println();
					}
					break;
					
				case 5:
					break;
					
				case 0:
					System.out.println("FIN!!!");
					break;
					
				default:
					System.out.println("Introduzca un número correcto");
					break;
			}
			
		}while(op != 0);		
		
	}
	
	public static void imprimirMenu() {
		System.out.println("");
		System.out.println("--------  Calculadora  --------");
		System.out.println("1)\tSumar");
		System.out.println("2)\tRestar");
		System.out.println("3)\tMultiplicar");
		System.out.println("4)\tDividir");
		System.out.println("5)\tRaíz cuadrada");
		System.out.println("0)\tFIN");
		System.out.println("");
	}

}
