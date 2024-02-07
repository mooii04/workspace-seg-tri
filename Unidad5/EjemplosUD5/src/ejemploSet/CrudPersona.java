package ejemploSet;

import java.util.Set;

import ejemploList2.Persona;

public class CrudPersona {

	private Set <Persona> listaP;

	public CrudPersona(Set<Persona> listaP) {
		super();
		this.listaP = listaP;
	}

	public Set<Persona> getListaP() {
		return listaP;
	}

	public void setListaP(Set<Persona> listaP) {
		this.listaP = listaP;
	}

	@Override
	public String toString() {
		return "CrudPersona [listaP=" + listaP + "]";
	}
	
}
