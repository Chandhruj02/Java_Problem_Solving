package advancedJavaProblems;

import java.util.Arrays;

//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]

//Input: digits = [9]
//Output: [1,0]


//Explanation: The array represents the integer 4321. Incrementing by one gives 4321 + 1 = 4322. Thus, the result should be [4,3,2,2]. 

public class problem4 {

	static int[] numberToArray(int a) {
		String number = Integer.toString(a);
		int[] num = new int[number.length()];
		for (int i = 0; i < number.length(); i++) {
            num[i] = Character.getNumericValue(number.charAt(i));
        }	
		return num;
	}
	
	static int arrayToNumber(int a[]) {
			StringBuilder numberString = new StringBuilder();
			for(int d :a ) {
				numberString.append(d);
			}
			int numbedDigits = Integer.parseInt((numberString.toString()));
		return numbedDigits;
	}
	
	public static void main(String[] args) {
		System.out.println("Array Problem - 4");
		int digits[] = {9};
		System.out.println("Given array: "+ Arrays.toString(digits));
		
		int added = arrayToNumber(digits) +1;
		System.out.println("After Increment by 1: "+added);
		System.out.println(Arrays.toString(numberToArray(added))); 
	}

}
