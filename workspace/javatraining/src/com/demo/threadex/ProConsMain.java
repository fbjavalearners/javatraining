package com.demo.threadex;

public class ProConsMain {

    public static void main(String[] args) {

        Buffer buf = new Buffer();

        Producer prorun = new Producer(buf);
        Thread pro = new Thread(prorun);
        pro.setName("Producer ");

        Consumer con = new Consumer(buf);
        Thread cons = new Thread(con);
        pro.setName("Consumer ");

        pro.start();
        cons.start();

    }

}