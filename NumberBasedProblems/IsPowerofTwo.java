<<<<<<< HEAD
package JavaProblems.NumberBasedProblems;
=======
package NumberBasedProblems;
>>>>>>> da935b2 (Resynced local files with remote)

import java.util.Scanner;

public class IsPowerofTwo {

	public static void main(String[] args) {
		System.out.println("Check if a Number is a Power of Two");
		System.out.println("Enter a number: ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		boolean answer = false;
		if(number % 2 == 0) {
			answer = true;
			System.out.println("Given number "+number+" is power of 2: "+answer);
		}
		else 
			System.out.println("Given number "+number+" is power of 2: "+answer);
		in.close();
		}

}


