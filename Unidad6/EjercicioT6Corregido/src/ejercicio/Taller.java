package ejercicio;

public class Taller {

	public void comprobarPrecioArreglo(Coche c) throws PrecioArregloNegativo{
		if(c.getPrecioArreglo() < 0) {
			throw new PrecioArregloNegativo("El precio de arreglo introducido no es válido");
		}
	}
	
	public void comprobarMatricula(Coche c) throws MatriculaErroneas{
		if(!c.getMatricula().matches("[0-9]{4}[A-Z]{3}")) {
			throw new MatriculaErroneas("La matrícula introducida no es válida");
		}
	}
	
}
