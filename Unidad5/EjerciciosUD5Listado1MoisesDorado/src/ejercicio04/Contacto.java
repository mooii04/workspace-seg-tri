package ejercicio04;

public class Contacto {
	
	private String nombre;
	
	public Contacto(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + "]";
	}

}
