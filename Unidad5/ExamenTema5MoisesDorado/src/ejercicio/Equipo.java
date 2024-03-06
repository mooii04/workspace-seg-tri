package ejercicio;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Equipo {

	private List <Jugador> lista;
	private String nombreEquipo;
	
	public Equipo(List<Jugador> lista, String nombreEquipo) {
		super();
		this.lista = lista;
		this.nombreEquipo = nombreEquipo;
	}

	public List<Jugador> getLista() {
		return lista;
	}

	public void setLista(List<Jugador> lista) {
		this.lista = lista;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	@Override
	public String toString() {
		return "Equipo [lista=" + lista + ", nombreEquipo=" + nombreEquipo + "]";
	}
	
	//case 1
	public Jugador buscarPorGoles () {
		Jugador j = null;
		Iterator <Jugador> ite = lista.iterator();
		boolean encontrado = false;
		
		while (ite.hasNext() && !encontrado) {
			 j = ite.next();
			if(j.getGoles() == 0) {
				encontrado = true;
			}
		}
		
		if(encontrado) {
			return j;
		}else {
			return null;
		}
	}
	
	//case 2
	public Jugador buscarPorNumCamiseta(int numCamiseta) {
		for (Jugador j : lista) {
			if(j.getNumCamiseta() == numCamiseta) {
				return j;
			}
		}
		return null;
	}
	
	//case 3
	public double calcularMediaGoles() {
		double suma =0;
		for (Jugador j : lista) {
			suma += j.getGoles();
		}
		return suma / lista.size();
	}
	
	//case 4
	public void modificarPosicion(int numCamiseta, String posicion) {
		Jugador j;
		j = buscarPorNumCamiseta (numCamiseta);
		j.setPosicion(posicion);
	}
	
	//case 5
	public void mostrarLista () {
			Jugador j;
			Iterator <Jugador > ite = lista.iterator();
			while(ite.hasNext()) {
				j = ite.next();
				System.out.println(j);
			}
	}
	
	//case 6
	public void ordenaPorPosicion() {
		Collections.sort(lista);
		for (Jugador j : lista) {
			System.out.println(j);
		}
	}
	
	//case 7
	public void ordenaPorNumGoles() {
		Collections.sort(lista, new OrdenaPorNumGoles());
		for (Jugador j : lista) {
			System.out.println(j);
		}
	}
	
}
