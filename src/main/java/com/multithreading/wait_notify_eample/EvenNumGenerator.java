package com.multithreading.wait_notify_eample;

class EvenNumGenerator implements Runnable {
    private NumberPrinter printer;
    private int max;

    public EvenNumGenerator(NumberPrinter printer, int max) {
        this.printer = printer;
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = 2; i <= max; i = i + 2) {
            try {
                printer.printEven(i);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
