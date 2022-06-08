package vector.exerciseVector;

import java.util.Scanner;

public class ExerciseVector2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] vet = new int[N];

		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextInt();
		}

		// show pairs 
		for (int i = 0; i < N; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
			}
		}
		System.out.println();

		// show number of pairs
		int quantityOfPairs = 0;
		for (int i = 0; i < N; i++) {
			if (vet[i] % 2 == 0) {
				quantityOfPairs++;
			}
		}
		System.out.println(quantityOfPairs);

		sc.close();
	}
}
