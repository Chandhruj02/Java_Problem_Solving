package StringBasedProblems;

import java.util.Scanner;

public class ReverseaString {

	public static void main(String[] args) {
		System.out.println("Reverse a String");
		System.out.println("Enter a String: ");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String revstr = "";
		for(int i=0;i<str.length(); i++) {
			revstr = str.charAt(i) + revstr;
		}
		System.out.println("Reversed String: "+ revstr);
		in.close();
	}
	
}
