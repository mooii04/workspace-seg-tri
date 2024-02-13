package ejemploSet;

import java.util.Iterator;
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
	/*
	public Persona buscarPorDni(String dni) {
		boolean encontrado = false;
		int i = 0;
		Persona dniBuscado;
		Iterator <Persona> ite = listaP.iterator();
		while(ite.hasNext()) {
			dniBuscado = ite.next();
			
			if(dniBuscado.getDni() == dni) {
				encontrado = true;
			}else {
				encontrado = false;
			}
		}
		
		if(encontrado) {
			return dniBuscado;
		}else {
			return null;
		}
		
	}*/
}
