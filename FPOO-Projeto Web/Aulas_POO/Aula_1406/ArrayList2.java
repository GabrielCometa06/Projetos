package Aula_1406;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		//criando(instancionando) a lista vazia de tipo INTEIRO
		ArrayList<Integer> lista = new ArrayList<Integer>(5);
		// adicionar numeros (elementos/itens) na lista
		lista.add(10);
		lista.add(20);
		lista.add(-50);
		lista.add(100);
		lista.add(35); // adicionar o valor
		lista.remove(4); // remover
		
		//ler os valores que estao na lista
		for (Integer mamaco : lista) {
			System.out.println("numero = " + mamaco);
		}
		int ver_conteudo = lista.get(-1);
		System.out.println("conteudo é:" + ver_conteudo);
		int tamanho = lista.size();
		System.out.println("numero = " + tamanho);
	}

}
