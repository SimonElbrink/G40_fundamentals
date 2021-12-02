package se.lexicon;

import java.util.Scanner;

public class Practice6 {

    /**
     * Being a developer you need to learn how to search for information on the Internet.
     * Open up a web browser and search for ”java input from user”.
     * Use your new knowledge to take a String as input from the user and store it in a String object.
     *
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello what do you want to write?");
        System.out.print("Enter message here: ");
        String message = scanner.nextLine();

        System.out.println(message);



    }
}
