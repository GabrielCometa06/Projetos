package Aula_0409;

public class Empregado1 {
	//atributos
	private int salario;
	private Pessoa funcionario; //composição muda o tipo do atributo
	
	//construtor com parametros
	public Empregado1(int salario, Pessoa funcionario) {
		this.salario = salario;
		this.funcionario = funcionario;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public Pessoa getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Pessoa funcionario) {
		this.funcionario = funcionario;
	}
}
