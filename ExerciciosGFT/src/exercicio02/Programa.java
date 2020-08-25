package exercicio02;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Juliana Brito");
		pessoa1.setEndereco("Rua X");
		pessoa1.setTelefone(00000000);
		
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getTelefone());
		System.out.println(" ");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Vitor Brito");
		pessoa2.setEndereco("Rua Y");
		pessoa2.setTelefone(11111111);
		
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getTelefone());
		

	}

}
