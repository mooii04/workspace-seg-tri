package ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class CrudNota {

	List <Nota> lista = new ArrayList <Nota> ();

	public CrudNota(List<Nota> lista) {
		super();
		this.lista = lista;
	}

	public List<Nota> getLista() {
		return lista;
	}

	public void setLista(List<Nota> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudNota [lista=" + lista + "]";
	}
	
	public void imprimirLista() {
		for (Nota n : lista) {
			System.out.println(n);
		}
	}
	
	public void addPersonaV1 (Nota n) {
		int cont=0;
		lista.add(n);
		cont ++;
	}
	
	public void mostrarContador () {
		
	}
	
	public void borrar (int id) {
		if(buscarById(id) != null) {
			lista.remove(buscarById (id));
		}
	}
	
	public Nota buscarById (int id) {
		boolean encontrado=false;
		int i=0;
		
		while(i<lista.size() && !encontrado) {
			Nota deLista = lista.get(i);
			if(deLista.getId() == id) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if(encontrado) {
			return lista.get(i);
		} else {
			return null;
		}
	}
	
}
