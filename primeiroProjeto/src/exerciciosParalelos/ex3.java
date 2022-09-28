package exerciciosParalelos;

//importando a classe Scanner
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		// 3. Informar um saldo e imprimir o saldo com reajuste de 1%.

		// instanciando e criando um objeto Scanner
		Scanner ler = new Scanner(System.in);

		// declaração de variáveis
		double saldo;
		double novoSaldo;

		System.out.println("Digite o saldo: ");
		// recebendo o saldo via teclado (entrada de dados, lendo um valor)
		saldo = ler.nextInt();

		novoSaldo = saldo + (1 * saldo) / 100;
		System.out.println("O saldo novo, com reajuste de 1% eh: " + novoSaldo);

	}

}
