package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class TestAccount {

	public static void main(String[] args) {

		Account conta1 = new Account(1001, "Alex", 1000.0);
		
		conta1.withdraw(200.0);
		System.out.println(conta1.getBalance());
		
		Account conta2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		conta2.withdraw(200.00);
		System.out.println(conta2.getBalance());
		
		Account conta3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		conta3.withdraw(200.0);
		System.out.println(conta3.getBalance());
	}

}
