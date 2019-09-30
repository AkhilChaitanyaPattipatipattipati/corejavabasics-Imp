package com.overriding;

import com.aggregation.Student;

public class Test {
    public static void main(String[] args) {
        Parent p1=new Parent();
        System.out.println (p1.m1 ());
        Object p2=null;
          p2=new Student (10,null,"");
          p2=new Child();
          //p2=new Child1 ();
        if(p2 instanceof Child) {
            Child c=(Child) p2;
            System.out.println (c.m2 ());
        }else{
            System.out.println ("p2 is not child class");
        }




//static methods will not ovverride
// in this case reference type is important to resolve method callm1() static polymorphism
//instance methods can ovverride
        //in this case runtime object will decide the method call runtime polymorphism
    }
}
