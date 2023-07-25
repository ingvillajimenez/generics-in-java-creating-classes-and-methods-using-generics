package com.skillsoft.generics;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        System.out.println("**** A repository for each type of data stored");

        IntegerRepository fifteen = new IntegerRepository(15);
        System.out.println(fifteen);

        DoubleRepository tenPointOne = new DoubleRepository(10.1);
        System.out.println(tenPointOne);

        StringRepository helloGenerics = new StringRepository("Hello generics!");
        System.out.println(helloGenerics);

        DateRepository today = new DateRepository(Calendar.getInstance().getTime());
        System.out.println(today);

//        IntegerRepository fifteen = new IntegerRepository(15);
//        System.out.println(fifteen);
//
//        IntegerRepository oneHundredOne = new IntegerRepository(101);
//        System.out.println(oneHundredOne);
//
//        IntegerRepository tenPointOne = new IntegerRepository(10.1); // java: incompatible types: double cannot be converted to java.lang.Integer
//
//        IntegerRepository helloGenerics = new IntegerRepository("Hello generics!"); // java: incompatible types: java.lang.String cannot be converted to java.lang.Integer
//
//        IntegerRepository today = new IntegerRepository(Calendar.getInstance().getTime()); // java: incompatible types: java.util.Date cannot be converted to java.lang.Integer

    }
}

// Generics
// Enable types (interfaces and classes) to be parameters while defining classes, interfaces, methods

// Advantages of Generics
// Runtime checks become compile time checks
// Eliminate casts while accessing data
// Allow extensive code reuse making code maintenance easier
// Allow programmers to use generic algorithms