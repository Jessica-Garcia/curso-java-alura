
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta();
		
		contaDoPaulo.deposita(100.00);
		
		// associa o cliente Paulo à contaDoPaulo:
		
		contaDoPaulo.titular = paulo;
		
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular.cpf);
		System.out.println(contaDoPaulo.titular.profissao);
		System.out.println(contaDoPaulo.getSaldo());
	}

}
