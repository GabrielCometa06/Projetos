package Aula_0208;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcao = 1;
		do {
			exibirMenu(); //metodo (acao) construindo fora do main
			int opcao1 = entrada.nextInt();
			switch (opcao1) {
				case 1:
					System.out.println("opcao 1 selecionada");
					break;
				case 2:	
					System.out.println("opcao 2 selecionada");
					break;
				case 3:
					System.out.println("opcao 3 selecionada");
					break;
					default:
						System.out.println("escolha as opcoes de 1 a 3");
						break;
			}
			System.out.println();
	}while(opcao != 0);
		
		
	} // FIM main
	
	//metodo para exibir menu de opcoes (fora do main)
	public static void exibirMenu() {
		System.out.println("Selecione uma opção");
		System.out.println("1 - opção 1");
		System.out.println("2 - opção 2");
		System.out.println("3 - opção 3");
		System.out.println("0 - SAIR");
	}
}//FIM classe
