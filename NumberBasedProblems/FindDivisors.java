package NumberBasedProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class FindDivisors {

	public static void main(String[] args) {
		System.out.println("Finding the divisior of the number");
		System.out.println("Enter a number: ");
		Scanner in = new Scanner (System.in);
		int number = in.nextInt();
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
		System.out.println(divisors);
		in.close();
	}

}
