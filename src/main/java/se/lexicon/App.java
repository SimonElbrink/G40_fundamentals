package se.lexicon;

import se.lexicon.inside.MyMethods;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


//        String firstName = "Simon";
//        String lastName = "Elbrink";
//        String hobby = "Programming";
//
//        String sentence = firstName + " " + lastName + " is interested in " + hobby + ".";
//
//        System.out.println("sentence = " + sentence);
//
//        String firstName1 = "Ulf";
//        String lastName1 = "Bengtsson";
//        String hobby1 = "Programming";





        /*
        * ObjectType objectName = new ObjectType(); - Syntax ("new" is a keyword for instantiating)
        */

        Car v70 = new Car();

        v70.brand = "Volvo";
        v70.model = "v70";
        v70.productionYear = 2006;
        v70.regNumber = "ABC123";
        v70.color = "Red";
        v70.gearbox = "Automatic";
        v70.ownerName = "Simon Elbrink";

//        System.out.println(v70.color);

        System.out.println(v70.getInformation());
        v70.printOwner();



        Car e30 = new Car();

        e30.brand = "bmw";
        e30.model = "e30";
        e30.productionYear = 1994;
        e30.regNumber = "CBA321";
        e30.color = "Silver";
        e30.gearbox = "Manual";

        System.out.println(e30.brand);
        System.out.println(e30.gearbox);
        System.out.println(e30.getInformation());



        //Question can we print all on separate line using \n? - Yes
        System.out.println(v70.brand + "\n" + v70.model + "\n" + v70.productionYear);

        //Question - Cant we use toString()?
        System.out.println(v70.toString()); // Prints Object hash value by default. for now..


        // Question - How do I show the calculation?
        int a = 10;
        int b = 10;
        int result = a + b;

        System.out.println(a + b); // Shows 20, the problem, how do i show the a and b without calculating it?
        System.out.println("" + a + b); // now it shows the string representation
        System.out.println(a + " + " + b + " = " + result); // 10 + 10 = 20
        System.out.println(a + " + " + b + " = " + (a+b)); // 10 + 10 = 20 //parenthesis has higher precedence show it starts there.

        // precedence - http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html


        System.out.println("For-loop");


//        for (initialization;termination; increment){ Thing to do }


        for(int i = 0; i<10; i++){
            System.out.println(i);
        }

//        MyMethods.printMessage("#40");



    }




}
