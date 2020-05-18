package Series;

import java.util.Vector;

class Serie {
	String titulo;
	String descripcion;
	String genero;
	String director;
	Vector<Temporada> temporadas;
	
	public Serie(String titulo, String descripcion, String genero, String director) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.genero = genero;
		this.director = director;
		temporadas = new Temporada();
	}

	
	
}
