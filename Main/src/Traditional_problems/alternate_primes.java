package Traditional_problems;

import java.util.Scanner;

public class alternate_primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int out =0;
        for(int i = 2; i<n ; i++){
            int count = 0;
            for (int j = 1; j < n ; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                out+=1;
            }else{
                continue;
            }
        }
        System.out.println(out/2);
    }
}

