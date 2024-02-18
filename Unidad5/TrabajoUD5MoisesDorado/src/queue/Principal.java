package queue;

import java.util.LinkedList;
import java.util.Queue;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue <Cliente> colaCliente = new LinkedList <Cliente>();
		
		Charcuteria charcuteria = new Charcuteria(colaCliente);
        int op;
        String nombreCliente;
        String nombreLocal = "Chorizos Familia";
        
        System.out.println("Bienvenidos al sistema de la charcutería ["+nombreLocal+"]");
        
        do{
            imprimirMenu();
        	op = Leer.datoInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre del cliente:");
                    nombreCliente = Leer.dato();
                    charcuteria.agregarCliente(new Cliente(nombreCliente));
                break;
                
                case 2:
                    if (charcuteria.hayClientesEnCola()) {
                        Cliente clienteAtendido = charcuteria.atenderCliente();
                        System.out.println("Atendiendo a " + clienteAtendido.getNombre());
                    } else {
                        System.out.println("No hay clientes en la cola");
                    }
                break;
                
                case 3:
                    if (charcuteria.hayClientesEnCola()) {
                        Cliente proximoCliente = charcuteria.verProximoCliente();
                        System.out.println("El próximo cliente en la cola es: " + proximoCliente.getNombre());
                    } else {
                        System.out.println("No hay clientes en la cola");
                    }
                break;
                
                case 0:
                	System.out.println("Gracias por utilizar el sistema de la charcutería ["+nombreLocal+"]!!!");
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
        System.out.println("(0) Salir");
	}
	
}
