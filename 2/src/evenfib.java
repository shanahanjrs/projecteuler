public class evenfib {
    public static void main(String[] args) {

        int[] fib = new int[2048];
        int LIMIT = 4000000, i = 2;
        double result = 0;

        fib[0] = 1;
        fib[1] = 1;

        //System.out.println(fib[i]);

        while (fib[i-1] < LIMIT) {
            int n = (fib[i - 1] + fib[i - 2]);
            fib[i] = n;
            if (n%2 == 0) {
                result += n;
            }
            i++;
        }
        System.out.println("Result = " + result);
    }
}
