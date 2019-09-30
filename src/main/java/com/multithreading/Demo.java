package com.multithreading;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        MyThread m=new MyThread ();
        m.start ();
       // m.start ();
        for(int i=1;i<=5;i++){
            System.out.println (Thread.currentThread ().getName ()+" :  "+i);
            Thread.sleep ( 1000 );
        }
    }
}
