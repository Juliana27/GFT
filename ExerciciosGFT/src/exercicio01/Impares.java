package exercicio01;

import java.util.Scanner;

public class Impares {

	public static void main(String[] args) {
		int inicio = 0;
		int fim = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero inicial: ");
		inicio = sc.nextInt();
		System.out.println("Digite o numero final: ");
		fim = sc.nextInt();
		
		for(int i = inicio; i <= fim; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

	}
}
