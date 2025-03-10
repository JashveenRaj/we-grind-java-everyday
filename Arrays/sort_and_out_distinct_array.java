package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class sort_and_out_distinct_array {
    public static void main(String[] args) {

        //Takes Input
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        //Sorts the array
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length ; j++) {
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // Counts no of repetitions
        //Changes elements to 0 if repeated more than once
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] == a[j]){
                    count++;
                    a[i] = 0;
                }
            }
        }

        //Creates new array to store non-repeating elements
        int[] b = new int[a.length-count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                b[index] = a[i];
                index++;
            }
        }

        //Print output
        System.out.println(Arrays.toString(b));
    }
}
