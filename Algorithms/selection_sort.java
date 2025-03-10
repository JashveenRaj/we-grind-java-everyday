package Algorithms;
import java.util.*;

public class selection_sort {
    public static void main(String[] args){
        int[] arr = {1,5,4,3,2,1,4};
        for(int i = 0 ; i<arr.length-1 ; i++){
            int index = i;
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
