package com.store.design;

import java.util.ArrayList;
import java.util.List;

public class Bike implements  Vehicle {
    private String name;
    private List<Model> models=new ArrayList<> (  );

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", models=" + models +
                '}';
    }

    public Bike(String name, Model model){
        this.name=name;
        this.models.add ( model );

    }

    public String getName() {
        return name;
    }

    public List<Model> getModels() {
        return models;
    }

    @Override
    public String type() {
        return VehicleType.Bike.toString ();
    }
}
