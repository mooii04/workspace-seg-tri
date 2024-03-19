package ejemplo02;

import java.time.LocalDate;

public class Hotel {

	private LocalDate fechaReserva;
	
	public Hotel(LocalDate fechaReserva) {
		super();
		this.fechaReserva = fechaReserva;
	}

	public Hotel() {
		
	}
	
	public LocalDate getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(LocalDate fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	@Override
	public String toString() {
		return "Hotel [fechaReserva=" + fechaReserva + "]";
	}

	public void hacerReserva(LocalDate fechaReservaSolicitada) {
		fechaReserva = fechaReservaSolicitada;
	}
	
}
