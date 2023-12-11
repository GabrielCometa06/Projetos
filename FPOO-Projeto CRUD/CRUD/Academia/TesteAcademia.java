package Academia;

public class TesteAcademia {

	public static void main(String[] args) {
		// instanciar um objeto
		Cliente Aluno1 = new Cliente();
		Cliente Aluno2 = new Cliente();
		Aluno1.nome = "Serjão";
		System.out.println("nome: " + Aluno1.nome);
		Aluno1.altura = 1.81;
		System.out.println("altura: " + Aluno1.altura);
		Aluno2.altura = 1.78;
		System.out.println("altura:" + Aluno2.altura);
		Aluno1.peso = 99.9;
		System.out.println("peso: " Aluno1.peso);
		Aluno2.peso = 89.8;
		System.out.println("peso: " Aluno2.peso);
		double imc = Aluno1.peso / (Aluno1.altura * Aluno1.altura);
		System.out.println("IMC do Aluno1: " + imc);
		//imc = Aluno2.peso / (Aluno2.altura * Aluno2.altura);
		Aluno1.calcularIMC();
		System.out.println("IMC do Aluno1 através do método" + 
		Aluno1.calcularIMC());
		System.out.println("Peso desejado: " + 
		Aluno1.calcularPesoDesejado (100));
		
		
	}

}
