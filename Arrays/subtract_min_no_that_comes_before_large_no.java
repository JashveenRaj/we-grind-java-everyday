package Arrays;
import java.util.Scanner;

/*
* Given an array arr[] of integers,
* find out the difference between any two elements such that larger element
* appears after the smaller number in arr[].

Examples: If array is [2, 3, 10, 6, 4, 8, 1] then returned value
* should be 8 (Diff between 10 and 2). If array is [ 7, 9, 5, 6, 3, 2 ]
* then returned value should be 2 (Diff between 7 and 9)
*/

public class subtract_min_no_that_comes_before_large_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = -1;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        int min = -1;
        for (int i = 0; i < index; i++) {
            min = arr[i];
        }

        System.out.println(max - min);
    }
}
