package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		// definindo o caminho do arquivo
		String path = "C:\\temp\\in.txt";
		
		//fazendo a leitura dos arquivos:
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
		/*lendo uma linha do arquivo=> String name = br.readLine();
		 * enquanto a linha que foi lida na variável name
		 * for diferente de nulo=> while (name != null), 
		 * adiciona-se o valor name na lista => list.add(name); 
		 * e depois lê-se a próxima linha=> name = br.readLine();
		 * isso vai ler o arquivo inteiro guardando cada um dos nomes em um elemento da lista 
		*/
			String name = br.readLine();
			while (name != null) {
				list.add(name);
				name = br.readLine();
			}
			//para colocar em ordem os elementos da coleção:
			Collections.sort(list);
			
			//percorrendo a lista usando for each imprimindo cada um dos elemenstos
			for (String s : list) {
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}