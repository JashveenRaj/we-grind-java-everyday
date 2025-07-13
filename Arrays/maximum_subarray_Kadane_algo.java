package Arrays;
import java.util.Scanner;

class Kadane {
    public int maxSubArray(int[] arr) {
        int curr_sum = 0 ;
        int max_sum = Integer.MIN_VALUE;

        for(int i = 0 ; i<arr.length ; i++){
            if((curr_sum+arr[i])>arr[i]){
                curr_sum+=arr[i];
            }else{
                curr_sum=arr[i];
            }

            if(curr_sum>max_sum){
                max_sum = curr_sum;
            }
        }
        return max_sum;
    }
}

public class maximum_subarray_Kadane_algo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println("Enter elements: ");
            arr[i] = scanner.nextInt();
        }

        Kadane kadane = new Kadane();
        System.out.println("Largest sum of subarray: " + kadane.maxSubArray(arr));
    }
}
