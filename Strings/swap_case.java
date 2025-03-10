package Strings;

import java.util.Scanner;

public class swap_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String out="";
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if(Character.isLowerCase(a[i])){
                out+=Character.toUpperCase(a[i]);
            } else if (Character.isUpperCase(a[i])) {
                out+=Character.toLowerCase(a[i]);
            }
        }
        System.out.println(out);
    }
}
