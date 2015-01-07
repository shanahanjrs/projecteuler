/**
 * Multiples of 3 and 5.
 */
public class multiples {
    public static void main(String[] args) {

        int i = 0, result = 0;

        while (i < 1000) {

            if (i%3 == 0 || i%5 == 0) {
                result += i;
            }
            i++;
        }

        System.out.println(result);
    }
}
