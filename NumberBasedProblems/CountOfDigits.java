<<<<<<< HEAD
package JavaProblems.NumberBasedProblems;
=======
package NumberBasedProblems;
>>>>>>> da935b2 (Resynced local files with remote)

import java.util.Scanner;

public class CountOfDigits {

	public static void main(String[] args) {
			System.out.println("Count the number of digits");
			System.out.println("Enter number: ");
			Scanner in = new Scanner(System.in);
			long number = in.nextInt();
			int digits = 0;
			while(number != 0) {
			  number /= 10 ;
			 digits++;
			}
			System.out.println("Number of Digits:" + digits);
			in.close();
	}

}
