package se.lexicon;

public class GuessingGame {

    public static void main(String[] args) {

        //        if(BooleanExpression){}
        int numberToGuess = 50;

        int myGuess = 50;

        if (myGuess > numberToGuess){
            System.out.println("Number is to high, try a lower number.");
        } else if (myGuess < numberToGuess){
            System.out.println("Number is to low, try i higher number.");
        }else{
            System.out.println("You have guessed the correct number.");
        }
    }
}
