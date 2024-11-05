package NumberBasedProblems;

import java.util.Scanner;

public class Nth_PrimeNumber {
	
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
	
	static int NthPrime(int num) {
			int count =0;
			int number = 1;
			while( count < num) {
				number++;
				if(findPrime(number)) {
					count++;
				}
			}
		return number;
	}
	
	public static void main(String[] args) {
		System.out.println("'N'th Prime Number");
		System.out.println("Enter the number: ");
		Scanner in  = new Scanner(System.in);
		int number = in.nextInt();
		System.out.println(number+"th Prime Number: "+NthPrime(number));
		in.close();
	}

}
