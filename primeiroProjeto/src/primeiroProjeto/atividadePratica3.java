package primeiroProjeto;

//importando a classe Scanner
import java.util.Scanner;

public class atividadePratica3 {

	public static void main(String[] args) {

		/*
		 * 03. Fazer um programa para receber um n�mero e verificar se est� entre 100 e
		 * 200. Se estiver na faixa, imprimir: "Voc� digitou um n�mero entre 100 e 200",
		 * Sen�o estiver na faixa, imprimir:
		 * " Voc� digitou um n�mero fora da faixa entre100 e 200."
		 * 
		 */

		// instanciando e criando um objeto Scanner
		Scanner ler = new Scanner(System.in);

		// declara��o de vari�veis
		int numero;

		System.out.println("Digite um numero qualquer: ");
		// recebendo o n�mero via teclado (entrada de dados, lendo um valor
		// inteiro)
		numero = ler.nextInt();

		if (numero >= 100 && numero <= 200) {
			System.out.println("Voce digitou um numero ENTRE 100 e 200");

		} else {
			System.out.println("Voce digitou um numero FORA DA FAIXA entre 100 e 200");
		}

	}

}
