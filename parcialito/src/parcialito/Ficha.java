package parcialito;

public class Ficha extends Golosina {
	
	 String nombre;
	 int espacio;
	 int fortaleza;
	 int poder;
	
	public Ficha(String nombre,  int espacio, int fortaleza, int poder) {
		
		this.nombre = nombre;
		this.espacio =  espacio;
		this.fortaleza = fortaleza;
		this.poder = poder;
	}

	int getEspacio() {
		return espacio;
	}

	void setEspacio(int espacio) {
		this.espacio = espacio;
	}

	int getFortaleza() {
		return fortaleza;
	}

	void setFortaleza(int fortaleza) {
		this.fortaleza = fortaleza;
	}

	int getPoder() {
		return poder;
	}

	void setPoder(int poder) {
		this.poder = poder;
	}

	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
}
