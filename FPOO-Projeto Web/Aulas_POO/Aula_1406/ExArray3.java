package Aula_1406;

public class ExArray3 {

	public static void main(String[] args) {
		String[] nomes=  new String[3];
		nomes[0]= "Thais";
		nomes[1]= "Carla";
		nomes[2]= "Macaco";
		for ( String macaco : nomes ) {
			System.out.println("nome:" + macaco );
		}
	
	}

}
