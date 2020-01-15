
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300.0;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println(segundaConta.saldo);
		
		segundaConta.saldo += 100.0;
		System.out.println(segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("são as mesmas");
		}

	}

}
