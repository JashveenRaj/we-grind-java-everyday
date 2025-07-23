package Arrays;
import java.util.*;
/*
Replace Elements with Greatest on the Right:
    Given an array, replace each element with the greatest element among the elements to its right.
    The last element should be replaced with -1.
 */
public class Replace_With_Greatest_Right_Element {
    public static void main(String[] args) {
        int[] arr = {17,18,5, 4, 6};
        int n = arr.length;

        for(int i = 0 ; i<n-1 ; i++){
            int greatest = Integer.MIN_VALUE;
            for(int j = i+1 ; j<n ; j++){
                if(arr[j]>greatest){
                    greatest = arr[j];
                }
            }
            arr[i] = greatest;
        }
        arr[n-1] = -1;
        System.out.println(Arrays.toString(arr));
    }
}
