package com.skillsoft.generics;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        System.out.println("**** Accessing values with the right type");

        Repository fifteen = new Repository(15);

        Integer integerVal = (Integer) fifteen.getValue();
        System.out.println("Accessing integer: " + integerVal);

        Repository tenPointOne = new Repository(10.1);

        Double doubleVal = (Double) tenPointOne.getValue();
        System.out.println("Accessing double: " + doubleVal);

        Repository helloGenerics = new Repository("Hello generics!");

        String stringVal = (String) helloGenerics.getValue();
        System.out.println("Accessing string: " + stringVal);

        Repository today = new Repository(Calendar.getInstance().getTime());

        String dateVal = (String) today.getValue();
        System.out.println("Accessing date (wrong cast!): " + dateVal); // java.lang.ClassCastException
                                                                        // class java.util.Date cannot be cast to class java.lang.String

//        System.out.println("***** A single repository holding objects");
//
//        Repository fifteen = new Repository(15);
//        System.out.println(fifteen);
//
//        Repository tenPointOne = new Repository(10.1);
//        System.out.println(tenPointOne);
//
//        Repository helloGenerics = new Repository("Hello generics!");
//        System.out.println(helloGenerics);
//
//        Repository today = new Repository(Calendar.getInstance().getTime());
//        System.out.println(today);

    }
}

// Generics
// Enable types (interfaces and classes) to be parameters while defining classes, interfaces, methods

// Advantages of Generics
// Runtime checks become compile time checks
// Eliminate casts while accessing data
// Allow extensive code reuse making code maintenance easier
// Allow programmers to use generic algorithms