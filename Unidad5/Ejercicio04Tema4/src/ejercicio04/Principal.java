package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam=3;
		int op;
		
		Producto p1 = new Alimentacion ("Patatas Deluxe", 1, 4.99, 30, true);
		Producto p2 = new Alimentacion ("Aceite 3L", 2, 9.99, 10, false);
		Producto p3 = new Electronica ("Teclado", 3, 19.99, 10);
		
		LineaDeVenta ldv1 = new LineaDeVenta (p1, 2);
		LineaDeVenta ldv2 = new LineaDeVenta (p2, 8);
		LineaDeVenta ldv3 = new LineaDeVenta (p3, 1);
		
		LineaDeVenta[] listado = new LineaDeVenta[tam];
		
		listado[0] = ldv1;
		
		listado[1] = ldv2;
		
		listado[2] = ldv3;
		
		Venta v = new Venta(listado);
		
		do {
			System.out.println("(1) Imprimir Ticket");
			System.out.println("(2) Ver Productos");
			System.out.println("(0) Fin Programa");
			op=Leer.datoInt();
			
			switch(op) {
			case 1:
				v.mostrarTicket();
			break;
			
			case 2:
				v.mostrarProductosGuardados();
			break;
			
			case 0:
				System.out.println("Gracias por confiar en nosotros");
			break;
			
			default:
				System.out.println("Número no comentado anteriormente");
				System.out.println("Por favor, pulse otro");
			break;				
			}
			
		}while(op!=0);
		
	}

}
