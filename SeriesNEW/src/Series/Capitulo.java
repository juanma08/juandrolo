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
	void visto(boolean visto) {
		visto =  true;
    	this.setCalificacion(calificacion);
	}
	String getTitulo() {
		return titulo;
	}
	void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	String getDescripcion() {
		return descripcion;
	}
	void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	boolean isVisto() {
		return visto;
	}
	void setVisto(boolean visto) {
		this.visto = visto;
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
