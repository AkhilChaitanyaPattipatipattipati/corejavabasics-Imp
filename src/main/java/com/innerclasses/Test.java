package com.innerclasses;

public class Test {
    public static void main(String[] args) {
        /*Car.Engine engine= new Car("tesla","001").new Engine("en1","Petrol");
        System.out.println(engine.getName());*/
        // without creating outclass object we cant create inner class oject

        MLOuter mo=new MLOuter();
        mo.m1();

       // new Vehicle(); instance of Vehilce

        /*new Vehicle(){
             public void move(){
                System.out.println("iam in Annonymouns Vehicle class move method");
            }
        };*///Anonymous  inner class that extends Vehicle and overriden move method

        //Annonymous inner class extends Vehicle class
       Vehicle v= new Vehicle(){
            int x=10;
            public void move(){
                System.out.println(this.x);
                System.out.println(super.x);
                super.move();
                System.out.println("iam in Annonymouns Vehicle class move method");
            }

        };
        //Anonymous inner class which implements only interface or extends  one class or abstract class

        final int k=20;
       new Inter(){
           @Override
           public void m3() {
               System.out.println(k);
               System.out.println("iam in annonyous inner class which implements Inter interface m3 method");
           }

       }.m3();

       //lamda supports only  an interface it should has only one abstract method (FunctionalInterface)

       Inter itr=()-> System.out.println("iam in lambda which implements Inter interface m3 method");
       itr.m3();

        Emp permanentEmp=(int basic)-> basic+basic*20/100+500;
        Emp contractEmp=(int basic)->basic+basic*20/100+500+200;

        System.out.println(permanentEmp.salary(1000));
        System.out.println(contractEmp.salary(1000));
    }
}
