package com.multithreading.second;

public class Demo {
    public static void main(String[] args) throws InterruptedException {



        Thread t0=new Thread ( new ReportGeneration () );

        Thread t1=new Thread ( new MailSender (t0) );

        t0.start ();
        t1.start ();

       // t0.join ();
       // t1.join ();
        System.out.println (Thread.currentThread ().getName ()+"  in main()");



    }
}
