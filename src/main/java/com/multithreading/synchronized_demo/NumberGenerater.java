package com.multithreading.synchronized_demo;

public class NumberGenerater {
    int i=0;
    static public int k=0;
    public   int  incrementAndGet() throws InterruptedException {
        Thread.sleep ( 1000 );
         i=i+100;
        System.out.println (Thread.currentThread ().getName ()+" : "+i);
        return i;
    }

    // multiple threads will work on same object it will create problem
   public static  synchronized  int incrementAndReurn() throws InterruptedException {
       Thread.sleep ( 1000 );
        k=k+100;
        return k;
   }
}
