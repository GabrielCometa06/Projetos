package Aula_1406;

import java.util.Scanner;

public class ExArray {

	public static void main(String[] args) {
		
		int [] notas = new int[2];
		int i;
		try (Scanner entrada = new Scanner (System.in)) {
			for (i = 0; i < 2; i++) {
				System.out.print("\nEntre com  numero" + (i+1) + ":");
				notas[i] = entrada.nextInt();
			}
		}
		for (i = 0; i < 2; i++) {
			System.out.printf("numero %d --> nota armazenada: %d" , (i+1), notas[i]);		
		}
		int soma = 0;
		for (i = 0; i < 2; i++) {
			soma = soma + notas[i];
		}
		//int media = media/2;
		float media = soma / notas.length;
		System.out.println("as medias das notas e: " + media);
}
}
