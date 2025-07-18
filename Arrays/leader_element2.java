package Arrays;

public class leader_element2 {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5,2};
        int n = arr.length;
        int max_right = arr[n-1];
        System.out.println(max_right);

        for(int i=n-2; i>=0 ; i--){
            if(arr[i]>max_right){
                max_right= arr[i];
                System.out.println(max_right);
            }
        }
    }
}
