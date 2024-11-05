package NumberBasedProblems;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Factorial of the Number");
		System.out.println("Enter a number: ");
		Scanner in =new Scanner(System.in);
		int a = in.nextInt();
		int fact = 1;
		for(int i=1;i<=a;i++) {
			fact *= i;
		}
		System.out.println("Factorial of "+ a + " : "+fact);
		in.close();
	}

}
