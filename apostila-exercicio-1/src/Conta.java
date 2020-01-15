
public class Conta {

	private String titular;
	private Integer numero;
	private Integer agencia;
	private Double saldo = 0.0;
	private String dataAbertura;
	
	
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public void saca(double quantia) {
		this.saldo -= quantia;
	}
	
	public void deposita (double quantia) {
		this.saldo += quantia;
	}
	
	public double calculaRendimento() {
		return saldo * 0.1;
	}
	
	public String toString() {
		return "Titular: "
				+ getTitular()
				+", Numero: "
				+ getNumero()
				+", Agencia: "
				+ getAgencia()
				+", Saldo: "
				+String.format("%.2f", getSaldo())
				+", Rendimento: "
				+String.format("%.2f", calculaRendimento());
	}
}

