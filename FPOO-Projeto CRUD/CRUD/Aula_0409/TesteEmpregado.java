package Aula_0409;

import java.util.Scanner;
public class TesteEmpregado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//instancia de obj
		Pessoa p1 = new Pessoa("gerente", "Tia Leila", 55);
		Empregado1 emp1 = new Empregado1(); 
		Empregado1 emp2 = new Empregado1(1500, p1);
		System.out.println("cargo: " + p1.cargo);
		System.out.println("salario: " + emp2.getSalario());
	}
}
