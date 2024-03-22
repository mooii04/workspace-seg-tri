package ejercicio;

public class Coche {

	private int numMatricula;
	private String letrasMatricula;
	private String matricula;//1234ABC este formato
	private String nombreDuenio;
	private double precioArreglo;
	private int aniosGarantia;
	
	public Coche(int numMatricula, String letrasMatricula, String matricula, String nombreDuenio, double precioArreglo,
			int aniosGarantia) {
		super();
		this.numMatricula = numMatricula;
		this.letrasMatricula = letrasMatricula;
		this.matricula = matricula;
		this.nombreDuenio = nombreDuenio;
		this.precioArreglo = precioArreglo;
		this.aniosGarantia = aniosGarantia;
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getLetrasMatricula() {
		return letrasMatricula;
	}

	public void setLetrasMatricula(String letrasMatricula) {
		this.letrasMatricula = letrasMatricula;
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
		return "Coche [numMatricula=" + numMatricula + ", letrasMatricula=" + letrasMatricula + ", matricula="
				+ matricula + ", nombreDuenio=" + nombreDuenio + ", precioArreglo=" + precioArreglo + ", aniosGarantia="
				+ aniosGarantia + "]";
	}
	
	public void ponerMatricula() {
		matricula = numMatricula+letrasMatricula;
	}
	
}
