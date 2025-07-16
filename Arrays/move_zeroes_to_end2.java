package Arrays;
import java.util.*;

public class move_zeroes_to_end2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int index = 0;
        for(int i = 0; i<n ; i++){
            int a = scanner.nextInt();
            if(a!=0){
                arr[index++] = a;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
