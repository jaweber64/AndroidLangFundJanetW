package com.example;

public class InitVarClass {

    // Janet Weber   9/2/2015
    // This code creates variables of various data types and initializes them with data.
    // All variables are then displayed to the screen.
    public static void main(String[] args){

        byte byteVar = 3;
        short shortVar = 32767;
        int intVar = 2000000000;
        long longVar = 9223000036000775000L;
        float floatVar = 3.14f;
        double doubleVar = 3.1415d;
        boolean win = true;
        char winOrLose = 'W';

        System.out.println ("byteVar (byte type) = " + byteVar);
        System.out.println ("shortVar (short type) = " + shortVar);
        System.out.println ("intVar (int type) = " + intVar);
        System.out.println ("longVar (long type) = " + longVar);
        System.out.println ("floatVar (float type) = " + floatVar);
        System.out.println ("doubleVar (double type) = " + doubleVar);
        System.out.println ("win (boolean) = " + win);
        System.out.println ("winOrLose (char) = " + winOrLose);
    }
}
