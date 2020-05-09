package FigurasGeometricas.conHerencia;



public class ManejadorFiguras {
	
	public void imprimir(Figura ff) { //ff=r1;
		
		System.out.println(ff.getDatosCompletos());
	}

    public static void main(String[] args) {
		
		ManejadorFiguras mfs = new ManejadorFiguras();
		
		Rectangulo r1 = new Rectangulo("aa", 10,5);
		Figura f1= new Rectangulo("rr",20,20);
		f1= new Circulo("cc",10);
		
		f1.getArea();
		
		
		
		
		mfs.imprimir(r1);
		
		
		System.out.println(r1);
		
		//if (r1.equals(f1))
		
		
    }	
}
