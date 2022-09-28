package primeiroProjeto;

import java.util.Scanner;

public class exFixacao1 {

	public static void main(String[] args) {

		/*
		 * 1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
		 * dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o
		 * mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
		 */

		// instanciando e criando um objeto Scanner
		Scanner ler = new Scanner(System.in);

		int anos;
		int meses;
		int dias;

		System.out.println("Quantos anos de vida voce tem ?");
		anos = ler.nextInt();

		System.out.println("\nQuantos meses de vida voce tem ?");
		meses = ler.nextInt();

		System.out.println("\nQuantos dias de vida voce tem ?");
		dias = ler.nextInt();

		int anosT = anos * 365;
		int mesesT = meses * 30;
		int diasTotais = anosT + mesesT + dias;

		System.out.println("\n=============================");
		System.out.println("=============================");

		System.out.println("\nSua idade total de vida em dias eh de: " + diasTotais + " dias");

	}

}
