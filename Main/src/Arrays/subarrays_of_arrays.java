package Arrays;
import java.util.Arrays;

public class subarrays_of_arrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        for (int i = 0; i < a.length ; i++){
            for(int j = i; j< a.length ; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k]);
                }
                System.out.println();
            }
        }
    }
}
