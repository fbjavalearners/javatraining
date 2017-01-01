package com.demo.threadex;


public class Consumer implements Runnable {

    Buffer bu;

    public Consumer(Buffer bu) {
        this.bu = bu;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                bu.getI();

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }

}

