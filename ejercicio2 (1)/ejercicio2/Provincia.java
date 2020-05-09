package ejercicio2;

public class Provincia {
	
	Ciudad[] ciudades;
	String nombre;
	


	int cantidadCiudades;

	public Provincia(String nombre,int valor) {
		this.ciudades = new Ciudad[valor];
		this.cantidadCiudades = 0;
		this.nombre = nombre;
	}
	
	public void addCiudad(Ciudad city) {
		
		if (cantidadCiudades<ciudades.length) {
			ciudades[cantidadCiudades] = city;
			cantidadCiudades++;
	    }

	}
	
	public int getHabitantes() {
		
		int suma =0;
		for (int i = 0; i<cantidadCiudades; i++) {
			suma = suma + ciudades[i].getHabitantes();
		}
		return suma;	
	}
	
	public double recaudadoImp1() {
		
		double suma =0;
		for (int i = 0; i<cantidadCiudades; i++) {
			suma = suma + ciudades[i].getImpuesto1();
		}
		return suma;	
	}
	
	public double recaudadoTotal() {
		
		double suma =0;
		for (int i = 0; i<cantidadCiudades; i++) {
			suma = suma + ciudades[i].getImpuesto1() + ciudades[i].getImpuesto2();
		}
		return suma;	
	}
	
	public int cantidadCiudades() {
		return cantidadCiudades;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public int cantidadCiudadesDeficit(int minimo) {
		int suma = 0;
		for (int i = 0; i<cantidadCiudades; i++) {
			if ((ciudades[i].getHabitantes()>minimo)&& ciudades[i].estaDeficit())
				suma ++;
	
		}
		
		return suma;
		
	}
	
	
}
