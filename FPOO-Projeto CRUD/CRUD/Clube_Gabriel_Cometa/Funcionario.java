package Clube_Gabriel_Cometa;

public class Funcionario extends Pessoa {
	private String funcao;
	private float salario;
	private String beneficio;
	
	public Funcionario() {
		
	}
	public Funcionario(String funcao, float salario, String beneficio) {
		this.setFuncao(funcao);
		this.setSalario(salario);
		this.setBeneficio(beneficio);
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getBeneficio() {
		return beneficio;
	}
	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}
	public void contratado() {
		System.out.println(" bem-vindo! ");
	}
	public void demitido() {
		System.out.println(" até mais! ");
	}
	public void executarFuncao() {
		System.out.println(" Trabalhando... ");
	}
	public void exibirFuncionario() {
		System.out.println(" notas do funcionario: " + getNome() + getIdade() + getCpf() + getTelefone() + getBeneficio() + getSalario() + getFuncao());
	}
}
