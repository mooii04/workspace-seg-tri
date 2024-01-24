package ejercicio06;

import java.util.Arrays;

public class Oficina {

	private Cuenta [] listaCuentas;

	public Oficina(Cuenta[] listaCuentas) {
		super();
		this.listaCuentas = listaCuentas;
	}

	public Cuenta[] getListaCuentas() {
		return listaCuentas;
	}

	public void setListaCuentas(Cuenta[] listaCuentas) {
		this.listaCuentas = listaCuentas;
	}

	@Override
	public String toString() {
		return "Oficina [listaCuentas=" + Arrays.toString(listaCuentas) + "]";
	}
	
	public double calcularSaldoTotal(Cuenta c, double ingreso, double retirada) {
		return c.calcularSaldoTotal(ingreso, retirada);
	}
	
	public double calcularDineroTotal(double ingreso, double retirada) {
		double resul = 0;
		for (int i = 0; i < listaCuentas.length; i++) {
			if(listaCuentas != null) {
				resul = resul + calcularSaldoTotal(listaCuentas[i], ingreso, retirada);
			}
		}
		return resul;
	}
	
	
	public double calcularRoboEmpresas() {
		double resul=0;
		for (int i = 0; i < listaCuentas.length; i++) {
			if(listaCuentas[i] != null && listaCuentas[i] instanceof CuentaEmpresa) {
				resul = resul + ((CuentaEmpresa) listaCuentas[i]).getRobo();
			}
		}
		return resul;
	}
	
	public double calcularRegaloJovenes() {
		double resul=0;
		for (int i = 0; i < listaCuentas.length; i++) {
			if(listaCuentas[i] != null && listaCuentas[i] instanceof CuentaJoven) {
				resul = resul +((CuentaJoven) listaCuentas[i]).getRegalo();
			}
		}
		return resul;
	}
	
	public Cliente buscarById (int id, int tam, Cliente [] listaClientes) {
		boolean encontrado=false;
		int i=0;
		
		while (i<tam && !encontrado) {
			if(listaClientes[i].getId() == id) {
				encontrado = true;
			} else {
				i++;
			}
		}
		
		if(encontrado) {
			return listaClientes[i];
		}else {
			return null;
		}
	}
	
	public void verSaldo (int id, int tam, Cliente [] listaClientes) {
		int uno = 1;
		for (int i = 0; i < uno; i++) {
			listaClientes[i]=buscarById(id, tam, listaClientes);
			listaClientes[i].verSaldo();
		}
	}
	
	public void sacarDinero (int id, int tam, Cliente [] listaClientes, double retirada) {
		int uno = 1;
		for (int i = 0; i < uno; i++) {
			listaClientes[i]=buscarById(id, tam, listaClientes);
			listaClientes[i].sacarDinero(retirada);;
		}
	}
	
	public void meterDinero (int id, int tam, Cliente [] listaClientes, double ingreso) {
		int uno = 1;
		for (int i = 0; i < uno; i++) {
			listaClientes[i]=buscarById(id, tam, listaClientes);
			listaClientes[i].meterDinero(ingreso);;
		}
	}
	
}
