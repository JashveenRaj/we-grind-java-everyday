package Strings;

public class XPattern {
    public static void main(String[] args) {
        String input = "1234567"; // Must be odd-length
        int n = input.length();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    System.out.print(input.charAt(i));
                } else if (j == n - 1 - i) {
                    System.out.print(input.charAt(n - 1 - i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
