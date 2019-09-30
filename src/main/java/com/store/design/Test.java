package com.store.design;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Store store = new Store ();
        Car c1 = new Car ( "kiya", new Model ( "amnti", new Date () ) );
        c1.addModel ( new Model ( "amnti2", new Date () ) );
        store.add ( c1 );
        Bike b = new Bike ( "Apache", new Model ( "180", new Date () ) );
        store.add ( b );
         //pring all vehicles in store
        store.vehicleDetails ()
             .stream ()
             .filter ( v->v.type ().equalsIgnoreCase ( Vehicle.VehicleType.Car.toString () ) )
             .forEach ( System.out::println );

    }
}
