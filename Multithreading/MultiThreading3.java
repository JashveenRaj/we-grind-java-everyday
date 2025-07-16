package Multithreading;

class thread5 extends Thread{
    public void run(){
        try {
            thread5.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Custom");
    }
}
public class MultiThreading3 {
    public static void main(String[] args) {
        thread5 t = new thread5();
        t.run(); // ----> "Custom" then "Main" Because 'run' is a method call
        t.start(); // ----> "Main" then "Custom" Because 'start' runs the 'run' method inside thread
        System.out.println("Main");
    }
}
