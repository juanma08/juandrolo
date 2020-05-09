
public class Serie {

	String titulo;
	String descripion;
	String creador;
	String genero;
	Temporada[]  temporadas;
	int MAXTEMPORADAS = 50;
	
	public Serie(String titulo, String descripion, String creador, String genero) {
		this.titulo = titulo;
		this.descripion = descripion;
		this.creador = creador;
		this.genero = genero;
		temporadas = new Temporada[MAXTEMPORADAS];
	}
 //JAVA      0   1
//Array 	[  ,  ]
// USER       1  2
	public void addTemporada(Temporada tnueva, int nro) {
		int posArreglo = nro - 1;
		if (posArreglo>=0 && posArreglo<MAXTEMPORADAS) {
			temporadas[posArreglo]= tnueva;
		}
		
	}
	
	public Temporada getTemporada(int nro) {
		int posArreglo = nro - 1;
		if (posArreglo>=0 && posArreglo<MAXTEMPORADAS) {
			return temporadas[posArreglo];
		}
		
		return null;
	}
	//  [T1, T2 , T3, null, null]
	
	public void addEpisodio(Episodio epNuevo, int nroTemp, int nroEp) {
		int posArreglo = nroTemp - 1;
		if (posArreglo>=0 && posArreglo<MAXTEMPORADAS) {
			 Temporada tempToAdd = temporadas[posArreglo];
			 if (tempToAdd!=null) {
				 tempToAdd.addEpisodio(epNuevo, nroEp);
			 }
		}
	}
	
	
	public int episodiosVistos() {
		int suma = 0;
		for (int i = 0; i<temporadas.length;i++) {
			Temporada temp = temporadas[i];
			if(temp!=null) {
				suma = suma + temp.episodiosVistos();
			}
		}
		return suma;
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripion() {
		return descripion;
	}

	public void setDescripion(String descripion) {
		this.descripion = descripion;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	public static void main(String[] args) {
		
		Episodio e1=new Episodio("hola", "descr");
		
		Serie losSimpsons = new Serie("los Simpsons", "dibujos", "mat", "animado");
		
		Temporada t1 = new Temporada(25, "season 1");
		
		t1.addEpisodio(e1,1);
		///
		losSimpsons.addTemporada(t1, 1);
		
		Episodio e2 = new Episodio("regreso", "el dos");
		
		losSimpsons.addEpisodio(e2, 1, 1);
		//losSimpsons.addEpisodio(e2, 1, 2);
		
		System.out.println(t1.getCantidadEpisodiosCargados());
		
		
		
	}
	
}
