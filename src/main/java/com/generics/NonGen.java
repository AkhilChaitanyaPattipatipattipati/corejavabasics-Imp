package com.generics;

import java.util.ArrayList;

public class NonGen<D>  {

    //Non Generic class un bounded generic  method
    public <D> D m1(D d) {
        return d;
    }

    //Non Generic class bounded generic method
    public <N extends Number> N getValue(N n) {
        return n;
    }

    //bounded method inside m1(? extends Number) method we can read data from al return type should Number
    // but we cant do write operation
    public void m2(ArrayList<? extends Number> al) {
        Number i = al.get(0);
    }

    //bounded method inside m1 method we can do write operation(number or its child objects) on al but not read return type should be number super class
    public void m3(ArrayList<? super Number> al) {

        al.add(new Integer(10));
        al.add(new Float(20F));
        al.get(0);
        Object s = al.get(0);

    }


    //we can do write operation on arraylist al with B or B child class objects but not read operation
    public void m4(ArrayList<? super B> al) {
        al.add(new B());
        al.add(new BChild());
        Object b = al.get(0);
    }
    public void m5(){

    }
}
