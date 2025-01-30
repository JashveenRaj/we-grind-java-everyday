package Arrays;

/*
 Given two sorted arrays nums1 and nums2 of size m and n respectively,
 return the median of the two sorted arrays.
 The overall run time complexity should be O(log (m+n)).

    Example 1:

    Input: nums1 = [1,3], nums2 = [2]
    Output: 2.00000
    Explanation: merged array = [1,2,3] and median is 2.

    Example 2:

    Input: nums1 = [1,2], nums2 = [3,4]
    Output: 2.50000
    Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newarr = new int[nums1.length+nums2.length];
        int index = 0 ;
        double median = 0;
        for(int i = 0 ; i<nums1.length ; i++){
            newarr[index] = nums1[i];
            index++;
        }
        for(int i = 0 ; i<nums2.length ; i++){
            newarr[index] = nums2[i];
            index++;
        }
        for(int i = 0 ; i<newarr.length-1 ; i++){
            for(int j = i+1 ; j<newarr.length ; j++){
                if(newarr[i]>newarr[j]){
                    int temp = newarr[i];
                    newarr[i] = newarr[j];
                    newarr[j] = temp;
                }
            }
        }
        if((newarr.length%2)!=0){
            for(int i =0 ; i<= newarr.length/2 ; i++){
                median = newarr[i];
            }
        }else{
            for(int i = 0 ; i<=newarr.length/2 ; i++){
                median = (newarr[newarr.length/2]+newarr[(newarr.length/2)-1])/2.0;
            }
        }
        return median;
    }
}
