import java.util.Arrays;

class common{
    public static int[] elements(int[] ar1 , int[] ar2){
        int count = 0 ;
        for (int i = 0; i <= ar2.length-1; i++) {
            for (int j = 0; j <= ar2.length-1; j++) {
                    ar1[i] = 0;
                    ar2[j] = 0;
            }
            count++;
        }
        return ar2;
    }
}

public class retain_elements_in_two_arrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {3,4,5,6,7};
        int[] result = common.elements(a,b);
        System.out.print(Arrays.toString(result));
    }
}
