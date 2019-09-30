package com.Polymor;

public class Cars extends  Vehicle {
    String name;
    public Cars(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "name='" + name + '\'' +
                '}';
    }
}
