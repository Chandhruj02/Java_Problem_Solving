package StringBasedProblems;

import java.util.Scanner;

public class CountofWords {
		
	public static void main(String[] args) {
		System.out.println("Count of Words");
		System.out.println("Enter a Sentance: ");
		Scanner in = new Scanner(System.in);
		String sentence = in.nextLine();
		String[] words = sentence.trim().split("\\s+");
		int wordCount = words.length;
		System.out.println("Count of words: "+wordCount);
		in.close();
	}

}
