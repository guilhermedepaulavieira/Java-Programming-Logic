package Matrix;

import java.util.Scanner;

public class ExerciseSolved1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] mat = new int[N][N];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.print("\nMAIN DIAGONAL = ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}

		int negative = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0) {
					negative++;
				}
			}
		}
		System.out.println();
		System.out.println("\nNEGATIVE NUMBER = " + negative);

		System.out.print("\nNEGATIVE NUMBERS ARE = ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}

		sc.close();
	}
}
