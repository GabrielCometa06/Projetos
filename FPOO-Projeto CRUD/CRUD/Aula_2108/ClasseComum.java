package Aula_2108;

public class ClasseComum {
	private static final int id = 0;
	public int numero = 10;
	public int idade = 50;
	//metodo construtor
	public ClasseComum() {
		System.out.println("Acabei de nascer!! Fui instanciado!");
	}
	public ClasseComum (int id) {
		super();
		this.idade = id;
	}
	//metodos
	public int getNumero() {
		return numero;
	}
	public void setNumero (int numero) {
		this.numero=numero;
	}
	public void getIdade() {
		this.idade=idade;
	}
	public int setIdade() {
		return idade = idade;
	}
}
