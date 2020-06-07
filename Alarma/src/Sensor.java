
public class Sensor extends AlarmaSensorial {
	
	private String nombre;
	private boolean rotura;
	private boolean apertura;
	private boolean movimiento;
	private boolean conflicto;
	
public Sensor(String nombre, boolean rotura, boolean apertura, boolean movimiento) {
		
		this.nombre=nombre;
		this.rotura=rotura;
		this.apertura=apertura;
		this.movimiento=movimiento;
		
	}

	boolean comprobar() {
	
	if (rotura==true || apertura==true || movimiento==true) {
		
		setConflicto(true);
		return true;
	}
	else {		
	return false;
	}
	}
	
	void setConflicto(boolean conflicto) {
		this.conflicto = conflicto;
	}

	boolean isConflicto() {
		return conflicto;
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
