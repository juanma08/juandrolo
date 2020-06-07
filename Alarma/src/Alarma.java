
public class Alarma {
	private String nombre;
	private boolean rotura;
	private boolean apertura;
	private boolean movimiento;
	private Timbre timbre = new Timbre();
	private Luz luz = new Luz();
	
	public Alarma(String nombre, boolean rotura, boolean apertura, boolean movimiento) {
		
		this.nombre=nombre;
		this.rotura=rotura;
		this.apertura=apertura;
		this.movimiento=movimiento;
		
	}
	boolean comprobar() {
		
		if (rotura==true || apertura==true || movimiento==true) {
			
			alarmaLuminosa();
			
			return true;
		}
		return false;
	}

	void alarmaLuminosa() {
		timbre.sonar();
		luz.encender();
	}
	String getNombre() {
		return nombre;
	}
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	boolean isRotura() {
		return rotura;
	}
	void setRotura(boolean rotura) {
		this.rotura = rotura;
	}
	boolean isApertura() {
		return apertura;
	}
	void setApertura(boolean apertura) {
		this.apertura = apertura;
	}
	boolean isMovimiento() {
		return movimiento;
	}
	void setMovimiento(boolean movimiento) {
		this.movimiento = movimiento;
	}
	
}
