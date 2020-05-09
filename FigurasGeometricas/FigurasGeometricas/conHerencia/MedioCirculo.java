package FigurasGeometricas.conHerencia;

public class MedioCirculo extends Circulo{

	public MedioCirculo(String n, double ra) {
		super(n,ra);
	}
	
	public double getArea() {
		return super.getArea()/2;
	}
}
