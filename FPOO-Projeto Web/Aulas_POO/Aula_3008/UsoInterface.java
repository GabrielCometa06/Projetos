package Aula_3008;

public class UsoInterface implements InterfacePai {
	// atributos
	public String at1;
	// preciso realizar a sobrescrita de metodods!
	@Override
	public void metodo1 () {
		System.out.println("esse é metodo 1");
	}
	@Override
	public void metodo2 () {

	}
	// metodo 3 é da propria classe
	public void somar (int x, int y) {
		int r = x + y;
		System.out.println("A soma é: " + r);
	}
	// metodo 3 é da propria classe
	public void metodo3 () {
		System.out.println(" esse é o metodo 3 da propria classe");
	}
}// fim classe
