<<<<<<< HEAD
package JavaProblems.NumberBasedProblems;
=======
package NumberBasedProblems;
>>>>>>> da935b2 (Resynced local files with remote)

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Print Amstrong Number");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int temp = a;
		int b = 0;
		int result = 0;
		while(temp > 0) {
			b = temp % 10;
			b = (int) Math.pow(b,3);
			result = result + b;
			temp = temp / 10; 
		}
		if (result == a){
			System.out.println("\nGiven number "+ a + "is a Armstrong number!");
		}
		else {
		 System.out.println("\nIt's not a Armstrong number, it results: "+ result + "which is not equal to " + a);
		 }
		in.close();
	}

}
