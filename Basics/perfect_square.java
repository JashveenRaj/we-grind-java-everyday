package Basics;

import java.util.Scanner;

public class perfect_square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flag = false;
        for (int i = 0; i < n ; i++) {
            if(i*i==n){
                flag = true;
            }
        }
        if(flag){
            System.out.println("Perfect Square");
        }else{
            System.out.println("Not a Perfect Square");
        }
    }
}
