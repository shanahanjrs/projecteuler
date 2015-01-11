/**
 * 10001st prime
 */

public class tenthousandonethprime {

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

        int counter = 0;
        int primeCounter = 0;
        double[] primes = new double[32000];

        primes[0] = 2;
        primes[1] = 3;
        primes[2] = 5;
        counter = 6;
        primeCounter = 3;

        while (primes[10000] == 0) {
            if (isPrime(counter)) {
                primes[primeCounter-1] = counter;
                primeCounter++;
            }

            counter++;
        }

        System.out.println(primes[10000]);

    }
}
