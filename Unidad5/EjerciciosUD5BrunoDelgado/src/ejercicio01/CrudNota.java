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
	
	public void imprimir2() {
		for(Nota n : lista) {
			System.out.println(n);
		}
	}
	
	public int mostrarTamano() {
		return lista.size();
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

	
	public void borrar (int id) {
		if(buscarById(id) != null) {
			lista.remove(buscarById (id));
		}
	}
	
	//no me va
	public void borrarNota(int id) {
		int uno=1;
		if(!lista.isEmpty()) {
			lista.remove(id-uno);
		}
	}
	
	public Nota buscarById (int id) {
		boolean encontrado=false;
		int i=0;
		
		while(i<lista.size() && !encontrado) {
			Nota n = lista.get(i);
			if(n.getId() == id) {
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
	
	public void modificar() {
		
	}
	
	//así no se hace
	public Nota verNotaPorIndice(int id) {
		int uno =1;
		return lista.get(id-uno);
	}
	
	public void crearNota(Nota n) {
		
		agregar(n);
	}
	
}
