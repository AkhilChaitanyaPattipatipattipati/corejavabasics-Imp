package com.store.design;

public interface Vehicle {
    enum VehicleType{
        Car,Bike;
        public String toString(){
           return this.name ();
        }
    }
     String type();
}
