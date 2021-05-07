package org.example;

class MyThread extends Thread {

    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("MyThread is running.");
        }
        System.out.println("MyThread has been stopped.");
    }
}

