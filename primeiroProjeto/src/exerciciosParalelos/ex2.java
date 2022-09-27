package exerciciosParalelos;

public class ex2 {
	public static void main(String[] args) {

		/*
		 * 2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A
		 * média dos números 4, 5 e 6. A soma das duas médias. A média das médias.
		 */

		double media1 = (8 + 9 + 7) / 3;
		double media2 = (4 + 5 + 6) / 3;
		double somaMedias = media1 + media2;
		double mediaMedia = somaMedias / 2;

		System.out.println("A media aritmetica dos numeros 8, 9 e 7 eh: " + media1);
		System.out.println("\nA media aritmetica dos numeros 4, 5 e 6 eh: " + media2);
		System.out.println("\nA soma das duas medias eh: " + somaMedias);
		System.out.println("\nA media das medias eh: " + mediaMedia);

	}

}
