package com.multithreading.second;

public class ReportGeneration implements  Runnable {
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println (Thread.currentThread ().getName ()+" :Report Generating ....  "+i);
            try {
                Thread.sleep ( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
    }
}
