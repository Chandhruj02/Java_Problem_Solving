package advancedJavaProblems;

import java.util.Arrays;
import java.util.Scanner;

// Given an array of positive integers nums and a positive integer target, 
// return the minimal length of a subarray whose sum is greater than or equal to target.
// If there is no such subarray, return 0 instead.

public class problem3 {

	static void sumCheck(int arr[],int t) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<i;j++) {
				if(i != arr.length-1) {	
					if((arr[i]+arr[j])>=t) {
						System.out.println("Possiable pair of numbers: ("+arr[i]+","+arr[i+1]+")");
						System.out.println("Index of number: "+i+","+(i+1));
					}
				}				
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int array[] = {1,2,3,4,5,6,7,8,9}; 
		System.out.println("Given array: "+ Arrays.toString(array));
		System.out.println("Enter Target Number: ");
		int target = in.nextInt();
		sumCheck(array,target);
		in.close();
	}
}
