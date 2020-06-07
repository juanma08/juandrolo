package Sueldos;

public class Empleado {
	protected double montoExtra;
	protected String nombre;
	protected double sueldoFijo;
	protected double sueldoTotal;
	public Empleado(String n, double sueldoFijo) {
		this.nombre=n;
		this.sueldoFijo=sueldoFijo;
	}
	double getMontoExtra() {
		return 0;				
	}
	String getNombre() {
		return nombre;
	}
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	double getSueldoFijo() {
		return sueldoFijo;
	}
	void setSueldoFijo(double sueldoFijo) {
		this.sueldoFijo = sueldoFijo;
	}
	void setSueldoTotal() {
		this.sueldoTotal=sueldoTotal;
	}
	double getSueldoTotal() {
		return sueldoTotal;
	}
	public char[] getSueldoTotal(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
