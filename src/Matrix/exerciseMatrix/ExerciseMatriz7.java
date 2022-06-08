package Matrix.exerciseMatrix;

import java.util.Scanner;

public class ExerciseMatriz7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[][] mat = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		// Input data
		int line = sc.nextInt();

		// decrement the queue value
		line = line - 1;

		// step 1: let's save the last of the chosen queue
		int lastInLine = mat[line][N - 1];

		// step 2: let's move all of the queue (except the last one) to the right,
		// but we will have to do it from right to left (countdown)
		for (int j = N - 1; j > 0; j--) {
			mat[line][j] = mat[line][j - 1];
		}

		// step 3: now let's store the last one in the first position of the queue
		mat[line][0] = lastInLine;

		// Now let's print the altered matrix:
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
