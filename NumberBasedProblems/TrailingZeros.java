package NumberBasedProblems;

import java.util.Scanner;

public class TrailingZeros {

	static int findFactorial(int a) {
			int fact = 1;
			for(int i=1;i<=a;i++) {
				fact *= i;
			}
			System.out.println("Factorial of "+ a + " : "+fact);
		return fact;
	}
	
	static int checkTrailing(int fact) {
			int count = 0;
			int digit = 0;
			while(fact > 0) {
				digit = fact % 10;
				fact = fact / 10;
				if(digit !=0 )
					break;
				else
					count++;
			}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("Trailing Zeros in Factorial of the Number");
		System.out.println("Enter a number: ");
		Scanner in =new Scanner(System.in);
		int number = in.nextInt();
		int factorial = findFactorial(number);
		int count = checkTrailing(factorial);
		System.out.println("Trailing Zeros: "+count );
		in.close();

	}

}
