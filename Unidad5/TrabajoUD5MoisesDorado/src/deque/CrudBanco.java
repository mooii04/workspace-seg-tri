package deque;

import java.util.Deque;
import java.util.Iterator;

public class CrudBanco {

	private Deque <ClienteB> cola;

	public CrudBanco(Deque<ClienteB> cola) {
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
		return "CrudBanco [cola=" + cola + "]";
	}
	
	public void agregarCliente(ClienteB cliente) {
        cola.offerFirst(cliente);
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
            return null;
        }
    }
    
    public void mostrarCola() {
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

    public boolean eliminarCliente(String dni) {
        	return cola.remove(buscarByDni(dni));    
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
