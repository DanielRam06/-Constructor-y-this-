
public class Menu {


	public static void main(String[] args) {
		
		Cuadrado cua = new Cuadrado(); 
		
		System.out.println("El lado del cuadrado es: "+cua.ID);
		System.out.println("El perimetro es: "+cua.CalculaPerimetro());
		System.out.println("El area es: "+cua.CalcularArea());
		cua.cambiaLongitud(20);
		System.out.println("El area es: "+cua.CalcularArea());
		System.out.println("La diagonal es: "+cua.calcularDiagonal());
		
		Circulo circu = new Circulo();
		
		System.out.println("El radio del circulo es: "+circu.ID);
		System.out.println("La circunferencia es: "+circu.CalculaCircunferencia());
		System.out.println("El area del circulo es: "+circu.CalcularArea());
		circu.cambiaRadio (10);
		System.out.println("El nuevo valor es: "+circu.cambiaRadio);
		
		
		

	}

}
