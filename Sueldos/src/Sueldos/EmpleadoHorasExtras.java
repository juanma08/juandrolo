package Sueldos;

public class EmpleadoHorasExtras extends Empleado{
	int horasExtras;
	
	double valorHorasExtras;

	public EmpleadoHorasExtras(String n, double sueldoFijo, int horasExtras) {
		super(n,sueldoFijo);
		
		this.horasExtras=horasExtras;
		valorHorasExtras=230;
	}
	protected double getMontoExtra() {
		return valorHorasExtras*horasExtras;
	}

	int getHorasExtras() {
		return horasExtras;
	}

	void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	double getSueldoTotal() {
		return sueldoFijo+getMontoExtra();
	}
	


}
