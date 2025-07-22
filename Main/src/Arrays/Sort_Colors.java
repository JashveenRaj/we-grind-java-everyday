package Arrays;
import java.util.*;

class Solution4 {
    public static void sortColors(int[] arr) {
        int start = 0;
        int mid = 0;
        int end = arr.length-1;
        while(mid<=end){
            switch(arr[mid]){
                case 0:
                    int temp0 = arr[start];
                    arr[start] = arr[mid];
                    arr[mid] = temp0;
                    start++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    int temp2 = arr[mid];
                    arr[mid] = arr[end];
                    arr[end] = temp2;
                    end--;
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

public class Sort_Colors {
    public static void main(String[] args) {
        int[] num = {2,0,2,1,1,0};
        Solution4.sortColors(num);
    }
}
