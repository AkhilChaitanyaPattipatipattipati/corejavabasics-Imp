package com.multithreading.wait_notify_eample;

class OddNumGenerator implements Runnable {
    private NumberPrinter printer;
    private int max;

    public OddNumGenerator(NumberPrinter printer, int max) {
        this.printer = printer;
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = 1; i < max; i = i + 2) {
            try {
                printer.printOdd(i);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}