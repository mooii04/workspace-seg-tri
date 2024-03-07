package ejercicio;

import java.time.LocalDate;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate hoy = LocalDate.now();
		
		LocalDate ayer = LocalDate.of(2024, 03, 06);
		
		LocalDate fecha = LocalDate.of(0, 0, 0);
		
		String fechaV2;
		
		System.out.println("Indique la fecha del tren (año-mes-día):");
		fechaV2 = Leer.dato();
		fecha = LocalDate.parse(fechaV2);
		
		System.out.println(hoy);
		
		System.out.println(ayer);
		
		
		
	}

}
