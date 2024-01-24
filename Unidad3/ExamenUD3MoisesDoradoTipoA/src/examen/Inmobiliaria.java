package examen;

import java.util.Arrays;

public class Inmobiliaria {

	private Piso [] lista;
	private int numVendedores;
	private int numPiso;
	
	public Inmobiliaria(Piso[] lista, int numVendedores, int numPiso) {
		this.lista = lista;
		this.numVendedores = numVendedores;
		this.numPiso = numPiso;
	}

	public Piso[] getLista() {
		return lista;
	}

	public void setLista(Piso[] lista) {
		this.lista = lista;
	}

	public int getNumVendedores() {
		return numVendedores;
	}

	public void setNumVendedores(int numVendedores) {
		this.numVendedores = numVendedores;
	}

	public int getNumPiso() {
		return numPiso;
	}

	public void setNumPiso(int numPiso) {
		this.numPiso = numPiso;
	}
	
	@Override
	public String toString() {
		return "Inmobiliaria [lista=" + Arrays.toString(lista) + ", numVendedores=" + numVendedores + ", numPiso="
				+ numPiso + "]";
	}
	
	public void agregar (Piso p) {
		lista[numPiso]=p;
		numPiso++;
	}
	
	public Piso buscarById (int id) {
		boolean encontrado=false;
		int i=0;
		
		while (i<numPiso && !encontrado) {
			if(lista[i].getId() == id) {
				encontrado = true;
			} else {
				i++;
			}
		}
		
		if(encontrado) {
			return lista[i];
		}else {
			return null;
		}
	}
	
	public double calcularPrecioFinalVenta(double ganancia, int id) {
		double cien=100;
		Piso p;
		p = buscarById(id);		
		
		return p.getPrecioVenta() + p.getPrecioVenta() * ganancia / cien;
	}
	
	public Piso [] buscarByEstado (int estado) {
		int i=0;
		Piso [] listaEncontrados = new Piso[numPiso];
		
		while (i<numPiso) {
			if (lista[i].getEstado() == estado) {
				listaEncontrados[i] = lista[i];
			}
			i++;
		}
		return listaEncontrados;
	}
	
	public void mostrarListaPisos (Piso [] lista) {
		for (int i=0; i < numPiso; i++) {
			if(lista[i] != null) {
				System.out.println(lista[i]);
			}
		}
		
	}
	
	public void modificarPrecioPiso (double nuevoPrecio, int id) {
		for(int i=0; i<numPiso; i++) {
			if(lista[i].getId() == id) {
				lista[i].setPrecioVenta(nuevoPrecio);
			}
		}
	}
	
	public int buscarByIdV2 (int id) {
		boolean encontrado=false;
		int i=0;
		
		while (i<numPiso && !encontrado) {
			if(lista[i].getId() == id) {
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
	
}
