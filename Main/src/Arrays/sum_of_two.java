/*
    Question:
    Given an array of integers nums and an integer target, return indices of the
    two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you
    may not use the same element twice.
    Desing the following method
    public static int[] twosum(int[] nums, int target)
    Example 1:
            = target = 9
    Input: nums
    Output: [0,1]
    Explanation: Because nums[O] + nums[l] 9, we return [O, 1].

*/

package Arrays;
import java.util.Arrays;

class find{
    public static int[] elements(int[] a , int t){
        int[] out = new int[2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length ; j++) {
                if(a[i]+a[j]==t){
                    out[0] = i;
                    out[1] = j;
                    a[i]=0;
                }
            }
        }
        return out;
    }
}

public class sum_of_two {
    public static void main(String[] args) {
        int[] arr = {2,7,1,15};
        int target = 9;
        int[] result = find.elements(arr,target);
        System.out.println(Arrays.toString(result));
    }
}