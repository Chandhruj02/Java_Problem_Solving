<<<<<<< HEAD
package JavaProblems.NumberBasedProblems;
=======
package NumberBasedProblems;
>>>>>>> da935b2 (Resynced local files with remote)

import java.util.Scanner;

public class SumofSquares {

	public static void main(String[] args) {
		System.out.println("Sum of Squares of Digits");
		System.out.println("Enter a number:");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int ans = 0;
		int digit;
		while (a > 0) {
			digit = a % 10;
			ans += (int)Math.pow(digit, 2);
			a /= 10; 
		}
		System.out.println("Sum: "+ ans);
		in.close();
	}

}
