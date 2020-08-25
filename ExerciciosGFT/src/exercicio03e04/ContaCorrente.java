package exercicio03e04;

public class ContaCorrente extends Conta{
	

	public double rendimento() {
		return this.getSaldo() * 0.03;
		
	}
	
	@Override
	public double calcularImposto() {
		return this.getSaldo() * 0.25;
	}
}
