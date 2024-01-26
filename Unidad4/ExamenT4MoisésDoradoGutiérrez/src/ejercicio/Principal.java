package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculos v= new Vehiculos("1234-ABC", 3, 2004, 1);
		Vehiculos vBat= new Batmovil("5678-EFG", 2, 2010, 2, 2);
		Vehiculos vPat= new PatinesVoladores("9012-HIJ", 1, 2020, 3, 45);
		
		int tam=3;
		int op, numVehiculos, numDias;
		
		Vehiculos [] listaVeh = new Vehiculos[tam];
		
		TiendaAlquileres listaTienda = new TiendaAlquileres(listaVeh);		
		
		listaVeh[0] = v;
		listaVeh[1] = vBat;
		listaVeh[2] = vPat;
		
		do {
			System.out.println();
			imprimirMenu();
			op=Leer.datoInt();
			
			switch(op){
				case 1:
					System.out.println("¿Qué vehículo quiere calcular el alquiler? Diga el nuúmero del vehículo");
					numVehiculos = Leer.datoInt();
					
					System.out.printf("El precio es de: %.2f€",listaTienda.calcularAlquiler(v));
				break;
				
				case 2:
					System.out.println("Aquí tiene la lista de todos los Vehículos");
					listaTienda.mostrarListado(tam);
				break;
				
				case 3:
					System.out.printf("Se ha podido recaudar un total de: %.2f€",listaTienda.calcularTotalRecaudado(v));
				break;
				case 4:
					System.out.printf("Se ha podido recaudar en la parte de Batmóviles un total de: %.2f€",listaTienda.calcularTotalRecaudadoBatmovil(vBat));
				break;
				
				case 5:
					System.out.println("¿Qué vehículo quiere calcular el alquiler? Diga el nuúmero del vehículo");
					numVehiculos = Leer.datoInt();
					
					System.out.println("¿Cuántos días se va?");
					numDias = Leer.datoInt();
					
					System.out.printf("El precio es de: %.2f€",listaTienda.calcularAlquilerDias(v, numVehiculos, numDias));
				break;
				
				case 0:
					System.out.println("Hasta pronto");
				break;
				
				default:
					System.out.println("Número no comentado anteriormente");
				break;
			}
			
		}while(op!=0);
		
	}
	
	public static void imprimirMenu() {
		System.out.println("(1) Calcular el alquiler del vehículo que usted quiera");
		System.out.println("(2) Mostrar el listado de vehículos");
		System.out.println("(3) Calcular el total recaudado");
		System.out.println("(4) Calcular el total recaudado de Batmóviles");
		System.out.println("(5) Calcular el alquiler del vehículo que usted quiera los días que necesite");
		System.out.println("(0) Salir del programa");
	}

}
