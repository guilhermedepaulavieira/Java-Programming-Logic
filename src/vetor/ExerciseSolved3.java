package vetor;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseSolved3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] names = new String[N];
		int[] age = new int[N];
		double[] height = new double[N];
		
		for (int i = 0; i < height.length; i++) {
			names[i] = sc.next();
			age[i] = sc.nextInt();
			height[i] = sc.nextDouble();			
		}
		
		double sum = 0;
		for (int i = 0; i < height.length; i++) {
			sum += height[i];
		}
		
		double media = sum / N;
		System.out.printf("Average height: %.2f%n", media);
		
		int count = 0;
		for (int i = 0; i < height.length; i++) {
			if (age[i] < 16) {
				count++;
			}
		}
		double x = count * 100.0 / N ;
		
		System.out.printf("Person under 16 years of age: %.1f%%%n", x);
		
		sc.close();
	}
}
