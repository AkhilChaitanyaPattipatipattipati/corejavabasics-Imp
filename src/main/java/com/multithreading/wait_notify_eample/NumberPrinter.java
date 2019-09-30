package com.multithreading.wait_notify_eample;

public class NumberPrinter {

    // To check if even number is printed or not.
    private boolean isEvenNumPrinted = true;

    public synchronized   void printOdd(int oddNumber) throws InterruptedException {
        // Get a lock on NumberPrinter
      //  synchronized (this)
      //  {
            // Wait until even is not printed.
            if (!isEvenNumPrinted)
                this.wait(); //relase lock on printer object and oddNum thread goes to waiting state

            System.out.println(oddNumber);
            isEvenNumPrinted = false;

            // Notify the other waiting thread which is waiting on
            // NumberPrinter
            // Other thread will get out of waiting state
            notify();
      //  }
    }

    public synchronized void printEven(int evenNumber) throws InterruptedException {
      //  synchronized (this) {
            if (isEvenNumPrinted)
                this.wait();//relase lock on printer object and evengen thread goes  to waiting state

            System.out.println(evenNumber);
            isEvenNumPrinted = true;
              notify();
      //  }
    }
}