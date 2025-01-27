package Arrays;

import java.util.Scanner;

public class second_largest_in_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
           if(a[i]>max1){
               max1 = a[i];
           }
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max2 && a[i]<max1){
                System.out.println(a[i]);
            }
        }
    }
}
