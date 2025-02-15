package project;

public class Q9DuplicateArrayElements {
    public static void main(String[] args) {

        String[] array = {"hello", "bonjour", "salut", "kamusta", "salom", "ciao", "hallo", "hello"};

        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j]) && i != j) {
                    System.out.println("Duplicated string is: " + array[j]);
                }
            }
        }

    }
}
