package Traditional_problems;

import java.util.Scanner;

public class power_of_a_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: "); //5
        int a = scanner.nextInt();
        System.out.print("Enter the exponent value: "); //4
        int b = scanner.nextInt();

        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
          System.out.println("Result: " + (result));
    }
}
