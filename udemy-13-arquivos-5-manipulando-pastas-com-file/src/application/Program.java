package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//para listar todas as pastas a partir do caminho instanciado com 
		//função que especifica qual tipo de coisa se deseja filtrar:
		//(nome da classe::isDirectory) 
		//o filtro isDirectory especifica que é para chamar so quem for pasta
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		
		//para imprimir lista de pastas:
		
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		// para listar todas os arquivos a partir do caminho instanciado
		//o filtro isFile especifica que é para chamar so quem for arquivo
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		
		//para imprimir a lista de arquivos:
		for(File file : files) {
			System.out.println(file);
		}
		
		//para criar uma subpasta a partir da pasta do caminho instanciado:
		// .mkdir(); criará a subpasta
		
		boolean success = new File(strPath + "\\subpasta").mkdir();
		
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
	}

}
