package advancedJavaProblems;

import java.util.Arrays;
import java.util.Scanner;

//Given an array of integers and an integer target, return indices of the two numbers such that they add up to target.

public class problem2 {

	static void sumCheck(int arr[],int t) {
		for(int i=0;i<arr.length;i++) {
			if(i != arr.length-1) {	
				if((arr[i]+arr[i+1])==t) {
					System.out.println("Possiable pair of numbers: ("+arr[i]+","+arr[i+1]+")");
					System.out.println("Index of number: "+i+","+(i+1));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int array[] = {1,2,3,4,5,6}; 
		System.out.println("Given array: "+ Arrays.toString(array));
		System.out.println("Enter Target Number: ");
		int target = in.nextInt();
		sumCheck(array,target);
		in.close();
	}
}


