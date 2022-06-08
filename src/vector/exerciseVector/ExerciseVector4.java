package vector.exerciseVector;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseVector4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[] vet = new double[N];

		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
		}

		
		double sum = 0.0;
		for (int i = 0; i < N; i++) {
			sum = sum + vet[i];
		}
		double media = sum / N;
		System.out.printf("%.3f%n", media);

		for (int i = 0; i < N; i++) {
			if (vet[i] < media) {
				System.out.printf("%.1f%n", vet[i]);
			}
		}

		sc.close();
	}
}
