package project;

public class Q3EvenNumbers {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program that will identify/print the even numbers only
         */
        int[][] numbers = {
                {4, 17, 24, 8},
                {89, 12, 77, 23},
                {48, 129, 67, 34}
        };
        for (int[] number : numbers) {
            for (int j = 0; j < number.length; j++) {
                if (number[j] % 2 == 0) {
                    System.out.print(number[j]);
                    if (j < number.length - 1) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
