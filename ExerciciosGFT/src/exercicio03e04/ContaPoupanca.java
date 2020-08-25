package exercicio03e04;

public class ContaPoupanca extends Conta implements Imposto{
	
	public double rendimento() {
		return this.getSaldo() * 0.05;
		
	}

	@Override
	public double calcularImposto() {
		return this.getSaldo() * 0.10;
	}

}
