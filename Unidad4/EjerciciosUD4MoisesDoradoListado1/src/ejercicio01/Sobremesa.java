package ejercicio01;

public class Sobremesa extends Ordenador{
	
	private double precioMontaje;

	public Sobremesa(double discoDuro, double frecuenciaProcesador, double precioBase, String marca, int id,
			double precioMontaje) {
		super(discoDuro, frecuenciaProcesador, precioBase, marca, id);
		this.precioMontaje = precioMontaje;
	}

	public double getPrecioMontaje() {
		return precioMontaje;
	}

	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}

	public double calcularPVP (double porcentaje) {
		return super.calcularPVP(porcentaje)+precioMontaje;
	}
	
}
