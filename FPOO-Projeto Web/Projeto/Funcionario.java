package Projeto;

public class Funcionario extends Pessoa {
	private int salario;
	
	public Funcionario() {
		
	}
	public Funcionario(int salario) {
		this.salario = salario;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public void Anotar() {
		System.out.println("Funcionario anotando seus dados");
	}
	public void exibirFuncionario() {
		System.out.println(" Salario: " + getSalario() );
	}
}
