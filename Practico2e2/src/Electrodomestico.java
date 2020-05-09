public class Electrodomestico {
	String nombre;
	double precioBase;
	String color;
	double consumoEnergeticoKW;
	double pesoKG;
	public Electrodomestico(String nombre) {
		this.nombre = nombre;
		precioBase  = 100.0;
		color = "Gris Plata";
		consumoEnergeticoKW = 10.0;
		pesoKG = 2.0;
		}
	public Electrodomestico(String nombre, double precioBase, String color,double consumoEnergeticoKW, double pesoKG ) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergeticoKW = consumoEnergeticoKW;
		this.pesoKG = pesoKG;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {  
		this.nombre = nombre;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getConsumoEnergeticoKW() {
		return consumoEnergeticoKW;
	}
	public void setConsumoEnergeticoKW(double consumoEnergeticoKW) {
		this.consumoEnergeticoKW = consumoEnergeticoKW;
	}
	public double getPesoKG() {
		return pesoKG;
	}
	public void setPesoKG(double pesoKG) {
		this.pesoKG = pesoKG;
	}
	public boolean bajoConsumo() {
		double consumoKW=this.getConsumoEnergeticoKW();
		if(consumoKW<45) {
			return true;
		}
		else return false;
	}
	public double balance() {
		double precio=this.getPrecioBase();
		double peso=this.getPesoKG();
		return precio/peso;
	}
	public boolean altaGama() {
		double balance = this.balance();
		if (balance>3)
		return true;
		else return false;
	}
}
