
public class TestaGetESet {

	public static void main(String[] args) {

		Conta conta = new Conta();

		Cliente paulo = new Cliente();
		
		//titular da conta recebe paulo:
		
		conta.setTitular(paulo);

		conta.setNumero(13337);
		paulo.setNome("Paulo Silveira");
		
		System.out.println(conta.getNumero());
		System.out.println(conta.getTitular().getNome());
		System.out.println(paulo.getNome());
		
		// alterar a profissao do titular da conta:
		
		conta.getTitular().setProfissao("Programador");
		
		System.out.println(conta.getTitular().getProfissao());
		
		

	}

}
