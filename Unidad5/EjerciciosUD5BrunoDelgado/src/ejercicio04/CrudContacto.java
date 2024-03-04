package ejercicio04;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;


import ejercicio02.Socio;


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
	


	
	
	public Contacto buscarPorNombre (String nombre) {	
		
		
		//Set <Contacto> claves = agenda.keySet(); antes tenía conct : claves
		for (Contacto conct : agenda.keySet() ) {
			if(conct.getNombre().equalsIgnoreCase(nombre)) {
				return conct;
			}
		
		}
		return null;
		
	}
	
	public List<Contacto> buscarPorNombreLista (String nombre) {		
		List <Contacto> lista = new ArrayList<Contacto>();
		for (Contacto conct : agenda.keySet() ) {
			if(conct.getNombre().equalsIgnoreCase(nombre)) {
				lista.add(conct);
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
	
	public void modificarTlf(String nombre, String nuevoTlf) {
		agenda.replace(buscarPorNombre(nombre), nuevoTlf);
	}
	
	public void imprimirAgenda() {
		System.out.println(agenda);
	}
	
	/*public void imprimir2() {
		for(Map.entry(Contacto, String) entrada : agenda.keySet()){
			Contacto c = entrada.getKey();
			int telefono = entrada.getValue();
			System.out.println("Nombre: "+ c.getNombre());
		}
	}*/
}
