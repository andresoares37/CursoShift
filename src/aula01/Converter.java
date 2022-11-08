package aula01;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float dolar;
		float real;
		
		System.out.println("Digite o valor em reais");
		real = leitor.nextFloat();
		leitor.close();
		
		dolar = real * 5;
		System.out.println("O valor em dolar é: " + dolar);

	}

}
