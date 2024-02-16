package ejercicio03;

import java.util.Iterator;
import java.util.Set;

public class CrudAlumno {

	private Set <Alumno> lista;

	public CrudAlumno(Set<Alumno> lista) {
		super();
		this.lista = lista;
	}

	public Set<Alumno> getLista() {
		return lista;
	}

	public void setLista(Set<Alumno> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudAlumno [lista=" + lista + "]";
	}
	
	public Alumno buscarPorCodAlum(int codAlum) {
		boolean encontrado = false;
		int i = 0;
		Alumno AlumBuscado;
		Iterator <Alumno> ite = lista.iterator();
		while(ite.hasNext()) {
			AlumBuscado = ite.next();
			
			if(AlumBuscado.getCodAlum() == codAlum) {
				encontrado = true;
			}else {
				encontrado = false;
			}
			if(encontrado) {
				return AlumBuscado;
			}else {
				return null;
			}
		}
		return null;
	}
	
	public void borrar (int codAlum) {
		if(buscarPorCodAlum(codAlum) != null) {
			lista.remove(buscarPorCodAlum(codAlum));
		}
	}
	
	public void modificarNombre (int codAlum, String nuevoNombre) {
		Alumno a;
		a = buscarPorCodAlum(codAlum);
		a.setNombre(nuevoNombre);
	}
	
}
