package deque;

import java.util.Deque;
import java.util.Iterator;

public class Banco {
    private Deque<ClienteB> cola;

    public Banco(Deque<ClienteB> cola) {
		super();
		this.cola = cola;
	}
    
	public Deque<ClienteB> getCola() {
		return cola;
	}

	public void setCola(Deque<ClienteB> cola) {
		this.cola = cola;
	}

	@Override
	public String toString() {
		return "Banco [cola=" + cola + "]";
	}

	public void agregarCliente(ClienteB cliente) {
        cola.offerLast(cliente);
        System.out.println(cliente.getNombre() + " ha sido agregado a la cola del banco.");
    }

	public void agregarClienteAlFinal(ClienteB cliente) {
        cola.offerLast(cliente);
        System.out.println(cliente.getNombre() + " ha sido agregado al final de la cola del banco.");
    }
	
    public ClienteB atenderCliente() {
        if (!cola.isEmpty()) {
            return cola.pollFirst();
        } else {
            System.out.println("La cola del banco está vacía.");
            return null;
        }
    }
    
    public void mostrarCola() {
        System.out.println("Clientes en la cola del banco:");
        for (ClienteB cliente : cola) {
            System.out.println(cliente);
        }
    }

    public int obtenerNumeroClientes() {
        return cola.size();
    }
    
    public ClienteB obtenerUltimoCliente() {
        return cola.peekLast();
    }

    public void eliminarCliente(String dni) {
        if (buscarByDni(dni) != null) {
        	cola.remove(buscarByDni(dni));
            System.out.println("El cliente ha sido eliminado de la cola.");
        } else {
            System.out.println("El cliente no está en la cola.");
        }
    }
    
    public ClienteB buscarByDni(String dni){
    	
    	for (Iterator<ClienteB> iterator = cola.iterator(); iterator.hasNext();) {
			ClienteB cliente = (ClienteB) iterator.next();
			if(cliente.getDni().equalsIgnoreCase(dni)) {
				return cliente;
			}
		}
    	return null;
    }
}