
public class punto_geometrico {

	int x;
	int y;
	
	public punto_geometrico() {
		x=0;
		y=0;
	}
	
	public void desplazar(int xd, int yd) {
		x=this.getX();
		y=this.getY();
		x+=xd;
		y+=yd;
	}
	
	public double distancia_eu(int x2, int y2) {
		double distancia = Math.sqrt(((this.getX() - x2)*2)+((this.getY()  - y2)*2));
		return distancia;
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
