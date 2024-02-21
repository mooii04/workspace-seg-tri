package queue;

public class Charcuteria {

	private CrudCharcuteria cc;
	private String nombre;
	
	public Charcuteria(CrudCharcuteria cc, String nombre) {
		super();
		this.cc = cc;
		this.nombre = nombre;
	}

	public CrudCharcuteria getCc() {
		return cc;
	}

	public void setCc(CrudCharcuteria cc) {
		this.cc = cc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Charcuteria [cc=" + cc + ", nombre=" + nombre + "]";
	}
	
}
