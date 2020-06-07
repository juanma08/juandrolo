package Sueldos;

public class ControladorSueldo {

	public static void main(String[] args) {
		Empleado e1= new EmpleadoConComision("e1", 23000,2625);
		e1.setSueldoTotal();
		System.out.println(e1.getNombre());
		System.out.println(e1.getSueldoTotal());
		Empleado e2 = new EmpleadoHorasExtras("e2", 23000, 2625);
		System.out.println(e2.getSueldoTotal());

	}

}
