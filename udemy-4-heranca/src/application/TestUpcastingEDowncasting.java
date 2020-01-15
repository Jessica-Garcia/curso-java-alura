package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class TestUpcastingEDowncasting {

	public static void main(String[] args) {

		Account conta = new Account(1101, "Alex", 0.0);
		BusinessAccount contaEmpresarial = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// Upcasting:
		
		Account conta1 = contaEmpresarial;
		
		Account conta2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		
		Account conta3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// Downcasting
		
		BusinessAccount conta4 = (BusinessAccount)conta2;
		
		conta4.loan(100.0);
		
		// o Downcasting pode dar erro em tempo de execução, conta3 é do tipo savingsAccont 
		//e não pode ser convertido para BusinessAccount, para evitar esse tipo de erro
		//é preciso um teste com o instanceof para executar isso: 
		
		if(conta3 instanceof BusinessAccount) {
			BusinessAccount conta5 = (BusinessAccount)conta3;
			conta5.loan(200.0);
			System.out.println("loan!");
		}
		
		if(conta3 instanceof SavingsAccount) {
			SavingsAccount conta5 = (SavingsAccount)conta3;
			conta5.updateBalance();
			System.out.println("Update!");
		}
	}

}
