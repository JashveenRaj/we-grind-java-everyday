package Arrays;

public class Max_Sum_of_Subarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int N = arr.length, max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++){
            int sum = 0;
            for (int j = i; j < N; j++){
                sum += arr[j];
                if (sum > max)
                    max = sum;
            }
        }
        System.out.println(max);
    }
}
