package Algorithms;
import java.util.Arrays;

class bubble{
    public static int[] sort (int[] a){
        for (int i = 0 ; i<a.length-1 ; i++){
            for (int j = 0; j <a.length-1-i ; j++) {
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
}

public class bubble_sort{
    public static void main(String[] args) {
        int[] array = new int[] {5,8,6,3,1,4,7,83,6};
        System.out.println(Arrays.toString(bubble.sort(array)));
    }
}