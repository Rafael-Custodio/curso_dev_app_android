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

		System.out.println("O numero digitado foi: " + numero1);

		System.out.println("\nDigite o segundo numero: ");
		// recebendo o segundo número via teclado (entrada de dados, lendo um valor
		// inteiro)
		numero2 = ler.nextInt();

		System.out.println("O numero digitado foi: " + numero2);

		System.out.println("\nDigite o terceiro numero: ");
		// recebendo o terceiro número via teclado (entrada de dados, lendo um valor
		// inteiro)
		numero3 = ler.nextInt();

		System.out.println("O numero digitado foi: " + numero3);

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("\nO primeiro numero eh o maior. \nOu seja, numero: " + numero1);
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("\nO segundo numero eh o maior. \nOu seja, numero: " + numero2);
		} else {
			System.out.println("\nO terceiro numero eh o maior. \nOu seja, numero: " + numero3);
		}

	}

}
