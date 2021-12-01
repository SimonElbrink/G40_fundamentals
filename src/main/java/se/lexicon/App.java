package se.lexicon; // Package always on line 1

// Single line comment

/*
    multiline comment
 */

/**  Multiline comment (Documentation)
 * Hello world!
 *
 */
public class App { //start of the class

    /**
     * Main method, needed to run the program.
     * where of program lives and dies.
     * if your code is not included in the main in any way it will not be executed.
     */
    public static void main( String[] args ) //Syntax for writhing a main method.
    { //Start of main method

        System.out.println("#### chars ####");
        char numberSign = '\u0023'; //#
        char four = '\u0034'; //4
        char zero = '\u0030'; //0

        char A = 'A';

        System.out.println("Hello Group " + numberSign + four + zero);


        System.out.println("#### int numbers ####");
        int number1 = 100;
        int number2 = 50;
        int result = 100;

//        number1 = number2;
        result = result + number1 + number2;

        System.out.println(result);


        System.out.println(++number1);

        System.out.println(12 % 3);


        System.out.println("#### boolean ####");
        boolean isTrue = true;

        System.out.println(isTrue);



        System.out.println("#### PRACTICE 1 ####");
        practice1();

        System.out.println("#### PRACTICE 2 ####");
        practice2();


        System.out.println("#### PRACTICE 3 ####");

        practice3();

    } //End of main method

    /**
     * Create a String with your first name as content.
     * Print out the String object to the console.
     */
    public static void practice1 (){
        String firstName = "Simon";

        System.out.println(firstName);
    }

    /**
     * Create two Strings.
     * One with your first name and the other with your last name.
     * Print out both Strings to the console with a ” ” separating them.
     */
    public static void practice2(){

        String firstName = "Simon";
        String lastName = "Elbrink";

        System.out.println(firstName + " " + lastName);
    }

    /**
     * Create two variables with decimal values.
     * Create a third decimal variable called result.
     * Assign the sum of the two first variables to result.
     */
    public static void practice3(){
        double number1 = 50.66;
        double number2 = 25.96;
        double result;

        result = number1 + number2;

        System.out.println(result);
    }



} // End of class