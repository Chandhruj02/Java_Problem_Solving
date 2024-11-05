package NumberBasedProblems;

import java.util.Scanner;

public class Sum_Of_N_NaturalNumbers {

	public static void main(String[] args) {
		System.out.println("Sum of N Natural Numbers");
		System.out.println("Enter a number: ");
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int number = in.nextInt();
		for(int i=1; i<=number;i++) {
			sum = sum + i;
		}
		System.out.println("Sum of "+number+"th Natural Numbers: "+sum);
		in.close();
	}

}
