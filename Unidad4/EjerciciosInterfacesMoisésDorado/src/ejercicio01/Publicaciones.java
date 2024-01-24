package ejercicio01;

public abstract class Publicaciones {
	
	private boolean prestado;
	private String nombre;
	private String autor;
	private int anioPublicacion;
	
	public Publicaciones(boolean prestado, String nombre, String autor, int anioPublicacion) {
		super();
		this.prestado = prestado;
		this.nombre = nombre;
		this.autor = autor;
		this.anioPublicacion=anioPublicacion;
	}
	
	public boolean isPrestado() {
		return prestado;
	}
	
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
}
