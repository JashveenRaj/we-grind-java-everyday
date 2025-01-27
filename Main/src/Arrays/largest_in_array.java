package Arrays;

import java.util.Scanner;

public class largest_in_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
