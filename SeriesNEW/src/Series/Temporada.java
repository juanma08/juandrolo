package Series;

import java.util.Vector;

class Temporada {
	Vector capitulos;
	String nombreTemporada;
	public Temporada(String nombreTemporada) {
		capitulos = new Vector();
		this.nombreTemporada=nombreTemporada;
	}
	String getNombreTemporada() {
		return nombreTemporada;
	}
	void setNombreTemporada(String nombreTemporada) {
		this.nombreTemporada = nombreTemporada;
	}
	Vector getCapitulos(int nro) {
		int posVector= nro -1;
		if(posVector>=0&&posVector<=5) {
			
		}
		return capitulos;
	}
	void setCapitulos(Vector capitulos) {
		this.capitulos = capitulos;
	}
}
