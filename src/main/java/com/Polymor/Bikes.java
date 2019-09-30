package com.Polymor;

public class Bikes extends Vehicle{
    String name;

    public Bikes(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bikes{" +
                "name='" + name + '\'' +
                '}';
    }
}
