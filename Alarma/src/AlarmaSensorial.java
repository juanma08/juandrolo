import java.util.Vector;

public class AlarmaSensorial {
	
	private Vector<Sensor> conflictos;
	private Vector<Sensor> sensores;
	private Timbre timbre;
	private Luz luz;
	
	public AlarmaSensorial() {
		this.sensores = new Vector<Sensor>(); 
		this.conflictos = new Vector<Sensor>();
		this.timbre = new Timbre();
		this.luz = new Luz();
	}
	
	void informarConflictos() {
		 for (int i=0; i<conflictos.size(); i++ ) {
			String nombre = conflictos.elementAt(i).getNombre();
			if (conflictos.elementAt(i).isApertura()){
				System.out.println(" SE ABRIO UNA PUERTA O VENTANA EN LA ZONA: " + nombre);
			}
			else if (conflictos.elementAt(i).isMovimiento()){
				System.out.println("SE DETECTO UN MOVIMIENTO EN LA ZONA: " + nombre);
			}
			else if (conflictos.elementAt(i).isRotura()){
				System.out.println("SE ROMPIO UN VIDRIO EN LA ZONA: " + nombre);
			}
		}
	}
	
	void agregarSensor(String nombre, boolean rotura, boolean apertura, boolean movimiento) {
		
		Sensor sensor = new Sensor(nombre, rotura, apertura, movimiento);
		
		sensores.add(sensor);
	}
	
	
	boolean comprobarSensores() {
		
		for (int i =0; i<sensores.size(); i++) {
			sensores.elementAt(i).comprobar();
			if (sensores.elementAt(i).isConflicto()) {
				conflictos.add(sensores.elementAt(i));
			}
		}
		if (conflictos.isEmpty()) {		
			return false;
		}
		else {
			alarmaLuminosa();
			informarConflictos();
			return true;
		}
	}
	void alarmaLuminosa() {
		timbre.sonar();
		luz.encender();
	}
	
}
