package project;

import java.util.Scanner;

public class Q6PrimeNumberCheck {
    public static void main(String[] args) {
        /*
        Write a Java program to check whether a given number is prime or not.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        boolean isPrime = num > 1;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

    }
}
