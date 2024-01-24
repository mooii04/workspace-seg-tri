package ejemplo01;

public class Trabajador {

	private String nombre;
	private String puesto;
	private String dni;
	
	public Trabajador(String nombre, String puesto, String dni) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
		this.dni = dni;
	}

	public Trabajador(String dni) {
		super();
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + ", dni=" + dni + "]";
	}
	
	public double calcularPaga() {
		return 0.0;
	}
	
	public double calcularPagaV2(double fijo) { //Esto no es lo de ayer
		return fijo;
	}
	
	//Ejemplo para ver un método ahí
	public void darDeBaja() {
		puesto="baja";
	}
	
}
