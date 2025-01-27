package Arrays;

import java.util.Scanner;

public class third_largest_in_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        int max1 = a[0];
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < a.length ; i++) {
            if (a[i]>max1){
                max3 = max2;
                max2 = max1;
                max1 = a[i];

            }else if(a[i]>max2){
                max3 = max2;
                max2 = a[i];

            }else if(a[i]>max3){
                max3 = a[i];
            }
        }
        System.out.println(max3);
    }
}
