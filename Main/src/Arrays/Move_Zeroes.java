package Arrays;
import java.util.*;

public class Move_Zeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,3,0,30,0,5};
        int n = arr.length;
        int curr = 0;
        for(int i = 0 ; i<n ; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]= arr[curr];
                arr[curr] = temp;
                curr++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
