
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int idade = 16;
		int quantidadePessoas = 3;
	
		if (idade >= 18) {
			System.out.println("Voce tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		}
		else if (quantidadePessoas >= 2) {
			System.out.println("Voce n�o tem 18 anos, "
					+ "mas pode entrar porque est� acompanhado.");
		}
		else {
			System.out.println("Voce n�o pode entrar");
		}
	}
}
