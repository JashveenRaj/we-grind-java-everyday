import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length you want: ");
        int length = scanner.nextInt();
        System.out.print("Enter the breadth you want: ");
        int breadth = scanner.nextInt();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < breadth; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
