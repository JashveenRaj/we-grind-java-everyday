import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an value: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}
