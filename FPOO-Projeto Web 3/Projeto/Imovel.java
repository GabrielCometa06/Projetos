package Projeto;

public class Imovel {
	//atributos 
	private int numeroQuartos;
	private int valor;
	private String local;
	private int qtdMoveis;
	private String residencia;
	
	//construtor padrao
	public Imovel() {
		
	}
	
	//construtor com parametros
	public Imovel(int numeroQuartos, int valor, String local, int qtdMoveis) {
		this.numeroQuartos = numeroQuartos;
		this.valor = valor;
		this.local = local;
		this.qtdMoveis = qtdMoveis;
	}
	
	//getter e setters
	
	public int getNumeroQuartos() {
		return numeroQuartos;
	}
	public void setNumeroQuartos(int numeroQuartos) {
		this.numeroQuartos = numeroQuartos;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public int getQtdMoveis() {
		return qtdMoveis;
	}
	public void setQtdMoveis(int qtdMoveis) {
		this.qtdMoveis = qtdMoveis;
 	}
	public String getResidencia() {
		return residencia;
	}
	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}
	public void exibirImovel() {
		System.out.println("Residencia " + getResidencia() + " Numero Quartos: " 
				+ getNumeroQuartos() + " Valor: " + getValor() 
				+ " Local: " + getLocal() + " Quantidade de Moveis: " 
				+ getQtdMoveis());
	}
}
