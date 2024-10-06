package com.thread;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread running using Runnable interface");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of MyRunnable
        MyRunnable myRunnable = new MyRunnable();

        // Creating a Thread object and passing MyRunnable as the target
        Thread thread = new Thread(myRunnable);

        // Starting the thread
        thread.run();
    }
}
