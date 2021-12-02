package se.lexicon;


import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {

    public static void main(String[] args) {


        //        if(BooleanExpression){}
        int numberToGuess = ThreadLocalRandom.current().nextInt(1,101);

        int numberOfTries = UserInputUtil.getIntFromUser("How many tries do you want?");

        for (int i = 1; i <= numberOfTries;  i++ ){

            int myGuess = UserInputUtil.getIntFromUser("Enter Your Guess # " + i + " : ");

            String message = guessProcess(myGuess, numberToGuess);

            System.out.println(message);

        }
    }

    public static String guessProcess(int myGuess, int numberToGuess){
        String message;

        if (myGuess > numberToGuess){
            message = "Number is to high, try a lower number.";
        } else if (myGuess < numberToGuess){
            message = "Number is to low, try i higher number.";
        }else{
            message = "You have guessed the correct number.";
        }

        return message;
    }




}
