package Arrays;
import java.util.Scanner;

public class unique_element {
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

        //Changes elements to 0 if repeated more than once
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] == a[j]){
                    a[i] = 0;
                }
            }
        }

        //Prints Non-Zero Elements Remaining in the Array
        System.out.println("Output: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                System.out.println(a[i]);
            }
        }
    }
}
