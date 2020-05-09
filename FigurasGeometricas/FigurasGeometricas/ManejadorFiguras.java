package FigurasGeometricas;

public class ManejadorFiguras {
	
	public void imprimir(Rectanguloh rr) {
		
		System.out.println(rr.getDatosCompletos());
	}
	public void imprimir(Circuloh cc) {
		
		System.out.println(cc.getDatosCompletos());
	}
	
	public static void main(String[] args) {
		
		ManejadorFiguras mfs = new ManejadorFiguras();
		
		Rectanguloh r1 = new Rectanguloh("aa", 10,5);
		Rectanguloh r2 = new Rectanguloh("aa2", 10,100);
		mfs.imprimir(r1);
		mfs.imprimir(r2);
		
		Circuloh c1 = new Circuloh("circulo",25);
		
		mfs.imprimir(c1);
		
	}

}
