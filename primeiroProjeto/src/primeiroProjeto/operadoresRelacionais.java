package primeiroProjeto;

public class operadoresRelacionais {

	public static void main(String[] args) {

		// CONHECENDO OS OPERADORES RELACIONAIS

		/*
		 * ( > ) MAIOR ( < ) MENOR ( >= ) MAIOR OU IGUAL ( <= ) MENOR OU IGUAL ( != )
		 * DIFERENTE ( == ) IGUAL
		 */

		// declarando as variáveis
		int A = 70;
		int B = 70;

		// ESTRUTURAS CONDICIONAIS ( IF / ELSEIF / ELSE )
		if (A > B) {
			System.out.println("A eh maior do que B");
		} else if (A == B) {
			System.out.println("A eh igual B");
		} else {
			System.out.println("B eh maior do que A");
		}

	}

}
