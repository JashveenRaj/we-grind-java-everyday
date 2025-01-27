package Arrays;

import java.util.Scanner;

public class find_meadian_of_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of first array: ");
        int size1 = scanner.nextInt();
        int[] a = new int[size1];
        System.out.println("Enter values: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Enter size of second array: ");
        int size2 = scanner.nextInt();
        int[] b = new int[size2];
        System.out.println("Enter values: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }

        int[] c = new int[a.length+b.length];
        int index = 0;


        for (int i = 0; i < a.length; i++) {
            c[index] = a[i];
            index++;
        }
        for (int i = 0; i < b.length; i++) {
            c[index] = b[i];
            index++;
        }
        for (int i = 0; i < c.length-1; i++) {
            for (int j = i+1; j < c.length ; j++) {
                if(c[i]>c[j]){
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }

        double sum = 0;
        int count = 0;
        if(c.length>2){
            for (int i = 1; i < c.length-1; i++) {
                    count++;
            }
            for (int i = 1; i < c.length-1 ; i++) {
                    sum+=c[i];
            }
        }else if(c.length==2){
            for (int i = 0; i < c.length; i++) {
                count = c.length;
                sum+=c[i];
            }
        }else{
            for (int i = 0; i < c.length; i++) {
                sum+=c[i];
            }
        }
        if(count>2){
            System.out.println("Result: " + sum/(count));
        }else if(count==2){
            System.out.println("Result: " +sum/count);
        }else{
            System.out.println("Result: " +sum);
        }
    }
}
