package Aula_3008;

public class Tv implements ControleRemoto {

	@Override
	public void ligar() {
		System.out.println("Ligando... ");
		
	}

	@Override
	public void desigar() {
		System.out.println("Desligando... ");
		
	}

	@Override
	public void volumeMais(int vol) {
		vol = vol +1;
		System.out.println("Aumentando: " + vol);
		
	}

	@Override
	public void voluMenos(int vol1) {
		vol1 = vol1 -1;
		System.out.println("Diminuindo: " + vol1);
		
	}

	@Override
	public int getPolegadas() {
		return 55;

		
	}

}
