import java.util.Scanner;

public class even_and_positive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        System.out.println(a == 0 ? "number is 0" : a%2==0 && a>=0 ? "Given number is even and positive" : "Given number lacks one or both charecter" );
    }
}
