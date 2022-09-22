package primeiroProjeto;

// importando a classe Scanner
import java.util.Scanner;

public class atividadePratica1 {

	public static void main(String[] args) {

		
		/*
		 * 01. Faça um programa que receba 3 números via teclado e imprima o maior
		 * deles.
		 */

		
		// instanciando e criando um objeto Scanner
		Scanner ler = new Scanner(System.in);

		// declarando as variáveis
		int numero1;
		int numero2;
		int numero3;

		System.out.println("Digite o primeiro numero: ");
		// recebendo o primeiro número via teclado (entrada de dados, lendo um valor
		// inteiro)
		numero1 = ler.nextInt();
		
		
		System.out.println("\nO numero digitado foi: " + numero1);

	}

}
