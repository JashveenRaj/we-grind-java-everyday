package Multithreading;

class thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread());
        }
    }
}

class thread3 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread());
        }
    }
}

class thread4 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread());
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        thread1 thread1 = new thread1();
        thread3 thread3 = new thread3();
        thread4 thread4 = new thread4();

        thread1.start();
//        thread1.join();
        thread3.start();
//        thread3.join();
        thread4.start();

        thread1.setName("Thread 1");
        thread3.setName("Thread 3");
        thread4.setName("Thread 4");

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread());
        }
    }
}