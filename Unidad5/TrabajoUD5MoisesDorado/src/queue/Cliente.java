package queue;

public class Cliente {

	private String nombre;
	private int numTicket; //Número del cliente cuando llega
	
	public Cliente(String nombre, int numTicket) {
		super();
		this.nombre = nombre;
		this.numTicket = numTicket;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumTicket() {
		return numTicket;
	}

	public void setNumTicket(int numTicket) {
		this.numTicket = numTicket;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", numTicket=" + numTicket + "]";
	}
	
}
