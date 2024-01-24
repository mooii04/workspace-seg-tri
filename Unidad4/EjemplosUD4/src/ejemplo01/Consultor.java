package ejemplo01;

public class Consultor extends Trabajador {

	private int horas;
	private double tarifa;
	
	public Consultor(String nombre, String puesto, String dni, int horas, double tarifa) {
		super(nombre, puesto, dni);//Llamada al constructor de la clase madre "Trabajador"
		this.horas = horas;
		this.tarifa = tarifa;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public String toString() {
		return "Consultor [horas=" + horas + ", tarifa=" + tarifa + "]";
	}
	
	public double calcularPaga () {
		return horas*tarifa;
	}
	
	public double calcularPagaV2 (double fijo) {
		return super.calcularPagaV2(fijo)+tarifa*horas;
	}
	
	public void avisarExtras() {
		if (horas>40) {
			System.out.println("Ha pasado lo permitido");
		}
	}
	
}
