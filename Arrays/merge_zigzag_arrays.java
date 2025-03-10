package Arrays;
import java.util.Arrays;

public class merge_zigzag_arrays {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9};
        int[] b = {2,4,6,8};
        int[] c = new int[a.length+b.length];
        int index = 0;

        for (int i = 0; i < a.length+b.length; i++) {
            if(i<a.length){
                c[index] = a[i];
                index++;
            }
            if(i<b.length){
                c[index] = b[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(c));
    }
}
