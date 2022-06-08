package vector.exerciseVector;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseVector5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[] vet = new double[N];

		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
		}

		double sumOfPairs = 0.0;
		int quantityOfPairs = 0;
		for (int i = 0; i < N; i++) {
			if (vet[i] % 2 == 0) {
				sumOfPairs += vet[i];
				quantityOfPairs++;
			}
		}

		if (quantityOfPairs == 0) {
			System.out.println("There was no even number");
		} else {
			double media = sumOfPairs / quantityOfPairs;
			System.out.printf("%.1f%n", media);
		}

		sc.close();
	}
}
