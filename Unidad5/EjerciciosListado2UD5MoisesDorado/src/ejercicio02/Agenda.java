package ejercicio02;

import java.util.Comparator;
import java.util.List;

public class Agenda {

	private List <Nombre> lista;

	public Agenda(List<Nombre> lista) {
		super();
		this.lista = lista;
	}

	public List<Nombre> getLista() {
		return lista;
	}

	public void setLista(List<Nombre> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Agenda [lista=" + lista + "]";
	}
	
	//case1
	public List<Nombre> odenarPorOrdenAlfabetico(){
		Comparator<Nombre> comparaNombre = Comparator.comparing(Nombre::getName);
		
		return lista.stream().sorted(comparaNombre).toList();
	}
	
	//case 2
	public List<Nombre> findByNombre(String prenom){
		return lista.stream().filter(nombre -> nombre.getName().equalsIgnoreCase(prenom)).toList();
	}
	
	//case 3
	//nidea
	
	//case 4
	public List<Nombre> longitudImpar() {
		return lista.stream().filter(nombre -> nombre.getName().length() % 2 != 0).toList();
	}
	
	public void borrarImpares() {
		lista.removeAll(longitudImpar());
	}
	
	//case 5
	public List<Nombre> mostrarNombresMayusculas(){
		return lista.stream().map(nombre -> nombre.getName().toUpperCase()).toList();
	}
	
}
