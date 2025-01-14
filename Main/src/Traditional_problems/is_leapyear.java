package Traditional_problems;

import java.util.Scanner;

public class is_leapyear {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a year: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            System.out.println((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? "It's a leap year" : "Not a leap year");

        }
    }
}
