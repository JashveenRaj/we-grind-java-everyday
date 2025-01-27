package Basics;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = a>b ? a : b;
        for (int i = max; i <= a*b ; i++) {
            if(i%a==0 && i%b==0){
                System.out.println("LCM: " + i);
                break;
            }
        }
    }
}
