package com.skillsoft.generics;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Repository<String> stringRepository = new Repository<>("Welcome To Java");
        Repository rawStringRepository = stringRepository;

        System.out.println(rawStringRepository);

        Object stringObject = rawStringRepository.getValue();

        rawStringRepository.setValue("Hi Java"); // Unchecked call to 'setValue(T)' as a member of raw type 'com.skillsoft.generics.Repository'

        System.out.println(rawStringRepository);

        rawStringRepository.setValue(10);

        System.out.println("Contains the wrong type! " + rawStringRepository);

//        Repository rawStringRepository = new Repository("Hello Java"); // Raw use of parameterized class 'Repository'
//        System.out.println(rawStringRepository);
//
//        Object stringObject = rawStringRepository.getValue();
//
//        Repository rawFloatRepository = new Repository(12.5f); // Raw use of parameterized class 'Repository'
//        System.out.println(rawFloatRepository);
//
//        Object floatObject = rawFloatRepository.getValue();
//
//        Repository rawBooleanRepository = new Repository(false); // Raw use of parameterized class 'Repository'
//        System.out.println(rawBooleanRepository);
//
//        Object booleanObject = rawBooleanRepository.getValue();

    }
}

// Generics
// Enable types (interfaces and classes) to be parameters while defining classes, interfaces, methods

// Advantages of Generics
// Runtime checks become compile time checks
// Eliminate casts while accessing data
// Allow extensive code reuse making code maintenance easier
// Allow programmers to use generic algorithms

// Backward Compatibility
// Generic classes can be instantiated using raw objects