package primeiroProjeto;

import java.util.Scanner;

public class exFixacao4 {

	public static void main(String[] args) {

		/*
		 * 
		 * 4) Uma empresa quer verificar se um empregado está qualificado para a
		 * aposentadoria ou não. Para estar em condições, um dos seguintes requisitos
		 * deve ser satisfeito:
		 * 
		 * - Ter no mínimo 65 anos de idade. - Ter trabalhado no mínimo 30 anos. - Ter
		 * no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
		 * 
		 * Com base nas informações acima, faça um algoritmo que leia: o número do
		 * empregado (código), o ano de seu nascimento e o ano de seu ingresso na
		 * empresa. O programa deverá escrever a idade e o tempo de trabalho do
		 * empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.
		 * 
		 */

		// instanciando e criando um objeto Scanner
		Scanner ler = new Scanner(System.in);

		String nome;
		String sobrenome;
		String numero_empregado;
		int ano_nascimento;
		int admissao;

		System.out.println("\nDigite seu primeiro nome: ");
		nome = ler.next();

		System.out.println("\nDigite seu sobrenome: ");
		sobrenome = ler.next();

		System.out.println("\nDigite seu numero de empregado na empresa (codigo funcional): ");
		numero_empregado = ler.next();

		System.out.println("\nDigite o ano do seu nascimento com 04 digitos: ");
		ano_nascimento = ler.nextInt();

		System.out.println("\nDigite o ano da sua admissao na empresa com 04 digitos: ");
		admissao = ler.nextInt();

		System.out.println("\n==============================================================");
		System.out.println("==============================================================");

		System.out.println("\nFuncionario: " + nome + " " + sobrenome);
		System.out.println("Codigo Funcional: " + numero_empregado);
		System.out.println((2022 - ano_nascimento) + " anos de idade");
		System.out.println("Tempo trabalhado: " + (2022 - admissao) + " anos");

		System.out.println("\n==============================================================");
		System.out.println("==============================================================");

		int idade = 2022 - ano_nascimento;
		int tempo_trabalhado = 2022 - admissao;

		if (idade > 64) {
			System.out.println("\n*** REQUER APOSENTADORIA ***");

		} else if (tempo_trabalhado > 29) {
			System.out.println("\n*** REQUER APOSENTADORIA ***");

		} else if (idade >= 60 && admissao >= 25) {
			System.out.println("\n*** REQUER APOSENTADORIA ***");

		} else {
			System.out.println("\n*** NAO REQUER APOSENTADORIA ***");
		}

	}

}
