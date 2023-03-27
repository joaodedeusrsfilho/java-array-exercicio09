package aula19_Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*
		 * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um
		 * vetor C, onde cada elemento de C é a Divisão dos respectivos elementos em A
		 * e B, ou seja: C[i] = A[i] / float(B[i]).
		 */

		Scanner ler = new Scanner(System.in);
		int[] vetorA = new int[10];
		float[] vetorB = new float[vetorA.length];
		double[] vetorC = new double[vetorB.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor do vetorA na posicao: " + i);
			vetorA[i] = ler.nextInt();
		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Entre com o valor do vetorB na posicao: " + i);
			vetorB[i] = ler.nextInt();
		}
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = (float) (vetorA[i] / vetorB[i]);
		}
		System.out.print("VetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("VetorB = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		// formatar numeros com DecinamlFormat
		DecimalFormat decimalFormat = new DecimalFormat("###,###.##");

		System.out.println();
		System.out.print("VetorC = ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(decimalFormat.format(vetorC[i]) + " ");
		}
	}
}
