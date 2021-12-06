package se.lexicon.week2;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        initArrays();


        iteratingAnArray();
    }

    public static void initArrays(){

        char[] chars = new char[5]; //A char array, with a fixed size of 5 elements. (Index 0-4)

        int[] numbers;  // Created, but non-initialized.
//        numbers[1] = 10; // Will not run. Need to initialize first.
        numbers = new int[4]; // Instantiated. Now has the size of 4. [0, 0, 0, 0]
        numbers[0] = 10; // [10, 0, 0, 0]

        System.out.println(numbers[0]);


        char[] javaWord = new char[] {'J', 'A', 'V', 'A'}; // ['J', 'A', 'V', 'A']
        //                      0       1       2    3        4
        String[] sentence = {"Hello", "This", "is", "a", "sentence"}; //["Hello", "This", "is", "a", "sentence"]

        String word = sentence[2];

        System.out.println(word); // is

    }


    public static void iteratingAnArray(){

        char[] javaWord = new char[] {'J', 'A', 'V', 'A'}; // ['J', 'A', 'V', 'A']

//        System.out.print("" + javaWord[0] + javaWord[1] + javaWord[2] + javaWord[3]);

        for (int i=0; i<javaWord.length; i++){
            System.out.print(javaWord[i]);
        }

        //Question - Can we use toString to print the Array?
//        System.out.println(javaWord.toString()); Will print a hashcode.
        System.out.println(Arrays.toString(javaWord));

    }
}
