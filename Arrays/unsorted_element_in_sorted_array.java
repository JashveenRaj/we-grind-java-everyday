package Arrays;
import java.util.Scanner;

public class unsorted_element_in_sorted_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        boolean flag = false;
        int result = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] >= a[j]) {
                    flag = true;
                    result = a[i];
                }
            }

        }
        if (flag) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }
}