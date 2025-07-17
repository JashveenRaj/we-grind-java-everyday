package Arrays;
import java.util.*;

class check{
    public static String sorted(int[] array){
        for (int i = 0; i < array.length-1 ; i++) {
            if(array[i] > array[i+1]){
                return "Not sorted";
            }
        }
        return "Sorted";
    }
}

public class check_if_sorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i]= scanner.nextInt();
        }
        System.out.print(Arrays.toString(a) + ": " + check.sorted(a));
    }
}
