package primeiroProjeto;

import java.util.Scanner;

public class exFixacao2 {

	public static void main(String[] args) {

		/*
		 * 2) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$
		 * 1,00 se forem compradas pelo menos 12. Escreva um programa que leia o número
		 * de maçãs compradas, calcule e escreva o custo total da compra.
		 * 
		 */

		// instanciando e criando um objeto Scanner
		Scanner ler = new Scanner(System.in);

		double macasMuitas = 1;
		double macasPoucas = 1.3;
		int quantidade;

		System.out.println("\nAbaixo de 1 duzia, cada maca custa R$ 1,30 cada.");
		System.out.println("Acima de 1 duzia, cada maca custa R$ 1,00 cada.");

		System.out.println("\n=============================");
		System.out.println("=============================");

		System.out.println("\nQuantos macas voce quer comprar ?");
		quantidade = ler.nextInt();

		if (quantidade < 12) {
			System.out.println("\nPara a quantidade que voce escolheu, de " + quantidade
					+ " macas, o valor total da sua compra eh de R$ " + (quantidade * macasPoucas));
		} else {
			System.out.println("\nPara a quantidade que voce escolheu, de " + quantidade
					+ " macas, o valor total da sua compra eh de R$ " + (quantidade * macasMuitas));
		}

		System.out.println("\n=============================");
		System.out.println("=============================");

		System.out.println("\nObrigado pela sua compra, e volte sempre!");

	}

}
