package Arrays;

import java.util.Arrays;

class concat {
    public static int[] arrays(int[] ar1 , int[]ar2){
        int[] ar3 = new int[ar1.length + ar2.length];
        for(int i = 0; i<=ar1.length-1 ; i++){
            ar3[i] = ar1[i];
        }
        for (int i = 0; i <=ar2.length-1 ; i++) {
            ar3[ar1.length+i] = ar2[i];
        }
        return ar3;
    }

    public static int[] arrayss(int[] arr1 , int[] arr2){
        int[] arr3 = new int[arr1.length+ arr2.length];
        int index = 0;
        for(int i : arr1){
            arr3[index] = i; // no need for arr1[i] in for each loop.
            index++;
        }
        for(int i : arr2){
            arr3[index] = i;
            index++;
        }
        return arr3;
    }
}

public class concatination_of_array {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};
        int[] result1 = concat.arrays(a,b);
        int[] result2 = concat.arrayss(a,b);
        System.out.println("With for loop: " + Arrays.toString(result1));
        System.out.print("With for each loop: " + Arrays.toString(result2));
    }
}
