package Aula_2108;

public class ClassePai {
//atributos
public String senha;
protected String nome = "Rock";
private int idade = 50;
//construtor 
public ClassePai() {
	System.out.println("chamando construtor padrao da ClassePai nome");
}
public void metodoImprimir() {
	System.out.println("Imprimir na ClassePai");
}
public void setIdade (int idade ) {
	this.idade = idade;
}
public int getIDade () {
	return idade;
}



}