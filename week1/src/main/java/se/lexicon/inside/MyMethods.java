package se.lexicon.inside;

public class MyMethods {


    public static void main(String[] args) {

        printMessage("G40");

        System.out.println(addition(10,25));

    }


    private static void printMessage(String group){
        System.out.println("Hello " + group);
    }

    static double addition(double num1, double num2){
        double result = 0;

        result = num1 + num2;

        return result;
    }




}
