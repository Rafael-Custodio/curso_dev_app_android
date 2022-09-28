package primeiroProjeto;

public class exFixacao3 {

	public static void main(String[] args) {
		/*
		 * 3) Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima
		 * em estoque e quantidade mínima em estoque de um produto. Calcular e escrever
		 * a quantidade média ((quantidade média = quantidade máxima + quantidade
		 * mínima)/2). Se a quantidade em estoque for maior ou igual a quantidade média
		 * escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
		 * compra'.
		 * 
		 */

		int estoque_atual = 800;
		int q_maxima = 1000;
		int q_minima = 200;
		int q_media = (q_maxima + q_minima) / 2;

		System.out.println("\nSeu estoque atual eh de: " + estoque_atual);
		System.out.println("\nA quantidade maxima eh de: " + q_maxima);
		System.out.println("A quantidade minima eh de: " + q_minima);
		System.out.println("\nLogo, a quantidade media eh de: " + q_media);

		System.out.println("\n=============================");
		System.out.println("=============================");

		if (estoque_atual >= q_media) {
			System.out.println("\nSeu estoque atual esta acima da media. \n*** NAO EFETUAR COMPRA! ***");

		} else {
			System.out.println("\nSeu estoque atual esta abaixo da media. \n*** EFETUAR COMPRA! ***");
		}

	}

}
