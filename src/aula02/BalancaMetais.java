package aula02;

import java.util.Scanner;

public class BalancaMetais {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float ouro, prata, bronze;
		System.out.println("Informe o peso do ouro:");
		ouro = leitor.nextFloat();
		System.out.println("Informe o peso do prata:");
		prata = leitor.nextFloat();
		System.out.println("Informe o peso do bronze:");
		bronze = leitor.nextFloat();
		leitor.close();

		// operations
		if (ouro == prata && ouro == bronze && bronze == prata) {
			System.out.println("Todos os pesos são iguais");
		} else {
			if (ouro == prata) {
				System.out.println("Ouro e prata possuem o mesmo peso");
			} else {
				if (ouro == bronze) {
					System.out.println("Ouro e bronze possuem o mesmo peso");
				} else {
					if (ouro > prata && ouro > bronze) {
						System.out.println("Ouro é o metal mais pesado");
					} else {
						if (prata > bronze && prata > ouro) {
							System.out.println("Prata é o metal mais pesado");
						} else {
							if (prata == bronze) {
								System.out.println("Prata e bronze possuem o mesmo peso");
							}
							System.out.println("Bronze é o metal mais pesado");
						}
					}
				}
			}
		}
	}
}
