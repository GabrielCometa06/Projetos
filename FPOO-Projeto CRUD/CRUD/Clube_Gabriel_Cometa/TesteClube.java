   package Clube_Gabriel_Cometa;

import java.util.Scanner;
public class TesteClube {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Funcionario f1 = new Funcionario();
		
		Tenista t1 = new Tenista();
		Tenista t2 = new Tenista();
		
		Nadador n1 = new Nadador();
		Nadador n2 = new Nadador();
		
		Atleta a1 = new Atleta();
		Atleta a2 = new Atleta();
		
		Clube c = new Clube();
		
		System.out.println(" Dados do clube: ");
		c.setNome("Clubão");
		c.setEndereco("Rua José Batista Pinto, N°15 ");
		c.setMensalidade(1200);
		c.setTitulo(5000);
		c.setFuncionario(null);
		c.setAssociado(null);
		System.out.println(" Clube aberto! ");
		
		System.out.println(" Inserindo dados! ");
		System.out.println(" Digite seu nome: ");
		f1.setNome(entrada.next());
		System.out.println(" Digite sua idade: ");
		f1.setIdade(entrada.nextInt());
		System.out.println(" Digite seu cpf: ");
		f1.setCpf(entrada.next());
		System.out.println(" Digite seu telefone: ");
		f1.setTelefone(entrada.nextInt());
		System.out.println(" Digite seu beneficio: ");
		f1.setBeneficio(entrada.next());
		System.out.println(" Digite seu salario: ");
		f1.setSalario(entrada.nextFloat());
		System.out.println(" Digite sua função: ");
		f1.setFuncao(entrada.next());
		
		f1.exibirFuncionario();
		
		System.out.println(" Inserindo dados! ");
		System.out.println(" Digite seu nome: ");
		t1.setNome(entrada.next());
		System.out.println(" Digite sua idade: ");
		t1.setIdade(entrada.nextInt());
		System.out.println(" Digite seu cpf: ");
		t1.setCpf(entrada.next());
		System.out.println(" Digite seu telefone: ");
		t1.setTelefone(entrada.nextInt());
		
		t1.exibirPessoa();
		
		System.out.println(" Digite seu nome: ");
		t2.setNome(entrada.next());
		System.out.println(" Digite sua idade: ");
		t2.setIdade(entrada.nextInt());
		System.out.println(" Digite seu cpf: ");
		t2.setCpf(entrada.next());
		System.out.println(" Digite seu telefone: ");
		t2.setTelefone(entrada.nextInt());
		
		t2.exibirPessoa();
		
		System.out.println(" Digite seu nome: ");
		a1.setNome(entrada.next());
		System.out.println(" Digite sua idade: ");
		a1.setIdade(entrada.nextInt());
		System.out.println(" Digite seu cpf: ");
		a1.setCpf(entrada.next());
		System.out.println(" Digite seu telefone: ");
		a1.setTelefone(entrada.nextInt());
		
		a1.exibirPessoa();
		
		System.out.println(" Digite seu nome: ");
		a2.setNome(entrada.next());
		System.out.println(" Digite sua idade: ");
		a2.setIdade(entrada.nextInt());
		System.out.println(" Digite seu cpf: ");
		a2.setCpf(entrada.next());
		System.out.println(" Digite seu telefone: ");
		a2.setTelefone(entrada.nextInt());
		
		a2.exibirPessoa();
		
		System.out.println(" Digite seu nome: ");
		n1.setNome(entrada.next());
		System.out.println(" Digite sua idade: ");
		n1.setIdade(entrada.nextInt());
		System.out.println(" Digite seu cpf: ");
		n1.setCpf(entrada.next());
		System.out.println(" Digite seu telefone: ");
		n1.setTelefone(entrada.nextInt());
		
		n1.exibirPessoa();
		
		System.out.println(" Digite seu nome: ");
		n2.setNome(entrada.next());
		System.out.println(" Digite sua idade: ");
		n2.setIdade(entrada.nextInt());
		System.out.println(" Digite seu cpf: ");
		n2.setCpf(entrada.next());
		System.out.println(" Digite seu telefone: ");
		n2.setTelefone(entrada.nextInt());
		
		n2.exibirPessoa();
	}
}