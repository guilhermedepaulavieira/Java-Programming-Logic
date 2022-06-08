package Matrix.exerciseMatrix;

import java.util.Scanner;

public class ExerciseMatrix1 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] mat = new int[M][N];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("NEGATIVE VALUE: ");
		for (int i=0; i < mat.length; i++) {
			for (int j=0; j<N; j++) {
				if (mat[i][j] < 0) {
					System.out.println(mat[i][j]);
				}
			}
		}
		
		sc.close();
	}
}
