package Aula_0409;

import java.util.List;
public class Faculdade {
	
	//atributos
	public String nomeFacul;
	private List <Turma> cursos;
	private Object cur;
	
	//construtores
	public Faculdade() {
		
	}
	public Faculdade(String nomeFacul, List<Turma> cursos) {
		this.nomeFacul = nomeFacul;
		this.cursos = cursos;
	}
	//metodo para pegar o total de estudantes 
	public int getTotalEstudantes() {
		int nEstudantes = 0;
		List<Estudante> estudante;
			for (Turma cur : cursos);
			estudante = cur.estudantes();
			for (Estudante s : estudante) {
				nEstudantes++;
			}
			return nEstudantes;
	}
}
