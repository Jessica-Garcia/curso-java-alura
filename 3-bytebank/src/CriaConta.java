import java.util.Locale;

public class CriaConta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.00;
		System.out.printf("%.2f%n", primeiraConta.saldo);
		
		primeiraConta.saldo += 100.0;
		System.out.printf("%.2f%n", primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50.0;
		System.out.printf("Primeira conta tem: %.2f%n", primeiraConta.saldo);
		System.out.printf("Segunda conta tem: %.2f%n", segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);

	}

}
