
public class Temporada {

	int cantEpisodios;
	Episodio[] episodios;
	String nombreTemporada;
	
	public Temporada(int cantEpisodios, String nombre) {
		this.cantEpisodios= cantEpisodios;
		this.nombreTemporada = nombre;
		episodios = new Episodio[cantEpisodios];

	}

	public int getCantEpisodios() {
		return cantEpisodios;
	}

	public void setCantEpisodios(int cantEpisodios) {
		this.cantEpisodios = cantEpisodios;
	}

	public Episodio getEpisodio(int nro) {
		int posArreglo = nro - 1; 
		if ((posArreglo>=0)&&posArreglo<cantEpisodios) {
		    return episodios[posArreglo];
		 }
		else
			return null;
	}

	public void addEpisodio(Episodio episodioDado, int nro) {
		int posArreglo = nro - 1;
		if ((posArreglo>=0)&&posArreglo<cantEpisodios) {
	     	episodios[posArreglo] = episodioDado;
		}else {
			return;
		}
	}
	
	public int getCantidadEpisodiosCargados() {
		int suma = 0;
		for(int i=0; i<cantEpisodios; i++) {
			if (episodios[i]!=null) {
				suma++;
			}
		}
		return suma;
		
	}

	public int episodiosVistos() {
		int suma = 0;
		for (int i =0; i<episodios.length; i++) {
			Episodio ep = episodios[i];
			if(ep!=null && ep.getVisto() )
				suma ++; 
		}
		return suma;
	}
	
	
	
	
	
	public String getNombreTemporada() {
		return nombreTemporada;
	}

	public void setNombreTemporada(String nombreTemporada) {
		this.nombreTemporada = nombreTemporada;
	}
	
	
	
	
}
