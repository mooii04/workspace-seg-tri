package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Probando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> cola = new LinkedList<>();

        // Agregamos algunos elementos a la cola
        cola.offer("Manzana");
        cola.offer("Banana");
        cola.offer("Naranja");

        // Mostramos el contenido de la cola y su tamaño
        System.out.println("Contenido de la cola:");
        for (String elemento : cola) {
            System.out.println("Elemento: " + elemento);
            System.out.println("Tamaño de la cola: " + cola.size());
        }

        // Verificamos si la cola está vacía
        System.out.println("¿La cola está vacía? " + cola.isEmpty());

        // Agregamos más elementos a la cola
        cola.offer("Perro");
        cola.offer("Gato");
        cola.offer("Pájaro");

        // Mostramos el primer elemento sin eliminarlo
        System.out.println("Primer elemento de la cola: " + cola.peek());

	}

}
