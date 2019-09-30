package com.composition_new;

public class Car {
    private Engine engine;
    public Car(String engineName) {
        this.engine = new Engine ( engineName );
    }

    public Engine getEngine() {
        return engine;
    }
}
