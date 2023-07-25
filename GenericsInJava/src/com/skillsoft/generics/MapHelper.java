package com.skillsoft.generics;

import java.util.Map;

//public class MapHelper<K, V> {
public class MapHelper { // MapHelper does not need to be a generic class if the static methods are parameterized

    public static <K, V> void addEntries(Map<K, V> map, K[] keys, V[] values) {
    // Specify the type parameters within angular brackets after the static keyword and before the return type
        int index = 0;
        for (K key : keys) {
            map.put(key, values[index]);
            index++;
        }
    }

    public static <K,V> void printEntries(Map<K, V> map) {
        // you need to specify the parameterized types for each method individually (generic method!)
        System.out.println("\n***********Map entries");

        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

//    public static void addEntries(Map<K, V> map, K[] keys, V[] values) { // 'com.skillsoft.generics.MapHelper.this' cannot be referenced from a static context
//    // You cannot use generic types for static variables, you cannot use the parameterized type in a static context
//        int index = 0;
//        for (K key : keys) {
//            map.put(key, values[index]);
//            index++;
//        }
//    }
//
//    public static void printEntries(Map<K, V> map) {
//        System.out.println("\n***********Map entries");
//
//        for (Map.Entry<K, V> entry : map.entrySet()) {
//            System.out.println(entry);
//        }
//    }

}
