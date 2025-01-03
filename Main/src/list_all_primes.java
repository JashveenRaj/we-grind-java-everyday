import java.util.Scanner;

public class list_all_primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1 ; j <=n ; j++) {
                if(i*j==n){
                    System.out.println(i);
                }
            }
        }
    }
}