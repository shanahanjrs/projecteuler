/**
 * Sum square difference.
 */

public class sumsquaredifference {
    public static void main(String[] args) {

        int c = 1;

        long squareOfSums = 0;
        long sumOfSquares = 0;
        long difference = 0;
        
        //TODO fix this brute force method for something real
        while (c <= 100) {

            squareOfSums = squareOfSums + c;
            sumOfSquares = sumOfSquares + (c * c);

            c++;
        }

        squareOfSums = squareOfSums * squareOfSums;

    difference = squareOfSums - sumOfSquares;
    System.out.println(difference);
    }
}
