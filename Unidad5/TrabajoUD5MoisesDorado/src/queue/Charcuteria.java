package queue;

import java.util.Queue;

public class Charcuteria {

	private String nombre;
	private Queue<Cliente> colaClientes;
	
	public Charcuteria(String nombre, Queue<Cliente> colaClientes) {
		super();
		this.nombre = nombre;
		this.colaClientes = colaClientes;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Queue<Cliente> getColaClientes() {
		return colaClientes;
	}

	public void setColaClientes(Queue<Cliente> colaClientes) {
		this.colaClientes = colaClientes;
	}
	
	@Override
	public String toString() {
		return "Charcuteria [nombre=" + nombre + ", colaClientes=" + colaClientes + "]";
	}

	public void agregarCliente(Cliente c) {
        colaClientes.offer(c);
        System.out.println("Nuevo cliente en la cola: " + c.getNombre());
        System.out.println("Número de ticket: "+c.getNumTicket());
    }

    public Cliente siguienteCliente() {
        return colaClientes.poll();
    }

    public boolean hayClientes() {
        return !colaClientes.isEmpty();
    }
    
}
