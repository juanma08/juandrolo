
public class controladorAlarma {

	public static void main(String[] args) {
		AlarmaSensorial alarma = new AlarmaSensorial();
		alarma.agregarSensor("SOTANO", true, false, false);
		alarma.agregarSensor("COCINA", false, false, true);
		alarma.agregarSensor("LIVING", false, true, false);
		alarma.comprobarSensores();
	}

}
