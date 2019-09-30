package com.pract;

public class Test {
    public static void main(String[] args) {
        Parent p =new Parent ();
        p.methodOne ();
        Child c =new Child ();
        c.methodOne ();
        Parent p1= new Child ();
        p1.methodOne ();
    }
}
