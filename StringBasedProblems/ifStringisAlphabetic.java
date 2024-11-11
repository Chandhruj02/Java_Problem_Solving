package StringBasedProblems;

import java.util.Scanner;
import java.util.regex.*;

public class ifStringisAlphabetic {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("if String is Alphabetic");
		System.out.println("Enter a String");
		String str = in.next();
		String strp = "^[A-Za-z]+$";
		Pattern strpattern = Pattern.compile(strp);
		Matcher strmatch = strpattern.matcher(str);
		if(strmatch.matches()) {
			System.out.println("Contain only Alphabetics Characters");
		}else {
			System.out.println("Contain Non-Alphabetics Characters");
		}
		in.close();
	}

}
