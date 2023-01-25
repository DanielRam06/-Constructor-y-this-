
public class Cuadrado {
	
	public float ID;
	
	public Cuadrado() {
		this (172020);
	}
	
	public Cuadrado (float y) {
	   ID = y;
	}
	public float CalculaPerimetro() {
		return ID*4;
	}
	public float CalcularArea() {
		return ID*ID;
	}
	public double calcularDiagonal() {
		return Math.sqrt((ID*ID)+(ID*ID));
	}
	public void cambiaLongitud (float y) {
		ID = y;
		
	}
}