package Basics;

import java.util.Scanner;

public class two_num_calc {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter First Number: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        int result1 = num1 + num2;
        int result2 = num1 - num2;
        int result3 = num1 * num2;
        int result4 = num1/num2;

        System.out.println();
        System.out.println("RESULTS:");
        System.out.println("1.) " + result1);
        System.out.println();
        System.out.println("2.) " + result2);
        System.out.println();
        System.out.println("3.) " +result3);
        System.out.println();
        System.out.println("4.) " + result4);
        System.out.println();

        scanner.close();
    }
}
