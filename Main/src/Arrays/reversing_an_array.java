package Arrays;
import java.util.Arrays;

class reverse {
    public static int[] array(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}

public class reversing_an_array {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] result = reverse.array(a);
        System.out.println(Arrays.toString(result));
    }
}
