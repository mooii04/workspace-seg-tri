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
	
	public Alumno buscarPorCodAlumIteV1(int codAlum) {
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
	
	public Alumno buscarPorCodAlumIteV2(int codAlum) {
		Alumno a = null;
		Iterator <Alumno> ite = lista.iterator();
		boolean encontrado = false;
		
		while (ite.hasNext() && !encontrado) {
			a=ite.next();
		if(a.getCodAlum()==/*si fuera string sería equals*/(codAlum)) {
			encontrado = true;
		}
		}
		if(encontrado) {
			return a;
		}else {
			return null;
		}
		
	}
	
	public Alumno buscarPorCodForEach(int codAlum) {
		if(lista.size() != 0) {
			for (Alumno alum : lista) {
				if(alum.getCodAlum() == codAlum) {
					return alum;
				}
			}
		}	
		return null;
	}

	
	
	public void borrar (int codAlum) {
		if(buscarPorCodAlumIteV1(codAlum) != null) {
			lista.remove(buscarPorCodAlumIteV1(codAlum));
		}
	}
	
	public void modificarNombre (int codAlum, String nuevoNombre) {
		Alumno a;
		a = buscarPorCodAlumIteV2(codAlum);
		a.setNombre(nuevoNombre);
	}
	
	public void agregar (Alumno a) {
		lista.add(a);
	}
	
	public void verAlumnos() {
		for(Alumno alumno:lista) {
			System.out.println(alumno);
		}
	}
	
	public void borrarAlumno(int codAlum) {
		lista.remove(buscarPorCodForEach(codAlum));
	}


	
}

