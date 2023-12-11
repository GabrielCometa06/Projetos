package Aula_1206;

import javax.swing.JOptionPane;

public class Multiplicacao {
	public static void main (String []args) {
		String primeiroNumero;
		String segundoNumero;
		
		float numero1;
		float numero2;
		float multiplicacao;
		
		primeiroNumero = JOptionPane.showInputDialog("Entre com o 1° numero");
		segundoNumero = JOptionPane.showInputDialog("Entre com o 2° numero");
		// conversão de tipos (parse)
		numero1 = Integer.parseInt(primeiroNumero);
		numero2 = Integer.parseInt(segundoNumero);
		multiplicacao = numero1 * numero2;
		
		JOptionPane.showMessageDialog(null, "A multiplicacao é" + multiplicacao, "Resultado da multiplicacao:" , JOptionPane.PLAIN_MESSAGE);
	System.out.println("o resultado e:" + multiplicacao);
	}
}
