package Basics;
import java.util.*;

public class prime_num_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int looper = Integer.MAX_VALUE;
        int prime = 0;

        while(N!=0){
            for(int i = 1 ; i<looper ; i++){
                int count = 0 ;
                for(int j = 1 ; j<=i ; j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count==2){
                    prime = i;
                    N--;
                    if(N==0){
                        looper = 0;
                    }
                }
            }
        }
        System.out.println((int)Math.pow(prime,2));
    }
}
