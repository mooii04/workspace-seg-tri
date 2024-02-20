package deque;

import java.util.Deque;
import java.util.Iterator;

public class Banco {
    private Deque<Cliente> cola;

    public Banco(Deque<Cliente> cola) {
		super();
		this.cola = cola;
	}
    
	public Deque<Cliente> getCola() {
		return cola;
	}

	public void setCola(Deque<Cliente> cola) {
		this.cola = cola;
	}

	@Override
	public String toString() {
		return "Banco [cola=" + cola + "]";
	}

	public void agregarCliente(Cliente cliente) {
        cola.offerLast(cliente);
        System.out.println(cliente.getNombre() + " ha sido agregado a la cola del banco.");
    }

	public void agregarClienteAlFinal(Cliente cliente) {
        cola.offerLast(cliente);
        System.out.println(cliente.getNombre() + " ha sido agregado al final de la cola del banco.");
    }
	
    public Cliente atenderCliente() {
        if (!cola.isEmpty()) {
            return cola.pollFirst();
        } else {
            System.out.println("La cola del banco está vacía.");
            return null;
        }
    }
    
    public void mostrarCola() {
        System.out.println("Clientes en la cola del banco:");
        for (Cliente cliente : cola) {
            System.out.println(cliente);
        }
    }

    public int obtenerNumeroClientes() {
        return cola.size();
    }
    
    public Cliente obtenerUltimoCliente() {
        return cola.peekLast();
    }

    public void eliminarCliente(Cliente cliente) {
        if (cola.remove(cliente)) {
            System.out.println("El cliente " + cliente.getNombre() + " ha sido eliminado de la cola.");
        } else {
            System.out.println("El cliente no está en la cola.");
        }
    }
    
    public Cliente findByDni(String dni){
    	
    	for (Iterator<Cliente> iterator = cola.iterator(); iterator.hasNext();) {
			Cliente cliente = (Cliente) iterator.next();
			if(cliente.getDni().equalsIgnoreCase(dni)) {
				return cliente;
			}
		}
    	return null;
    }
}