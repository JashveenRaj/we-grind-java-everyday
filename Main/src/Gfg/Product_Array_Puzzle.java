/*
    Given an array, arr[] construct a product array, res[] where each element in res[i] is
    the product of all elements in arr[] except arr[i]. Return this resultant array, res[].
    Note: Each element is res[] lies inside the 32-bit integer range.

    Examples:

    Input: arr[] = [10, 3, 5, 6, 2]
    Output: [180, 600, 360, 300, 900]
    Explanation: For i=0, res[i] = 3 * 5 * 6 * 2 is 180.
    For i = 1, res[i] = 10 * 5 * 6 * 2 is 600.
    For i = 2, res[i] = 10 * 3 * 6 * 2 is 360.
    For i = 3, res[i] = 10 * 3 * 5 * 2 is 300.
    For i = 4, res[i] = 10 * 3 * 5 * 6 is 900.

    Input: arr[] = [12, 0]
    Output: [0, 12]
    Explanation: For i = 0, res[i] is 0.
    For i = 1, res[i] is 12.

*/

package Gfg;
import java.util.Arrays;

class Solution {
    public static int[] productExceptSelf(int[] arr) {
        int[] a = new int[arr.length];
        int index = 0 ;
        int prod = 1;
        for(int i =0 ; i < arr.length ; i++){
            for(int j = 0 ; j<arr.length ; j++){
                if(j==i){
                    continue;
                }else{
                    prod=prod*arr[j];
                }
            }
            a[index] = prod;
            index++;
            prod = 1;
        }
        return a;
    }
}

public class Product_Array_Puzzle {
    public static void main(String[] args) {
        int[] a = {10,3,5,6,2};
        System.out.println(Arrays.toString(Solution.productExceptSelf(a)));
    }
}
