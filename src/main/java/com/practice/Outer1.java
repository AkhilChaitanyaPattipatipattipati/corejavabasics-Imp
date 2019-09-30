package com.practice;

//creating static inner class with instance members calling from outside static class is possible by creatig outer class
// object then call Inner class thrn call method
public class Outer1 {

    public void methodOne(){
        System.out.println ("I am in outer class method one");
    }

    public static class Inner1{
        public  void methodTwo(){
            System.out.println ("I ma in Inner class method");
        }
    };

    public static void main(String[] args) {
        System.out.println (new Outer1.Inner1 () instanceof Inner1);
        new Outer1.Inner1 ().methodTwo ();
    }
}
