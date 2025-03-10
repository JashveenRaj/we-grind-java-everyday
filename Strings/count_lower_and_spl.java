package Strings;

import java.util.Scanner;

public class count_lower_and_spl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        char[] s = scanner.nextLine().toCharArray();
        int lower = 0;
        int spl = 0;
        for (int i = 0; i < s.length; i++) {
            if (Character.isLowerCase(s[i])) {
              lower++;
            } else if (!Character.isDigit(s[i]) && !Character.isUpperCase(s[i]) && !Character.isLowerCase(s[i])) {
                spl++;
            }
        }
        System.out.println(lower+spl);
    }
}
