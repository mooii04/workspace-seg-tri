package queue;

import java.util.LinkedList;
import java.util.Queue;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ENUNCIADO DEL EJERCICIO
		 * El programa gestiona una cola de clientes
		 * para la charcutería "Chorizos Familia".
		 * Permite agregar clientes a la cola, atender
		 * al próximo cliente, ver la cantidad de clientes
		 * en espera, buscar un cliente por su número de
		 * ticket y limpiar la cola. Los empleados
		 * interactúan con el sistema a través de
		 * un menú interactivo.
		 */
		
		Queue <Cliente> colaCliente = new LinkedList <Cliente>();
		
		CrudCharcuteria cc = new CrudCharcuteria (colaCliente);
		
		Charcuteria c = new Charcuteria(cc, "Chorizos Familia");
		
        int op, cantClientes, numTicket;
        String nombreCliente;
        
        System.out.println("Bienvenidos al sistema de la charcutería ["+ c.getNombre() +"]");
        
        do{
            imprimirMenu();
        	op = Leer.datoInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre del cliente:");
                    nombreCliente = Leer.dato();
                    
                    System.out.println("Ingrese el número del ticket");
                    numTicket = Leer.datoInt();
                    
                    cc.agregarCliente(new Cliente(nombreCliente, numTicket));
                break;
                
                case 2:
                    if (cc.hayClientesEnCola()) {
                        Cliente clienteAtendido = cc.atenderCliente();
                        System.out.println("Atendiendo a " + clienteAtendido.getNombre());
                    } else {
                        System.out.println("No hay clientes en la cola");
                    }
                break;
                
                case 3:
                    if (cc.hayClientesEnCola()) {
                        Cliente proximoCliente = cc.verProximoCliente();
                        System.out.println("El próximo cliente en la cola es: " + proximoCliente.getNombre());
                    } else {
                        System.out.println("No hay clientes en la cola");
                    }
                break;
                
                case 4:
                	cantClientes = cc.cantidadClientesEnCola();
                	
                    System.out.println("Cantidad de clientes en cola: " + cantClientes);
                break;
                
                case 5:
                	System.out.println("Ingrese el número del ticket para ver si está en la cola:");
                    numTicket = Leer.datoInt();
                  
                    if (cc.buscarByNumTicket(numTicket) != null) {
                		System.out.println("El cliente se encuentra en la cola");
                	} else {
                		System.out.println("El cliente no se encuentra en la cola");
                	}
                break;
                
                case 6:
                	cc.limpiarCola();
                	System.out.println("Se ha limpiado la cola de clientes.");
                break;
                
                case 0:
                	System.out.println("Gracias por utilizar el sistema de la charcutería ["+ c.getNombre() +"]!!!");
                break;
                
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una nueva opción :)");
            }
        }while(op != 0);
        
	}
	
	public static void imprimirMenu () {
		System.out.println("\n===== Menú de Charcutería =====");
        System.out.println("(1) Agregar cliente a la cola");
        System.out.println("(2) Atender cliente");
        System.out.println("(3) Ver próximo cliente");
        System.out.println("(4) Cantidad de clientes en cola");
        System.out.println("(5) Ver si un cliente está en cola");
        System.out.println("(6) Limpiar la cola");
        System.out.println("(0) Salir");
	}
	
}
