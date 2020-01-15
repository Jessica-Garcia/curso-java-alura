package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Alura";
		// assim tamb�m  funciona:
		//System.out.println(nome.replace("A", "a"));
		//System.out.println(nome.toUpperCase());
		
		// mas melhor fazer assim:
		
		String outro = nome.replace('A', 'a');
		String outro2 = nome.toLowerCase();
		String outro3 = nome.toUpperCase();
		
		System.out.println(nome);
		System.out.println(outro);
		System.out.println(outro2);
		System.out.println(outro3);
		
		//para saber a letra que est� em determinada posi��o da String
		
		char c = nome.charAt(2);
		System.out.println(c);
		
		// posi��o de determinada substring dentro da string
		int pos = nome.indexOf("ur");
		System.out.println(pos);
		
		// para devolver uma subtring baseado em um string a partir de 
		//determinada posi��o:
		
		String sub = nome.substring(1); // vai imprimir da posi��o 1 em diante
		
		System.out.println(sub);
		
		//para saber o numero de caracteres de um string:
		System.out.println(nome.length());
		
		//para imprimir caractere por caractere um embaixo do outro:
		for (int i = 0; i< nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		// para saber se o string est� vazio, devolve um boolean:
		
		String vazio = " ";
		System.out.println(vazio.isEmpty());
		
		// para tirar os espa�os do inicio e fim de um String:
		String outroVazio = vazio.trim();
		
		System.out.println(outroVazio.isEmpty());
		
		//para saber se uma String possui uma String ou subtring
		
		System.out.println(nome.contains("Alu"));
		
		//StringBuilder exemplo:
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("�nibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString();
		System.out.println(texto);

	}

}
