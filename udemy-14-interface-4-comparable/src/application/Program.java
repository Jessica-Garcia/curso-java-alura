package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		List<Funcionario> list = new ArrayList<>();

		// definindo o caminho do arquivo
		String path = "C:\\temp\\in.txt";

		// fazendo a leitura dos arquivos:
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String funcionarioCsv = br.readLine();
			while (funcionarioCsv != null) {
				/* para pegar nome e salario a partir do String funcionarioCsv 
				 * é preciso recortar esse string em dois criando um vetor
				 * de Strings
				 */
				String[] fields = funcionarioCsv.split(",");
				
				list.add(new Funcionario(fields[0], Double.parseDouble(fields[1])));
				funcionarioCsv = br.readLine();
			}
			// para colocar em ordem os elementos da coleção:
			Collections.sort(list);

			// percorrendo a lista usando for each imprimindo cada um dos elemenstos
			for (Funcionario f : list) {
				System.out.println(f.getName() +", " + f.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
