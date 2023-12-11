package Aula_1206;

public class Switch {

	public static void main(String[] args) {
		int idade= 10;
		switch (idade) {
		case (10):
			System.out.println("menor de idade");
			break;
		case (18):
			System.out.println("maior de idade");
			break;
		case (99):
			System.out.println("experiente");
			break;
		default:
			System.out.println("nenhuma validade válida!");
			break;
		}

	}

}
