package Traditional_problems;

import java.util.Scanner;

public class list_all_primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}