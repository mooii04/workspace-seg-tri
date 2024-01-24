package examen;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int opcion;
		String direccion;
		int metrosCuadrados;
		double precioVenta;
		int estado; //1. nuevo - 2. seminuevo - 3. reformar
		int numPiso=0;
		int numVendedores=0;
		int tam;
		int id=0;
		double ganancia;
		double nuevoPrecio;
		
		Piso p;
		
		System.out.println("¿Cuántos pisos hay?");
		tam = Leer.datoInt();
		
		Piso [] lista= new Piso[tam];
		
		Inmobiliaria i= new Inmobiliaria(lista, numVendedores, numPiso);
		
		do {
			imprimirMenu();
			opcion = Leer.datoInt();
			
			switch(opcion) {
				case 1:
					System.out.println("Diga la dirección del piso");
					direccion = Leer.dato();
					
					System.out.println("Diga los metros cuadrados que tiene (SIN decimales)");
					metrosCuadrados = Leer.datoInt();
					
					System.out.println("Diga el precio de la venta");
					precioVenta = Leer.datoDouble();
					
					System.out.println("Diga en que estado se encuentra"
							+ "\n\t(1)\tNuevo"
							+ "\n\t(2)\tSeminuevo"
							+ "\n\t(1)\tReformar");
					estado = Leer.datoInt();
					
					id++;
					
					p = new Piso(direccion, metrosCuadrados, precioVenta, estado, id);
					i.agregar(p);
				break;
				
				case 2:
					System.out.println("Diga el ID del piso para ver el precio final de venta");
					id = Leer.datoInt();
					
					System.out.println("Diga la ganancia del dueño");
					ganancia = Leer.datoDouble();
					
					System.out.printf("El precio final de venta es de: %.2f€\n", i.calcularPrecioFinalVenta(ganancia, id));
				break;
				
				case 3:
					System.out.println("Diga el estado de los pisos que quieres ver");
					estado = Leer.datoInt();
					
					i.mostrarListaPisos(i.buscarByEstado(estado));
				break;
				
				case 4:
					System.out.println("Diga el id del piso para cambiar el precio");
					id = Leer.datoInt();
					
					System.out.println("Diga el precio nuevo para establecerlo");
					nuevoPrecio = Leer.datoDouble();
					
					//Intentarlo por el busar que busca por un producto en este caso un Piso
					i.modificarPrecioPiso(nuevoPrecio, i.buscarByIdV2(id));
				break;
				
				case 5:
					
				break;
			}
			
			
		}while(opcion != 0);
		
		
	}

	public static void imprimirMenu() {
		System.out.println("(1) Agregar nuevo piso");
		System.out.println("(2) Calcular precio final de venta");
		System.out.println("(3) Ver los pisos según su estado");
		System.out.println("(4) Modificar precio de venta por uno nuevo");
	}
	
}
