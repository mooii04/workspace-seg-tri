package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numMatricula=0;
		String letrasMatricula="";
		String matricula="";//1234ABC este formato
		double precioArreglo=0;
		int aniosAntiguo;
		boolean fin=false;
		
		Coche c = new Coche (numMatricula, letrasMatricula, matricula, "Manolo", precioArreglo, 4);
		
		do {
	
			try {
				System.out.println("Cuánto cuesta el arreglo");
				precioArreglo = Leer.datoInt();
				c.setPrecioArreglo(precioArreglo);
				
				if(c.getPrecioArreglo() < 0) {
					throw new CocheException("El arreglo no puede ser negativo");
				}
				
				System.out.println("Cuánto tiempo tiene el coche");
				aniosAntiguo = Leer.datoInt();
				
				if(c.getAniosGarantia() < aniosAntiguo) {
					throw new CocheException("Su coche ya ha pasado la garantía");
				}
				
				System.out.println("Diga los números de la matrícula del coche por favor");
				numMatricula = Leer.datoInt();
				c.setNumMatricula(numMatricula);
				
				if (c.getNumMatricula() < 0 && c.getNumMatricula() > 9999) {
					throw new CocheException("Los números de la matrícula son 4, dicho formato 1111");
				}
				
				System.out.println("Diga las letras de la matrícula del coche por favor");
				letrasMatricula = Leer.dato();
				c.setLetrasMatricula(letrasMatricula);
				
				if(c.getLetrasMatricula().length() < 3 && c.getLetrasMatricula().length() > 3) {
					throw new CocheException("Las letras de la matrícula son 3, dicho formato XXXX");
				}
				
				fin = true;
						
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
	
		}while(!fin);
		
	}

}
