package Algorithms;
import java.util.Arrays;
import java.util.Scanner;

class bubble2{
    public static int[] sorter(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1 ; j < array.length; j++) {
                if(array[i]> array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}

public class bubble_sort2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array you want: ");
        int size = scanner.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter values: ");
            a[i] = scanner.nextInt();
        }

        int[] result = bubble2.sorter(a);
        System.out.println();
        System.out.print("Sorted Array: " + Arrays.toString(result));
    }
}
