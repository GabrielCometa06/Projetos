package Aula_1408;

public class TesteCarro {

	private static final String modelo = null;
	private static final float potencia = 0;

	public static void main(String[] args) {
		
		//carro 1: supla
		Carro c1 = new Carro();
			c1.modelo = "supla";
		System.out.println("o modelo é: " + c1.modelo);
			c1.getPotencia(1500);
		System.out.println("a potencia é: " + c1.getPotencia());
		
		//carro2: BMW
		Carro c2 = new Carro();
			c2.modelo = "BMW";
		System.out.println("o modelo é: " + c2.modelo);
			c2.getPotencia(1900);
		System.out.println("a potencia é: " + c2.getPotencia());
		
		//carro 3: CIVIC
		Carro c3 = new Carro("CIVIC", 2400);
			c3.modelo = "CIVIC";
		System.out.println("o modelo é: " + c3.modelo);
			c3.getPotencia(2400);
		System.out.println("a potencia é: " + c3.getPotencia());
		
		

	}

}
