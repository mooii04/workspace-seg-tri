package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p = new Producto ();
		Trabajador t = new Trabajador();
		
		double precioProd=100;
		int ivaProd=25;
		double sueldoTrabajador=1200;
		double precioIvaProd;
		double sueldoIrpfTrabajador;
		
		//IVA Producto
		precioIvaProd = p.calculoIva(precioProd, ivaProd);
		
		System.out.printf("El precio del producto es de %.2f€", precioProd, ", pero aplicandole"
				+ " un %.2f", ivaProd, "% de IVA se queda en %.2f€", precioIvaProd);
		
		//IRPF Trabajador
		sueldoIrpfTrabajador = t.calculoIrpf(sueldoTrabajador);
		
		System.out.printf("\nEl trabajador cobra %.2f", sueldoTrabajador, "€, pero aplicandole"
				+ " el IRPF se queda en %.2f€", sueldoIrpfTrabajador);
		
	}

}
