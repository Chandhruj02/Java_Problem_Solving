package StringBasedProblems;

import java.util.Scanner;

public class UpperCase_LowerCase {

	public static void main(String[] args) {
		System.out.println("UpperCase and LowerCase");
		System.out.println("Enter a String: ");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println("UpperCase: "+str.toUpperCase());
		System.out.println("LowerCase: "+str.toLowerCase());
		in.close();
	}

}
