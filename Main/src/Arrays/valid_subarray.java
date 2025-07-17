package Arrays;

public class valid_subarray {
    public static void main(String[] args) {
        int[] arr = {1,2,1,4,5,9};
        int count = 0;
        for(int i = 0 ; i<arr.length;i++){
            if(i==0 || i==arr.length-1){
                continue;
            }else if(arr[i-1]+arr[i+1]==arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
