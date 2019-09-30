package com.composition_new;

public class Engine {
    public String name;

    public Engine(String name) {
        this.name = name;
    }
    public void work(){
        System.out.println ("working "+name);
    }
}
