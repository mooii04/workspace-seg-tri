package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b, c, x;
		
		System.out.println("Diga la a de la ecuación");
		a = Leer.datoDouble();
		
		System.out.println("Diga la b de la ecuación");
		b = Leer.datoDouble();
		
		System.out.println("Diga la c de la ecuación");
		c = Leer.datoDouble();
		
		System.out.println("Diga la x de la ecuación");
		x = Leer.datoDouble();
		
		CEcuacion2grado ce = new CEcuacion2grado(a, b, c);
		
		try {
			if(a==0&&b==0){
				throw new EcuacionException("fsdbhyfs");
			}
			if((Math.sqrt(Math.pow(b, 2))-4*a*c)<0) {
				
			}
			System.out.println(ce.formulaMas(x));
		}catch(EcuacionException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
