package project;

public class Q1Temperatures {
    public static void main(String[] args) {
        /*
        Create a program that uses an array to store a list of temperatures for a week,
        and then uses a loop to find the highest and lowest temperature for the week
         */
        int[] temperatures = {-8, -9, -7, -12, -3, -15, -5};

        int highest = -100;
        int lowest = 0;

        for (int temp: temperatures) {
            if (temp > highest) {
                highest = temp;
            } else if (temp < lowest) {
                lowest = temp;
            }
        }
        System.out.println("The highest temperature of the week is: " + highest);
        System.out.println("The lowest temperature of the week is: " + lowest);
    }
}
