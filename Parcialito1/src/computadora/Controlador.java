package computadora;

class Controlador {

	public static void main(String[] args) {
		Computadora c1  = new Computadora (10,2);
		Tarea t1 = new Tarea ("eclipse", 2);
		ejecutarTarea(c1,t1);
		System.out.println(t1.isEjecutada());
		
		int a = 15;
		int b =  15;
		System.out.println(a==b);
	}
	
	public static void ejecutarTarea(Computadora cc, Tarea tt) {
		double memoria = cc.getMemoria();
		double cantMemoria =  tt.getCantMemoria();
		
		if (memoria>=cantMemoria) 
			tt.setEjecutada(true);	
		else
			tt.setEjecutada(false);
	}
	
}
