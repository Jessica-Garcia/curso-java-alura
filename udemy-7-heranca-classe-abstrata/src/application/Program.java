package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		
		list.add(new BusinessAccount(1111, "abcd", 500.00, 500.00));
		list.add(new BusinessAccount(2222, "dfgh", 600.00, 300.00));
		list.add(new SavingsAccount(3333, "ijlm", 700.00, 0.02));
		list.add(new SavingsAccount(4444, "kbnm", 810.00, 0.22));
		
		double sum =0;
		
		for(Account c : list) {
			sum += c.getBalance();
		}
		
		System.out.printf("Soma dos saldos de todas as contas: %.2f%n", sum);
		
		for (Account c : list) {
			c.deposit(50.00);
		}
		
		for(Account c : list) {
			System.out.printf("Saldo da conta número %d = %.2f%n", c.getNumber(), c.getBalance());
		}
	}

}
