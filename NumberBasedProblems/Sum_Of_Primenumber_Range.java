<<<<<<< HEAD
package JavaProblems.NumberBasedProblems;
=======
package NumberBasedProblems;
>>>>>>> da935b2 (Resynced local files with remote)

import java.util.ArrayList;
import java.util.Scanner;

public class Sum_Of_Primenumber_Range {
	static ArrayList<Integer> findPrimeNum(int num1, int num2){
		ArrayList<Integer> Primes = new ArrayList<>();
		for(int i=num1;i<=num2;i++) {
			if(i<=1) { continue; }
			boolean isPrime = true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {Primes.add(i);}
		}
		return Primes;
	}
	
	static int findSum(ArrayList<Integer> n) {
		int sum = 0;
		for(int i=0;i<n.size();i++) {
			sum = n.get(i) + sum;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Sum Of Prime Numbers in a Range");
		System.out.println("Enter the Starting Range: ");
		int startNum = in.nextInt();
		System.out.println("Enter the Ending Range: ");
		int endNum = in.nextInt();
		ArrayList<Integer> PrimeNumbers = new ArrayList<>();
		int SumOfPrimes = 0;
		if(startNum < endNum) {
			PrimeNumbers = findPrimeNum(startNum,endNum);
			SumOfPrimes = findSum(PrimeNumbers);
			System.out.println("Sum Of Prime Numbers from "+startNum+" to "+endNum+" is: "+SumOfPrimes);
		}else {
			System.out.println("Range is invalid!");
		}	
		
		in.close();
	}

}
