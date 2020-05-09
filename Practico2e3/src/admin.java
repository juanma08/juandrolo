
public class admin extends punto_geometrico {

	public static void main(String[] args) {
		punto_geometrico p= new punto_geometrico();
		System.out.println(p.getX());
		System.out.println(p.getY());
		p.desplazar(40, 64);
		System.out.println(p.distancia_eu(20, 24));
	}

}
