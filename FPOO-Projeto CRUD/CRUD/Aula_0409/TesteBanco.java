package Aula_0409;

import java.util.Scanner;
public class TesteBanco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Banco b1 = new Banco();
		Empregado e1 = new Empregado();
		
		b1.setNome("Satander");
		e1.setNome("Mario");
		
		System.out.println("Bem vindo " + e1.getNome() + " ao Banco " + b1.getNome() + "!!");
		
	}

}
