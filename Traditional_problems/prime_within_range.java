package Traditional_problems;

import java.util.Scanner;

public class prime_within_range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int count = 0 ;
        for (int i = start; i <=end ; i++) {
            for (int j = 1; j <=end ; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(i);
            }
            count = 0;
        }
    }
}
