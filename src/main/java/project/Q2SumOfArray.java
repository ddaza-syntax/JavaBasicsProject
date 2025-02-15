package project;

public class Q2SumOfArray {
    public static void main(String[] args) {
        /*
    Create an array of integer values.
    After the array is created, calculate the sum of all stored
    elements in that array.
     */
        int[] values = {24, 17, 19, 8, 47, 26, 35, 219, 87};

        int sum = 0;
        for (int value:values) {
            sum +=value;
        }
        System.out.println("The total sum of all stored elements is: " + sum);
    }

}
