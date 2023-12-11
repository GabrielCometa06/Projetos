package Academia;

public class Cliente {
//atributos
	public double altura;
	public double peso;
	public String cpf;
	public int idade;
	public String nome;
	public int telefone;
	//métodos especiais
	public double calcularIMC(){
		double imc = peso / (altura * altura) ;
		return imc;	
	}
	public double calcularPesoDesejado (double metaPeso) {
		if (peso > metaPeso) {
			return peso - metaPeso;
		}else
			return metaPeso - peso;
	}
	public void imprimirDados ( ) {
		System.out.println("CPF: " + cpf + "Nome: " + nome + "Tel: " + telefone + "Idade: " + idade + "Alt: " + altura + "Peso: "+ peso + "kg");
	}
	
}
