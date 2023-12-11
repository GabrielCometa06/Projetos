package Aula_2108;

public class SubClasse extends SuperClasse {
	//atributos
	protected int c;
	protected int d;
	//metodo construtor
	SubClasse (){
		super();
	}

	public SubClasse(int a, int b ,int c, int d) {
		super.b = b;
		super.a = a;
		this.c = c;
		this.d = d;
	}
	//metodos
	
	public int getC () {
		return c;
	}
	public void setC (int c) {
		this.c = c;
	}
	public int getD () {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	//metodo especial
	public String toString() {
		return "Chamando o toString da SuperClasse";
	}
	
}