package com.skillsoft.generics;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Alice");
        map1.put(2, "Bob");
        map1.put(3, "Charlie");

        Map<Double, String> map2 = new HashMap<>();
        map2.put(3.1, "Charles");
        map2.put(2.3, "Bob");
        map2.put(1.4, "Alice");

//        Map<Integer, String> map2 = new HashMap<>();
////        map2.put(3, "Charlie");
//        map2.put(3, "Charles");
//        map2.put(2, "Bob");
//        map2.put(1, "Alice");

//        Map<Integer, Double> map2 = new HashMap<>();
//        map2.put(3, 5.5);
//        map2.put(2, 4.5);
//        map2.put(1, 8.5);

        System.out.println("Are the maps equal? " + MapHelper.mapEquals(map1, map2));
//        java: method mapEquals in class com.skillsoft.generics.MapHelper cannot be applied to given types;
//        required: java.util.Map<K,V>,java.util.Map<K,V>
//        found:    java.util.Map<java.lang.Integer,java.lang.String>,java.util.Map<java.lang.Double,java.lang.String>
//        reason: inference variable K has incompatible equality constraints java.lang.Double,java.lang.Integer


//        MapHelper.displayElements(100, 200, 300, 400);
//
//        MapHelper.displayElements("Key", "Value", new Date(), new UUID(543, 98765));
//
//        MapHelper.displayElements(new Date(), "Hello", 123.4);

//        MapHelper.displayElements("ID", 10);
//
//        MapHelper.displayElements(10001, new Date());
//
//        MapHelper.displayElements(1045.56, new UUID(123, 567));

//        MapHelper.displayElements("Key", "Value");
//
//        MapHelper.displayElements(new Date(), new Date());
//
//        MapHelper.displayElements(1045.56, 23456.12);
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