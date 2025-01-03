import java.util.Scanner;

public class is_perfect_square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = scanner.nextInt();
        boolean m = false;

        for (int i = 0; i <= n; i++) {
            if(i*i == n){
                 m = true;
                 break;
            }
        }

        if (m){
            System.out.println( n + " a perfect square");
        }else{
            System.out.println(n + " not a perfect square");
        }
    }
}
