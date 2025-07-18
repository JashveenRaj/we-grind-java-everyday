package Arrays;
import java.util.Arrays;

//Sort and bubble swap for easy way
public class zig_zag {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for (int i = 0; i < arr.length-1; i++) {
            if(i%2==0){
                if(arr[i]>arr[i+1]){
                    swap(arr, i, i+1);
                }
            }else{
                if(arr[i]<arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
        public static void swap(int[] a, int i, int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
}
