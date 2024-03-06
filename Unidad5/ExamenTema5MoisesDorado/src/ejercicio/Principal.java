package ejercicio;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Jugador> lista = new ArrayList <Jugador>();
		
		Equipo e= new Equipo (lista, "OsasunaNuncaSeRinde FC");
		
		int op;
		int numCamiseta;
		String posicion;
		
		lista.add(new Jugador ("Moisés", "Defensa", 2, 4, true));
		lista.add(new Jugador ("Bruno", "Delantero", 7, 10, true));
		lista.add(new Jugador ("Manuel", "Portero", 1, 0, true));
		lista.add(new Jugador ("Carlos", "Medio", 6, 8, true));
		lista.add(new Jugador ("Joaquin", "Defensa", 3, 1, true));
		lista.add(new Jugador ("Fran", "Medio", 8, 3, true));
		lista.add(new Jugador ("Joseca", "Defensa", 4, 0, true));
		
		do {
			imprimirMenu();
			op = Leer.datoInt();
		
			switch(op) {
				case 1:
					//NO he conseguido que muestre todos los jugadores, solo uno :(
					System.out.println(e.buscarPorGoles());
					break;
					
				case 2:
					System.out.println("Diga el número de la camiseta del jugador que desea buscar");
					numCamiseta = Leer.datoInt();
					
					if(e.buscarPorNumCamiseta(numCamiseta) == null) {
						System.out.println("Jugador no encontrado");
					}else {
						System.out.println(e.buscarPorNumCamiseta(numCamiseta));
					}
					break;
					
				case 3:
					System.out.printf("La media de goles del equipo es de: %.2f\n", e.calcularMediaGoles());
					break;
					
				case 4:
					System.out.println("Diga el número de la camiseta del jugador que desea cambiar la posición");
					numCamiseta = Leer.datoInt();
					
					System.out.println("Ahora diga la nueva posición del jugador");
					System.out.println("Recuerde:  Portero  -  Defensa  -  Medio  -  Delantero");
					posicion = Leer.dato();
					
					e.modificarPosicion(numCamiseta, posicion);
					break;
					
				case 5:
					e.mostrarLista();
					break;
					
				case 6:
					e.ordenaPorPosicion();
					break;
				
				case 7:
					e.ordenaPorNumGoles();
					break;
					
				case 0:
					System.out.println("Gracias por usar nuestro sistema de equipo");
					break;
					
				default:
					System.out.println("Número no comentado anteriormente");
					break;
			}
			
		}while(op != 0);
	}
	
	public static void imprimirMenu() {
		System.out.println("********************************************************");
		System.out.println("-------- OsasunaNuncaSeRinde FC --------");
		System.out.println("(1)\tVer los jugador que no han anotado");
		System.out.println("(2)\tBuscar jugador por dorsal");
		System.out.println("(3)\tCalcular la media de goles del equipo");
		System.out.println("(4)\tModificar posición");
		System.out.println("(5)\tVer la lista de jugadores");
		System.out.println("(6)\tOrdenar la lista por posición");
		System.out.println("(7)\tOrdenar la lista por los goles anotados");
		System.out.println("(0)\tSalir del sistema");
		System.out.println("********************************************************");
	}

}
