package se.lexicon;

public class LecturePractices {

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
}
