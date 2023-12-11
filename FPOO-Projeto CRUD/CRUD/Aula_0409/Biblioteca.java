package Aula_0409;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	//atributos
	private List <Livro> livros; //varios livros

	//construtor
	public Biblioteca() {
		
	}
	public Biblioteca(List<Livro> livros) {
		this.livros = livros;
	}
	//metodo especial
	public List <Livro> getTotalLivrosBiblioteca() {
		return livros;
	}
}