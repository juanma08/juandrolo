package Sueldos;

public class EmpleadoConComision extends Empleado {
	int cantVentas;
	double porcentaje;
	
	public EmpleadoConComision(String n, int sueldoFijo, int cantVentas) {
		super(n,sueldoFijo);
		this.cantVentas=cantVentas;	
	}
	double getMontoExtra() {	
		return getPorcentaje();
	}
	int getCantVentas() {
		return cantVentas;
	}
	void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}
	double getPorcentaje() {
		porcentaje=(sueldoFijo*cantVentas)/100;
		return porcentaje;
	}
	double getSueldoTotal() {
			double sueldoTotal=sueldoFijo+getMontoExtra();
			return sueldoTotal;
	}

	
}
