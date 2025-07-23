package Arrays;
import java.util.Scanner;

class second_largest{
    public static int second_largest(int[] arr){
        int max1 = Integer.MIN_VALUE;
        int max2 = 0;
        for(int i = 0; i<arr.length ; i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }else if(arr[i]>max2 && arr[i]<max1){
                max2 = arr[i];
            }
        }
        return max2;
    }
}

public class second_largest_in_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(second_largest.second_largest(arr));
    }
}
