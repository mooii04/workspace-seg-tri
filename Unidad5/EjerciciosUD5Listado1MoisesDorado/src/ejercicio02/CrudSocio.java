package ejercicio02;

import java.util.List;

public class CrudSocio {

	private List<Socio> lista;

	public CrudSocio(List<Socio> lista) {
		super();
		this.lista = lista;
	}

	public List<Socio> getLista() {
		return lista;
	}

	public void setLista(List<Socio> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudSocio [lista=" + lista + "]";
	}
	
	public void agregar (Socio s) {
		lista.add(s);
	}
	
	public Socio findByDni (String dni) {
		boolean encontrado = false;
		int i=0;
		
		while (i<lista.size() && !encontrado) {
			Socio c = lista.get(i);
			if(c.getDni() == dni) {
				encontrado  = true;
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
	
	public void mostrarSocio() {
		for (Socio c : lista) {
			System.out.println(c);
		}
	}
	
	public void borrar (String dni) {
		if(findByDni(dni) != null) {
			lista.remove(findByDni(dni));
		}
	}
	
	public void modificarCuotaBase (String dni, double nuevaCuota) {
		Socio s;
		s = findByDni(dni);
		s.setCuotaBase(nuevaCuota);
	}
	
}
