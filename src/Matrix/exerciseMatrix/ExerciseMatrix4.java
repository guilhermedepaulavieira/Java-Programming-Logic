package Matrix.exerciseMatrix;

import java.util.Scanner;

public class ExerciseMatrix4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] mat = new int[N][N];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int sum = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = i + 1; j < N; j++) { 
				System.out.println(mat[i][j]);
				sum += mat[i][j];
				
			}
		}
		System.out.println(sum);

		sc.close();
	}
}
