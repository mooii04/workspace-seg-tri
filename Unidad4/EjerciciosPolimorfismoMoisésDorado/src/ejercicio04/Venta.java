package ejercicio04;

import java.util.Arrays;

public class Venta {

	private LineaDeVenta[] listado;
	
	public Venta(LineaDeVenta[] listado) {
		this.listado = listado;
	}
	
	public LineaDeVenta[] getListado() {
		return listado;
	}

	public void setListado(LineaDeVenta[] listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Venta [listado=" + Arrays.toString(listado) + "]";
	}

	public double calcularTotal() {
		double resultado = 0;
		for (int i = 0; i < listado.length; i++) {
			resultado = resultado + listado[i].calcularPrecioPorCant();
		}
		return resultado;
	}
	
	public void imprimirCabecera() {
		System.out.println("Producto\tCantidad\tPrecioUd\tPrecioFinal");
	}
	
	public void imprimirFinal() {
		System.out.printf("Total: %.2f\n",calcularTotal());
	}
	
	public void imprimir () {
		for (int i = 0; i < listado.length; i++) {
			listado[i].imprimirLineaDeVenta();
			System.out.println("\n");
		}
	}
	
	public void imprimirListado() {
		for (int i = 0; i < listado.length; i++) {
			System.out.println(listado[i]);
		}
	}
	
}
