package primeiroProjeto;

// importando a classe Scanner
import java.util.Scanner;

public class atividadePratica4 {

	public static void main(String[] args) {

		// 04. Ler um número e informar se ele é positivo, negativo ou nulo.

		// instanciando e criando um objeto Scanner
		Scanner ler = new Scanner(System.in);

		// declaração de variáveis
		int numero;

		System.out.println("Digite qualquer numero, sendo ele positivo, negativo ou nulo (0): ");
		// recebendo o número via teclado (entrada de dados, lendo um valor
		// inteiro)
		numero = ler.nextInt();

		if (numero == 0) {
			System.out.println("Voce digitou um numero NULO = 0");

		} else if (numero < 0) {
			System.out.println("Voce digitou um numero NEGATIVO");

		} else {
			System.out.println("Voce digitou um numero POSITIVO");
		}

	}

}
