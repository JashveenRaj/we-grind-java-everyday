package Arrays;

public class Subarrays_with_sum_0 {
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        for(int i = 0 ; i<arr.length ; i++){
            int sum = 0;
            for(int  j = i ; j<arr.length ; j++){
                sum+=arr[j];

                if(sum==0){
                    System.out.print("{ " );
                    for(int k = i ; k<=j ; k++){
                        System.out.print(arr[k] + " ");
                    }
                    System.out.print(" }");
                    System.out.println();
                }
            }
        }
    }
}
