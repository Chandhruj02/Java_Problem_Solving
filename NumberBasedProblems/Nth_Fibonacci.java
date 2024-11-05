<<<<<<< HEAD
package JavaProblems.NumberBasedProblems;
=======
package NumberBasedProblems;
>>>>>>> da935b2 (Resynced local files with remote)

import java.util.Scanner;

public class Nth_Fibonacci {

	public static void main(String[] args) {
		System.out.println("Fibonacci of the Nth Number");
		System.out.println("Enter a number: ");
		Scanner in =new Scanner(System.in);
		int a = in.nextInt();
		int first = 0;
		int second = 1;
		int ans = 0;
		if (a == 1) {
			ans = first; 
		} else {
			for (int i = 2; i <= a; i++) {
				ans = first + second;
				first = second;
				second = ans;
			}
		}
		System.out.println("Fibonacci: "+ans);
		in.close();
	}

}
