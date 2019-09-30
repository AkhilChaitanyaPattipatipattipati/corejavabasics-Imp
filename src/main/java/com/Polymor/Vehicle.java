package com.Polymor;

public class Vehicle {
   public  static Vehicle getVehicleDetails(String vehiclename) {
        if (vehiclename.equalsIgnoreCase ( "Bike" )) {
            Vehicle veh = new Bikes ( "Apache" );
            return veh;
        } else if (vehiclename.equalsIgnoreCase ( "Car" )) {
            Vehicle veh = new Cars ( "Honda Civic" );
            return veh;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{}";
    }
}

