package primeiroProjeto;

import java.util.Scanner;

public class atividadePratica5 {

	public static void main(String[] args) {
		

		/*
		 * 05. Faça um algoritmo para ler: número da conta do cliente, saldo, débito e
		 * crédito. Após calcular e escrever o saldo atual (saldo atual = saldo - débito
		 * + crédito). Também testar se saldo atual for maior ou igual a zero escrever a
		 * mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
		 * 
		 */
		
		// instanciando e criando um objeto Scanner
		Scanner ler = new Scanner(System.in);

		String numeroConta;
		String digitoConta;
		double saldo = 1000;
		double debito;
		double credito;

		System.out.println("\nDigite o numero da conta corrente sem o digito: ");
		numeroConta = ler.next();

		System.out.println("\nQual o digito da conta corrente: ");
		digitoConta = ler.next();
		
		System.out.println("\n=============================");
		System.out.println("=============================");

		System.out.println("\nConta corrente numero: " + numeroConta + "-" + digitoConta);
		System.out.println("\nSaldo em 27/09/2022: R$ " + saldo);
		
		System.out.println("\nDigite o valor que voce quer sacar: R$ ");
		debito = ler.nextDouble();
				
		System.out.println("Digite o valor que voce quer depositar: R$ ");
		credito = ler.nextDouble();
		
		System.out.println("\n=============================");
		System.out.println("=============================");
				
		double saldoAtual = saldo - debito + credito;

		System.out.println("\nSaldo atual em 28/09/2022: R$ " + saldoAtual);

		if (saldoAtual >= 0) {
			System.out.println("\n*** Saldo Positivo ***");
		} else {
			System.out.println("\n*** Saldo Negativo ***");
		}

	}

}
