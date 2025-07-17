package Arrays;
import java.util.*;

public class missing_in_range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n-1 ; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = (n*(n+1))/2;
        for (int i = 0; i < n; i++) {
            sum-=arr[i];
        }
        System.out.println(sum);
    }
}
