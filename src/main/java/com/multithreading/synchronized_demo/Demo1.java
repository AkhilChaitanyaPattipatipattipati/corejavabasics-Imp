package com.multithreading.synchronized_demo;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        NumberGenerater n=new NumberGenerater();
        MyThread m1 =new MyThread (n);
        m1.start ();

        int total=0;
        for (int i=1;i<=10;i++) {
            total= NumberGenerater.incrementAndReurn ();
            System.out.println (total );
        }
    }
}
