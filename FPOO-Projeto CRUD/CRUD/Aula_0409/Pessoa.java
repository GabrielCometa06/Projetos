package Aula_0409;

public class Pessoa {
	//atributos
	public String nome;
	public String cargo;
	public int idade;
	//construtor com parametros
	public Pessoa(String nome, String cargo, int idade) {
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
