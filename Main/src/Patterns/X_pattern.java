package Patterns;

import java.util.Scanner;

public class X_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=n; j++) {
                if(i==j || i+j==n){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
