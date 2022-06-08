package vector;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int N = entrada.nextInt();
		double[] vet = new double[N];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = entrada.nextInt();
		}

		for (int i = 0; i < vet.length; i++) {
			System.out.printf("%.2f%n", vet[i]);
		}

		entrada.close();
	}
}
