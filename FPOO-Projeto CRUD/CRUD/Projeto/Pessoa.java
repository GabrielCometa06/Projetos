package Projeto;

public class Pessoa {
	//atributos

	private String nome;
	private String sobrenome;
	private int cpf;
	private int idade;
	
	//construtores
	//padrao
	public Pessoa() {
		
	}
	//com parametros
	public Pessoa(String nome, String sobrenome, int cpf, int idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	//metodos
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getIdade () {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void exibirInfo() {
		System.out.println(" Nome: " + getNome() + " Sobrenome: " 
				+ getSobrenome() + " Idade: " 
				+ getIdade() + " Cpf: " + getCpf() );
	}
}
