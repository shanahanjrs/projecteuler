/**
 * Largest Palindrome product of two 3-digit numbers.
 */

public class largestpalindromeproduct {

    public static long reverseNumber(long original) {
        long temp = 0, reversed = 0;

        while (original > 0) {
            temp = original % 10;
            reversed = reversed * 10 + temp;
            original = original / 10;
        }

        return reversed;
    }

    public static boolean resultIsPalindrome(long x, long y) {
        long result = x * y;

        if (result == reverseNumber(result)) {
            return true;
        } else {
            return false;
        }
        
    }

    public static void main(String[] args) {

        long a = 999, b = 0;
        long stoppingPoint = 800; // An un-educated guess.
        long largestPalindrome = 0;

        while (a > stoppingPoint) {
            b = a;

            while (b > stoppingPoint) {
                if (resultIsPalindrome(a, b)) {
                    if (a > largestPalindrome) {
                        largestPalindrome = a * b; // If a is the biggest so far, store it.
                    }
                }

                b--;
            }
            

            a--; // Move 'a' down one.
        }

        System.out.println("Largest palindrome: " + largestPalindrome);
    }
}
