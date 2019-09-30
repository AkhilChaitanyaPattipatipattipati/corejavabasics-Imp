package com.aggregation_new;

public class Test {
    public static void main(String[] args) {
        Engine engine1=new Engine ("engine1");
        Engine engine2=new Engine ("engine2");
        Car car=new Car ();
       // car.setEngine ( engine1 );
        //car.engine=engine1
        // Car car1=new Car ();
        //        car1.setEngine ( engine1 );
        //car1.engine=engine1
        car.setEngine ( engine2 );
        car.getEngine ().work ();

    }
}
