package Arrays;

/*
    Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
    such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
    Notice that the solution Tree_set must not contain duplicate triplets.


    Example 1:

    Input: nums = [-1,0,1,2,-1,-4] -1 0 1 2 -1 -4
    Output: [[-1,-1,2],[-1,0,1]]
    Explanation:
    nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
    nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
    nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
    The distinct triplets are [-1,0,1] and [-1,-1,2].
    Notice that the order of the output and the order of the triplets does not matter.
    Example 2:

    Input: nums = [0,1,1]
    Output: []
    Explanation: The only possible triplet does not sum up to 0.
    Example 3:

    Input: nums = [0,0,0]
    Output: [[0,0,0]]
    Explanation: The only possible triplet sums up to 0.
*/

//class finding{
//    public static void triplets (int[] a) {
////        return count;
//    }
//}

import java.util.ArrayList;
import java.util.Arrays;

public class triplets_in_array {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        int count = 0;
        for (int i = 0; i < arr.length- 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (i != j && i != k && j != k && arr[i] + arr[j] + arr[k] == 0) {
                        count++;
                    }
                }
            }
        }
        int[][] out = new int[count][3];
        int index = 0;
        for (int i = 0; i < arr.length- 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (i != j && i != k && j != k && arr[i] + arr[j] + arr[k] == 0) {
                        out[index][0] = arr[i];
                        out[index][1] = arr[j];
                        out[index][2] = arr[k];
                        index++;
                    }
                }
            }
        }
        for(int[] i : out){
            for(int j :  i){
                System.out.println(j);
            }
        }
    }
}
