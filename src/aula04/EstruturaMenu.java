package aula04;

import java.util.Scanner;

public class EstruturaMenu {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		

		int opcao=0;
		
		

		while (opcao != 4) {
			System.out.println("Estrutura de menus");
			System.out.println("Suas opções são:\\n1-Opção 1\\n2-Opção 2\\n3-Opção 3\\n4-Sair\"");
			opcao = leitor.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Você escolheu a opção 1");
				break;
			case 2:
				System.out.println("Você escolheu a opção 2");
				break;
			case 3:
				System.out.println("Você escolheu a opção 3");
				break;
			case 4:
				System.out.println("Ok! Saindo do sistema...");
				break;
			default:
				System.out.println("A opção escolhida não existe...");
				break;
			}			
		}
		
		leitor.close();
	}

}
