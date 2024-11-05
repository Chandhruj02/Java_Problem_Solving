<<<<<<< HEAD
package JavaProblems.NumberBasedProblems;
=======
package NumberBasedProblems;
>>>>>>> da935b2 (Resynced local files with remote)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrefectNumbers {
	
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
	
	static int sum(ArrayList<Integer> n) {
		int sum=0;
		for(int i=0;i<n.size();i++) {
			sum = n.get(i) + sum;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Perfect Numbers");
		System.out.println("Enter a number: ");
		Scanner in = new Scanner(System.in); 
		int number = in.nextInt();
//		Sample Perfect Number 6, 28, 496, 8128
		int sumofdivisors = 0;
		boolean perfect = false;
		ArrayList<Integer> divisors = new ArrayList<>();
		divisors = findDivisors(number);
		Collections.sort(divisors);
		sumofdivisors = sum(divisors)-number;
		if (sumofdivisors == number) {
			perfect = true;
			System.out.println("Number "+number+" is Perfect Number? :" + perfect);
		}
		else {
			System.out.println("Number "+number+" is Perfect Number? :" + perfect);
		}
		in.close();
	}

}
