package Aula_3008;

public class TesteInterface {

	public static void main(String[] args) {
		// intancia de objetos
		// nao pode instanciar objetos de interfave, e sim de classes!!!
		InterfacePai obj = new UsoInterface();
		obj.metodo1();
		obj.metodo2();
		//System.out.print(obj.somar(5, 15));
		obj.somar (5, 15);

	}

}
