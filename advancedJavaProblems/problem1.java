package advancedJavaProblems;

import java.util.Arrays;

// Given an integer array nums, move all O's to the end of it while maintaining the relative order of 
// the non-zero elements. Note that you must do this in- place without making a copy of the array.

public class problem1 {

	public static void main(String[] args) {
		System.out.println("Array Problem No:1");
		int temp = 0;
		int array[] = {2,0,4,1,6,4,0,3,5}; 
		System.out.println("Given array: "+ Arrays.toString(array));
		for(int i = 0;i<array.length-1;i++) {
			for(int j=0;j<array.length;j++) {
				if(array[j] == 0 ) {    
					if(j!=array.length-1) {
						temp = array[j+1];
						array[j+1] = array[j];
						array[j] = temp;
					}
				}
			}
			System.out.println(i+"th iteration array: "+ Arrays.toString(array)+"\n");	
		}
		System.out.println("Solution array: "+ Arrays.toString(array));	
	}
}
