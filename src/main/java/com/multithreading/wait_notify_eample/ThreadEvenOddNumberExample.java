package com.multithreading.wait_notify_eample;

public class ThreadEvenOddNumberExample {
    public static void main(String[] args) {
        int maxNumber = 100;
        NumberPrinter printer = new NumberPrinter();
        new Thread(new EvenNumGenerator(printer, maxNumber)).start();
        new Thread(new OddNumGenerator(printer, maxNumber)).start();
    }

}
