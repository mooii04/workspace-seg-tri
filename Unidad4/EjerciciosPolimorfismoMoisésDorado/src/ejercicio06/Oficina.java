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
			resul = resul + calcularSaldoTotal(listaCuentas[i], ingreso, retirada);
		}
		return resul;
	}
	
	/*
	public double calcularRoboEmpresas() {
		
	}
	
	public double calcularRegaloJovenes() {

	}
	*/
}
