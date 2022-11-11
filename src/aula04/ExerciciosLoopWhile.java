package aula04;

import java.util.Scanner;

public class ExerciciosLoopWhile {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int numero = 0;

		// numeros de 1 a 100
//		 while (numero <= 100) {
//		 System.out.println(numero);
//		 numero++;
//		 }

		// numeros pares de 1 a 100
		// while (numero <= 100) {
		// if (numero % 2 == 0) {
		// System.out.println(numero);
		// }
		// numero++;
		// }

		// Soma dos numeros de 1 a 100
//		int soma = 0;
//		while (numero <= 100) {
//			soma = soma + numero;
//			numero++;
//		}
//		System.out.println(soma);

		while (numero <= 1000) {
			if (numero % 2 != 0) {
				System.out.println(numero);
				if (numero == 567) {
					break;
				}
				numero++;
			}
		}

		leitor.close();
	}

}
