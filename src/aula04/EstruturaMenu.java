package aula04;

import java.util.Scanner;

public class EstruturaMenu {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Estrutura de menus");
		
		String opcao;
		System.out.println("Digite a opção");
		opcao = leitor.next();
		while (opcao != "sair") {
			System.out.println("Fazendo alguma coisa");
			
		}
		leitor.close();
	}

}
