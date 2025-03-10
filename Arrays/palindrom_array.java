package Arrays;

import java.util.Scanner;

public class palindrom_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        boolean flag = false;
        int left = 0;
        int right = a.length-1;
        while(size>0){
            if(a[left]==a[right]){
                left++;
                right--;
                size--;
                flag = true;
            }else{
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
