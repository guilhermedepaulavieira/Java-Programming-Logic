package Matrix;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int M = sc.nextInt();
		int N = sc.nextInt();
			
		int[][] mat = new int[M][N];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
		
			}
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		

		sc.close();
	}

}
