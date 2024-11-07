package StringBasedProblems;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Palindrome");
		System.out.println("Enter a String: ");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String revstr = "";
		for(int i=0;i<str.length(); i++) {
			revstr = str.charAt(i) + revstr;
		}
		if(str.equals(revstr)) {
			System.out.println(str+" is a Palindrome");
		}else {
			System.out.println(str +" is Not a Palindrome");
		}
		in.close();
	}

}
