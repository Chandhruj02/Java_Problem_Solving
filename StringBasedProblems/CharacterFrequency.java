package StringBasedProblems;

import java.util.Scanner;

public class CharacterFrequency {

	static int cFrequency(String str, char c) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == c) {
				count++;
			}
		}	
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Character Frequency");
		System.out.println("Enter a String: ");
		String str = in.next();
		System.out.println("Enter a Letter to Check Character Frequency");
		char letter = in.next().charAt(0); 
		int count = cFrequency(str , letter);
		System.out.println("Character Frequency: " + count);
		in.close();
	}

}
