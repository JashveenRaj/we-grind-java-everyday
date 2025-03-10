package Arrays;

import java.util.Arrays;

class common{
    public static int[] elements(int[] ar1 , int[] ar2){
        int count = 0 ;
        for (int i = 0; i <= ar1.length-1; i++) {
            for (int j = 0; j <= ar2.length-1; j++) {
                if(ar1[i] == ar2[j]){
                    count++;
                }
            }
        }
        int index = 0;
        int[] newarr = new int[count];
        for (int i = 0; i <= ar1.length-1; i++) {
            for (int j = 0; j <= ar2.length-1; j++) {
                if(ar1[i] == ar2[j]){
                    newarr[index] = ar2[j];
                    index++;
                }
            }
        }

        return newarr;
    }
}

public class retain_elements_in_two_arrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {3,4,5,6,7};
        int[] result = common.elements(a,b);
        System.out.print(Arrays.toString(result));
    }
}
