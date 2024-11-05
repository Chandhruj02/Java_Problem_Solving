<<<<<<< HEAD
package JavaProblems.NumberBasedProblems;
=======
package NumberBasedProblems;
>>>>>>> da935b2 (Resynced local files with remote)

import java.util.Scanner;

public class PowerofNumber {

	public static void main(String[] args) {
		System.out.println("Power of Numbers");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = in.nextInt();
		System.out.println("Enter power value: ");
		int powervalue = in.nextInt();
		int powerednum = (int)Math.pow(number,powervalue);  
		System.out.println("Power of numbers "+number+"^"+powervalue+" is: "+ powerednum);
		in.close();
	}
}
