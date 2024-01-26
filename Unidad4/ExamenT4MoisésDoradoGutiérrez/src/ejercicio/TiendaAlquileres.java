package ejercicio;

import java.util.Arrays;

public class TiendaAlquileres {

	private Vehiculos [] listaVeh;

	public TiendaAlquileres(Vehiculos[] listaVeh) {
		super();
		this.listaVeh = listaVeh;
	}

	public Vehiculos[] getlistaVeh() {
		return listaVeh;
	}

	public void setlistaVeh(Vehiculos[] listaVeh) {
		this.listaVeh = listaVeh;
	}

	@Override
	public String toString() {
		return "TiendaAlquileres [listaVeh=" + Arrays.toString(listaVeh) + "]";
	}
	
	public double buscarByNumVehiculos(Vehiculos v, int numVehiculos) {
		int i=0;
		boolean encontrado=false;
		while (i < listaVeh[i].getNumVehiculos() && !encontrado) {
			if (listaVeh[i].getNumVehiculos() == numVehiculos) {
				encontrado = true;
			} else {
				i++;
			}
		}
		
		if(encontrado == true) {
			return i;
		}else {
			return -1;
		}
		
	}
	
	public double calcularAlquilerVehiculo(Vehiculos v, int numVehiculos) {
		int uno=1;
		double resul=0;
		for (int i = 0; i < uno; i++) {
			resul = buscarByNumVehiculos(v, numVehiculos);
			resul = v.calcularPrecio();
		}
		return resul;
	}
	
	

	public void mostrarListado(int numVehiculos, Vehiculos v) {
		for (int i = 0; i < numVehiculos; i++) {
			if (listaVeh[i] instanceof Batmovil) {
				((Batmovil)listaVeh[i]).avisarMaximo();
			}
			System.out.println("Matrícula: "+ v.getMatricula() + " Metros: "+ v.getMetrosTam() + " Año Fabricación: "+ v.getAnioFabricacion() + " Número del Vehículo: " + v.getNumVehiculos());
		}
	}
	
	public double calcularAlquiler(Vehiculos v) {
		return v.calcularPrecio();
	}
	
	public double calcularTotalRecaudado(Vehiculos v) {
		double resul=0;
		for (int i = 0; i < listaVeh.length; i++) {
			resul += calcularAlquiler(v);
		}
		return resul;
	}
	
	public double calcularTotalRecaudadoBatmovil(Vehiculos v) {
		double resul=0;
		for (int i = 0; i < listaVeh.length; i++) {
			if(listaVeh[i] instanceof Batmovil) {
				resul += ((Batmovil)listaVeh[i]).calcularPrecio();
			}
		}
		return resul;
	}
	
	public double calcularAlquilerDias(Vehiculos v, int numVehiculos, int numDias) {
		double resul=0;
		for (int i = 0; i < listaVeh.length; i++) {
			resul = buscarByNumVehiculos(v, numVehiculos);
			resul = v.calcularPrecio() * numDias;
		}
		return resul;
	}
	
}
