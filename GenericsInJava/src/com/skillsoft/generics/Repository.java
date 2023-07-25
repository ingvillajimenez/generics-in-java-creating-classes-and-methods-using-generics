package com.skillsoft.generics;

public class Repository<T> {

    private T value;

    public Repository(T value) {
        this.value = value;
    }

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

// Repository<Object>
// The Java compiler has lost all information of the type od data stored in the repository