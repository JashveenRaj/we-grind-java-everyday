import java.util.Scanner;

class finding{
    public static int fibonacci(int num){
        int a = 0;
        int b = 1;
        for (int i = 2; i <=num ; i++) {
            int c = a+b;
            a = b;
            b = c;
        }
        return b;
    }
}

public class fibonacci2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int result = finding.fibonacci(n);
        System.out.println("Result: " + result);
    }
}
