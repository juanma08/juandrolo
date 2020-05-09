package FigurasGeometricas;



public class Rectanguloh {

	double lado1;
	double lado2;
	String nombre;
	
	public Rectanguloh(String n, double l1, double l2) {
		lado1= l1;
		lado2= l2;
		nombre = n;
		
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getArea() {
		return lado1*lado2;
	}
	public double getPerimetro() {
		return (lado1+lado2)*2;
	}
	
	public String getDatosCompletos() {
		return nombre + "- " + getArea() + "-" + getPerimetro();
	}
	
}
