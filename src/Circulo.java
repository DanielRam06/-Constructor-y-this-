
public class Circulo {
	
	public float ID;
	public float cambiaRadio;
	
	
	public Circulo() {
		this (172020);
	}
	
	public Circulo (float y) {
	   ID = y;
	}
	public float CalculaCircunferencia() {
		return (float) (Math.PI *(ID*2));
	}
	public float CalcularArea() {
		return (float) (Math.PI *(Math.pow(ID, 2)));
	}
	public void cambiaRadio (float cambiaRadio) {
		ID = cambiaRadio;
		cambiaRadio = cambiaRadio;
		
	}

}
