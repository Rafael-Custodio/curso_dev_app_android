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
		double saldoAtual = saldo - debito + credito;

		System.out.println("\nDigite o numero da conta corrente: ");
		numeroConta = ler.next();

		System.out.println("\nQual o dígito da conta corrente: ");
		digitoConta = ler.next();
		
		System.out.println("\nSeu saldo eh: " + saldo);
		System.out.println("Debito: " + debito);
		System.out.println("Credito: " + credito);
		System.out.println("Saldo Atual: " + saldoAtual);

		if (saldoAtual >= 0) {
			System.out.println("\nSaldo Positivo");
		} else {
			System.out.println("\nSaldo Negativo");
		}

	}

}
