package com.practice;

// creating static inner class member and calling from outer class static members is possible by creating outer object
// with inner object and then call the method.

public class Outer {
    public void methodOne(){
        System.out.println ("I am in Outer class");
    }

    public class Inner{
        public void methodTwo(){
            System.out.println ("I am in method two");
        }
    };


    public static void main(String[] args) {
        new Outer ().new Inner ().methodTwo ();

    }
}
