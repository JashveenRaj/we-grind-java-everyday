package Patterns;

import java.util.Scanner;

public class square_outof_nums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 0 ; i < n+1;  i++) {
            for (int j = 0 ; j < n+1 ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
