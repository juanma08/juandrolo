package FigurasGeometricas.conHerencia;

public class Circulo extends Figura{
    
    double radio;
    
    public Circulo(String n, double r) {
    	super(n);
    	radio= r;
    	
    }


	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
    
	public double getArea() {
		return Math.PI * radio * radio;
	}
    public double getPerimetro(){
    	return 2 * Math.PI * radio;
    }

}
