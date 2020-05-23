import java.util.Vector;

public class AlarmaSensorial {

	private Vector<Sensor> sensores;
	private Timbre timbre;
	private Luz luz;
	
	public AlarmaSensorial() {
		this.sensores = new Vector<Sensor>(); 
		this.timbre = new Timbre();
		this.luz = new Luz();
	}
	
	void agregarSensor(Sensor sensor) {
		sensores.add(sensor);
	}
	
	
	boolean comprobarSensores() {
		
		for (int i =0; i<sensores.size(); i++) {
			if (sensores.elementAt(i) ) {
				
			}
		}
		
		return true;
	}
	void alarmaLuminosa() {
		timbre.sonar();
		luz.encender();
	}
	
}
