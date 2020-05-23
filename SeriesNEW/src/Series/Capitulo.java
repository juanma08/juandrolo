package Series;

class Capitulo {
	String titulo;
	String descripcion;
	boolean visto;
	int calificacion;
	public Capitulo(String t, String d) {
		titulo  = t;
		descripcion = d;
		visto = false;
		calificacion=-1;
	}

	String getTitulo() {
		return titulo;
	}
	String getDescripcion() {
		return descripcion;
	}
	boolean isVisto() {
		return visto;
	}
	void setVisto(boolean visto, int calificacion) {
		this.visto = visto;
		this.setCalificacion(calificacion);
	}
	int getCalificacion() {
		return calificacion;
	}
	void setCalificacion(int c) {
		if(c>=1&&c<=5) {
		calificacion = c;
		}
		else {
			System.out.println("ERROR CON LA CALIFICACION" + calificacion);    
		} 
	}
}
