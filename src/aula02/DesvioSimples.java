package aula02;

import java.util.Scanner;

public class DesvioSimples {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe sua idade:");
		int idade = leitor.nextInt();
		leitor.close();
		if (idade < 12) {
			System.out.println("Vc é um bosta!");
		}
		else {
			System.out.println("Vc é legal!");
		}
		System.out.print("Sua idade é: ");		
	}

}
