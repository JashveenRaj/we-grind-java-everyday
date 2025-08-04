package Arrays;

public class max_subarray_simple {
    public static int maxSumSubarray(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            // Sum elements of the current subarray of size k
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            // Update maxSum if current subarray sum is larger
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 2, 9, 1};
        int k = 3;
        System.out.println("Maximum sum of a subarray of size " + k + " is: " + maxSumSubarray(arr, k));
    }
}

