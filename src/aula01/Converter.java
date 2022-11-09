package aula01;

import java.util.Scanner;

public class Converter {

	static final double cotacao = 5;
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double dolar;
		double real;
		
		System.out.println("Digite o valor em dolar");
		real = leitor.nextFloat();
		leitor.close();
		
		real = dolar * cotacao;
		System.out.println("O valor em real é: " + real);

	}

}
