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
		Iterator <Alumno> it = lista.iterator();
		Alumno a =null;
		boolean encontrado = false;
		
		while (it.hasNext() && !encontrado) {
			a= it.next();
			if(a.getCodAlum() == codAlum) {
				encontrado = true;
			}
		}
		
		if(encontrado) {
			return a;
		}else {
			return null;
		}
		
	}
	
	public Alumno buscarPorCodAlumV2(int codAlum) {
		if (lista.size() != 0) {
			for (Alumno alumno : lista) {
				if (alumno.getCodAlum() == codAlum) {
					return alumno;
				}
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
	
	public void  verAlumnos () {
		for (Alumno alumno : lista) {
			System.out.println(alumno);
		}
		
	}
	
}
