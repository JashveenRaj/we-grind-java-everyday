import java.util.Scanner;

public class is_prime {
    public static void main(String[] args) {
        while (true) {
            boolean flag = true;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number to check: ");
            int num = scanner.nextInt();
            scanner.nextLine();

            if (num == 1) {
                System.out.println("Given number is not a prime number");
            } else if (num > 1) {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        flag = false;
                        break;
                    }
                } if (flag){
                    System.out.println("Given number is prime number");
                }else{
                    System.out.println("Given number is not a prime number");
                }
            }else{
                System.out.println("Given number is not a prime number");
            }
        }
    }
}
