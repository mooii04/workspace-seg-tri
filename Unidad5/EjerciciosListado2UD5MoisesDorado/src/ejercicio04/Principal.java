package ejercicio04;

import java.time.LocalDate;
import java.time.LocalTime;

import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Evento fc = new Evento(LocalDate.of(2024, 6, 1), LocalTime.of(21, 0));
		GestionEventos g = new GestionEventos(fc);
		
		int horas, anio;
		
		System.out.println("¿Cuántas horas antes se van a abrir las puertas?");
		horas=Leer.datoInt();
		
		System.out.println("Las puertas se abren a las "+g.calcularHoraApertura(horas));
		
		System.out.println("¿En qué año jugó tu equipo la última final?");
		
		anio=Leer.datoInt();
		
		System.out.println("Han pasado "+g.calcularTiempoDesdeLaUltimaFinal(anio)+ "años");
		
		System.out.println("Quedan "+g.calcularTiempoParaLaFinal()+" días para la final");
	
	}
}
