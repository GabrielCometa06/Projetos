package Projeto;

public class Cliente extends Pessoa {
	//atributos
	private int qtdAcompanhantes;
	private String preferenciaQuarto;
	private double tamanho;
	
	//construtor padrao
	public Cliente () {
		
	}
	
	//construtor com parametros
	public Cliente(int qtdAcompanhantes, String preferenciaQuarto, double tamanho) {
		this.qtdAcompanhantes = qtdAcompanhantes;
		this.preferenciaQuarto = preferenciaQuarto;
		this.tamanho = tamanho;
	}
	
	//getters e setters --- metodos:
	
	public void orcamento() {
		System.out.println("Cliente fazendo orçamento com o funcionario...");
	}
	public void pagamento() {
		System.out.println("Cliente pagando seu orçamento...");
	}
	public int getQtdAcompanhantes () {
		return qtdAcompanhantes;
	}
	public void setQtdAcompanhantes(int qtdAcompanhantes) {
		this.qtdAcompanhantes = qtdAcompanhantes;
	}
	public String getPreferenciaQuarto() {
		return preferenciaQuarto;
	}
	public void setPreferenciaQuarto(String preferenciaQuarto) {
		this.preferenciaQuarto = preferenciaQuarto;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
}
