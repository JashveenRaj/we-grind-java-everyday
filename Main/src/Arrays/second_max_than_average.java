package Arrays;

import java.util.Scanner;

public class second_max_than_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter values: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0 ;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        int avg = sum/a.length;
        
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max1){
                max1 = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max2 && a[i]<max1){
                max2 = a[i];
            }
        }
        System.out.println("Result: " + max2);
    }
}
