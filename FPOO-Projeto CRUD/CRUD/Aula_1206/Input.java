package Aula_1206;

import java.util.Scanner;

public class Input {

	public static void main(String[] ags) {
		try (// instancia  ("criar") de objeto objin
		Scanner objin = new Scanner(System.in)) {
			System.out.println("digite o valor de a:");
			int a = objin.nextInt();
			System.out.println("digite o valor de b:");
			int b = objin.nextInt();
			if (a > b) {
				System.out.printf("valor de a:%d\n %d\n", a,b);
				System.out.println("valor de a:" + a +" "+ b);
			}else
				System.out.println("%d\n" + b);
		}
	}

}
