package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> products = new ArrayList<>();

		System.out.print("Enter file path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);
		

		boolean success = new File(path.getParent() + "\\out").mkdir();
		System.out.println("out created? " + (success ? "SIM" : "NAO"));

		try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				String[] parts = line.split(",");
				String name = parts[0];
				Double price = Double.valueOf(parts[1]);
				Integer quantity = Integer.valueOf(parts[2]);

				products.add(new Product(name, price, quantity));
				line = br.readLine();
			}
		} 
		catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		
		String targetFile = path.getParent() + "\\out\\summary.csv";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {

			for(Product product : products) {
				bw.write(String.format("%s,%.2f",product.getName(), product.valorTotal()));
				bw.newLine();
			}
			
			System.out.println(targetFile + " CREATED!");
		} 
		catch (IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
			e.printStackTrace();
		}

		sc.close();
	}

}
