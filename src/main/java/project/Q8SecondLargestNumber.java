package project;

public class Q8SecondLargestNumber {
    public static void main(String[] args) {
        /*
        Write a Java program to find the second-largest number in the array
         */

        int[] numArray = {34, 12, 35, 38, 84, 17, 93, 67, 27, 4};
        int largest = -1;
        int secondLargest = -1;

        for (int num: numArray) {
            if (num > largest) {
                largest = num;
            }
        }

        for (int num: numArray) {
            if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("The second largest number is: " + secondLargest);
    }
}
