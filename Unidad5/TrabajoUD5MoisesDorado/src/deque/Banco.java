package deque;

public class Banco {
	
    private CrudBanco cb;
    private String nombre;
    
	public Banco(CrudBanco cb, String nombre) {
		super();
		this.cb = cb;
		this.nombre = nombre;
	}

	public CrudBanco getCb() {
		return cb;
	}

	public void setCb(CrudBanco cb) {
		this.cb = cb;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Banco [cb=" + cb + ", nombre=" + nombre + "]";
	}
    
}