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

        System.out.println("#### chars example ####");
        char numberSign = '\u0023'; //#
        char four = '\u0034'; //4
        char zero = '\u0030'; //0

        char A = 'A';

        System.out.println("Hello Group " + numberSign + four + zero);

// ----------------------------------------------------------------------

        System.out.println("#### Number and calculations ####");
        int number1 = 100;
        int number2 = 50;
        int result = 100;

//        number1 = number2;
        result = result + number1 + number2;

        System.out.println(result);


        System.out.println(++number1);

        System.out.println(12 % 3);

// ----------------------------------------------------------------------

        System.out.println("#### boolean ####");
        boolean isTrue = true;

        System.out.println(isTrue);



        System.out.println("#### PRACTICE 1 ####");
        LecturePractices.practice1();

        System.out.println("#### PRACTICE 2 ####");
        LecturePractices.practice2(); // Calling method from our class.

        System.out.println("#### PRACTICE 3 ####");
        LecturePractices.practice3();

    } //End of main method

} // End of class