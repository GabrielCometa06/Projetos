package Clube_Gabriel_Cometa;

public class Pessoa {
	private String nome;
	private int idade;
	private String cpf;
	private int telefone;
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, int idade, String cpf, int telefone) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public void exibirPessoa() {
		System.out.println(" notas da Pessoa: " + getNome() + getIdade() + getCpf() + getTelefone());
	}
}
