package Series;

import java.util.Vector;

class Temporada {
	Vector<Capitulo> capitulos;
	String nombreTemporada;
	public Temporada(String nombreTemporada) {
		capitulos = new Vector<Capitulo>();
		this.nombreTemporada=nombreTemporada;
	}
	String getNombreTemporada() {
		return nombreTemporada;
	}
	void setNombreTemporada(String nombreTemporada) {
		this.nombreTemporada = nombreTemporada;
	}
	Capitulo getCapitulos(int nro) {
		int posVector= nro -1;
		if((posVector>=0)&&posVector<=capitulos.size()) {
			return (Capitulo) capitulos.elementAt(posVector);
		}
		return null;
	}

	void addCapitulo(Capitulo capituloDado){
		capitulos.add(capituloDado);
		
	}
	
	int capVistos(){
		int suma=0;
		for(int i=0; i<capitulos.size(); i++) {
			Capitulo cap = (Capitulo) capitulos.elementAt(i);
			if(cap!=null&&cap.isVisto()) {
				suma++;
			}	
		}
		return 	suma;
	}
	
	double promCalif() {
		double promedio=0;
		int suma=0;
		for(int i=0; i<capitulos.size(); i++) {
			Capitulo cap = (Capitulo) capitulos.elementAt(i);
			if(cap!=null&&cap.calificacion!=-1) {				
			suma += cap.calificacion;
			}
		}
		promedio = suma/capVistos();
		
		return promedio;
	}

	 int cantCap() {
		return capitulos.size();
	}
	
}
