package Series;

import java.util.Vector;

class Serie {
	String titulo;
	String descripcion;
	String genero;
	String director;
	Vector<Temporada> temporadas;
	boolean serieCompletada;
	
	public Serie(String titulo, String descripcion, String genero, String director) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.genero = genero;
		this.director = director;
		serieCompletada = false;		
	}

	int totalVistos(){
		
		int suma = 0;
		for (int i=0; i<temporadas.size(); i++) {
			Temporada temp = (Temporada) temporadas.elementAt(i);
			if(temp!=null) {
				suma+= temp.capVistos();
			}
		}
		return suma;
	}
	int totalCap() {
		int suma=0;
		
		for(int i=0; i<temporadas.size();i++) {
			Temporada temp = (Temporada)temporadas.elementAt(i);
			if(temp!=null) {
				suma+= temp.cantCap();
			}
		}
		return suma;
	}
	boolean serieCompletada() {
		int vistos=totalVistos();
		int cantidadCap =totalCap();
		if(vistos==cantidadCap) {
			return true;
		}
		return false;
	}
}
