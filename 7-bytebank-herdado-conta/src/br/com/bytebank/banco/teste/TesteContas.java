package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException{

		ContaCorrente cc = new ContaCorrente(111, 1111);
		cc.deposita(100.00);
		
		ContaPoupanca cp = new ContaPoupanca(222, 2222);
		cp.deposita(200.0);
		
		cc.transfere(90.0, cp);
		
		System.out.println("Saldo Conta Corrente " + String.format("%.2f",cc.getSaldo()));
		System.out.println("Saldo Conta Poupanca " + String.format("%.2f",cp.getSaldo()));
		
		System.out.println(cp);
		System.out.println(cc);
	}

}
