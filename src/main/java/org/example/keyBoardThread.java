package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class keyBoardThread extends Thread {

    public void run() {
        System.out.println("press any key");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = null;
        try {
            name = reader.readLine();
        } catch (IOException e) {
            //e.printStackTrace();
        }

        // Printing the read line
        System.out.println(name);
        System.out.println("MyThread has been stopped.");
    }
}