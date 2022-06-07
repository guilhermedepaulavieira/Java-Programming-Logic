package vetor;

import java.util.Scanner;

public class ExerciseSolved2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] vet = new double[N];

		
		// presentation of values ​​with sum
		double sum = 0.0;
		int count = 0;
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextDouble();
			sum += vet[i];
			count ++;
		}
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
		
		System.out.println(sum);
		System.out.println(sum/count);

		sc.close();
	}
}
