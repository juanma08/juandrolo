package FigurasGeometricas.conHerencia;

public class Figura {
	
	String nombre;
	
	public Figura(String n) {
		nombre = n;
	}
	
	public double getArea() {
		return 0;
	}
	public double getPerimetro() {
		return 0;
	}
	
	public String getDatosCompletos() {
		return nombre + "-" + this.getArea() + "-" + getPerimetro();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return "Figura  ";
	}
	
}
