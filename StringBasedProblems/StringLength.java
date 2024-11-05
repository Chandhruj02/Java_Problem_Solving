package StringBasedProblems;

import java.util.Scanner;

public class StringLength {
	
	static int findlen(String str) {
		int length = 0;
		for( char c: str.toCharArray()) {
			length++;
		}
		return length;
	}
	
	public static void main(String[] args) {
		System.out.println("String Length");
		System.out.println("Enter a String: ");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int length = findlen(str); 
		System.out.println("Lenght of the String "+str+" is: "+length);
		in.close();
	}

}
