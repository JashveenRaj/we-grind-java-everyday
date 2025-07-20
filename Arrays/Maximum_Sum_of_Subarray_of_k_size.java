package Arrays;

//Kadane's algo can be used when the size of array is not fixed
public class Maximum_Sum_of_Subarray_of_k_size {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1,3,2};
        int k = 3;
        int maxSum = 0, windowSum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            windowSum += arr[end];  // add the next element

            if (end >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[start];  // remove element going out
                start++;  // slide the window ahead
            }
        }
        System.out.println(maxSum);
    }
}
