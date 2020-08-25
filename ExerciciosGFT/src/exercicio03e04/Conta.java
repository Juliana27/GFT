package exercicio03e04;

public abstract class Conta implements Imposto {
	private int numero;
	private String titular;
	private double saldo;
	
	public double rendimento() {
		return this.saldo * 0.01;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
