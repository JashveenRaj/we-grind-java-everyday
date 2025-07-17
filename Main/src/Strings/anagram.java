package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        for(int i = 0 ; i< arr1.length ; i++){
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    arr1[i] = 0;
                    arr2[j] = 0;
                }
            }
        }

        boolean flag = true;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] != 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
