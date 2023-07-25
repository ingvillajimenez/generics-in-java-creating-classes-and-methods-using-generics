package com.skillsoft.generics;

import java.util.Map;

public class MapHelper {

    public static <K, V> void addEntries(Map<K, V> map, K[] keys, V[] values) {

        int index = 0;
        for (K key : keys) {
            map.put(key, values[index]);
            index++;
        }
    }

    public static <K,V> void printEntries(Map<K, V> map) {
        System.out.println("\n***********Map entries");

        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

//    public static <T> void displayElements(T element1, T element2) {
//        // This is a generic method because of using the type parameter <T>
//        System.out.println("\n************Some elements");
//
//        System.out.format("Element 1: %s, Element 2: %s\n", element1, element2);
//    }

    public static <T, S> void displayElements(T element1, S element2) {
        System.out.println("\n*************Some elements");

        System.out.format("Element 1: %s, Element 2: %s\n", element1, element2);
    }

    @SafeVarargs // to prevent Possible heap pollution from parameterized vararg type
    public static <T> void displayElements(T... elements) { // varargs type
        System.out.println("\n***********Some elements");

        for (T element : elements) {
            System.out.println(element);
        }
    }

    public static <K, V> boolean mapEquals(Map<K, V> map1, Map<K, V> map2) {

        if (map1.entrySet().size() != map2.entrySet().size()) {
            return false;
        }

        for (Map.Entry<K, V> entry : map1.entrySet()) {
            V map2Value = map2.get(entry.getKey());

            if (!entry.getValue().equals(map2Value)) {
                return false;
            }
        }

        return true;
    }

}
