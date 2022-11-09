package aula02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double doacao, investimento = 0, usoImediato = 0;
		System.out.println("Entre com o valor da doação");		
		doacao = leitor.nextDouble();
		leitor.close();
		if (doacao <= 0) {
			System.out.println("valor inválido para doação");
		} else {
			if (doacao < 1000) {
				investimento = doacao * 0.05;
				usoImediato = doacao - investimento;
			}
			else {
				investimento = doacao * 0.15;
				usoImediato = doacao - investimento;
			}
			System.out.println("A doação de R$" + doacao + " implica em um investimento de R$" + investimento + ", restando R$" + usoImediato + " parauso imediato");
			System.out.println("O valor do investimento é: " + investimento);
		}		
	}

}
