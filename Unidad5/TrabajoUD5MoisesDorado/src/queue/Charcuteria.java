package queue;

import java.util.Queue;
import java.util.Random;

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
    }

    public Cliente siguienteCliente() {
        return colaClientes.poll();
    }

    public boolean hayClientes() {
        return !colaClientes.isEmpty();
    }
    
    public int sacarNumeroTicket () {
    	int numTicket;
    	int desde=1, hasta=100;
    	Random rnd = new Random (System.nanoTime());
    	for (int i = 0; i < ; i++) {
			numTicket = rnd.nextInt(hasta-desde+1)+desde;
		}
    	
    	return numTicket;
    }
    
}
