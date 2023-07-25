package com.skillsoft.generics;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();

        Integer[] studentIds = new Integer[] {22, 33, 44, 55};
        String[] studentNames = new String[] {"Doris", "Donald", "Elise", "Eric"};

        MapHelper mapHelper = new MapHelper();

        mapHelper.addEntries(studentsMap, studentIds, studentNames);

        mapHelper.printEntries(studentsMap);

//        Map<Integer, Double> studentsMap = new HashMap<>();
//
//        Integer[] studentIds = new Integer[] {22, 33, 44, 55};
//        Double[] studentScores = new Double[] {3.2, 2.8, 3.3, 3.8};
//
//        MapHelper mapHelper = new MapHelper();
//
//        mapHelper.addEntries(studentsMap, studentIds, studentScores); // java: incompatible types: java.util.Map<java.lang.Integer,java.lang.Double> cannot be converted to java.util.Map<java.lang.Integer,java.lang.String>
//
//        System.out.println(studentsMap);

//    Map<Integer, String> studentsMap = new HashMap<>();
//
//    Integer[] studentIds = new Integer[] {22, 33, 44, 55};
//    String[] studentNames = new String[] {"Doris", "Donald", "Elise", "Eric"};
//
//    MapHelper mapHelper = new MapHelper();
//
//    mapHelper.addEntries(studentsMap, studentIds, studentNames);
//
//    System.out.println(studentsMap);

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