<<<<<<< HEAD
package JavaProblems.NumberBasedProblems;
=======
package NumberBasedProblems;
>>>>>>> da935b2 (Resynced local files with remote)

import java.util.Scanner;

public class HcfOfThreeNumbers {
	static int findHcf(int num1,int num2, int num3) {
		int h = (num1 > num2)?num1:num2;
		int hcf = (h>num3)?h:num3;
		while(hcf > 0) {
			if(num1 % hcf == 0 && num2 % hcf == 0 && num3 % hcf == 0) 
				break;
			hcf--;
		}
		return hcf;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("HCF of Three Numbers");
		System.out.println("Enter 1st number:");
		int number1= in.nextInt();
		System.out.println("Enter 2nd number:");
		int number2= in.nextInt();
		System.out.println("Enter 3rd number:");
		int number3= in.nextInt();
		int hcf = findHcf(number1, number2, number3);
		System.out.println("LCM of ("+number1+","+number2+","+number3+") : "+hcf);
		in.close();
	}
}
