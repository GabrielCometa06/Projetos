package Aula_2108;

public class SubClasse1 extends ClassePai {
	// "extends" --> Herança
	
	
	//metodo construtor
	public SubClasse1() {
		super();
		nome = super.nome;
		System.out.println("imprimi na ClassePai");
		super.metodoImprimir();//esse metodo esta na ClassePai
	}

	
		
	
}