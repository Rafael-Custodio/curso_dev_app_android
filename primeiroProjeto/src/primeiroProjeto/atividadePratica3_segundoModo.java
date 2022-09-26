package primeiroProjeto;

import java.util.Scanner;

public class atividadePratica3_segundoModo {

	public static void main(String[] args) {
		/*
		 * 03. Fazer um programa para receber um número e verificar se está entre 100 e
		 * 200. Se estiver na faixa, imprimir: "Você digitou um número entre 100 e 200",
		 * Senão estiver na faixa, imprimir:
		 * " Você digitou um número fora da faixa entre100 e 200."
		 * 
		 */

		// declaração de variáveis
		int numero = 105;

		if (numero >= 100 && numero <= 200) {
			System.out.println("Voce digitou um numero ENTRE 100 e 200");

		} else {
			System.out.println("Voce digitou um numero FORA DA FAIXA entre 100 e 200");
		}
	}

}
