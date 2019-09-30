package com.store.design;

import java.util.HashSet;
import java.util.Set;

public class Store {
    private Set<Vehicle> vehicles = new HashSet<> ( 0 );

    public void add(Vehicle v) {
        vehicles.add ( v );
    }

    public  void remove(Vehicle v) {
        vehicles.remove ( v );
    }

    public Set<Vehicle> vehicleDetails() {
        return vehicles;
    }

}
