package NumberBasedProblems;

import java.util.Scanner;

public class LargestPrimeFactor {

    public static long largestPrimeFactor(long n) {
        long largestFactor = -1;
        while (n % 2 == 0) {
            largestFactor = 2;
            n = n / 2;
        }
        for (long i = 3; i * i <= n; i = i+ 2) {
            while (n % i == 0) {
                largestFactor = i;
                n /= i;
            }
        }
        if (n > 2) {
            largestFactor = n;
        }

        return largestFactor;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = in.nextLong();
        in.close();

        System.out.println("The largest prime factor of " + number + " is: " + largestPrimeFactor(number));
    }
}
