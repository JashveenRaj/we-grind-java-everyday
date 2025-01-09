import java.util.ArrayList;
import java.util.Arrays;

class bubble{
    public static int[] sort (int[] a){
        int n = a.length;
        for (int i = 0 ; i<n-1 ; i++){
            for (int j = 0; j <n-1-i ; j++) {
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