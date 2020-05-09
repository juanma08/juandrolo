package ejercicio2;

public class Ciudad {
      
	  String nombre;
	 int habitantes;
	 double imp1;
	 double imp2;
	 double imp3;
	 double imp4;
	 double imp5;
	 
	 double gasto;
	
	 public Ciudad(String nombre) {
		 this.nombre = nombre;
		 imp1 =0;
		 imp2 =0;
		 imp3 =0;
		 imp4 =0;
		 imp5 =0;
		 habitantes = 0;
		 gasto = 0;
	 }
	 
	 public void addGasto(double g) {
		 gasto = gasto + g;
	 }
	 
	 public double getGasto() {
		 return gasto;
	 }
	 
	 /// FALTAN AGREGAR METODOS PARA LOS DEMAS IMPUESTOS
	
	 public void addImpuesto1(double a) {
		 imp1 = imp1 + a;
	 }
	 public double getImpuesto1() {
		 return imp1;
	 }
	 public void addImpuesto2(double a) {
		 imp2 = imp2 + a;
	 }
	 public double getImpuesto2() {
		 return imp2;
	 }
	 
	 //////////////////
	 
	 public void setHabitantes(int habitantes) {
		 this.habitantes = habitantes;
	 }
	 public int getHabitantes() {
		 return habitantes;
	 }
	 
	 
	public boolean estaDeficit() {
		//boolean x;
		double suma = imp1+imp2+imp3+imp4+imp5;
		
		if (gasto>suma) //deficit
			return true;
		else
			return false;
		
		/// return  (gasto > suma)

	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
