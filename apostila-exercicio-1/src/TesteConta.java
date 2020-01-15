
public class TesteConta {

	public static void main(String[] args) {

		Conta c1 = new Conta();
		c1.setTitular("Hugo");
		c1.setNumero(123);
		c1.setAgencia(6666);
		c1.setDataAbertura("03/01/2020");
		
		c1.deposita(100.0);
		System.out.println(c1);
		
		
	}

}
