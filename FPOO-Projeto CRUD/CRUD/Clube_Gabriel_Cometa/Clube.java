package Clube_Gabriel_Cometa;

public class Clube {
	private String nome;
	private String endereco;
	private int telefone;
	private float titulo;
	private float mensalidade;
	private Associado associado;
	private Funcionario funcionario;
	
	public Clube() {
		
	}
	public Clube(String nome, String endereco, int telefone, float titulo, float mensalidade, Associado associado, Funcionario funcionario) {
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.setTitulo(titulo);
		this.setMensalidade(mensalidade);
		this.setAssociado(associado);
		this.setFuncionario(funcionario);
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public float getTitulo() {
		return titulo;
	}
	public void setTitulo(float titulo) {
		this.titulo = titulo;
	}
	public float getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	public Associado getAssociado() {
		return associado;
	}
	public void setAssociado(Associado associado) {
		this.associado = associado;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
}
