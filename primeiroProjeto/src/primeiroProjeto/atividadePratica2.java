package primeiroProjeto;

//importando a classe Scanner
import java.util.Scanner;

public class atividadePratica2 {

	public static void main(String[] args) {

		// 02. Fa�a um programa que receba um n�mero via teclado e verifique se este
		// n�mero � par ou �mpar.

		// instanciando e criando um objeto Scanner
		Scanner ler = new Scanner(System.in);

		// declarando a vari�vel
		int numero;

		System.out.println("Digite um numero qualquer: ");
		// recebendo o n�mero via teclado (entrada de dados, lendo um valor
		// inteiro)
		numero = ler.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O numero " + numero + " eh par!");

		} else {
			System.out.println("O numero " + numero + " eh impar!");
		}

	}

}
