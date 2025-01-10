package Algorithms;
import java.util.Arrays;

class selection{
    public static int[] sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[min]>array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }
}


public class selection_sort {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        int[] result = selection.sort(a);
        System.out.print(Arrays.toString(result));
    }
}
