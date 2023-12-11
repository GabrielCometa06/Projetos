package Aula_1206;

import javax.swing.JOptionPane;

public class Relogio {

	private static final int Oxigenacao = 0;

	public static void main(String[] args) {
		String numero1;
		String numero2;
		String numero3;
		
		int batimentos;
		int batimentosp;
		int oxigenacao;
		
		String numero11 = JOptionPane.showInputDialog("Rito parado");
		String numero22 = JOptionPane.showInputDialog("Rito correndo");
		String numero33 = JOptionPane.showInputDialog("Oxigenacao");	
		
		batimentos = Integer.parseInt(numero11);
		batimentosp = Integer.parseInt(numero22);
		oxigenacao = Integer.parseInt(numero33);		
	
		if (batimentos > batimentosp*3 || Oxigenacao < 95) {
			JOptionPane.showInputDialog(null, "Diminuir");
		}else if (batimentos < batimentosp*2 && Oxigenacao > 97) {
			JOptionPane.showInputDialog(null, "Aumentar");
		}else {
			JOptionPane.showInputDialog(null, "Manter");
			
		}
	
	}
}


