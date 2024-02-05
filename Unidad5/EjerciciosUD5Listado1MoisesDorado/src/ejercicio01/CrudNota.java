package ejercicio01;

import java.util.List;

public class CrudNota {
	
	private List<Nota> lista;
	
	public CrudNota(List<Nota> lista) {
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
	
	public void imprimirNotas() {
		System.out.println(lista);
		System.out.println();
	}
	
	public void agregar(Nota n) {
		lista.add(n);
		aumentarContador();
	}
	
	public int aumentarContador() {
		int contador=0;
		contador++;
		return contador;
	}
	
	public void mostrarContador() {
		System.out.println(aumentarContador());
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
