package NumberBasedProblems;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println("Palindrome Number");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a = in.nextInt();
		String inp = Integer.toString(a);
		String reverse = "" ;
		boolean result;
		while(a > 0) {
			reverse = reverse + a % 10 ;
			 a = a / 10; 
		} 
		if(reverse.equals(inp)) { 
			result = true;
		}
		else {
			result = false;
		}
		System.out.println("Result: "+ result);
		in.close();
	}
}
