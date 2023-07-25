package com.skillsoft.generics;

public class Repository<T> {

//    public static T staticVariable; // java: non-static type variable T cannot be referenced from a static context
    // Type parameter is associated with an instance of the repository class
    // So this type parameter cannot be used with static definitions inside the class

//    public T value = 10; // java: incompatible types: int cannot be converted to T

    @SuppressWarnings("unchecked")
    private T value = (T) "Initial values"; // Unchecked cast: 'java.lang.String' to 'T'

    public Repository() {

    }

    //    public T value;

//    public Repository(T value) {
//        this.value = value;
//    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("Repository contains: %s", value);
    }
}

// Type Parameter or Type Variable
// A placeholder for the different types of data that the Repository can work with