package ejercicio;

import java.util.Iterator;
import java.util.List;

public class Diccionario {

	private List <Palabra> listaPalabras;

	public Diccionario(List<Palabra> listaPalabras) {
		super();
		this.listaPalabras = listaPalabras;
	}

	public List<Palabra> getListaPalabras() {
		return listaPalabras;
	}

	public void setListaPalabras(List<Palabra> listaPalabras) {
		this.listaPalabras = listaPalabras;
	}

	@Override
	public String toString() {
		return "Diccionario [listaPalabras=" + listaPalabras + "]";
	}
	
	public void imprimirLista () {
		Palabra p;
		Iterator<Palabra> it = listaPalabras.iterator();
		
		while(it.hasNext()) {
			p = it.next();
			System.out.println(p);
		}
	}
	
	public void agregarLista (Palabra p) {
		listaPalabras.add(p);
	}
	
	public Palabra buscarPorNombre (String nombre) {
		for (Palabra p : listaPalabras) {
			if(p.getNombre().equalsIgnoreCase(nombre)) {
				return p;
			}
		}
		return null;
	}
	
	public void modificarSignificado (String nombre, String nuevoSignificado) {
		Palabra p;
		p = buscarPorNombre(nombre);
		p.setSignificado(nuevoSignificado);
	}
	
	public void borrarPalabra (String nombre) {
		if(buscarPorNombre(nombre) != null) {
			listaPalabras.remove(buscarPorNombre(nombre));
		}
	}
	
}
