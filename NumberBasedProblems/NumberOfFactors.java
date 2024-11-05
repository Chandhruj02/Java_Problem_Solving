package NumberBasedProblems;

import java.util.Scanner;

public class NumberOfFactors {

	public static int countFactors(int n) {
		int count = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) { 
				count++; 
				if (i != n / i) { 
					count++; 
				}
			}
		}
		
		return count; 
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count = countFactors(number);
		System.out.println("No.Of Factors of "+number+" is: "+count);
		in.close();
	}

}
