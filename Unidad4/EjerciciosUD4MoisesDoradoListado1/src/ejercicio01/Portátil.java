package ejercicio01;

public class Portátil extends Ordenador{
	
	private boolean seguro;
	private double precioSeguro;
	
	public Portátil(double discoDuro, double frecuenciaProcesador, double precioBase, String marca, int id,
			boolean seguro, double precioSeguro) {
		super(discoDuro, frecuenciaProcesador, precioBase, marca, id);
		this.seguro = seguro;
		this.precioSeguro = precioSeguro;
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}

	public double getPrecioSeguro() {
		return precioSeguro;
	}

	public void setPrecioSeguro(double precioSeguro) {
		this.precioSeguro = precioSeguro;
	}

	@Override
	public String toString() {
		return "Portátil [seguro=" + seguro + ", precioSeguro=" + precioSeguro + "]";
	}
	
	public double calcularPVP (double porcentaje) {
		if (seguro = true) {
			return super.calcularPVP(porcentaje)+precioSeguro;
		} else {
			return super.calcularPVP(porcentaje);
		}
	}
	
}
