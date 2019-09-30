package com.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        Comparator<Test>  c=(t1,t2)->t1.getData ().compareTo ( t2.getData () );
        TreeSet<Test> t=new TreeSet<> ( c );
        t.add ( new Test(10) );
        t.add ( new Test ( 5 ) );
       System.out.println (t);
    }
}

//Treeset is perticularly for the sorting perpose.
//It allows only Homogenious and comparable objects only.
//comparable means on the top of which ever the object we are trying to do sorting that class supposed to be
// Implements comparable then only we call it as comparable objects.
//If we are trying to do it for predifined class then we should have to use comparataor it will have compare method
// inside we will override it and implement our own logic.
//If we are trying to sort some user defined class we should have to implement that with comparable it will
// have compared to medthod inside.
//we can use the lambda expression as well for to do sorting it will have comparator.comparing both are same thing only.
