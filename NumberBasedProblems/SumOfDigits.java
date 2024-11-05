package NumberBasedProblems;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println("Sum of Digits");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a = in.nextInt();
		int sum = 0;
		while(a > 0) {
		 sum = sum + a % 10;
		 a = a / 10;
		}
		System.out.println("The Sum Of Digits: " + sum);
		in.close();
	}

}
