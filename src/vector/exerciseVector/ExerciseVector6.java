package vector.exerciseVector;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseVector6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[] names = new String[N];
		int[] ages = new int[N];

		for (int i = 0; i < N; i++) {
			names[i] = sc.next();
			ages[i] = sc.nextInt();
		}

		int majorityAge = ages[0];
		int positionMajorAge = 0;

		for (int i = 1; i < N; i++) {
			if (ages[i] > majorityAge) {
				majorityAge = ages[i];
				positionMajorAge = i;
			}
		}

		System.out.println("Older person: " + names[positionMajorAge]);

		sc.close();
	}
}
