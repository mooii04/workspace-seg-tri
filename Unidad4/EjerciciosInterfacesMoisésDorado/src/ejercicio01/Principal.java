package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Publicaciones l1 = new Libro (false, "Aprende SQL", "Luismi", 2009);
		Publicaciones l2 = new Libro (true, "Aprende HTML", "Rafa", 2017);		
		Publicaciones r1 = new Revista (false, "Revista IP: Todo sobre redes", "Miguel", 2020);		
		Publicaciones r2 = new Revista (false, "Revista Java", "Ángel", 2016);
		
		int tam = 4;
		
		int anio;
		
		Publicaciones [] listado = new Publicaciones [tam];
		
		listado[0] = l1;		
		listado[1] = l2;		
		listado[2] = r1;		
		listado[3] = r2;
		
		Biblioteca bib = new Biblioteca ();
		
		System.out.println("Diga año");
		
		anio = Leer.datoInt();
		
		System.out.println("Hay "+bib.publicacionesAnterioresA(listado, anio)+" anteriores al año "+anio);
		
		System.out.println("Hay "+bib.cuentaPrestados(listado)+" libros prestados");
		
		bib.verPublicaciones(listado);
	}
}
