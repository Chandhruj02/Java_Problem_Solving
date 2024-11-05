<<<<<<< HEAD
package JavaProblems.NumberBasedProblems;
=======
package NumberBasedProblems;
>>>>>>> da935b2 (Resynced local files with remote)

import java.util.Scanner;

public class ProductofDigits {

	public static void main(String[] args) {
		System.out.println("Product of Digits");
		System.out.println("Enter a number:");
		Scanner in = new Scanner(System.in);
		int digits = 1;
		int number = in.nextInt();
		while (number > 0) {
			digits = number % 10 * digits;
			number = number / 10;
		}
		System.out.println("Product of Digits: "+digits);
		in.close();
	}
}
