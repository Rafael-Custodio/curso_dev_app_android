package primeiroProjeto;

import java.util.Scanner;

public class atividadePratica3_segundoModo {

	public static void main(String[] args) {
		/*
		 * 03. Fazer um programa para receber um n�mero e verificar se est� entre 100 e
		 * 200. Se estiver na faixa, imprimir: "Voc� digitou um n�mero entre 100 e 200",
		 * Sen�o estiver na faixa, imprimir:
		 * " Voc� digitou um n�mero fora da faixa entre100 e 200."
		 * 
		 */

		// declara��o de vari�veis
		int numero = 105;

		if (numero >= 100 && numero <= 200) {
			System.out.println("Voce digitou um numero ENTRE 100 e 200");

		} else {
			System.out.println("Voce digitou um numero FORA DA FAIXA entre 100 e 200");
		}
	}

}
