package aula04;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		double somaAlturas=0.0, media;
		int i = 0, quantidadeAlunos;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o total de alunos na turma");
		quantidadeAlunos = leitor.nextInt();
		while (i<quantidadeAlunos) {
		System.out.println("Digite a altura do " + (i+1) + "aluno");
		somaAlturas = somaAlturas + leitor.nextDouble();
		i = i + 1;
		} media =
		somaAlturas/quantidadeAlunos;
		System.out.println("A media de altura dos alunos é de " +
		media);
		leitor.close();

	}

}
