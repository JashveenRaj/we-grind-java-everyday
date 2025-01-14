package Basics;

public class more_formatting {
    public static void main(String[] args) {
        System.out.printf("Integer: %d%n", 123); // Integer: 123
        System.out.printf("Right-aligned: %5d\n", 123); // Right-aligned:   123
        System.out.printf("Left-aligned: %-5d\n", 123); // Left-aligned: 123
        System.out.printf("Zero-padded: %07d\n", 123); // Zero-padded: 00123
        System.out.printf("Floating-point: %.2f\n", 123.456); // Floating-point: 123.46
        System.out.printf("Width and precision: %2.2f\n", 123.4); // Width and precision:   123.40
        System.out.printf("String: %16s\n", "Hello"); // String: Hello
        System.out.printf("Character: %c\n", 'A'); // Character: A
        System.out.printf("Boolean: %b\n", true); // Boolean: true
        System.out.printf("Percent sign: %%\n"); // Percent sign: %

        for (int i = 1; i <= 5; i++) {
            System.out.printf("%-5d %-5d %-5d\n", i, i * i, i * i * i);
        }

        double num = 123.45678;
        System.out.printf("%.1f\n", num); // 123.5
        System.out.printf("%.3f\n", num); // 123.457
        System.out.printf("%.6f\n", num); // 123.456780

        System.out.printf("%-15s %10s\n", "Item", "Price");
        System.out.printf("%-15s %10.2f\n", "Apples", 2.50);
        System.out.printf("%-15s %10.2f\n", "Bananas", 1.75);

        for (int i = 0; i <= 100; i += 20) {
            System.out.printf("Progress: %3d%%\n", i);
        }

        int num1 = 255;
        System.out.printf("Decimal: %d\n", num1); // Decimal: 255
        System.out.printf("Hexadecimal: %x\n", num1); // Hexadecimal: ff
        System.out.printf("Octal: %o\n", num1); // Octal: 377

    }
}
