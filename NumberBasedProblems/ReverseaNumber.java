package NumberBasedProblems;

import java.util.Scanner;

public class ReverseaNumber {

	public static void main(String[] args) {
		System.out.println("Reverse a Number");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a = in.nextInt();
		String result = "" ;
		while(a > 0) {
			 result = result + a % 10 ;
			 a = a / 10; 
		} 
			System.out.println("The Resvered Number " + result);
		in.close();
	}

}
