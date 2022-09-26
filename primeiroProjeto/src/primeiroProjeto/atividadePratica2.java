package primeiroProjeto;

//importando a classe Scanner
import java.util.Scanner;

public class atividadePratica2 {

	public static void main(String[] args) {

		// 02. Faça um programa que receba um número via teclado e verifique se este
		// número é par ou ímpar.

		// instanciando e criando um objeto Scanner
		Scanner ler = new Scanner(System.in);

		// declarando a variável
		int numero;

		System.out.println("Digite um numero qualquer: ");
		// recebendo o número via teclado (entrada de dados, lendo um valor
		// inteiro)
		numero = ler.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O numero " + numero + " eh par!");

		} else {
			System.out.println("O numero " + numero + " eh impar!");
		}

	}

}
