package Projeto;

import java.util.Scanner;

import javax.swing.JOptionPane;
public class TesteImovel {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Funcionario f1 = new Funcionario();
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		Animal2 a1 = new Animal2();
		Animal2 a2 = new Animal2();
		Animal2 a3 = new Animal2();
		Imovel i1 = new Imovel();
		Imovel i2 = new Imovel();
		Imovel i3 = new Imovel();
		
		f1.setNome("Marta");
		
		System.out.println(f1 + " auxiliará no cadastro das pessoas! ");
		System.out.println("As pessoas vão fazer seus cadastros para seus orçamentos");
		
		System.out.println("---PESSOA1---");
		System.out.println(" Insira seu nome: ");
		p1.setNome(entrada.next());
		System.out.println(" Insira sua idade: ");
		p1.setIdade(entrada.nextInt());
		System.out.println(" Insira seu sobrenome: ");
		p1.setSobrenome(entrada.next());
		System.out.println(" Insira seu Cpf: ");
		p1.setCpf(entrada.nextInt());
		
		p1.exibirInfo();
		
		System.out.println("---ANIMAL DA PESSOA 1---");
		System.out.println(" Cadastro exclusivo para animais! ");
		System.out.println(" Insira o tipo do animal: ");
		a1.setTipo(entrada.next());
		System.out.println(" Insira a cor do animal: ");
		a1.setCor(entrada.next());
		System.out.println(" Insira o tamanho do animal: ");
		a1.setTamanho(entrada.nextDouble());
		
		a1.exibirAnimal();
		
		System.out.println("As pessoas vão fazer seus cadastros para seus orçamentos");
		System.out.println("---PESSOA2---");
		System.out.println(" Insira seu nome: ");
		p2.setNome(entrada.next());
		System.out.println(" Insira sua idade: ");
		p2.setIdade(entrada.nextInt());
		System.out.println(" Insira seu sobrenome: ");
		p2.setSobrenome(entrada.next());
		System.out.println(" Insira seu Cpf: ");
		p2.setCpf(entrada.nextInt());
		
		p2.exibirInfo();
		
		System.out.println("---ANIMAL DA PESSOA 2---");
		System.out.println(" Cadastro exclusivo para animais! ");
		System.out.println(" Insira o tipo do animal: ");
		a2.setTipo(entrada.next());
		System.out.println(" Insira a cor do animal: ");
		a2.setCor(entrada.next());
		System.out.println(" Insira o tamanho do animal: ");
		a2.setTamanho(entrada.nextDouble());
		
		a2.exibirAnimal();
		
		System.out.println("As pessoas vão fazer seus cadastros para seus orçamentos");
		System.out.println("---PESSOA3---");
		System.out.println(" Insira seu nome: ");
		p3.setNome(entrada.next());
		System.out.println(" Insira sua idade: ");
		p3.setIdade(entrada.nextInt());
		System.out.println(" Insira seu sobrenome: ");
		p3.setSobrenome(entrada.next());
		System.out.println(" Insira seu Cpf: ");
		p3.setCpf(entrada.nextInt());
		
		p3.exibirInfo();
		
		System.out.println("---ANIMAL DA PESSOA 3---");
		System.out.println(" Cadastro exclusivo para animais! ");
		System.out.println(" Insira o tipo do animal: ");
		a3.setTipo(entrada.next());
		System.out.println(" Insira a cor do animal: ");
		a3.setCor(entrada.next());
		System.out.println(" Insira o tamanho do animal: ");
		a3.setTamanho(entrada.nextDouble());
		
		a3.exibirAnimal();
		
		System.out.println("---RESIDENCIA DA PESSOA1---");
		System.out.println(" Insira o tipo de sua nova residencia: ");
		i1.setResidencia(entrada.next());
		System.out.println(" Insira a quantidade de quartos: ");
		i1.setNumeroQuartos(entrada.nextInt());
		System.out.println(" Insira o local: ");
		i1.setLocal(entrada.next());
		System.out.println(" Insira a quantidade de moveis: ");
		i1.setQtdMoveis(entrada.nextInt());
		System.out.println(" Insira um valor aproximado para seu cadastro: ");
		i1.setValor(entrada.nextInt());
		
		i1.exibirImovel();
		
		System.out.println("---RESIDENCIA DA PESSOA2---");
		System.out.println(" Insira o tipo de sua nova residencia: ");
		i2.setResidencia(entrada.next());
		System.out.println(" Insira a quantidade de quartos: ");
		i2.setNumeroQuartos(entrada.nextInt());
		System.out.println(" Insira o local: ");
		i2.setLocal(entrada.next());
		System.out.println(" Insira a quantidade de moveis: ");
		i2.setQtdMoveis(entrada.nextInt());
		System.out.println(" Insira um valor aproximado para seu cadastro: ");
		i2.setValor(entrada.nextInt());
		
		i2.exibirImovel();
		
		System.out.println("---RESIDENCIA DA PESSOA3---");
		System.out.println(" Insira o tipo de sua nova residencia: ");
		i3.setResidencia(entrada.next());
		System.out.println(" Insira a quantidade de quartos: ");
		i3.setNumeroQuartos(entrada.nextInt());
		System.out.println(" Insira o local: ");
		i3.setLocal(entrada.next());
		System.out.println(" Insira a quantidade de moveis: ");
		i3.setQtdMoveis(entrada.nextInt());
		System.out.println(" Insira um valor aproximado para seu cadastro: ");
		i3.setValor(entrada.nextInt());
		
		i3.exibirImovel();
		
		System.out.println(" Residencias instnaciadas!! ");
		
		System.out.println(" Funcionário concluiu seu dia de trabalho. Agora vai receber seu salario");
		System.out.println(" Insira seu salario: ");
		f1.setSalario(entrada.nextInt());
		
		f1.exibirFuncionario();
		System.out.println(" Parabens! ");
		
		/*
		float residencia1;
		float residencia2;
		
		String primeiraResidencia = JOptionPane.showInputDialog(" 1° Residencia ");
		String segundaResidencia = JOptionPane.showInputDialog(" 2° Residencia ");
		residencia1 = Integer.parseInt(primeiraResidencia);
		residencia2 = Integer.parseInt(segundaResidencia);
		
		JOptionPane.showMessageDialog(null, " A residencia 1 e: " + i1 + " Residencia 2 e: " + i2, null, JOptionPane.PLAIN_MESSAGE);
			System.out.println(" A 1° residencia e: " + i1 + " E a 2° residencia e: " + i2);
			*/
	}

	}