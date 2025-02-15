package project;

public class Q7FibonacciSeries {
    public static void main(String[] args) {
        /*
        Write a Java Program to print the first 10 numbers of the Fibonacci series
            1. 1
            2. 1
            3. 2
            4. 3
            5. 5
            6. 8
            7. 13
            8. 21
            9. 34
            10. 55
         */
        int fibonacciSequence = 1;
        int helper1 = 0, helper2 = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(fibonacciSequence);
            fibonacciSequence = helper1 + helper2;
            helper1 = helper2;
            helper2 = fibonacciSequence;
        }
    }
}
