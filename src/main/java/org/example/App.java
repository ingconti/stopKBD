package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("MyThread is running.");
            try {
            Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Caught:" + e);
            }
        }
        System.out.println("MyThread has been stopped.");
    }

    public static void main(String args[]) {

        //Thread myThread = new MyThread();
        Thread myThread = new keyBoardThread();
        myThread.start();

        try {
            Thread.sleep(4000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("Caught:" + e);
        }
        System.out.println("Exiting the main Thread.");
    }
}
