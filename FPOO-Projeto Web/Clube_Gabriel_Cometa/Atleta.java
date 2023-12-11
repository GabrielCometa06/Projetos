package Clube_Gabriel_Cometa;

public class Atleta extends Pessoa{
	private String patrocinado;
	private char sexo;
	
	public Atleta () {
		
	}
	public Atleta(String patrocinado, char sexo) {
		this.patrocinado = patrocinado;
		this.sexo = sexo;
	}
	public String getPatrocinado() {
		return patrocinado;
	}
	public void setPatrocinado(String patrocinado) {
		this.patrocinado = patrocinado;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}
