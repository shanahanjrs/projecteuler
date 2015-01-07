/**
 * Created by john on 11/20/14.
 */

public class largestprimefactor {

        public static boolean isPrime(double test) {
            if ((test % 2 == 0) || (test % 3 == 0) || (test % 5 == 0)){
                return false;
            } else {
                return true;
            }
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
