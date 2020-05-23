
public class Alarma {

	private boolean rotura = true;
	private boolean apertura = true;
	private boolean movimiento = true;
	private Timbre timbre = new Timbre();
	private Luz luz = new Luz();
	
	boolean comprobar() {
		
		if (rotura==false || apertura==false || movimiento==false) {
			
			alarmaLuminosa();
			
			return false;
		}
		return true;
	}

	void alarmaLuminosa() {
		timbre.sonar();
		luz.encender();
	}
	
}
