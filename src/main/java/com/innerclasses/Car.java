package com.innerclasses;

public class Car {
    // here any variable we defined(instance or static) we can call it through inner class
    //we cant create static methods in inner class

    private String name;
    private String model;
    private static String defaultType = "cyl";

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static class Engine {
        private String name;
        private String type;

        public Engine(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getName() {
           // String carName = Car.this.name;
            String defaultType = Car.defaultType;

            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

    }




}
