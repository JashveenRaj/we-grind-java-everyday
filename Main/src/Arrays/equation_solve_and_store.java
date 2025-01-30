package Arrays;

/*
*
* Sort an Array after applying the equation which should be sorted in ascending order,
* after that we have to make it as the equation as we have three integers A,B and C we need to do
*   A*x*x + B*x + c for each element x the output should be sorted array
*
*   Example : input arr = {-1,0,1,2,3,4}; x is current value
*               A = -1 , B = 2 , C = -1
*             output arr = {-9,-4,-4,-1,-1,0}
*
*/

import java.util.Arrays;
import java.util.Scanner;

public class equation_solve_and_store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        for (int i = 0; i < a.length ; i++) {
            a[i] = (A*a[i]*a[i] + B*a[i] + C);
        }

        for (int i = 0; i < a.length-1 ; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
