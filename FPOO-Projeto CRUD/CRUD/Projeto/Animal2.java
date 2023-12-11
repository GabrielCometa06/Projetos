package Projeto;

public class Animal2 {
	private String tipo;
	private String cor;
	private double tamanho;
	
	public Animal2() {
		
	}
	public Animal2(String tipo, String cor, double tamanho) {
		this.tipo = tipo;
		this.cor = cor;
		this.tamanho = tamanho;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	public void exibirAnimal() {
		System.out.println(" Tipo : " + getTipo() + " Cor : "  + getCor() +
				" Tamanho : " + getTamanho());
	}
}
