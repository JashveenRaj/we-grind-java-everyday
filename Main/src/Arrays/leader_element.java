package Arrays;

public class leader_element {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,6,9};
        boolean b = false;
        for (int i = 0; i < arr.length-1; i++) {
            boolean leader = false;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]>arr[i]){
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
    }
}
