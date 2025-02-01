package Arrays;

import java.util.Scanner;

public class common_odd_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] a = new int[size1];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int size2 = sc.nextInt();
        int[] b = new int[size2];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }


        int count = 0;
        boolean flag = false;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j] && a[i]%2!=0){
                    count++;
                    b[i] = 0;
                }
            }
        }
        int[] c = new int[count];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j] && a[i]%2!=0 && a[i]!=0){
                    flag = true;
                    c[index] = a[i] ;
                    index++;
                }
            }
        }

        if(flag){
            for (int i = 0; i < c.length ; i++) {
                System.out.println(c[i]);
            }
        }else{
            System.out.println("notfound");
        }
    }
}
