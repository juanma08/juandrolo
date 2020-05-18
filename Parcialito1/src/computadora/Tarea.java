package computadora;

class Tarea {
	String nombre;
	double cantMemoria;
	boolean ejecutada;
	public Tarea(String n, double cantM) {
		nombre =  n;
		cantMemoria  = cantM;
		ejecutada = false;
	}
	String getNombre() {
		return nombre;
	}
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	double getCantMemoria() {
		return cantMemoria;
	}
	void setCantMemoria(double cantMemoria) {
		this.cantMemoria = cantMemoria;
	}
	boolean isEjecutada() {
		return ejecutada;
	}
	void setEjecutada(boolean ejecutada) {
		this.ejecutada = ejecutada;
	}
}
