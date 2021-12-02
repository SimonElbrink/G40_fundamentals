package se.lexicon;

public class StringExample {
    public static void main(String[] args) {
        String name = "Simon";
//        name.concat(" Elbrink"); // will not save " Ebrink"

//        name = name.concat(" Elbrink"); //saves " Ebrink" to name variable, using method.
        name = name + " Elbrink"; // saves " Ebrink" to name variable, doing it manually.


        System.out.println(name);

//        System.out.println(name.concat(" Elbrink")); //prints correct but does not save.
//        System.out.println(String.join(" ", name, "Elbrink"));
    }
}
