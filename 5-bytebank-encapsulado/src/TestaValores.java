
public class TestaValores {

	public static void main(String[] args) {

		
		Conta conta = new Conta(1337, 24226);
		
		conta.deposita(200.0);
		
		System.out.println(conta.getSaldo());
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(123321);
		
		Conta conta2 = new Conta(1337, 16549);
		Conta conta3 = new Conta(1337, 25466);
		
		System.out.println("ototal de conta é:" + Conta.getTotal());

	}

}
