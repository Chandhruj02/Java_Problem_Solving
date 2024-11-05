<<<<<<< HEAD
package JavaProblems.NumberBasedProblems;
=======
package NumberBasedProblems;
>>>>>>> da935b2 (Resynced local files with remote)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Is_Deficient_Perfect_Abundant {

	static ArrayList<Integer> divisors(int number){
		ArrayList<Integer> divisors = new ArrayList<>();
		for(int i=1;i<= Math.sqrt(number) ;i++) {
			if(number%i==0) { 
				divisors.add(i);
				if(i != number /i ) {
					divisors.add(number / i);
				}
			}
		}
		Collections.sort(divisors);
		return divisors;
	}
	
	static int sum(ArrayList<Integer> n) {
		int sum=0;
		for(int i=0;i<n.size();i++) {
			sum = n.get(i) + sum;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Finding wether a number is Deficient,Perfect,Abundant");
		System.out.println("Enter a number: ");
		Scanner in = new Scanner (System.in);
		int number = in.nextInt();
		int sum = sum(divisors(number))-number;
		if(sum==number) {
			System.out.println(number+" is Perfect Number");
		}else if(sum>number) {
			System.out.println(number+" is Abundant Number");
		}else {
			System.out.println(number+" is Deficient Number");
		}
		in.close();
	}

}
