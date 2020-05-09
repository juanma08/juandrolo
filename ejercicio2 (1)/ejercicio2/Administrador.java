package ejercicio2;

public class Administrador {

	
	public static void main (String[] args) {
		
		Ciudad bolivar = new Ciudad("Bolivar");
		bolivar.addGasto(12000);
		bolivar.addImpuesto1(1000);
		bolivar.addImpuesto2(2000);
		bolivar.setHabitantes(120000);
		
		Ciudad bolivar2 = new Ciudad("Bolivar2");
		bolivar2.addGasto(1200);
		bolivar2.addImpuesto1(1000);
		bolivar2.addImpuesto2(2000);
		bolivar2.setHabitantes(100001);
		
	    Ciudad pehuajo = new Ciudad("Pehuajo");
	    pehuajo.setHabitantes(40000);
	    pehuajo.addGasto(1000);
	    
	
		Provincia bsas = new Provincia("Buenos Aires",50);
		
		bsas.addCiudad(bolivar);
		bsas.addCiudad(bolivar2);
		bsas.addCiudad(pehuajo);
		
		System.out.println("La provincia " + bsas.getNombre() +
				           " recaudo " + bsas.recaudadoTotal() +
				           " tiene "+ bsas.cantidadCiudadesDeficit(10000) +
				           " en deficit"	);
		
		bolivar.addImpuesto1(20000);
		
		System.out.println("La provincia " + bsas.getNombre() +
		           " recaudo " + bsas.recaudadoTotal() +
		           " tiene "+ bsas.cantidadCiudadesDeficit(10000) +
		           " en deficit"	);
		
		
		
		
		
		
		
		
		//System.out.println(bolivar.estaDeficit());
	}
}
