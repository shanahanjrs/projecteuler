/**
 * Created by john on 11/20/14.
 */

public class largestprimefactor {

    public static boolean isPrime(double n) {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        double number = 600851475143.0d;
        double i = 3.0d;
        double limit = Math.cbrt(number);
        double[] factors = new double[64000];
        double[] primeFactors = new double[64000];

        int n = 0, x = 0;

        System.out.println("Limit: " + limit);

        while (i < limit) {
            if (number % i == 0) {
                factors[n] = i;
                n++;
                if (isPrime(factors[n-1])) {
                    System.out.printf("Prime factor: %.0f\n", factors[n-1]);
                }
            }
            i++;
        }


        System.out.println("Done! ");
        //System.out.printf("Largest prime factor: %.0f\n", factors[n-1]);

    }
}
