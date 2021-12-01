package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

////        if(BooleanExpression){}
//        int numberToGuess = 50;
//
//        int myGuess = 50;
//
//        if (myGuess > numberToGuess){
//            System.out.println("Number is to high, try a lower number.");
//        } else if (myGuess < numberToGuess){
//            System.out.println("Number is to low, try i higher number.");
//        }else{
//            System.out.println("You have guessed the correct number.");
//        }


//        //Guest, Employee, Manager, Ceo
//        String role = "Manager";
//
//        switch (role){
//
//            case "Guest":
//                System.out.println("Hello, welcome let me show you around!");
//                break;
//            case "Employee":
//                System.out.println("Hello, welcome back, here are today's tasks.");
//                break;
//            case "Manager":
//                System.out.println("Hello, Here is the report from yesterday!");
//                break;
//            case "Ceo":
//                System.out.println("Hello, here is the report about the company's health.");
//                break;
//            default:
//                System.out.println("Hm.. does not recognize that role");
//        }



//        String name = "Simon";
////        name.concat(" Elbrink"); // will not save " Ebrink"
//
////        name = name.concat(" Elbrink"); //saves " Ebrink" to name using method.
//        name = name + " Elbrink"; //Saving but doing it manually.
//
//
//        System.out.println(name);
////        System.out.println(name.concat(" Elbrink")); //prints correct but does not save.
////        System.out.println(String.join(" ", name, "Elbrink"));




//        String firstName = "Simon";
//        String lastName = "Elbrink";
//        String hobby = "Programming";
//
//        String sentence = firstName + " " + lastName + " is interested in " + hobby + ".";
//
//        System.out.println("sentence = " + sentence);


        // ObjectType objectName = new ObjectType(); - Syntax ("new" is a keyword for instantiating)

        Car v70 = new Car();

        v70.brand = "Volvo";
        v70.model = "v70";
        v70.productionYear = 2006;
        v70.regNumber = "ABC123";
        v70.color = "Red";
        v70.gearbox = "Automatic";

//        System.out.println(v70.color);

        System.out.println(v70.getInformation());

        Car e30 = new Car();

        e30.brand = "bmw";
        e30.model = "e30";
        //...

        System.out.println(e30.brand);
        System.out.println(e30.gearbox); // null



        //Question can we print all on separate line using \n? - Yes
        System.out.println(v70.brand + "\n" + v70.model + "\n" + v70.productionYear);

        //Question - Cant we use toString()?
        System.out.println(v70.toString()); // Prints Object hash value by default. for now..


        // Question - How do i show the a calculation?
        int a = 10;
        int b = 10;
        int result = a + b;

        System.out.println(a + b); // Shows 20, the problem, how do i show the a and b without calculating it?
        System.out.println("" + a + b); // now it shows the string representation
        System.out.println(a + " + " + b + " = " + result); // 10 + 10 = 20
        System.out.println(a + " + " + b + " = " + (a+b)); // 10 + 10 = 20 //parenthesis has higher precedence show it starts there.

        // precedence - http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html









    }
}
