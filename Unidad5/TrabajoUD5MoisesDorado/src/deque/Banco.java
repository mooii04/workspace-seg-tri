package deque;

import java.util.Deque;

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
}