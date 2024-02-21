package deque;

import java.util.ArrayDeque;
import java.util.Deque;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ENUNCIADO DEL EJERCICIO
		 * El programa gestiona una cola de
		 * clientes para el banco "Hardcore Pawn".
		 * Permite agregar clientes al principio o
		 * al final de la cola, atender al próximo
		 * cliente, mostrar la cola de clientes,
		 * mostrar el número total de clientes en
		 * espera y eliminar un cliente de la cola
		 * por su número de identificación. Los
		 * usuarios interactúan con el sistema a
		 * través de un menú interactivo.
		 */
		
		Deque <ClienteB> colaBanco = new ArrayDeque <ClienteB>();
		
		CrudBanco cb = new CrudBanco(colaBanco);

		Banco b = new Banco (cb, "Hardcore Pawn");
		
        int op, numClientes;
        String nombreCliente, nombreClienteFinal, dniCliente;
        
        System.out.print("Bienvenidos a: " + b.getNombre());
   
        do {
            imprimirMenu();
            op = Leer.datoInt();

            switch (op) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    nombreCliente = Leer.dato();
                    
                    System.out.print("Ingrese el dni del cliente: ");
                    dniCliente = Leer.dato();
                    
                    cb.agregarCliente(new ClienteB(nombreCliente, dniCliente));
                break;
                
                case 2:
                    System.out.print("Ingrese el nombre del cliente: ");
                    nombreClienteFinal = Leer.dato();
                    
                    System.out.print("Ingrese el dni del cliente: ");
                    dniCliente = Leer.dato();
                    
                    cb.agregarClienteAlFinal(new ClienteB(nombreClienteFinal,dniCliente));
                break;
                
                case 3:
                	ClienteB clienteAtendido = cb.atenderCliente();
                	
                    if (clienteAtendido != null) {
                        System.out.println("Ha sido atendido el cliente: " + clienteAtendido.getNombre());
                    } else {
                    	System.out.println("La cola del banco está vacía.");
                    }
                break;
             
                case 4:
                	System.out.println("Clientes en la cola del banco:");
                	cb.mostrarCola();
                break;
                
                case 5:
                	numClientes = cb.obtenerNumeroClientes();
                    System.out.println("Número de clientes en la cola: " + numClientes);
                break;
                
                case 6:
                    System.out.print("Ingrese el dni del cliente a eliminar: ");
                    dniCliente = Leer.dato();
                    
                    if (cb.buscarByDni(dniCliente) != null) {
                        System.out.println("El cliente ha sido eliminado de la cola.");
                    } else {
                        System.out.println("El cliente no está en la cola.");
                    }
                break;
                
                case 0:
                    System.out.println("Saliendo del sistema de gestión de cola del banco...");
                break;
                
                default:
                    System.out.println("Opción no válida. Por favor, intentelo de nuevo");
            }
        } while (op != 0);

    }
	
	public static void imprimirMenu() {
		System.out.println("\n===== Menú de Banco =====");
        System.out.println("(1) Agregar cliente al principio de la cola");
        System.out.println("(2) Agregar cliente al final de la cola");
        System.out.println("(3) Atender cliente");
        System.out.println("(4) Mostrar cola de clientes");
        System.out.println("(5) Mostrar número de clientes en la cola");
        System.out.println("(6) Eliminar un cliente de la cola");
        System.out.println("(0) Salir");
        System.out.print("Ingrese su opción: ");
	}
	
}