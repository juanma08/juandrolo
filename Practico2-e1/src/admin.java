import java.util.GregorianCalendar;

import Practico2e1.Persona;
public class admin {

	public static void main(String[] args) {
		Persona p1= new Persona(38921716);
		String	fecha_de_nacimiento=p1.getFecha_de_nacimiento();
		Persona p2=new Persona("Sergio", "Aguero", 22, "09-05-2020",  40548340, "Masculino", 65.5, 1.75);
		fecha_de_nacimiento=p2.getFecha_de_nacimiento();
		System.out.println(fecha_de_nacimiento);
		p2.cumple();
	}

}

