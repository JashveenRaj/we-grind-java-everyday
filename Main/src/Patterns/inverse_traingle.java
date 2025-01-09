import java.util.Scanner;

public class inverse_traingle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        for (int i = a; i > 0 ; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}
