package Aula_1408;

public class Carro {
//atributos
	public String modelo;
	private float potencia;
	public boolean parado;
	//construir padrao (default)
	Carro(){
	System.out.println("acabei de nascer!");	
	}
	public Carro(String mod, float pot) {
		this.modelo = mod;
		this.potencia = pot;
		
		
	}
	//metodos getters e setters
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	public float getPotencia() {
		return potencia;
	}
	public void getPotencia(float p) {
		this.potencia = p;
	}
	
	//metodos especiais (logica)

	public boolean getAcelerar() {
		return parado;
		if (parado == true) {
			System.out.println("sem movimento");
		}else {
			System.out.println("andando");
		}	

	public boolean getFrear() {
		return parado;
		if (parado == true) {
			System.out.println("sem movimento, freio acionado");
		}else {
			System.out.println("esta sem movimento");
		}
		public boolean isParado() {
			return parado;
		}
		public void setSeparado(boolean pa) {
			parado = pa;
		}
		public void setPotencia(int i) {
			
			
		}
	}
