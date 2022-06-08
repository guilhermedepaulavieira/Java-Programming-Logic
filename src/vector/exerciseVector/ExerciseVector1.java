package vector.exerciseVector;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseVector1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[] vet = new double[N];

		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
		}

		double larger = vet[0];
		int higherPosition = 0;

		for (int i = 1; i < N; i++) {
			if (vet[i] > larger) {
				larger = vet[i];
				higherPosition = i;
			}
		}

		System.out.printf("%.1f%n", larger);
		System.out.println(higherPosition);

		sc.close();
	}
}
