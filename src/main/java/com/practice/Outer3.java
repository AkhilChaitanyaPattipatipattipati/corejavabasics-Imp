package com.practice;

public class Outer3 {

    public class Inner3{
        public void methodTwo(){
            System.out.println ("I am in Inner class method two");
        }
    };

    public void methodOne(){
        new Outer3 ().new Inner3 ().methodTwo ();
    }

    public static void main(String[] args) {
        new Outer3 ().methodOne ();
    }

}
