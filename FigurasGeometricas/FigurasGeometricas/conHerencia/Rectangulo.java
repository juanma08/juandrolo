package FigurasGeometricas.conHerencia;

public class Rectangulo extends Figura {
	
	double lado1;
	double lado2;
	
	public Rectangulo(String n, double l1, double l2) {
		super(n);
		lado1= l1;
		lado2= l2;

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
	
	public double getArea() {
		//return lado1*lado2;
		return super.getArea();
	}
	
	public double getPerimetro() {
		return (lado1+lado2)*2;
	}
	
	
	public String toString() {
		return "Rectangulo de " + getArea();
	}
}
