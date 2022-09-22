package primeiroProjeto;

public class operadoresLogicos {

	public static void main(String[] args) {

		// CONHECENDO OS OPERADORES LÓGICOS

		/*
		 * ( && ) E ( || ) OU ( != ) NEGAÇÃO
		 */

		/*
		 * ATIVIDADE Construa uma aplicação que receba quatro notas, essas notas deverão
		 * ser somadas e exibidas a média.
		 * 
		 * Caso a media seja menor que 7 deverá ser impresso "Aluno Reprovado!" Caso a
		 * media seja entre 7 e 8 deverá ser impresso "Aluno de Recuperação!" Caso a
		 * media seja maior que 8 deverá ser impresso "Aluno Aprovado!"
		 * 
		 */

		// declarando as variáveis
		double nota1 = 7.5;
		double nota2 = 6.8;
		double nota3 = 7.8;
		double nota4 = 6.2;
		double soma = nota1 + nota2 + nota3 + nota4;
		double media = soma / 4;

		System.out.println("A SOMA de todas as notas eh: " + soma + "\n");
		System.out.println("A MEDIA de todas as notas eh: " + media + "\n");

		if (media < 7) {
			System.out.println("Aluno Reprovado!");

		} else if (media >= 7 && media <= 8) {
			System.out.println("Aluno de Recuperacao!");
		}

		else {
			System.out.println("Aluno Aprovado!");
		}

	}

}
