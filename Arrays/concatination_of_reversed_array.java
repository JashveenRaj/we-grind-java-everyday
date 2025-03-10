package Arrays;
import java.util.Arrays;

class concatinating{
    public static int[] reversed_array(int[] ar1 , int[] ar2){
        for (int i = 0; i < (ar2.length/2); i++) {
            int temp = ar2[i];
            ar2[i] = ar2[ar2.length-1-i];
            ar2[ar2.length-1-i] = temp;
        }

        int index = 0;
        int[] newarr = new int[ar1.length + ar2.length];

        for (int i = 0; i <= ar1.length-1; i++) {
            newarr[index] = ar1[i];
            index++;
        }

        for (int i = 0; i <= ar2.length-1; i++) {
            newarr[index] = ar2[i];
            index++;
        }

        return newarr;
    }

}

public class concatination_of_reversed_array {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4};
        int[] result = concatinating.reversed_array(a,b);
        System.out.print(Arrays.toString(result));
    }
}
