package ejercicio04;

import java.time.LocalDate;
import java.time.LocalTime;

public class GestionEventos {

private Evento fc;

	public GestionEventos(Evento fc) {
		super();
		this.fc = fc;
	}

	public Evento getFc() {
		return fc;
	}

	public void setFc(Evento fc) {
		this.fc = fc;
	}
	
	public LocalTime calcularHoraApertura(int horas) {
		return fc.getHora().minusHours(horas);
	}
	
	public int calcularTiempoDesdeLaUltimaFinal(int ultimaFinal) {
		return fc.getDia().getYear()-ultimaFinal;
	}
	
    public int calcularTiempoParaLaFinal() {    	
    	LocalDate hoy = LocalDate.now();
        LocalDate diaDeLaFinal = fc.getDia();
       
        return diaDeLaFinal.getDayOfYear() - hoy.getDayOfYear();
    }

}
