package queue;

import java.util.LinkedList;
import java.util.Queue;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos una cola
        Queue<String> cola = new LinkedList<>();

        String nombre;
        int tam, suma, op;
        int uno=1;
        
        do {
        	imprimirMenu();
        	op = Leer.datoInt();
        	
        }while(op != 0);
        
        // Agregamos algunos elementos a la cola
        System.out.println("Hola buenas, bienvenido a la zona de pedidos");
        System.out.println("Para comenzar diga cuantos clientes han hecho un pedido");
        tam = Leer.datoInt();
        
        for (int i = 0; i < tam; i++) {
        	suma = uno+i;
			System.out.println("Diga el nombre del cliente nº" + suma);
			nombre = Leer.dato();
			cola.offer(nombre);
		}
        
        System.out.println(cola);
        
              
	}
	
	public static void imprimirMenu() {
		System.out.println("(1)\t=>\tNúmero de clientes");
		System.out.println("(2)\t=>\tNombre de los clientes");
		System.out.println("(3)\t=>\tLista de los clientes");
		System.out.println("(4)\t=>\tNúmero de clientes");
		System.out.println("(5)\t=>\tNúmero de clientes");
		System.out.println("(6)\t=>\tNúmero de clientes");
	}	
	
}