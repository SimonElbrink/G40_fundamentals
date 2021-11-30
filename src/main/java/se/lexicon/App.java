package se.lexicon;

// Single line comment

/*
    multiline comment
 */

/**  Multiline comment (Documentation)
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        char numberSign = '\u0023';
        char four = '\u0034';
        char zero = '\u0030';

        System.out.println("Hello Group " + numberSign + four + zero);


        int number1 = 100;
        int number2 = 50;
        int result = 100;

//        number1 = number2;
        result = result + number1 + number2;

        System.out.println(result);


        System.out.println(++number1);

        System.out.println(12 % 3);


        boolean isTrue = true;

        System.out.println(isTrue);



        String firstName = "Simon";

        System.out.println(firstName);


    }

    /**
     * Create a String with your first name as content.
     * Print out the String object to the console.
     */
    public static void practice1 (){
        String firstName = "Simon";

        System.out.println(firstName);
    }



}
