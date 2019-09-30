package com.aggregation_new;

import com.aggregation_new.Engine;

final class Car {
   //For every car object seperate copy of engine object will create
    //For every object seperate memory allocation done for instance variable
    //instance variable value vary from one object to another object
    private Engine engine;
    private int i;
    void setI(int i){
        this.i=i;
    }

    void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

   /* void move() {
        if (engine != null)
            engine.work();
    }*/


}

