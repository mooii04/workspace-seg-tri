package ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Oficina {

	private List <Trastero> listaTrasteros;

	public Oficina(List<Trastero> listaTrasteros) {
		super();
		this.listaTrasteros = listaTrasteros;
	}

	public List<Trastero> getListaTrasteros() {
		return listaTrasteros;
	}

	public void setListaTrasteros(List<Trastero> listaTrasteros) {
		this.listaTrasteros = listaTrasteros;
	}

	@Override
	public String toString() {
		return "Oficina [listaTrasteros=" + listaTrasteros + "]";
	}
	
	//case 1
	public void agregarTrastero(Trastero t) {
		listaTrasteros.add(t);
	}
	
	//case 2
	public List<Trastero> buscarByPrecio(double precio) {
		List<Trastero> mismoPrecio = new ArrayList<Trastero>();
		for (Trastero t : mismoPrecio) {
			if(t.getPrecio() == precio) {
				mismoPrecio.add(t);
			}
		}
		return mismoPrecio;
	}
	
	//case 3
	public Trastero buscarByNum(int numTrastero) {
		for (Trastero t : listaTrasteros) {
			if(t.getNumTrastero() == numTrastero) {
				return t;
			}
		}
		return null;
	}
	
	//case 4
	public Trastero devolverMasCaro() {
		Trastero masCaro = null;
		
		for (Trastero t : listaTrasteros) {
			if(masCaro == null || t.getPrecio() > masCaro.getPrecio()) {
				masCaro = t;
			}
		}
		return masCaro;
	}
	
	//case 5
	public void eliminarPorNum(int numTrastero) {
		if(buscarByNum(numTrastero) != null) {
			listaTrasteros.remove(numTrastero);
		}
	}
	
	//case 6
	public void modificarPrecioTrastero(int numTrastero, double precioNuevo) {
		Trastero t;
		t = buscarByNum(numTrastero);
		t.setPrecio(precioNuevo);
	}
	
	//case 8
	public void mostrarTrasterosNoOcupados() {
		for (Trastero t : listaTrasteros) {
			if(t.getOcupado() == 2) {
				System.out.println(t);
			}
		}
	}
	
}
