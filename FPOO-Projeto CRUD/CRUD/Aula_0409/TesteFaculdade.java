package Aula_0409;

import java.util.ArrayList;
import java.util.List;

public class TesteFaculdade {
	
	public static void main (String [] args) {
		
		//instancia da classe estudante
		Estudante e1 = new Estudante("Jão", 10, "TIA");
		Estudante e2 = new Estudante("Maria", 20, "TIB");
		Estudante e3 = new Estudante("Pedro", 100, "EE");
		Estudante e4 = new Estudante("Ana", 200, "ECP");
		//criando a lista vazia de estudantes 
		
		List<Estudante> eTI = new ArrayList<>Estudante();
		eTI.add(e1);
		eTI.add(e2);
		//mostrando alunos que estão na lista
		
		for (Estudante estudante : eTI) {
		System.out.printf("Posição %d-%s %d %s", i2, estudante estudante.nome, estudante.ra, estudante.curso);
		i2++;
	}
	//vamos adicionar os alunos e3 e e4 na lista NOVA.
	List<Estudante> eEE = new ArrayList<Estudante>(); //lista eEE
	eEE.add(e3);
	eEE.add(e4);
	
	//instancia da classe Turma
	Turma TIA = new Turma("TI", eTI);
	Turma EE = new Turma ("EngE", eEE);
	
	// agora criei uma lista de turmas p/ adicionar os alunos a ela
	List<Turma> tur = new ArrayList<Turma>();
	tur.add(TIA);
	tur.add(EE);
	
	//ler a lista a verificar quais alunos estao nela
	for (int i = 0; i < tur.size(); i++) {
		System.out.println("nome das turmas: " + tur.get(i).getNome());
	}
	//instancia da classe Faculdade 
	Faculdade senai = new Faculdade ("SENAI", tur);
	System.out.println(senai.getTotalEstudantes());
}
