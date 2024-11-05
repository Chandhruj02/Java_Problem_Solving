<<<<<<< HEAD
package JavaProblems.NumberBasedProblems;
=======
package NumberBasedProblems;
>>>>>>> da935b2 (Resynced local files with remote)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GCD {
	
	static ArrayList<Integer> findDivisors (int number){
		ArrayList<Integer> divisors = new ArrayList<>();
		for(int i=1;i<= Math.sqrt(number);i++) {
			if(number%i==0) {
				divisors.add(i);
				if(i != number/i) {
					divisors.add(number/i);
				}
			}
		}
		Collections.sort(divisors);
		return divisors;
	}
	
	static int findGcd(ArrayList<Integer> num1,ArrayList<Integer> num2) {
		int gcd = 1;
		for(int i =num1.size()-1;i>=0;i--) {
			if(num2.contains(num1.get(i))) {
				gcd = num1.get(i);
                break;
			}
		}
		return gcd;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("GCD of Numbers");
		System.out.println("Enter 1st number:");
		int number1= in.nextInt();
		System.out.println("Enter 2nd number:");
		int number2= in.nextInt();
		ArrayList<Integer> num1 = new ArrayList<>();
		ArrayList<Integer> num2 = new ArrayList<>();
		num1 = findDivisors(number1);
		num2 = findDivisors(number2);
		Collections.sort(num1);
		Collections.sort(num2);
		int gcd = findGcd(num1,num2);
		System.out.println("GCD of ("+number1+","+number2+") : "+gcd);
		in.close();
	}

}
