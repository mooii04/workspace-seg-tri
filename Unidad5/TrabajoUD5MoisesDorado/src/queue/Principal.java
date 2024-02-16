package queue;

import java.util.LinkedList;
import java.util.Queue;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Cliente> colaCliente = new LinkedList<Cliente>();

		Charcuteria charc = new Charcuteria("Chorizos la familia", colaCliente);
		
		int op, numTicket;
		String nombre;

		do {
			imprimirMenu();
			op = Leer.datoInt();
			
			switch (op) {
				case 1:
					System.out.println("Inserte el nombre del cliente");
					nombre = Leer.dato();
					
					System.out.println("Diga el número del ticket");
					numTicket = Leer.datoInt();
					
					Cliente c = new Cliente (nombre, numTicket);
					
					charc.agregarCliente(c);
				break;
				
				case 2: //mirar esto bien, pq no está muy bien
					System.out.println("Clientes que tienen que ser atendidos:");
				    while (charc.hayClientes()) {
				    	Cliente cliente = charc.siguienteCliente();
				        System.out.println(cliente.getNombre());
				        System.out.println("Turno de: "+cliente.getNombre());
				    }
				break;
				
				case 3:
					
				break;
				
				case 0:
					System.out.println("Un día más en la Charcuteria: "+charc.getNombre()+"\nNos vemos mañana con más ganas");
				break;
				
				default:
					System.out.println("Inserte un número comentado anteriormente");
				break;
			}
			
		}while (op != 0);
		
		
	    // Agregar clientes a la cola
		charc.agregarCliente(new Cliente("Juan", 1));
		charc.agregarCliente(new Cliente("Maria", 2));
		charc.agregarCliente(new Cliente("Pedro", 3));

		System.out.println(charc.siguienteCliente());
		
		System.out.println(charc.siguienteCliente());
		
		System.out.println(charc.siguienteCliente());
		
	    // Atender clientes
	    System.out.println("Clientes que tienen que ser atendidos:");
	    while (charc.hayClientes()) {
	    	Cliente cliente = charc.siguienteCliente();
	        System.out.println("Atendiendo a: " + cliente.getNombre());
	    }
	    
	}
	
	public static void imprimirMenu () {
		System.out.println("Pulse lo que desee");
		System.out.println("(1)\tAgregar clientes a la cola");
		System.out.println("(2)\tVer cola de clientes y a quien le toca");
		System.out.println("(3)\t...");
		System.out.println("(0)\tCerrar Charcutería");
	}
}
