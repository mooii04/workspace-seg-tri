package deque;

import java.util.ArrayDeque;
import java.util.Deque;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque <Cliente> colaBanco = new ArrayDeque <Cliente>();
		
		Banco b = new Banco(colaBanco);

        int op, numClientes;
        String nombreCliente, nombreClienteFinal, nombreClienteRemover;
        
        do {
            imprimirMenu();
            op = Leer.datoInt();

            switch (op) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    nombreCliente = Leer.dato();
                    b.agregarCliente(new Cliente(nombreCliente));
                break;
                
                case 2:
                    System.out.print("Ingrese el nombre del cliente: ");
                    nombreClienteFinal = Leer.dato();
                    b.agregarClienteAlFinal(new Cliente(nombreClienteFinal));
                break;
                
                case 3:
                	Cliente clienteAtendido = b.atenderCliente();
                    if (clienteAtendido != null) {
                        System.out.println("Ha sido atendido el cliente: " + clienteAtendido.getNombre());
                    }
                break;
             
                case 4:
                	b.mostrarCola();
                break;
                
                case 5:
                	numClientes = b.obtenerNumeroClientes();
                    System.out.println("Número de clientes en la cola: " + numClientes);
                break;
                
                case 6:
                    System.out.print("Ingrese el nombre del cliente a remover: ");
                    nombreClienteRemover = Leer.dato();
                    b.removerCliente(new Cliente(nombreClienteRemover));
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
        System.out.println("(1) Agregar cliente a la cola");
        System.out.println("(2) Agregar cliente al final de la cola");
        System.out.println("(3) Atender cliente");
        System.out.println("(4) Mostrar cola de clientes");
        System.out.println("(5) Mostrar número de clientes en la cola");
        System.out.println("(6) Remover un cliente de la cola");
        System.out.println("(0) Salir");
        System.out.print("Ingrese su opción: ");
	}
	
}