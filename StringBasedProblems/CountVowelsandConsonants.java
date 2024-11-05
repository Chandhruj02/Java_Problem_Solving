package StringBasedProblems;

import java.util.Scanner;

public class CountVowelsandConsonants {
	
	static int vowelscount(String sen) {
			String temp = sen.toLowerCase();
			char[] vowels = {'a','e','i','o','u'};
			int vc = 0;
			for(int i=0;i<sen.length();i++) {
				for(int j=0;j<vowels.length;j++) {
					if(temp.charAt(i)==vowels[j]) {
						vc++;
					}
				}
			}
		return vc;
	}
	
	static int consonantscount(int vc, String sen) {
		String temp = sen.toLowerCase();
		int cc = 0;
		char space = ' ';
		int spacecount = 0;
		System.out.println("Given Sentence: "+sen);
		for(int i=0;i<sen.length();i++) {
				if(temp.charAt(i)==space) {
					spacecount++;
				}
		}
		cc = (temp.length() - vc)-spacecount;
	return cc;
}

	
	public static void main(String[] args) {
			System.out.println("Count of Vowels and Consonants");
			System.out.println("Enter a Sentance: ");
			Scanner in = new Scanner(System.in);
			String sentence = in.nextLine();
			int vc = vowelscount(sentence);
			int cc = consonantscount(vc, sentence);
			System.out.println("Vowels Count:" + vc);
			System.out.println("Consonants Count:" + cc);
			in.close();
	}

}
