package Aula_1608;

import java.util.Scanner;

import Atividade_Gabriel_Cometa.Brinquedo;
import Atividade_Gabriel_Cometa.Brinquedo2;
import Atividade_Gabriel_Cometa.Visitante2;

public class TesteParque {

	public static void main(String[] args) {
		//Scanner s System (permite entrada de dados)
		Scanner entrada = new Scanner (System.in);
		//instanciar objetos
		System.out.println("informe os dados do brinquedo 1");
		System.out.println("Nome: ");
		String nomeMontanhaRussa = entrada.nextLine(); //pega a linha inteira da String
		System.out.println("Altura Minima: (em metros)");
		double alturaMinimaMontanhaRussa = entrada.nextDouble();
		System.out.println("Capacidade Maxima: ");
		int capacidadeMaximaMontanhaRussa = entrada.nextInt();
		//agora estamos instanciando um objeto da classe BRINQUEDO
		Brinquedo2 montanhaRussa = new Brinquedo2(nomeMontanhaRussa, alturaMinimaMontanhaRussa, capacidadeMaximaMontanhaRussa);
		
		// ****** instanciar o 2° brinquedo ******
		System.out.println("informe os dados do visitante 1");
		System.out.println("Nome: ");
		entrada.nextLine();
		String nomeVisitante1 = entrada.nextLine();
		System.out.println("Idade: ");
		int idadeVisitante1 = entrada.nextInt();
		System.out.println("Altura: ");
		double alturaVisitante1 = entrada.nextDouble();
		
		//instanciar o objeto visitante1
		//Visitante2 vis1 = new Visitante2();
		Visitante2 visitante1 = new Visitante2(nomeVisitante1, idadeVisitante1, alturaVisitante1);
		System.out.println("Informações do brinquedo: ");
		montanhaRussa.exibirInfo();
		
		System.out.println("Informações do visitante: ");
		visitante1.exibirInfo();
		//vamos verificar se o visitante pode ou nao andar no brinquedo
		System.out.println("Pode andar na Montanha Russa? " + (visitante1.podeAndarNoBrinquedo() ? "Sim" : "Não"));
		
		
		
	}

}
