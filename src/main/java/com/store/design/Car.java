package com.store.design;

import java.util.ArrayList;
import java.util.List;

public class Car implements Vehicle {
    private String name;
    private List<Model> models = new ArrayList<> ();

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", models=" + models +
                '}';
    }

    public Car(String name, Model model) {
        this.name = name;
        this.models.add ( model );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Model> getModels() {
        return models;
    }

    public void addModel(Model model) {
        this.models.add ( model );
    }

    @Override
    public String type() {
        return VehicleType.Car.toString ();
    }
}
