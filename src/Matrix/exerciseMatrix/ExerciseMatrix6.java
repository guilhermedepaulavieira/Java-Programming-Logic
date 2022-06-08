package Matrix.exerciseMatrix;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseMatrix6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[][] mat = new double[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		int lines = sc.nextInt();
		int colummns = sc.nextInt();

		double sum = 0.0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] > 0.0) {
					sum = sum + mat[i][j];
				}
			}
		}
		System.out.printf("SUM OF POSITIVES: %.1f%n", sum);
		;

		System.out.print("CHOSEN LINE: ");
		for (int j = 0; j < N; j++) {
			System.out.printf("%.1f ", mat[lines][j]);
		}
		System.out.println();

		System.out.print("CHOSEN COLUMN: ");
		for (int i = 0; i < N; i++) {
			System.out.printf("%.1f ", mat[i][colummns]);
		}
		System.out.println();

		System.out.print("MAIN DIAGONAL: ");
		for (int i = 0; i < N; i++) {
			System.out.printf("%.1f ", mat[i][i]);
		}
		System.out.println();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0.0) {
					mat[i][j] = mat[i][j] * mat[i][j];
				}
			}
		}
		System.out.println("MATRIX CHANGED:");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf("%.1f ", mat[i][j]);
			}
			System.out.println();
		}

		sc.close();
	}
}
