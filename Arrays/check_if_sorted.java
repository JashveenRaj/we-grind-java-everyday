package Arrays;

import java.util.Arrays;

class check{
    public static String sorted(int[] array){
        for (int i = 0; i < array.length-1 ; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]){
                    return "Not sorted";
                }
            }
        }
        return "Sorted";
    }
}

public class check_if_sorted {
    public static void main(String[] args) {
        int[] a = {1,2,3,7,5};
        String result = check.sorted(a);
        System.out.print(Arrays.toString(a) + ": " + result);
    }
}
