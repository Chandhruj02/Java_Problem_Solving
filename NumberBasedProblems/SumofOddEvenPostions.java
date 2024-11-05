package NumberBasedProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SumofOddEvenPostions {
	
	public static void main(String[] args) {
		System.out.println("Sum of Digits At Odd and Even Postion");
		System.out.println("Enter the number: ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		ArrayList<Integer> digits = new ArrayList<>();
		while(number !=0) {
			digits.add(number % 10);
			number = number / 10;
		}
		Collections.reverse(digits);
		int oddSum = 0 ;
		int evenSum = 0 ; 
		for(int i=0;i<digits.size();i++) {
			int digit = digits.get(i);
			if ((i + 1) % 2 == 0) { 
                evenSum += digit;
            } else {                 
                oddSum += digit;
            }
		}
		System.out.println("Sum of Digits at Even Postion: "+evenSum);
		System.out.println("Sum of Digits at Odd Postion: "+oddSum);
		in.close();
	}

}
