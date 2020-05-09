package Practico2e1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
	String nombre;
	String apellido;
	int edad;
	String fecha_de_nacimiento;
	int dni;
	String sexo;
	double peso;
	double altura;
	public Persona(int dni) {	
		this.nombre="N";
		this.apellido="N";
		this.fecha_de_nacimiento = "01/01/2000";
		this.edad=0;
		this.dni=dni;
		this.peso=1.0;
		this.altura=1.0;
	}
	public Persona(String nombre, String apellido, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_de_nacimiento = "01/01/2000";
		this.edad=0;
		this.dni=dni;
		this.peso=1.0;
		this.altura=1.0;
	}

	public Persona(String nombre, String apellido, int edad, String fecha_de_nacimiento, int dni, String sexo, double peso,  double altura) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fecha_de_nacimiento = fecha_de_nacimiento;
		this.dni = dni;
		this.sexo  = sexo;
		this.peso = peso;
		this.altura = altura;
		
	}
	
	public double masa_corporal() {
		altura=this.getAltura();
		peso=this.getPeso();
		double imc=peso/(altura*altura); 
		return imc;
	}
	public boolean en_forma() {
		double imc=this.masa_corporal();
		if(imc>=18.5&&imc<=25) {
			return true;
		}
		return false;
		
	}
	public  boolean cumple() {
		String fecha_actual="09-05-2020";
		String fecha_sin_ano=fecha_actual.replace(fecha_actual.substring(5), "") ;
		String fecha_nacimiento = this.getFecha_de_nacimiento();
		String nacimiento_sin_ano=fecha_nacimiento.replace(fecha_nacimiento.substring(5), "");

		System.out.println(fecha_sin_ano);
		System.out.println(nacimiento_sin_ano);
		if(fecha_sin_ano.equals(nacimiento_sin_ano)) {
			System.out.println("ES EL CUMPLE!");
			return true;
		}
		else {
			System.out.println("NO ES EL CUMPLE!");
			return false;
		}
	}
	public boolean mayor_18() {
		String fecha_nacimiento=this.getFecha_de_nacimiento();
		String fecha_actual="09-05-2020";
		if()
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFecha_de_nacimiento() {
		return fecha_de_nacimiento;
	}

	public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
		this.fecha_de_nacimiento = fecha_de_nacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
