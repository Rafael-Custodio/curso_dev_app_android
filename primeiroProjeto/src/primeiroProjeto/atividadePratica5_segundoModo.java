package primeiroProjeto;

public class atividadePratica5_segundoModo {

	public static void main(String[] args) {
		/*
		 * 05. Faça um algoritmo para ler: número da conta do cliente, saldo, débito e
		 * crédito. Após calcular e escrever o saldo atual (saldo atual = saldo - débito
		 * + crédito). Também testar se saldo atual for maior ou igual a zero escrever a
		 * mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
		 * 
		 */

		String numeroConta = "0280877";
		String digitoConta = "3";
		double saldo = 500.00;
		double debito = 50.00;
		double credito = 500;
		double saldoAtual = saldo - debito + credito;

		System.out.println("\nConta corrente numero: " + numeroConta + "-" + digitoConta);
		System.out.println("\nSaldo: " + saldo);
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
