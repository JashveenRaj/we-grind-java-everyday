package Multithreading;

class thread2 extends Thread{
    public void run(int n){
        System.out.println("From thread1: " + (n>2?3:4));
        System.out.println("From thread1: " + (n>2?3:4));
        System.out.println("From thread1: " + (n>2?3:4));
        System.out.println("From thread1: " + (n>2?3:4));
        System.out.println("From thread1: " + (n>2?3:4));
    }
    public void start(int n){
        System.out.println("From thread1: " + (n>2?3:4));
        System.out.println("From thread1: " + (n>2?3:4));
        System.out.println("From thread1: " + (n>2?3:4));
        System.out.println("From thread1: " + (n>2?3:4));
        System.out.println("From thread1: " + (n>2?3:4));
    }
}
public class MultiThreading2 {
    public static void main(String[] args) {
        int n = 1;
        thread2 thread2 = new thread2();
        thread2.run(n);
        thread2.start(n);

        System.out.println("From main thread: " + (n>2?3:4));
        System.out.println("From main thread: " + (n>2?3:4));
        System.out.println("From main thread: " + (n>2?3:4));
        System.out.println("From main thread: " + (n>2?3:4));

    }
}
