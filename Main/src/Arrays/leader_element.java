package Arrays;

public class leader_element {
    public static void main(String[] args) {
        int[] arr = {1,5,2,3,1};
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            boolean leader = false;
            for (int j = i+1; j < n ; j++) {
                if(arr[j]<arr[i]){
                    leader = true;
                }else{
                    leader = false;
                    break;
                }
            }
            if (leader){
                System.out.println(arr[i]);
            }
        }
        System.out.println(arr[n-1]);
    }
}
