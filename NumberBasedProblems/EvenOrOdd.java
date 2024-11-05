<<<<<<< HEAD
package JavaProblems.NumberBasedProblems;
=======
package NumberBasedProblems;
>>>>>>> da935b2 (Resynced local files with remote)

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Even or Odd");
		System.out.println("Enter the number: ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		if(number % 2 == 0) {
			System.out.println("Typed number is Even");
		}
		else 
			System.out.println("typed number is Odd");
		in.close();
	}

}
