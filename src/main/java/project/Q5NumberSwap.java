package project;

public class Q5NumberSwap {
    public static void main(String[] args) {
        /*
        Write a program to swap 2 numbers without a temporary variable
         */
        int x = 25;
        int y = 12;

        System.out.println("Value of x before swap is: " + x);
        System.out.println("Value of y before swap is: " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println();
        System.out.println("Value of x after swap is: " + x);
        System.out.println("Value of y after swap is: " + y);
    }
}
