package repasoud3completo;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op=0;
		int id=0, idLeido;
		String nombre;
		double precioFabrica, ganancia, nuevoPrecio, descuento;
		int seccion;
		boolean enVenta;
		int lecturaVenta=0;
		int numProducto=0;
		int numTrabajadores=3;
		int tam=10;
		
		Producto p;
		Producto prod = new Producto();
		
		//Productos de prueba
		
		Producto [] listado= new Producto[tam];
		Tienda t=new Tienda(listado, numProducto, numTrabajadores);
		
		Producto p3= new Producto ("Pantalón", 30.5, 3, true, 1);
		Producto p4= new Producto ("Camiseta", 12.99, 3, true, 2);
		Producto p5= new Producto ("Ordenador", 1299.95, 2, true, 3);
		Producto p6= new Producto ("Teclado", 29.50, 2, true, 4);
		
		t.agregar(p3);
		t.agregar(p4);
		t.agregar(p5);
		t.agregar(p6);
		id = 5;
		
		System.out.println("Hola, gestionamos productos");
		
		do {
			System.out.println("1. Para agregar nuevo productos");
			System.out.println("2. Para mostrar toda la lista");
			System.out.println("3. Para buscar por sección");
			System.out.println("4. Para buscar por id");
			System.out.println("5. Para calcular precio de venta al público");
			System.out.println("6. Para modificar precio de fábrica de una sección");
			System.out.println("7. Para calcular descuento del producto");
			System.out.println("8. Para borrar sección");
			System.out.println("9. Para mostrar solo los activos");
			op = Leer.datoInt();
			switch(op){
				case 0:
					System.out.println("Vuelva pronto, le esperamos");
				break;
				
				case 1:
					System.out.println("Diga nombre del producto");
					nombre = Leer.dato();
				
					System.out.println("Diga precio de fábrica del producto");
					precioFabrica = Leer.datoDouble();
					
					System.out.println("Diga sección del producto"
							+ " 1 alimentación, 2 electrónica, 3 ropa");
					seccion = Leer.datoInt();
					
					System.out.println("Diga si está en venta: 1 SÍ, cualquier otro número NO");
					lecturaVenta = Leer.datoInt();
					
					if(lecturaVenta==1) {
						enVenta=true;
					}else {
						enVenta=false;
					}
					
					//Dos formas
					//a) Creando el produco antes
					p=new Producto(nombre, precioFabrica, seccion, enVenta, id);
					t.agregar(p);
					id++;
					
					//b) Instanciando directamente el producto
					//t.agregar (new Producto(nombre, precioFabrica, seccion, enVenta));
				break;
				
				case 2:
					t.mostrarProductos();
				break;
				
				case 3:
					System.out.println("Diga sección a ver");
					seccion = Leer.datoInt();
					
					t.mostrarLista(t.buscarBySeccion(seccion));
				break;
				
				case 4:
					System.out.println("Diga el id");
					idLeido = Leer.datoInt();
					prod=t.buscarByIdV2(idLeido);
					
					if (prod==null) {
						System.out.println("Producto no encontrado");
					} else {
						System.out.println(prod);	
					}					
					
				break;
				
				case 5:
					System.out.println("Diga el id del producto para saber precio de venta al público");
					idLeido = Leer.datoInt();
					
					System.out.println("Diga porcentaje de ganancia");
					ganancia = Leer.datoDouble();
					
					System.out.printf("El precio de venta es: %.2f euros\n", t.calcularPrecioFinal(ganancia, idLeido));
				break;
				
				case 6:
					System.out.println("Diga sección");
					seccion = Leer.datoInt();
					
					System.out.println("Diga nuevo precio");
					nuevoPrecio = Leer.datoDouble();
					
					t.modificarPrecioFabricaSeccion(seccion, nuevoPrecio);
				break;
				
				case 7:
					System.out.println("Diga el descuento");
					descuento = Leer.datoDouble();
					
					System.out.println("Diga la ganancia");
					ganancia = Leer.datoDouble();
					
					System.out.println("Diga el id del producto a modificar");
					idLeido = Leer.datoInt();
					
					System.out.printf("El precio con descuento es: %.2f euros\n", t.hacerDescuento(descuento, ganancia, idLeido));
				break;
				
				case 8:
					System.out.println("Diga qué sección quiere eliminar");
					seccion = Leer.datoInt();
					
					System.out.println("Se han eliminado "+t.eliminarSeccion(seccion));
				break;
				
				case 9:
					t.mostrarProductosActivos();
				break;
			}
			
		}while(op != 0);
		
	}

}
