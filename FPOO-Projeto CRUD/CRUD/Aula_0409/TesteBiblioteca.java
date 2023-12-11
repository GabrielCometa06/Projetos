package Aula_0409;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TesteBiblioteca {

	private static Livro[] ver_lista;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// instancia de obj, mas quais??
		//instancia de livros
		Livro l1 = new Livro("Programação JAVA", "Deitel");
		Livro l2 = new Livro("UML", "Bezerra");
		//instancia da lista vazia
		List<Livro> lista_livro = new ArrayList<Livro>();
		//adicionando obj livro no obj lista_livro 
		lista_livro.add(l1);
		lista_livro.add(l2);
		//quero ler os livros que estao na lista
		for (Livro  ver_lista : lista_livro) {
			System.out.println("livros na lista: " + ver_lista.titulo + ver_lista.autor);
		}
		//instanciar a biblioteca
		//a lista de livros faz parte da biblioteca (composição)
		Biblioteca bi = new Biblioteca(lista_livro);
		List<Livro> li = bi.getTotalLivrosBiblioteca();
		System.out.println("Titulo: " + l1.titulo + "Autor: " + l1.autor);
		System.out.println("t" + li.get(0));
		for (Livro olho : ver_lista);
		System.out.println("");
	}
}
