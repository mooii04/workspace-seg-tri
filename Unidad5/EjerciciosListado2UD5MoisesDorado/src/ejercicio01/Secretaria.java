package ejercicio01;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Secretaria {

	private List <Alumno> lista;

	public Secretaria(List<Alumno> lista) {
		super();
		this.lista = lista;
	}

	public List<Alumno> getLista() {
		return lista;
	}

	public void setLista(List<Alumno> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Secretaria [lista=" + lista + "]";
	}
	
	//case 1
	public List<Alumno> findByEdadFilter (int edad){
		return lista.stream().
				filter(alumno -> alumno.getEdad() == edad).
				toList();
	}
	
	//case 2
	public void mostrarAlumnos () {
		lista.stream().forEach(System.out::println);
	}
	
	//case 3
	public List<Alumno> findByInicial (String inicial){
		return lista.stream().
				filter(alumno -> alumno.getNombre().	startsWith(inicial)).
				toList();
	}
	
	//case 4
	public long contarAlumnos() {
		return lista.stream().
				count();
	}
	
	//case 5
	public List<Alumno> mostrarAlumnosMediaMayor9 (){
		double nueve=9;
		String dam1="1DAM";
		return lista.stream().
				filter(alumno -> alumno.getNotaMedia() > nueve && alumno.getNombreCurso().equalsIgnoreCase(dam1)).
				toList();
	}
	
	//case 6
	public List<Alumno> mostrar3Alumnos(){
		int tres=3;
		return lista.stream().
				limit(tres).
				toList();
	}
	
	//case 7
	public Optional<Alumno> mostrarAlumnoMenor(){
		Comparator<Alumno> comparaEdad = Comparator.comparing(Alumno::getEdad);
		
		return lista.stream().
				sorted(comparaEdad).
				findFirst();
	}
	
	//case 8
	public Optional<Alumno> mostrarPrimerAlumno(){
		return lista.stream().
				findFirst();
	}
	
	//case 9
	public List<Alumno> mostrarNombresMayor10Letras(){
		int diez=10;
		return lista.stream().
				filter(alumno -> alumno.getNombre().length()>diez).
				toList();
	}
	
	//case 10
	public List<Alumno> mostrarAlumnosEmpiecenAMayorIgual6Letras(){
		int seis=6;
		String a="A";
		return lista.stream().
				filter(alumno -> alumno.getNombre().length()>=seis && alumno.getNombre().startsWith(a)).
				toList();
	}
	
}
