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
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j]);
                    if (j < numbers[i].length - 1) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
