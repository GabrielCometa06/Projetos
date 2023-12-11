package Aula_2308;

public class CaixaEletronico {
	//atributos
	//contrutores
	//getters e setters
	//metodo especial
	public void sacar (double valor) {
		valor = valor + 0.5; //taxa cobrada peka transação
		System.out.println("O seu saque no caixa eletronico " + "foi = " + valor);
	}
}
