package ejercicio;

public class Coche {

	private String matricula;//1234ABC este formato
	private String nombreDuenio;
	private double precioArreglo;
	private int aniosGarantia;
	
	public Coche(String matricula, String nombreDuenio, double precioArreglo, int aniosGarantia) {
		super();
		this.matricula = matricula;
		this.nombreDuenio = nombreDuenio;
		this.precioArreglo = precioArreglo;
		this.aniosGarantia = aniosGarantia;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombreDuenio() {
		return nombreDuenio;
	}

	public void setNombreDuenio(String nombreDuenio) {
		this.nombreDuenio = nombreDuenio;
	}

	public double getPrecioArreglo() {
		return precioArreglo;
	}

	public void setPrecioArreglo(double precioArreglo) {
		this.precioArreglo = precioArreglo;
	}

	public int getAniosGarantia() {
		return aniosGarantia;
	}

	public void setAniosGarantia(int aniosGarantia) {
		this.aniosGarantia = aniosGarantia;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", nombreDuenio=" + nombreDuenio + ", precioArreglo=" + precioArreglo
				+ ", aniosGarantia=" + aniosGarantia + "]";
	}
	
}
