
public class admin extends punto_geometrico {

	public static void main(String[] args) {
		punto_geometrico p= new punto_geometrico();
		System.out.println(p.getX());
		System.out.println(p.getY());
		p.setX(10);
		p.setY(20);
		int x =p.getX();
		int y =p.getY();
		Rectangulo r = new Rectangulo (x,y);	
		System.out.println(r.getBase()+ " " + r.getAltura());
	}

}
