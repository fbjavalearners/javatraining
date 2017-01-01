package com.demo.threadex;

class Buffer {

    int i;

    public Buffer() {

    }

    public synchronized void getI() throws InterruptedException {
        if (this.i != 0) {
            System.out.println("Consuming:: " + i);
            this.i = 0;
            notify();

        } else {
            wait();
            System.out.println("Consuming:: " + i);
            this.i = 0;
            notify();
        }
    }

    public synchronized void setI(int i) throws InterruptedException {
        if (this.i == 0) {
            System.out.println("Producing :: " + i);
            this.i = i;
            notify();

        } else {

            wait();
            System.out.println("Producing :: " + i);
            this.i = i;
            notify();
        }

    }

}
