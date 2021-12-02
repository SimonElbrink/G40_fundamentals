package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        String firstName = "Simon";
        String lastName = "Elbrink";
        String hobby = "Programming";

        String sentence = firstName + " " + lastName + " is interested in " + hobby + ".";

        System.out.println("sentence = " + sentence);

        String firstName1 = "Ulf";
        String lastName1 = "Bengtsson";
        String hobby1 = "Programming";



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
