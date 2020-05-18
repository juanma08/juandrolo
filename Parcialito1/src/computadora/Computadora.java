package computadora;

class Computadora {
	int velocidad;
	double memoria;
	public Computadora(int v, double m) {
		velocidad = v;
		memoria  = m;
	}
	int getVelocidad() {
		return velocidad;
	}
	void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	double getMemoria() {
		return memoria;
	}
	void setMemoria(double memoria) {
		this.memoria = memoria;
	}
}
