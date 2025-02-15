package project;

public class Q4OddEvenSums {
    public static void main(String[] args) {
        /*
        Create a 2D array of integers. Develop a program that will calculate
        the sum of even and odd numbers separately for that array.
         */
        int[][] numbers = {
                {4, 17, 24, 8, 35, 67},
                {89, 12, 77, 23, 46, 78},
                {48, 129, 67, 34, 2, 9}
        };
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    evenSum += numbers[i][j];
                } else {
                    oddSum += numbers[i][j];
                }
            }
        }
        System.out.println("The sum of the odd numbers is "+ oddSum);
        System.out.println("The sum of the even numbers is "+ evenSum);
    }
}
