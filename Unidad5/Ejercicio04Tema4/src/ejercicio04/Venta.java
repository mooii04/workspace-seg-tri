package ejercicio04;

import java.util.Arrays;

public class Venta {

	private LineaDeVenta [] lv;

	public Venta(LineaDeVenta[] lv) {
		super();
		this.lv = lv;
	}

	public LineaDeVenta[] getLv() {
		return lv;
	}

	public void setLv(LineaDeVenta[] lv) {
		this.lv = lv;
	}

	@Override
	public String toString() {
		return "Venta [lv=" + Arrays.toString(lv) + "]";
	}

	public double calcularPrecioTotal() {
		double resul=0.0;
		for (int i = 0; i < lv.length; i++) {
			resul += lv[i].calcularPrecioTotalLinea();
		}
		return resul;
	}
	
	public void mostrarTicket() {
		//hacer ticket
		System.out.println("***************MALASAÑA***************");
		System.out.println("Nombre\t\tPrecioUni\t\tCantidad\t\tTotal");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < lv.length; i++) {
			System.out.println(lv[i].getP().getNombre());
			System.out.println("\t\t"+lv[i].getP().calcularPrecioUnitario());
			System.out.println("\t\t"+lv[i].getCantProductos());
			System.out.println("\t\t"+lv[i].calcularPrecioTotalLinea());
		}
		System.out.println("-------------------------------------------");
		System.out.println("Total a pagar:\t\t\t\t\t"+ calcularPrecioTotal());
	}
	
	public void mostrarProductosGuardados() {
		for (int i = 0; i < lv.length; i++) {
			System.out.println(lv[i].getP().getNombre());
			if(lv[i].getP() instanceof Alimentacion) {
				((Alimentacion)lv[i].getP()).mostrarSiCaducaEn2Dias();
			}
		}
	}
	
}
