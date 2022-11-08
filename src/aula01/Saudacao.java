package aula01;

import java.util.Scanner;

public class Saudacao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome;
		int idade;
		System.out.print("Digite o nome:");
		nome = leitor.next();
		System.out.println("O nome digitado é: " + nome);
		System.out.println();
		System.out.print("Digite a idade:");
		idade = leitor.nextInt();
		System.out.println("A idade é: " + idade);
		leitor.close();	
		
		
	}

}
