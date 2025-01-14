package Traditional_problems;

import java.util.Scanner;

public class neon_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int squared = n*n;
        int sum = 0;

        while(squared>0){
            sum+=squared%10;
            squared = squared / 10;
        }

        if(sum==n){
            System.out.println(n + " is a Neon number");
        }else{
            System.out.println(n+ " is not Neon number");
        }
    }
}
