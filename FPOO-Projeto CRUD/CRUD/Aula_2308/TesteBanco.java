package Aula_2308;

public class TesteBanco {

	public static void main(String[] args) {
		//intancia de objetos 
		CaixaEletronico cel = new CaixaEletronico();
		cel.sacar(150);
		
		
		Caixa cx = new Caixa();
		cx.sacar(150);
		
		
		Santander st = new Santander();
		st.sacar(150);
	}

}
