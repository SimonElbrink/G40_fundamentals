package se.lexicon.week2.string.one_step_down;

public class OverloadingExample {

    //public, package, protected, private

    /*
    Overloading is when you have the same name but not the same parameters.
    You may change the return type, or the access modifier.
     */

    //fields
    static int number1 = 15;
    int number2 = 5;


    public static void main(String[] args) {

        int number1 = 10;
        System.out.println(number1);

        System.out.println(OverloadingExample.number1);



        System.out.println(add(5,6,6,7,9,10,10,90,60));
        add(10.25, 20.50, 30.75);
        add(5,10);

    }

    {
        int number2 = 10;

        System.out.println(number2);
        System.out.println(this.number2);
    }

    static{
        int number1 = 100;
        System.out.println(number1);
        System.out.println(OverloadingExample.number1);
    }


    public static int add(int number1, int number2){
        return number1 + number2;
    }
    //same name as above but different set of parameters.
    public static double add(double number1, double number2){
        return number1 + number2;
    }

    //Protected is when you can access the with same package and with inheritance.
    protected static double add(double number1, double number2, double number3){
        return number1 + number2 + number3;
    }

    //Private is when you can only access within the same class. (OverloadingExamples.class)
    private static double add(double number1, int number2){
        return number1 + number2;
    }

    //package as default access, can be access within package.
    static String add(int...ints){

        int result = 0;
        String resultAsString = "";

        for (int i = 0; i < ints.length; i++) {

            result = result + ints[i];

            if (i != ints.length -1){
                resultAsString = resultAsString + ints[i] + "+";
            }else{
                resultAsString += ints[1];
            }
        }

        return resultAsString += " = " + result;

    }


}
