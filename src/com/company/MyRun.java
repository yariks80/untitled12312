package com.company;

public class MyRun implements Runnable {
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        for (int i = 0; i < 10000; i++) {
            System.out.println("Name - " + thread.getName() + " " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }}

