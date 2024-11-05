<<<<<<< HEAD
package JavaProblems.NumberBasedProblems;
=======
package NumberBasedProblems;
>>>>>>> da935b2 (Resynced local files with remote)

//import java.util.ArrayList;
import java.util.Scanner;

public class StrongNumber {
	
	static int findFactorial(int a) {
		int fact = 1;
		for(int i=1;i<=a;i++) {
			fact *= i;
		}
	return fact;
	}
	
	public static void main(String[] args) {
		//ArrayList<Integer> digits = new ArrayList<>();
		System.out.println("String Number");
		System.out.println("Enter a number: ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int sum=0;
		int temp = number;
		while(temp > 0) {
			sum = sum + findFactorial(temp % 10);
			temp = temp / 10;
		}
		System.out.println("Sum of Factorial of Digits: "+sum);
		if(sum == number) {
			System.out.println("True - Given number is Strong Number");
		}else {
			System.out.println("False - Given number is not a Strong Number");
		}
		in.close();
	}

}
