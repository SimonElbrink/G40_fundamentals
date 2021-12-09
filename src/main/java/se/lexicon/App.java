package se.lexicon;

import se.lexicon.one_step_down.OverloadingExample;

public class App
{
    public static void main( String[] args )
    {



    }

    public static void trimExample(){
        String message = "\t I Love\nProgramming\nin Java \t \n\n\n\n";

        System.out.println(message);

        System.out.println("----Trim----");
        System.out.println(message.trim());
    }

    public static void replaceExample(){
        String message = "I Love Programming in Java";

        message = message.replace("o", "O");
        message = message.replace("LOve", "LOVE");

        message = message.replace("Java", "C#");

        System.out.println(message);
    }

    public static void starts_Ends_ContainsExample(){
        String message = "I Love Programming in Java";

        System.out.println("message.startsWith(\"I Love\") = " + message.startsWith("I Love"));
        System.out.println("message.endsWith(\"Java\") = " + message.endsWith("Java"));
        System.out.println("message.startsWith(\"i\") = " + message.startsWith("i"));
        System.out.println("message.contains(\" in \") = " + message.contains(" in "));
        System.out.println("message.contains(\" In Java \") = " + message.contains(" In Java "));
        System.out.println("message.contains(\"Programming\") = " + message.contains("Programming"));
    }

    public static void equalsExample(){
        String string1 = "I Love Programming in Java";
        String string2 = "i LoVe PrOgraMMinG IN JAVA";

        boolean falsy = string1.equals(string2);

        boolean truthy = string1.equalsIgnoreCase(string2);

        boolean ownIgnoreCasing = string1.toUpperCase().equals(string2.toUpperCase());

        System.out.println("falsy = " + falsy);
        System.out.println("truthy = " + truthy);

        System.out.println("ownIgnoreCasing = " + ownIgnoreCasing);
    }

    public static void substringExample(){
        String message = "I Love Programming in Java";

        String subString = message.substring(2, 6);

        System.out.println("subString = " + subString);

        System.out.println(message.substring(7, 14));

        int javaIndex = message.indexOf("Java");
        System.out.println("javaIndex = " + javaIndex);

        System.out.println(message.substring(javaIndex));
    }



    public static void indexOfExample(){
        String welcomeMessage = "Hello And Welcome";

        System.out.println(welcomeMessage.indexOf("lo"));
        System.out.println(welcomeMessage.indexOf("Wel"));
        System.out.println(welcomeMessage.indexOf("l", 5));
        System.out.println(welcomeMessage.indexOf("el"));
    }

    public static void charAtExample(){
        String name = "Simon";

        for (int i = 0; i < name.length(); i++){
//            name[i]
            System.out.println(name.charAt(i));
        }


        String welcomeMessage = "Hello and Welcome";

        char character = getCharFromString(welcomeMessage, 10);

        System.out.println("character at index 10 is = " + character);
    }

    public static char getCharFromString (String string, int index){
        return string.charAt(index);
    }

    public static void startingWithStrings (){
        int number = 1000;
//        int number = 1000.length;

        char a = 'a';

        // String is An Object
        //Stores Text
        //Uppercase letter of "S"
        //Have methods.
        String string = "";

        String stringObject = new String();


        "Hello this is a message".toUpperCase();


//      int number = 1000.length; // Does not have methods
        String hasMethods = "Hello".toString();
    }






}
