package Aula_2308;

public class Caixa extends CaixaEletronico {//BANCO caixa economica federal
	//metodo
	@Override
	public void sacar (double valor) {
		valor = valor + 0.9; //taxa cobrada peka transação
		System.out.println("O seu saque no caixa Economico Federal " + "foi = " + valor);
	}

}
