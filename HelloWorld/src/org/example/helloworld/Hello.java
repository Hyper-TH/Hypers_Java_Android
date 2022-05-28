/*
    https://www.youtube.com/watch?v=fis26HvvDII

    - Variables and Arithmetic Operators

    - Coded in IntelliJ
    - Pushed in VSC
 */
package org.example.helloworld;

import java.sql.SQLOutput;

public class Hello
{
    public static void main(String[] args)
    {
        // Print line moves cursor to next line
//        System.out.println("Hello World");

        // Print does not move cursor to next line
//        System.out.println("Hello World");

        // Datatype name = value;
        int number = 5;
        System.out.println(number);

        // Able to store larger numbers
        // but consume more memory
        long myLong = 5;
        System.out.println(myLong);

        // Store floating point numbers
        double myDouble = 4.5;
        System.out.println(myDouble);

        // Floating point numbers in default for java are doubles
        // Can store smaller numbers
        float myFloat = (float) 4.5;
        System.out.println(myFloat);

        // Store single chars
        char myChar = 'M';
        char myChar2 = '\u00AE'; // Unicode value
        System.out.println(myChar);

        // Store multiple chars
        String name = "Hyper";
        System.out.println(name);

        // Note that these are primitive data types
        // EXCEPT for String because String is a CLASS

        boolean myBoolean = true;
        boolean myBoolean2 = false;
        System.out.println(myBoolean);
        System.out.println(myBoolean2);

    } // end main()

} // end Hello class
