package Matrix.exerciseMatrix;

import java.util.Scanner;

public class ExerciseMatrix3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] mat = new int[N][N];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < mat.length; i++) {
			int bigger = mat[i][0];
			for (int j = 1; j < N; j++) {
				if (mat[i][j] > bigger) {
					bigger = mat[i][j];
				}
			}
			System.out.println(bigger);
		}

		sc.close();
	}
}
