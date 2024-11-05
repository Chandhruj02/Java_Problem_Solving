package NumberBasedProblems;

import java.util.Scanner;

public class SquareRoot {

	 public static double calculateSquareRoot(double n) {
	        double guess = n / 2;
	        double epsilon = 0.00001;
	        while (Math.abs(guess * guess - n) > epsilon) {
	            guess = (guess + n / guess) / 2; 
	        }
	        return guess; // Return the approximated square root
	    }
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its square root: ");
        double number = scanner.nextDouble();
        scanner.close();
        double squareRoot = calculateSquareRoot(number);
        System.out.printf("The square root of %.2f is approximately %.5f%n", number, squareRoot);
    }
}
