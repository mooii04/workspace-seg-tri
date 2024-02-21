package ejercicio04;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CrudContacto {

	private Map <Contacto, String> agenda;

	public Map<Contacto, String> getAgenda() {
		return agenda;
	}

	public void setAgenda(Map<Contacto, String> agenda) {
		this.agenda = agenda;
	}

	public CrudContacto(Map<Contacto, String> agenda) {
		super();
		this.agenda = agenda;
	}

	@Override
	public String toString() {
		return "CrudContacto [agenda=" + agenda + "]";
	}
	
	public void agregar(Contacto c, String tlf) {
		agenda.put(c, tlf);
	}
	
	//Devolver alguna lista mejor, esto es para buscar una persona igual
	public Contacto buscarPorNombre (String nombre) {	 
		for (Contacto contc : agenda.keySet() ) {
			if(contc.getNombre().equalsIgnoreCase(nombre)) {
				return contc;
			}
		}
		return null;
	}
	
	//Devuelve una lista de personas
		public List<Contacto> buscarPorNombreV2 (String nombre) {	 
			List <Contacto> lista = new ArrayList <Contacto> ();
			for (Contacto contc : agenda.keySet() ) {
				if(contc.getNombre().equalsIgnoreCase(nombre)) {
					lista.add(contc);
				}
			}
			return lista;
		}
	
	public void borrar(String nombre) {
		if(buscarPorNombre(nombre)!=null) {
			agenda.remove(buscarPorNombre(nombre));
		}
	}
	
	public void modificarNombre(String nombre, String nuevoNombre) {
		Contacto c;
		c = buscarPorNombre(nombre);
		c.setNombre(nuevoNombre);
	}
	
	public void modificarTlf(String nombre, String tlf, String nuevoTlf) {
		Contacto c;
		c = buscarPorNombre(nombre);
		agenda.replace(c, tlf, nuevoTlf);
	}
	
	public void imprimirAgenda() {
		System.out.println(agenda);
	}
	
	public void modificarTlf(String nombre, String nuevoTlf) {
		agenda.replace(buscarPorNombre(nombre), nuevoTlf);
	}

}
