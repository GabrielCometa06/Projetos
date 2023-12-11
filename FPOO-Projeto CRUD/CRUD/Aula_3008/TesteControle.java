package Aula_3008;

public class TesteControle {

	public static void main(String[] args) {
		// instancia de objetos
		Tv tv1 = new Tv();
		tv1.ligar();
		tv1.volumeMais(10);
		tv1.volumeMais(11);
		tv1.voluMenos(12);
		System.out.println("polegadas da Tv: " + tv1.getPolegadas());

	}

}
