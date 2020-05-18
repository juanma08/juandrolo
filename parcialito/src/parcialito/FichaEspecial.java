package parcialito;

public class FichaEspecial extends Ficha{

	public FichaEspecial(String nombre,  int espacio, int fortaleza, int poder) {
		super(nombre,  espacio,  fortaleza , poder);
		super.poder=this.getPoder();
	}
	
	int getPoder(){
		int poder = fortaleza /espacio;
		return  poder; 
	}
	
}
