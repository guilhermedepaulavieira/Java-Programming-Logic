package vector.exerciseVector;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseVector7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[] name = new String[N];
		double[] gradesSemester1 = new double[N];
		double[] gradesSemester2 = new double[N];

		for (int i = 0; i < N; i++) {
			name[i] = sc.next();
			gradesSemester1[i] = sc.nextDouble();
			gradesSemester2[i] = sc.nextDouble();
		}

		System.out.println("Approved students: ");
		for (int i = 0; i < N; i++) {
			double media = (gradesSemester1[i] + gradesSemester2[i]) / 2.0;
			if (media >= 6.0) {
				System.out.println(name[i]);
			}
		}

		sc.close();
	}
}
