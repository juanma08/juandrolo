
public class Episodio {
    
	String titulo;
	String descripcion;
	boolean visto;
	int calificacion;
	
	public Episodio(String titulo, String descripcion) {
		this.titulo= titulo;
		this.descripcion = descripcion;
		visto = false;
		calificacion = -1;
	}

	public boolean getVisto() {
		return visto;
	}

    public void vioElEpisodio(int puntos) {
    	visto = true;
    	this.setCalificacion(puntos);
    }

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		if (calificacion >=0 && calificacion <= 10)
	    	this.calificacion = calificacion;
		else {
			System.out.println("ERROR CON LA CALIFICACION" + calificacion);    
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	
}
