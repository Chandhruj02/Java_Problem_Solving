package NumberBasedProblems;

import java.util.Scanner;

public class DigitalRoots {

	static int sum(int num) {
		int sum = 0;
		while(num != 0) {
			 sum = num % 10 + sum;
			 num = num / 10; 
			}
	return sum;
}

public static void main(String[] args) {
	System.out.println("Digital Roots");
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int number = in.nextInt();
	int DigitSum = 0;
	while (number >= 10) {
		DigitSum = sum(number);
		number = DigitSum; 
	}
	
	System.out.println("The Sum Of Digits: " + DigitSum);
	in.close();
}

}
