package com.generics;

public class Demo {
    public static void main(String[] args) {
        NonGen<Student> s=new NonGen<> ();
        Student s1=  new Student ( 10,"ranga" );
        s.m1 (s1 );

        Number n=new Integer ( 10 );

        n=s.getValue ( n );
    }
}
