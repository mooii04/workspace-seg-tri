package queue;

import java.util.Iterator;
import java.util.Queue;

public class Charcuteria {

	private Queue<Cliente> colaClientes;

    public Charcuteria(Queue<Cliente> colaClientes) {
		super();
		this.colaClientes = colaClientes;
	}

	public Queue<Cliente> getColaClientes() {
		return colaClientes;
	}

	public void setColaClientes(Queue<Cliente> colaClientes) {
		this.colaClientes = colaClientes;
	}

	@Override
	public String toString() {
		return "Charcuteria [colaClientes=" + colaClientes + "]";
	}

	public void agregarCliente(Cliente cliente) {
        colaClientes.add(cliente);
        System.out.println("Cliente " + cliente.getNombre() + " ha llegado a la cola.");
    }

    public Cliente atenderCliente() {
        return colaClientes.poll();
    }

    public Cliente verProximoCliente() {
        return colaClientes.peek();
    }

    public int cantidadClientesEnCola() {
        return colaClientes.size();
    }

    public boolean hayClientesEnCola() {
        return !colaClientes.isEmpty();
    }

    //DECIRSELO A CARLOS PARA VER CUAL ES EL PROBLEMA
    public boolean contieneCliente(int numTicket) {
    	if (buscarByNumTicket(numTicket) != null) {
    		return colaClientes.contains(numTicket);	
    	} else {
    		return colaClientes.contains(false);
    	}
        
    }

    public void limpiarCola() {
        colaClientes.clear();
        System.out.println("Se ha limpiado la cola de clientes.");
    }
    
    public Cliente buscarByNumTicket(int numTicket){
    
    	for (Iterator<Cliente> iterator = colaClientes.iterator(); iterator.hasNext();) {
			Cliente cliente = (Cliente) iterator.next();
			if(cliente.getNumTicket() == numTicket) {
				return cliente;
			}
		}
    	return null;
    }
}
