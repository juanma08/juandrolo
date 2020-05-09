package FigurasGeometricas;

public class Circuloh {
    String nombre;
    double radio;
    
    public Circuloh(String n, double r) {
    	nombre = n;
    	radio= r;
    	
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
    
	public String getDatosCompletos() {
		return nombre + "- " + getArea() + "-" + getPerimetro();
	}
}
