package NumberBasedProblems;

import java.util.Scanner;


public class PrimeNumber {
	
	static boolean findPrime(int num) {
		boolean check = true;
		if(num == 0 || num ==1) {
			check = false;
		}else {
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) { 
						check = false;
						break;
					}
			}
		}
		return check;
	}

	public static void main(String[] args) {
		System.out.println("Prime Number");
		System.out.println("Enter a number: ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		boolean prime = findPrime(number);
		System.out.println(number+" Is, Prime Number?: "+prime);
		in.close();
	}

}
