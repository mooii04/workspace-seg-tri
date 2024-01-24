package ejercicio05;

import java.util.Arrays;

public class Oficina {

	private Empleado [] empList;
	
	 public Oficina(Empleado[] empList) {
		super();
		this.empList = empList;
	}

	public Empleado[] getEmpList() {
		return empList;
	}

	public void setEmpList(Empleado[] empList) {
		this.empList = empList;
	}

	@Override
	public String toString() {
		return "Oficina [empList=" + Arrays.toString(empList) + "]";
	}

	//Cálculo del Sueldo del Empleado
    public double calcularSueldoEmpleado(Empleado emp) {
        return emp.calcularSueldo();
    }

    public double calcularTotalPagado() {
		double resul = 0;
		for (int i = 0; i < empList.length; i++) {
			resul = resul + calcularSueldoEmpleado(empList[i]);
		}
		return resul;
	}

    public void felicitarPorVentas(int objetivoVentas) {
		for (int i = 0; i < empList.length; i++) {
			if(empList[i] instanceof Vendedor) {
				((Vendedor)empList[i]).felicitarPorVentas(objetivoVentas);
			}
		}
	}
}
