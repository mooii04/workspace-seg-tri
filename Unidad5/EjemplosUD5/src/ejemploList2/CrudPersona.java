package ejemploList2;

import java.util.List;

public class CrudPersona {

	private List <Persona> lista;

	public CrudPersona(List<Persona> lista) {
		super();
		this.lista = lista;
	}

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudPersona [lista=" + lista + "]";
	}
	
	public void addPersonaV1 (Persona p) {
		lista.add(p);
	}
	
	//NUNCA pasamos los atributos del objeto por separado
	//SOLO pasamos el objeto
	//NO se guarda y se imprime a la vez
	
	public boolean addPersonaV2 (Persona p) {
		return lista.add(p);
	}

	
	public Persona buscarByDni (String dni) {
		boolean encontrado=false;
		int i=0;
		
		while(i<lista.size() && !encontrado) {
			Persona deLista = lista.get(i);
			if(deLista.getDni().equalsIgnoreCase(dni)) {
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
