package Arrays;
import java.util.*;

public class permutation_of_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int[] a = new int[n];
        System.out.println(Arrays.toString(arr));

        int  i = 0 ;
        while(i<n){
            if(a[i]<i){
                if(i%2==0){
                    swap(arr,0,i);
                }else{
                    swap(arr,a[i],i);
                }
                System.out.println(Arrays.toString(arr));
                a[i]++;
                i=0;
            }else{
                a[i]=0;
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
