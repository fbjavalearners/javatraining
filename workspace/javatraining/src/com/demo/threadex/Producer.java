package com.demo.threadex;

public class Producer implements Runnable {

    Buffer bu;

    public Producer(Buffer buf) {
        this.bu = buf;
    }

    public void run() {

        for (int i = 1; i <= 10; i++) {
            try {
                bu.setI(i);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }
    }

}