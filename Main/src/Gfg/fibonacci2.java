package Gfg;

import java.util.Scanner;

public class fibonacci2 {
    public static void main(String[] args) {
        // code here
        Scanner scanner = new Scanner(System.in);
        int  n = scanner.nextInt();

        int prev = 0;
        int curr = 1;
        int out = 0 ;
        if (n == 0) {
            System.out.println(prev);
            return;
        }else if (n == 1) {
            System.out.println(curr);
            return;
        }

        while(n>1){
            out=prev+curr;
            prev = curr;
            curr = out;
            n--;
        }
        System.out.println(out);
    }
}
