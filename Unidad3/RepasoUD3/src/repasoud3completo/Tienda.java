package repasoud3completo;

import java.util.Arrays;

public class Tienda {

	private Producto [] listado;
	private int numProducto;
	private int numTrabajadores;
	
	public Tienda(Producto[] listado, int numProducto, int numTrabajadores) {
		this.listado = listado;
		this.numProducto = numProducto;
		this.numTrabajadores = numTrabajadores;
	}

	public Producto[] getListado() {
		return listado;
	}

	public void setListado(Producto[] listado) {
		this.listado = listado;
	}

	public int getNumProducto() {
		return numProducto;
	}

	public void setNumProducto(int numProducto) {
		this.numProducto = numProducto;
	}

	public int getNumTrabajadores() {
		return numTrabajadores;
	}

	public void setNumTrabajadores(int numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}

	@Override
	public String toString() {
		return "Tienda [listado=" + Arrays.toString(listado) + ", numProducto=" + numProducto + ", numTrabajadores="
				+ numTrabajadores + "]";
	}
	
	//El nombre (verde) tiene que ser en infinitivo
	//SIN ñ y SIN tildes
	//Que indique que hace el método 
	//La segunda palabra empieza en mayúsculas y la primera en minúsculas
	//SIEMPRE
	//ENSERIO SIEMPRE
	//QUERIDO YO DEL FUTURO SIEMPRE
	public void agregar (Producto p) {
		listado[numProducto]=p;
		numProducto++;
	}
		
	public void mostrarProductos () {
		for (int i=0; i < numProducto; i++) {
			System.out.println(listado[i]);
		}
		
	}

	public Producto [] buscarBySeccion (int seccion) {
		int i=0;
		Producto [] listaEncontrados = new Producto[numProducto];
		
		while (i<numProducto) {
			if (listado[i].getSeccion() == seccion) {
				listaEncontrados[i] = listado[i];
			}
			i++;
		}
		return listaEncontrados;
	}
	
	public void mostrarLista (Producto [] lista) {
		for (int i=0; i < lista.length; i++) {
			if(lista[i] != null) {
				System.out.println(lista[i]);
			}
		}
		
	}

	public int buscarById (int id) {
		boolean encontrado=false;
		int i=0;
		
		while (i<numProducto && !encontrado) {
			if(listado[i].getId() == id) {
				encontrado = true;
			} else {
				i++;
			}
		}
		
		if(encontrado) {
			return i;
		}else {
			return -1;
		}
	}
	
	public Producto buscarByIdV2 (int id) {
		boolean encontrado=false;
		int i=0;
		
		while (i<numProducto && !encontrado) {
			if(listado[i].getId() == id) {
				encontrado = true;
			} else {
				i++;
			}
		}
		
		if(encontrado) {
			return listado[i];
		}else {
			return null;
		}
	}
	
	public double calcularPrecioFinal (double ganancia, int id) {
		double cien=100;
		Producto p;
		p = buscarByIdV2(id);		
		
		return p.getPrecioFabrica() + p.getPrecioFabrica() * ganancia / cien;
	}
	
	public void modificarPrecioFabricaSeccion (int seccion, double nuevoPrecio) {
		
		for(int i=0; i<numProducto; i++) {
			if(listado[i].getSeccion() == seccion) {
				listado[i].setPrecioFabrica(nuevoPrecio);
			}
		}
		
	}
	
	public double hacerDescuento(double descuento, double ganancia, int id) {
		double cien=100;
		double resul;
		
		resul = calcularPrecioFinal(ganancia, id) - calcularPrecioFinal(ganancia, id) * descuento/cien;
		
		return resul;			
	}
	
	//Devuelve el número de elementos "eliminados" de la lista
	public int eliminarSeccion (int seccion) {
		int contador=0;
		
		for (int i = 0; i < numProducto; i++) {
			if(listado[i].getSeccion() == seccion) {
				listado[i].setEnVenta(false);
				contador++;
			}
		}
		return contador;
	}
	
	public void mostrarProductosActivos () {
		for (int i = 0; i < numProducto; i++) {
			if(listado[i].isEnVenta()) {
				System.out.println(listado[i]);
			}
		}
	}
	
}
