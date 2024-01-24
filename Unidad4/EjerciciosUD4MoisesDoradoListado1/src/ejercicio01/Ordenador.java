package ejercicio01;

public class Ordenador {

	private double discoDuro;
	private double frecuenciaProcesador;
	private double precioBase;
	private String marca;
	private int id;
	
	public Ordenador(double discoDuro, double frecuenciaProcesador, double precioBase, String marca, int id) {
		super();
		this.discoDuro = discoDuro;
		this.frecuenciaProcesador = frecuenciaProcesador;
		this.precioBase = precioBase;
		this.marca = marca;
		this.id = id;
	}

	public double getDiscoDuro() {
		return discoDuro;
	}

	public void setDiscoDuro(double discoDuro) {
		this.discoDuro = discoDuro;
	}

	public double getFrecuenciaProcesador() {
		return frecuenciaProcesador;
	}

	public void setFrecuenciaProcesador(double frecuenciaProcesador) {
		this.frecuenciaProcesador = frecuenciaProcesador;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ordenador [discoDuro=" + discoDuro + ", frecuenciaProcesador=" + frecuenciaProcesador + ", precioBase="
				+ precioBase + ", marca=" + marca + ", id=" + id + "]";
	}	
	
	public double calcularPVP (double porcentaje) {
		double cien=100;
		double precioPVP;
		
		precioPVP = precioBase+precioBase*porcentaje/cien;
		
		return precioPVP;
	}
	
}