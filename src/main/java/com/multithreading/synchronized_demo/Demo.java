package com.multithreading.synchronized_demo;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        NumberGenerater n=new NumberGenerater();

        // If we are trying to manipulate the instance variable inside instance method  and multiple threads are trying to
        // pass to same object then we must need syncronize key word for the instnace method


        // If we are trying to manipulate 2 instances variables throw 2 different objects we dont need to have syncroze key word.
        //As well as for the static methods as well


        MyThread m1 =new MyThread (n);
        m1.start ();
        for (int i=1;i<=10;i++) {
            System.out.println ( n.incrementAndGet () );
        }
    }
}
