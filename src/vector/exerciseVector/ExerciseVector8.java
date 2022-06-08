package vector.exerciseVector;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseVector8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[] heights = new double[N];
		char[] gender = new char[N];

		for (int i = 0; i < N; i++) {
			heights[i] = sc.nextDouble();
			gender[i] = sc.next().charAt(0);
		}

		double smallestHeight = heights[0];
		for (int i = 1; i < N; i++) {
			if (heights[i] < smallestHeight) {
				smallestHeight = heights[i];
			}
		}
		System.out.printf("Shortest height = %.2f%n", smallestHeight);

		double maiorAltura = heights[0];
		for (int i = 1; i < N; i++) {
			if (heights[i] > maiorAltura) {
				maiorAltura = heights[i];
			}
		}
		System.out.printf("Greater height = %.2f%n", maiorAltura);

		double sumOfHeightsOfWomen = 0.0;
		int contWoman = 0;
		for (int i = 0; i < N; i++) {
			if (gender[i] == 'F') {
				sumOfHeightsOfWomen = sumOfHeightsOfWomen + heights[i];
				contWoman++;
			}
		}

		if (contWoman == 0) {
			System.out.println("There is no woman among the people");
		} else {
			double media = sumOfHeightsOfWomen / contWoman;
			System.out.printf("Average height of women = %.2f%n", media);
		}

		int contMen = 0;
		for (int i = 0; i < N; i++) {
			if (gender[i] == 'M') {
				contMen++;
			}
		}
		System.out.println("Numero de homens = " + contMen);

		sc.close();
	}
}
