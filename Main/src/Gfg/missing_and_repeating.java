package Gfg;
import java.util.*;

class Solution1 {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> arrlist = new ArrayList<>();

        if(arr.length <=1){
            return arrlist;
        }

        int left = 0;
        int right = 1;

        while(left<right){
            if(arr[left] == arr[right]){
                arrlist.add(arr[left]);
                break;
            }else{
                left++;
                right++;
            }
        }

        int n = arr.length+1;
        int totalsum = n*(n+1)/2;
        int actualsum = 0;
        for(int num : arr){
            actualsum+=num;
        }

        arrlist.add(totalsum-actualsum);

        return arrlist;
    }
}


public class missing_and_repeating {
    public static void main(String[] args) {
        int[] arr = {1,3,3};
        Solution1 solution1 = new Solution1();
        ArrayList<Integer> result = solution1.findTwoElement(arr);
        System.out.println(result);
    }
}
