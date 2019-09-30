package com.multithreading.second;

public class MailSender implements Runnable{
    Thread t0;
    public MailSender(Thread t0) {
        this.t0=t0;
    }

    @Override
    public void run() {
        try {
            t0.join ();
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        for(int i=1;i<=5;i++){
            System.out.println (Thread.currentThread ().getName ()+" :Mail Sending ....  "+i);
            try {
                Thread.sleep ( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
    }
}
