package ejemploMap2;

public class Alumno {

	private int id;
	private String nombre;
	private double notaMedia;
	
	public Alumno(int id, String nombre, double notaMedia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", notaMedia=" + notaMedia + "]";
	}
	
}
