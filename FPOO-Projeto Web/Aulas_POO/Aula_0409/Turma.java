package Aula_0409;

import java.util.List;
public class Turma {
	//atributos
	public String nome;
	private List<Estudante> estudantes; //agregação
	//construtor
	public Turma(){
		
	}
	public Turma(String nome, List<Estudante> estudantes) {
		this.nome = nome;
		this.estudantes = estudantes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Estudante> getEstudantes(){
		return this.estudantes;
	}
}
