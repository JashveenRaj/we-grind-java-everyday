package Arrays;

import java.util.Scanner;

public class frequent_than_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int avg = a.length/2;

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

        int count = 0;
        int element = 0;
        for (int i = 0; i < a.length; i++) { //1,1,2,1,3,5,1
            for (int j = i+1; j < a.length ; j++) {
                if(a[i] == a[j] && a[i]!=0){
                    a[i] = 0;
                    count++;
                    break;
                }
                if(count+1>=avg){
                    element = a[i];
                }
                count = 0;
            }
        }
        System.out.println(element);
    }
}
