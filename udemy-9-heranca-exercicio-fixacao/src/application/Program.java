package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char resp = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Anual Income:");
			double rendaAnual = sc.nextDouble();
			
			if(resp == 'i') {
				System.out.print("Health expenditures: ");
				double gastoSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			}
			else {
				System.out.print("Number of employees: ");
				int numeroFuncionario = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionario));
			}
		}
		
		System.out.println();
		System.out.println("Taxes paid: ");
		
		for(Contribuinte c : list) {
			System.out.println(c.getNome() + ": $ " + String.format("%.2f",c.impostoPago()));
		}
		System.out.println();
		System.out.println("TOTAL TAXES: ");
		double soma = 0.0;
		
		for(Contribuinte c : list) {
			soma += c.impostoPago();
		}
		System.out.println(String.format("%.2f",soma));
		
		sc.close();
	}

}
