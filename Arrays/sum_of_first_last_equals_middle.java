package Arrays;

public class sum_of_first_last_equals_middle {
    public static int countSpecialSubarrays(int[] arr) {
        int count = 0;
        int k = 3;

        for (int i = 0; i <= arr.length - k; i++) {
            int first = arr[i];
            int middle = arr[i + 1];
            int last = arr[i + 2];
            if (first + last == middle) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 3, 6, 3, 1};
        int result = countSpecialSubarrays(arr);
        System.out.println("Count of subarrays of size 3  " + result);
    }
}
