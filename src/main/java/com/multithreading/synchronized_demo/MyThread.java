package com.multithreading.synchronized_demo;

public class MyThread  extends Thread {
    NumberGenerater n;

    public MyThread(NumberGenerater n) {
        this.n=n;
    }

    @Override
    public void run() {
        for (int i=1;i<=10;i++) {
            try {
                System.out.println ( n.incrementAndGet () );
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
      /* int  total=  NumberGenerater.k;
        for (int i=1;i<=10;i++) {
            try {
                total= NumberGenerater.incrementAndReurn ();
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
            System.out.println (total );
        }*/

    }
}
