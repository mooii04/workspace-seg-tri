package ejemplo02;

import java.time.LocalDate;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fechaString;
		
		do {
			try {
				System.out.println("Diga una fecha");
				fechaString = Leer.dato();
				
				LocalDate fechaPaReservar = LocalDate.parse(fechaString);
				
				if(fechaPaReservar.isBefore(LocalDate.now())) {
					throw new FechaException ("No puedes reservar antes de hoy");
				}
				Hotel h = new Hotel(fechaPaReservar);
				
				h.hacerReserva(fechaPaReservar);
				System.out.println("Reserva confirmada");
				
			}catch(FechaException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println("Introduce una fecha en el formato correcto YYYY-MM-DD");
			}
		while(fin);
		
	}

}
