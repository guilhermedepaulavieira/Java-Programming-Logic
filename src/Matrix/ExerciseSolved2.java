package Matrix;

import java.util.Scanner;

public class ExerciseSolved2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int N = entrada.nextInt();
		int M = entrada.nextInt();

		double[][] mat = new double[N][M];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < M; j++) {
				mat[i][j] = entrada.nextDouble();
			}

		}

		double[] vet = new double[M];

		for (int i = 0; i < mat.length; i++) {
			double sum = 0.0;
			for (int j = 0; j < M; j++) {
				sum += mat[i][j];
			}
			vet[i] = sum;
		}

		for (int i = 0; i < vet.length - 1; i++) {
			System.out.printf("%.1f\n", vet[i]);

		}

		entrada.close();
	}
}
