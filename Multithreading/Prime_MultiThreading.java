package Multithreading;

class prime extends Thread{
    int num;
    prime(int num){
        this.num = num ;
    }

    public void run(){
        int count = 0;
        for(int i = 1; i<=num ; i++){
            if(num%i==0){
                count++;
            }
        }
        System.out.println(num + (count==2?" Prime":" Not Prime"));
    }
}
public class Prime_MultiThreading {
    public static void main(String[] args) {
        int start = 21;
        int end = 121;
        prime[] p1 = new prime[end-start];
        int index = 0;
        for (int i = start; i < end  ; i++) {
            p1[index++] = new prime(i);
        }
        for (int i = 0; i < p1.length; i++) {
            p1[i].start();
        }
    }
}
