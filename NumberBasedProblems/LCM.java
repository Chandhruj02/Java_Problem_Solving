package NumberBasedProblems;

import java.util.Scanner;

public class LCM {

	static int findLcm(int num1,int num2) {
		int lcm = (num1 > num2)?num1:num2;
		while(true) {
			if(lcm % num1 == 0 && lcm % num2 == 0) 
				break;
			lcm++;
		}
		return lcm;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("LCM of Numbers");
		System.out.println("Enter 1st number:");
		int number1= in.nextInt();
		System.out.println("Enter 2nd number:");
		int number2= in.nextInt();
		int lcm = findLcm(number1, number2);
		System.out.println("LCM of ("+number1+","+number2+") : "+lcm);
		in.close();
	}


}
