package se.lexicon;

import java.util.Scanner;

public class UserInputUtil {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static String getStringFromUser(){
        return SCANNER.nextLine();
    }


    public static int getIntFromUser(String prompt){
        int givenNumber = 0;

        boolean invalidNumber = true;

        while (invalidNumber){
            try{
                System.out.println(prompt);
                String s = SCANNER.nextLine();
                givenNumber= Integer.parseInt(s);
                invalidNumber = false;
            }catch (NumberFormatException ex){
                System.out.println("Invalid, try again");
            }
        }
        return givenNumber;
    }
}
