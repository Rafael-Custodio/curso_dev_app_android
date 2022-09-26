package primeiroProjeto;

public class atividadePratica1_segundoModo {

	public static void main(String[] args) {

		//01. Faça um programa que receba 3 números via teclado e imprima o maior deles.

		// declarando as variáveis
		int numero1 = 10;
		int numero2 = 20;
		int numero3 = 30;

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("\nO primeiro numero eh o maior. \nOu seja, numero: " + numero1);
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("\nO segundo numero eh o maior. \nOu seja, numero: " + numero2);
		} else {
			System.out.println("\nO terceiro numero eh o maior. \nOu seja, numero: " + numero3);
		}

	}

}
