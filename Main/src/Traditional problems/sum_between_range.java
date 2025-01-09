import java.util.Scanner;

public class sum_between_range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int start = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter second number: ");
        int end = scanner.nextInt();
        scanner.nextLine();

        scanner.close();

        int result = 0;
        for(int i=start ; i<=end ; i++){
            result = result+i;
        }
        System.out.println(result);
    }
}
