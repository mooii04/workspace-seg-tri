package ejercicio02;

public class Socio {

	private String dni;
	private String nombre;
	private String apellidos;
	private double cuota;
	
	public Socio(String dni, String nombre, String apellidos, double cuota) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cuota = cuota;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	@Override
	public String toString() {
		return "Socio [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", cuota=" + cuota + "]";
	}
	
	
	
	
}
