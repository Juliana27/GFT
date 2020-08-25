package exercicio03e04;

public class Programa {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente();
		cc.setTitular("Juliana");
		cc.setNumero(111);
		cc.setSaldo(1000.00);
		System.out.println("--- Conta Corrente ---");
		System.out.println("Numero: " + cc.getNumero());
		System.out.println("Titular: " + cc.getTitular());
		System.out.println("Saldo: " + cc.getSaldo());
		System.out.println("Rendimento: " + cc.rendimento());
		System.out.println("Imposto: " + cc.calcularImposto());
		System.out.println(" ");
		
		Conta cp = new ContaPoupanca();
		cp.setTitular("Vitor");
		cp.setNumero(222);
		cp.setSaldo(1000.00);
		System.out.println("--- Conta Poupanca ---");
		System.out.println("Numero: " + cp.getNumero());
		System.out.println("Titular: " + cp.getTitular());
		System.out.println("Saldo: " + cp.getSaldo());
		System.out.println("Rendimento: " + cp.rendimento());
		System.out.println("Imposto: " + cp.calcularImposto());
		
		

	}

}
